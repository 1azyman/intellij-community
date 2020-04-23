/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.inspections;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("kotlin/idea/testData/multiFileLocalInspections")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class MultiFileLocalInspectionTestGenerated extends AbstractMultiFileLocalInspectionTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInMultiFileLocalInspections() throws Exception {
        KotlinTestUtils.assertAllTestsPresentInSingleGeneratedClassWithExcluded(this.getClass(), new File("kotlin/idea/testData/multiFileLocalInspections"), Pattern.compile("^(.+)\\.test$"), null);
    }

    @TestMetadata("convertSealedSubClassToObject/convertCallableReferenceUsages/convertCallableReferenceUsages.test")
    public void testConvertSealedSubClassToObject_convertCallableReferenceUsages_ConvertCallableReferenceUsages() throws Exception {
        runTest("kotlin/idea/testData/multiFileLocalInspections/convertSealedSubClassToObject/convertCallableReferenceUsages/convertCallableReferenceUsages.test");
    }

    @TestMetadata("convertSealedSubClassToObject/convertInOtherFiles/convertInOtherFiles.test")
    public void testConvertSealedSubClassToObject_convertInOtherFiles_ConvertInOtherFiles() throws Exception {
        runTest("kotlin/idea/testData/multiFileLocalInspections/convertSealedSubClassToObject/convertInOtherFiles/convertInOtherFiles.test");
    }

    @TestMetadata("moveFileToPackageMatchingDirectory/moveToDefaultDirectory/moveToDefaultDirectory.test")
    public void testMoveFileToPackageMatchingDirectory_moveToDefaultDirectory_MoveToDefaultDirectory() throws Exception {
        runTest("kotlin/idea/testData/multiFileLocalInspections/moveFileToPackageMatchingDirectory/moveToDefaultDirectory/moveToDefaultDirectory.test");
    }

    @TestMetadata("moveFileToPackageMatchingDirectory/moveToDefaultDirectoryWithoutPackageKeyword/moveToDefaultDirectoryWithoutPackageKeyword.test")
    public void testMoveFileToPackageMatchingDirectory_moveToDefaultDirectoryWithoutPackageKeyword_MoveToDefaultDirectoryWithoutPackageKeyword() throws Exception {
        runTest("kotlin/idea/testData/multiFileLocalInspections/moveFileToPackageMatchingDirectory/moveToDefaultDirectoryWithoutPackageKeyword/moveToDefaultDirectoryWithoutPackageKeyword.test");
    }

    @TestMetadata("moveFileToPackageMatchingDirectory/moveToNonDefaultDirectory/moveToNonDefaultDirectory.test")
    public void testMoveFileToPackageMatchingDirectory_moveToNonDefaultDirectory_MoveToNonDefaultDirectory() throws Exception {
        runTest("kotlin/idea/testData/multiFileLocalInspections/moveFileToPackageMatchingDirectory/moveToNonDefaultDirectory/moveToNonDefaultDirectory.test");
    }

    @TestMetadata("moveFileToPackageMatchingDirectory/packageMatchesDirectory/packageMatchesDirectory.test")
    public void testMoveFileToPackageMatchingDirectory_packageMatchesDirectory_PackageMatchesDirectory() throws Exception {
        runTest("kotlin/idea/testData/multiFileLocalInspections/moveFileToPackageMatchingDirectory/packageMatchesDirectory/packageMatchesDirectory.test");
    }

    @TestMetadata("reconcilePackageWithDirectory/addQuotation/addQuotation.test")
    public void testReconcilePackageWithDirectory_addQuotation_AddQuotation() throws Exception {
        runTest("kotlin/idea/testData/multiFileLocalInspections/reconcilePackageWithDirectory/addQuotation/addQuotation.test");
    }

    @TestMetadata("reconcilePackageWithDirectory/changeToDefaultPackage/changeToDefaultPackage.test")
    public void testReconcilePackageWithDirectory_changeToDefaultPackage_ChangeToDefaultPackage() throws Exception {
        runTest("kotlin/idea/testData/multiFileLocalInspections/reconcilePackageWithDirectory/changeToDefaultPackage/changeToDefaultPackage.test");
    }

    @TestMetadata("reconcilePackageWithDirectory/changeToNonDefaultPackage/changeToNonDefaultPackage.test")
    public void testReconcilePackageWithDirectory_changeToNonDefaultPackage_ChangeToNonDefaultPackage() throws Exception {
        runTest("kotlin/idea/testData/multiFileLocalInspections/reconcilePackageWithDirectory/changeToNonDefaultPackage/changeToNonDefaultPackage.test");
    }

    @TestMetadata("reconcilePackageWithDirectory/changeToNonDefaultPackageFromRoot/changeToNonDefaultPackageFromRoot.test")
    public void testReconcilePackageWithDirectory_changeToNonDefaultPackageFromRoot_ChangeToNonDefaultPackageFromRoot() throws Exception {
        runTest("kotlin/idea/testData/multiFileLocalInspections/reconcilePackageWithDirectory/changeToNonDefaultPackageFromRoot/changeToNonDefaultPackageFromRoot.test");
    }

    @TestMetadata("reconcilePackageWithDirectory/innerClass/innerClass.test")
    public void testReconcilePackageWithDirectory_innerClass_InnerClass() throws Exception {
        runTest("kotlin/idea/testData/multiFileLocalInspections/reconcilePackageWithDirectory/innerClass/innerClass.test");
    }

    @TestMetadata("reconcilePackageWithDirectory/packageMatchesDirectory/packageMatchesDirectory.test")
    public void testReconcilePackageWithDirectory_packageMatchesDirectory_PackageMatchesDirectory() throws Exception {
        runTest("kotlin/idea/testData/multiFileLocalInspections/reconcilePackageWithDirectory/packageMatchesDirectory/packageMatchesDirectory.test");
    }

    @TestMetadata("redundantQualifierName/javaStatic2/fromKotlinTest.test")
    public void testRedundantQualifierName_javaStatic2_FromKotlinTest() throws Exception {
        runTest("kotlin/idea/testData/multiFileLocalInspections/redundantQualifierName/javaStatic2/fromKotlinTest.test");
    }

    @TestMetadata("redundantQualifierName/javaStatic/fromKotlinTest.test")
    public void testRedundantQualifierName_javaStatic_FromKotlinTest() throws Exception {
        runTest("kotlin/idea/testData/multiFileLocalInspections/redundantQualifierName/javaStatic/fromKotlinTest.test");
    }

    @TestMetadata("unusedSymbol/fromKotlinTest/fromKotlinTest.test")
    public void testUnusedSymbol_fromKotlinTest_FromKotlinTest() throws Exception {
        runTest("kotlin/idea/testData/multiFileLocalInspections/unusedSymbol/fromKotlinTest/fromKotlinTest.test");
    }

    @TestMetadata("unusedSymbol/fromKotlinTestClass/fromKotlinTestClass.test")
    public void testUnusedSymbol_fromKotlinTestClass_FromKotlinTestClass() throws Exception {
        runTest("kotlin/idea/testData/multiFileLocalInspections/unusedSymbol/fromKotlinTestClass/fromKotlinTestClass.test");
    }

    @TestMetadata("unusedSymbol/inlineClassesImplInterface/inlineClassesImplInterface.test")
    public void testUnusedSymbol_inlineClassesImplInterface_InlineClassesImplInterface() throws Exception {
        runTest("kotlin/idea/testData/multiFileLocalInspections/unusedSymbol/inlineClassesImplInterface/inlineClassesImplInterface.test");
    }

    @TestMetadata("unusedSymbol/internalConstructorUsedInJava/internalConstructorUsedInJava.test")
    public void testUnusedSymbol_internalConstructorUsedInJava_InternalConstructorUsedInJava() throws Exception {
        runTest("kotlin/idea/testData/multiFileLocalInspections/unusedSymbol/internalConstructorUsedInJava/internalConstructorUsedInJava.test");
    }
}
