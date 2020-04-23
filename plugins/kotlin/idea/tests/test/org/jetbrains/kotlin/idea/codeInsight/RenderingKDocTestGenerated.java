/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.codeInsight;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("kotlin/idea/testData/codeInsight/renderingKDoc")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class RenderingKDocTestGenerated extends AbstractRenderingKDocTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInRenderingKDoc() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("kotlin/idea/testData/codeInsight/renderingKDoc"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @TestMetadata("classRendering.kt")
    public void testClassRendering() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/renderingKDoc/classRendering.kt");
    }

    @TestMetadata("difficultKDoc.kt")
    public void testDifficultKDoc() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/renderingKDoc/difficultKDoc.kt");
    }

    @TestMetadata("functionRendering.kt")
    public void testFunctionRendering() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/renderingKDoc/functionRendering.kt");
    }

    @TestMetadata("propertyRendering.kt")
    public void testPropertyRendering() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/renderingKDoc/propertyRendering.kt");
    }
}
