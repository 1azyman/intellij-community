/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.highlighter;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("kotlin/idea/testData/diagnosticMessage")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class DiagnosticMessageTestGenerated extends AbstractDiagnosticMessageTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("abstractBaseClassMemberNotImplemented.kt")
    public void testAbstractBaseClassMemberNotImplemented() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/abstractBaseClassMemberNotImplemented.kt");
    }

    public void testAllFilesPresentInDiagnosticMessage() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("kotlin/idea/testData/diagnosticMessage"), Pattern.compile("^(.+)\\.kt$"), null, false);
    }

    @TestMetadata("annotationsForResolve.kt")
    public void testAnnotationsForResolve() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/annotationsForResolve.kt");
    }

    @TestMetadata("assignedButNeverAccessedVariable.kt")
    public void testAssignedButNeverAccessedVariable() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/assignedButNeverAccessedVariable.kt");
    }

    @TestMetadata("callableReferenceResolutionAmbiguityHtml.kt")
    public void testCallableReferenceResolutionAmbiguityHtml() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/callableReferenceResolutionAmbiguityHtml.kt");
    }

    @TestMetadata("callableReferenceResolutionAmbiguityTxt.kt")
    public void testCallableReferenceResolutionAmbiguityTxt() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/callableReferenceResolutionAmbiguityTxt.kt");
    }

    @TestMetadata("cannotInferVisibility.kt")
    public void testCannotInferVisibility() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/cannotInferVisibility.kt");
    }

    @TestMetadata("cannotOverrideInvisibleMember.kt")
    public void testCannotOverrideInvisibleMember() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/cannotOverrideInvisibleMember.kt");
    }

    @TestMetadata("complexTypeMismatchWithTypeParameters.kt")
    public void testComplexTypeMismatchWithTypeParameters() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/complexTypeMismatchWithTypeParameters.kt");
    }

    @TestMetadata("complexTypeMismatchWithTypeParametersAndTypeAlias.kt")
    public void testComplexTypeMismatchWithTypeParametersAndTypeAlias() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/complexTypeMismatchWithTypeParametersAndTypeAlias.kt");
    }

    @TestMetadata("conflictingOverloadsClass.kt")
    public void testConflictingOverloadsClass() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/conflictingOverloadsClass.kt");
    }

    @TestMetadata("conflictingOverloadsDefaultPackage.kt")
    public void testConflictingOverloadsDefaultPackage() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/conflictingOverloadsDefaultPackage.kt");
    }

    @TestMetadata("conflictingSubstitutions.kt")
    public void testConflictingSubstitutions() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/conflictingSubstitutions.kt");
    }

    @TestMetadata("constructorsRedeclaration.kt")
    public void testConstructorsRedeclaration() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/constructorsRedeclaration.kt");
    }

    @TestMetadata("constructorsRedeclarationTopLevel.kt")
    public void testConstructorsRedeclarationTopLevel() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/constructorsRedeclarationTopLevel.kt");
    }

    @TestMetadata("differentNamesForSameParameter.kt")
    public void testDifferentNamesForSameParameter() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/differentNamesForSameParameter.kt");
    }

    @TestMetadata("expectedNothingDueToProjections.kt")
    public void testExpectedNothingDueToProjections() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/expectedNothingDueToProjections.kt");
    }

    @TestMetadata("extensionInClassReference.kt")
    public void testExtensionInClassReference() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/extensionInClassReference.kt");
    }

    @TestMetadata("functionPlaceholder.kt")
    public void testFunctionPlaceholder() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/functionPlaceholder.kt");
    }

    @TestMetadata("illegalSuspendCall.kt")
    public void testIllegalSuspendCall() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/illegalSuspendCall.kt");
    }

    @TestMetadata("incompatibleEnums.kt")
    public void testIncompatibleEnums() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/incompatibleEnums.kt");
    }

    @TestMetadata("invisibleMember.kt")
    public void testInvisibleMember() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/invisibleMember.kt");
    }

    @TestMetadata("multipleDefaultsFromSupertypes.kt")
    public void testMultipleDefaultsFromSupertypes() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/multipleDefaultsFromSupertypes.kt");
    }

    @TestMetadata("nameInConstraintIsNotATypeParameter.kt")
    public void testNameInConstraintIsNotATypeParameter() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/nameInConstraintIsNotATypeParameter.kt");
    }

    @TestMetadata("nestedClassAcessedViaInstanceReference.kt")
    public void testNestedClassAcessedViaInstanceReference() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/nestedClassAcessedViaInstanceReference.kt");
    }

    @TestMetadata("nestedClassShouldBeQualified.kt")
    public void testNestedClassShouldBeQualified() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/nestedClassShouldBeQualified.kt");
    }

    @TestMetadata("noneApplicable.kt")
    public void testNoneApplicable() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/noneApplicable.kt");
    }

    @TestMetadata("noneApplicableCallableReference.kt")
    public void testNoneApplicableCallableReference() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/noneApplicableCallableReference.kt");
    }

    @TestMetadata("noneApplicableConstructor.kt")
    public void testNoneApplicableConstructor() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/noneApplicableConstructor.kt");
    }

    @TestMetadata("noneApplicableGeneric.kt")
    public void testNoneApplicableGeneric() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/noneApplicableGeneric.kt");
    }

    @TestMetadata("noneApplicableHtml.kt")
    public void testNoneApplicableHtml() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/noneApplicableHtml.kt");
    }

    @TestMetadata("noneApplicableTxt.kt")
    public void testNoneApplicableTxt() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/noneApplicableTxt.kt");
    }

    @TestMetadata("numberValueTypes.kt")
    public void testNumberValueTypes() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/numberValueTypes.kt");
    }

    @TestMetadata("overloadResolutionAmbiguityHtml.kt")
    public void testOverloadResolutionAmbiguityHtml() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/overloadResolutionAmbiguityHtml.kt");
    }

    @TestMetadata("overloadResolutionAmbiguityTxt.kt")
    public void testOverloadResolutionAmbiguityTxt() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/overloadResolutionAmbiguityTxt.kt");
    }

    @TestMetadata("renderCollectionOfTypes.kt")
    public void testRenderCollectionOfTypes() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/renderCollectionOfTypes.kt");
    }

    @TestMetadata("returnTypeMismatchOnOverride.kt")
    public void testReturnTypeMismatchOnOverride() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/returnTypeMismatchOnOverride.kt");
    }

    @TestMetadata("typeInferenceCannotCaptureTypes.kt")
    public void testTypeInferenceCannotCaptureTypes() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/typeInferenceCannotCaptureTypes.kt");
    }

    @TestMetadata("typeInferenceExpectedTypeMismatch.kt")
    public void testTypeInferenceExpectedTypeMismatch() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/typeInferenceExpectedTypeMismatch.kt");
    }

    @TestMetadata("typeMismatchDueToProjections.kt")
    public void testTypeMismatchDueToProjections() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/typeMismatchDueToProjections.kt");
    }

    @TestMetadata("typeMismatchDueToProjectionsIn.kt")
    public void testTypeMismatchDueToProjectionsIn() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/typeMismatchDueToProjectionsIn.kt");
    }

    @TestMetadata("typeMismatchDueToProjectionsTxt.kt")
    public void testTypeMismatchDueToProjectionsTxt() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/typeMismatchDueToProjectionsTxt.kt");
    }

    @TestMetadata("typeMismatchWithFunctionalType.kt")
    public void testTypeMismatchWithFunctionalType() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/typeMismatchWithFunctionalType.kt");
    }

    @TestMetadata("typeMismatchWithNothing.kt")
    public void testTypeMismatchWithNothing() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/typeMismatchWithNothing.kt");
    }

    @TestMetadata("typeMismatchWithTypeParameters.kt")
    public void testTypeMismatchWithTypeParameters() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/typeMismatchWithTypeParameters.kt");
    }

    @TestMetadata("typeParameterAsReified.kt")
    public void testTypeParameterAsReified() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/typeParameterAsReified.kt");
    }

    @TestMetadata("typeVarianceConflictInTypeAliasExpansion.kt")
    public void testTypeVarianceConflictInTypeAliasExpansion() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/typeVarianceConflictInTypeAliasExpansion.kt");
    }

    @TestMetadata("unsupportedFeature.kt")
    public void testUnsupportedFeature() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/unsupportedFeature.kt");
    }

    @TestMetadata("unusedParameter.kt")
    public void testUnusedParameter() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/unusedParameter.kt");
    }

    @TestMetadata("unusedValue.kt")
    public void testUnusedValue() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/unusedValue.kt");
    }

    @TestMetadata("unusedVariable.kt")
    public void testUnusedVariable() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/unusedVariable.kt");
    }

    @TestMetadata("upperBoundViolated.kt")
    public void testUpperBoundViolated() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/upperBoundViolated.kt");
    }

    @TestMetadata("upperBoundViolatedInTypeAliasConstructorCall.kt")
    public void testUpperBoundViolatedInTypeAliasConstructorCall() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/upperBoundViolatedInTypeAliasConstructorCall.kt");
    }

    @TestMetadata("urlRender.kt")
    public void testUrlRender() throws Exception {
        runTest("kotlin/idea/testData/diagnosticMessage/urlRender.kt");
    }
}
