/*
 * Copyright 2000-2005 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jetbrains.idea.devkit.actions;

import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.xml.XmlFile;
import com.intellij.psi.xml.XmlTag;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.idea.devkit.DevKitBundle;

/**
 * @author max
 */
public class NewModuleComponentAction extends GenerateClassAndPatchPluginXmlActionBase {
  /**
   *.
   */
  public NewModuleComponentAction() {
    super(DevKitBundle.message("new.menu.module.component.text"),
          DevKitBundle.message("new.menu.module.component.description"), null);
  }

  protected void patchPluginXml(final XmlFile pluginXml, final PsiClass klass) throws IncorrectOperationException {
    final XmlTag rootTag = pluginXml.getDocument().getRootTag();
    if (rootTag != null && "idea-plugin".equals(rootTag.getName())) {
      XmlTag moduleComponents = rootTag.findFirstSubTag("module-components");
      if (moduleComponents == null) {
        moduleComponents = (XmlTag)rootTag.add(rootTag.createChildTag("module-components", rootTag.getNamespace(), null, false));
      }

      XmlTag cmp = (XmlTag)moduleComponents.add(moduleComponents.createChildTag("component", moduleComponents.getNamespace(), null, false));
      cmp.add(cmp.createChildTag("implementation-class", cmp.getNamespace(), klass.getQualifiedName(), false));
    }
  }

  protected String getErrorTitle() {
    return DevKitBundle.message("new.module.component.error");
  }

  protected String getCommandName() {
    return DevKitBundle.message("new.module.component.command");
  }

  protected String getClassNamePromptTitle() {
    return DevKitBundle.message("new.module.component.prompt.title");
  }

  protected String getClassTemplateName() {
    return "ModuleComponent.java";
  }

  protected String getClassNamePrompt() {
    return DevKitBundle.message("new.module.component.prompt");
  }

  protected String getActionName(PsiDirectory directory, String newName) {
    return DevKitBundle.message("new.module.component.action.name", directory, newName);
  }
}
