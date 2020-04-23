/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.codeInsight.generate;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("kotlin/idea/testData/codeInsight/generate/equalsWithHashCode")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class GenerateHashCodeAndEqualsActionTestGenerated extends AbstractGenerateHashCodeAndEqualsActionTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInEqualsWithHashCode() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("kotlin/idea/testData/codeInsight/generate/equalsWithHashCode"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @TestMetadata("annotation.kt")
    public void testAnnotation() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/generate/equalsWithHashCode/annotation.kt");
    }

    @TestMetadata("arrays.kt")
    public void testArrays() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/generate/equalsWithHashCode/arrays.kt");
    }

    @TestMetadata("customAccessors.kt")
    public void testCustomAccessors() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/generate/equalsWithHashCode/customAccessors.kt");
    }

    @TestMetadata("dataClass.kt")
    public void testDataClass() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/generate/equalsWithHashCode/dataClass.kt");
    }

    @TestMetadata("dataClassHasArrayProperty.kt")
    public void testDataClassHasArrayProperty() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/generate/equalsWithHashCode/dataClassHasArrayProperty.kt");
    }

    @TestMetadata("enum.kt")
    public void testEnum() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/generate/equalsWithHashCode/enum.kt");
    }

    @TestMetadata("explicitDefaultAccessors.kt")
    public void testExplicitDefaultAccessors() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/generate/equalsWithHashCode/explicitDefaultAccessors.kt");
    }

    @TestMetadata("genericClass.kt")
    public void testGenericClass() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/generate/equalsWithHashCode/genericClass.kt");
    }

    @TestMetadata("genericClassWithIsCheck.kt")
    public void testGenericClassWithIsCheck() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/generate/equalsWithHashCode/genericClassWithIsCheck.kt");
    }

    @TestMetadata("interface.kt")
    public void testInterface() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/generate/equalsWithHashCode/interface.kt");
    }

    @TestMetadata("keepQuotes.kt")
    public void testKeepQuotes() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/generate/equalsWithHashCode/keepQuotes.kt");
    }

    @TestMetadata("multipleVars.kt")
    public void testMultipleVars() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/generate/equalsWithHashCode/multipleVars.kt");
    }

    @TestMetadata("multipleVarsCommon.kt")
    public void testMultipleVarsCommon() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/generate/equalsWithHashCode/multipleVarsCommon.kt");
    }

    @TestMetadata("multipleVarsJS.kt")
    public void testMultipleVarsJS() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/generate/equalsWithHashCode/multipleVarsJS.kt");
    }

    @TestMetadata("multipleVarsNullable.kt")
    public void testMultipleVarsNullable() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/generate/equalsWithHashCode/multipleVarsNullable.kt");
    }

    @TestMetadata("multipleVarsWithSuperClass.kt")
    public void testMultipleVarsWithSuperClass() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/generate/equalsWithHashCode/multipleVarsWithSuperClass.kt");
    }

    @TestMetadata("nameClash.kt")
    public void testNameClash() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/generate/equalsWithHashCode/nameClash.kt");
    }

    @TestMetadata("nestedArray.kt")
    public void testNestedArray() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/generate/equalsWithHashCode/nestedArray.kt");
    }

    @TestMetadata("noVars.kt")
    public void testNoVars() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/generate/equalsWithHashCode/noVars.kt");
    }

    @TestMetadata("noVarsCommon.kt")
    public void testNoVarsCommon() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/generate/equalsWithHashCode/noVarsCommon.kt");
    }

    @TestMetadata("noVarsJS.kt")
    public void testNoVarsJS() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/generate/equalsWithHashCode/noVarsJS.kt");
    }

    @TestMetadata("noVarsWithSuperClass.kt")
    public void testNoVarsWithSuperClass() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/generate/equalsWithHashCode/noVarsWithSuperClass.kt");
    }

    @TestMetadata("nullableArrays.kt")
    public void testNullableArrays() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/generate/equalsWithHashCode/nullableArrays.kt");
    }

    @TestMetadata("object.kt")
    public void testObject() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/generate/equalsWithHashCode/object.kt");
    }

    @TestMetadata("singleVar.kt")
    public void testSingleVar() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/generate/equalsWithHashCode/singleVar.kt");
    }

    @TestMetadata("singleVarNullable.kt")
    public void testSingleVarNullable() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/generate/equalsWithHashCode/singleVarNullable.kt");
    }

    @TestMetadata("singleVarWithIsCheck.kt")
    public void testSingleVarWithIsCheck() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/generate/equalsWithHashCode/singleVarWithIsCheck.kt");
    }

    @TestMetadata("singleVarWithJavaSuperClass.kt")
    public void testSingleVarWithJavaSuperClass() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/generate/equalsWithHashCode/singleVarWithJavaSuperClass.kt");
    }

    @TestMetadata("singleVarWithSuperClass.kt")
    public void testSingleVarWithSuperClass() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/generate/equalsWithHashCode/singleVarWithSuperClass.kt");
    }
}
