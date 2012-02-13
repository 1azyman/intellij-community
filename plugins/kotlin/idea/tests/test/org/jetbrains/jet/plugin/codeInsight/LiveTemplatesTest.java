package org.jetbrains.jet.plugin.codeInsight;

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupEx;
import com.intellij.codeInsight.lookup.LookupManager;
import com.intellij.codeInsight.template.TemplateManager;
import com.intellij.codeInsight.template.impl.TemplateManagerImpl;
import com.intellij.ide.DataManager;
import com.intellij.openapi.editor.actionSystem.EditorActionHandler;
import com.intellij.openapi.editor.actionSystem.EditorActionManager;
import com.intellij.testFramework.LightProjectDescriptor;
import com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase;
import com.intellij.util.ArrayUtil;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.jet.plugin.JetWithJdkAndRuntimeLightProjectDescriptor;
import org.jetbrains.jet.plugin.PluginTestCaseBase;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Evgeny Gerashchenko
 * @since 2/10/12
 */
public class LiveTemplatesTest extends LightCodeInsightFixtureTestCase {
    public void testIter() {
        myFixture.configureByFile(getTestName(false) + ".kt");
        myFixture.type("iter");

        doAction("ExpandLiveTemplateByTab");
        assertStringItems("args", "collection", "myList", "str", "stream");
    }

    @NotNull
    @Override
    protected LightProjectDescriptor getProjectDescriptor() {
        return JetWithJdkAndRuntimeLightProjectDescriptor.INSTANCE;
    }

    @SuppressWarnings("MethodOverridesPrivateMethodOfSuperclass")
    private void doAction(@NotNull String actionId) {
        EditorActionManager actionManager = EditorActionManager.getInstance();
        EditorActionHandler actionHandler = actionManager.getActionHandler(actionId);
        actionHandler.execute(myFixture.getEditor(), DataManager.getInstance().getDataContext());
    }

    @Override
    protected void tearDown() throws Exception {
        ((TemplateManagerImpl) TemplateManager.getInstance(getProject())).setTemplateTesting(false);
        super.tearDown();
    }

    private void assertStringItems(@NonNls String... items) {
        assertEquals(Arrays.asList(items), Arrays.asList(getItemStringsSorted()));
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        myFixture.setTestDataPath(new File(PluginTestCaseBase.getTestDataPathBase(), "/templates").getPath() +
                                  File.separator);

        ((TemplateManagerImpl) TemplateManager.getInstance(getProject())).setTemplateTesting(true);
    }

    private String[] getItemStrings() {
        LookupEx lookup = LookupManager.getActiveLookup(myFixture.getEditor());
        assertNotNull(lookup);
        ArrayList<String> result = new ArrayList<String>();
        for (LookupElement element : lookup.getItems()) {
            result.add(element.getLookupString());
        }
        return ArrayUtil.toStringArray(result);
    }
    
    private String[] getItemStringsSorted() {
        String[] items = getItemStrings();
        Arrays.sort(items);
        return items;
    }
}
