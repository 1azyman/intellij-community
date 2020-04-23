/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.fir;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("kotlin/idea/testData/fir/multiModule")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class FirMultiModuleResolveTestGenerated extends AbstractFirMultiModuleResolveTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInMultiModule() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("kotlin/idea/testData/fir/multiModule"), Pattern.compile("^([^\\.]+)$"), null, false);
    }

    @TestMetadata("basic")
    public void testBasic() throws Exception {
        runTest("kotlin/idea/testData/fir/multiModule/basic/");
    }

    @TestMetadata("basicWithAnnotatedJava")
    public void testBasicWithAnnotatedJava() throws Exception {
        runTest("kotlin/idea/testData/fir/multiModule/basicWithAnnotatedJava/");
    }

    @TestMetadata("basicWithAnnotatedOverriddenJava")
    public void testBasicWithAnnotatedOverriddenJava() throws Exception {
        runTest("kotlin/idea/testData/fir/multiModule/basicWithAnnotatedOverriddenJava/");
    }

    @TestMetadata("basicWithJava")
    public void testBasicWithJava() throws Exception {
        runTest("kotlin/idea/testData/fir/multiModule/basicWithJava/");
    }

    @TestMetadata("basicWithJavaFakeOverride")
    public void testBasicWithJavaFakeOverride() throws Exception {
        runTest("kotlin/idea/testData/fir/multiModule/basicWithJavaFakeOverride/");
    }

    @TestMetadata("basicWithPrimitiveJava")
    public void testBasicWithPrimitiveJava() throws Exception {
        runTest("kotlin/idea/testData/fir/multiModule/basicWithPrimitiveJava/");
    }

    @TestMetadata("fieldAccessFromDerived")
    public void testFieldAccessFromDerived() throws Exception {
        runTest("kotlin/idea/testData/fir/multiModule/fieldAccessFromDerived/");
    }

    @TestMetadata("intersectionTypesProblem")
    public void testIntersectionTypesProblem() throws Exception {
        runTest("kotlin/idea/testData/fir/multiModule/intersectionTypesProblem/");
    }

    @TestMetadata("javaGetPrefixConflict")
    public void testJavaGetPrefixConflict() throws Exception {
        runTest("kotlin/idea/testData/fir/multiModule/javaGetPrefixConflict/");
    }

    @TestMetadata("javaInheritsKotlinDerived")
    public void testJavaInheritsKotlinDerived() throws Exception {
        runTest("kotlin/idea/testData/fir/multiModule/javaInheritsKotlinDerived/");
    }

    @TestMetadata("javaInheritsKotlinExtension")
    public void testJavaInheritsKotlinExtension() throws Exception {
        runTest("kotlin/idea/testData/fir/multiModule/javaInheritsKotlinExtension/");
    }

    @TestMetadata("javaInheritsKotlinProperty")
    public void testJavaInheritsKotlinProperty() throws Exception {
        runTest("kotlin/idea/testData/fir/multiModule/javaInheritsKotlinProperty/");
    }

    @TestMetadata("javaInheritsRawKotlin")
    public void testJavaInheritsRawKotlin() throws Exception {
        runTest("kotlin/idea/testData/fir/multiModule/javaInheritsRawKotlin/");
    }

    @TestMetadata("javaSyntheticProperty")
    public void testJavaSyntheticProperty() throws Exception {
        runTest("kotlin/idea/testData/fir/multiModule/javaSyntheticProperty/");
    }

    @TestMetadata("mppFakeOverrides")
    public void testMppFakeOverrides() throws Exception {
        runTest("kotlin/idea/testData/fir/multiModule/mppFakeOverrides/");
    }

    @TestMetadata("mppMemberType")
    public void testMppMemberType() throws Exception {
        runTest("kotlin/idea/testData/fir/multiModule/mppMemberType/");
    }

    @TestMetadata("mppMembers")
    public void testMppMembers() throws Exception {
        runTest("kotlin/idea/testData/fir/multiModule/mppMembers/");
    }

    @TestMetadata("mppSuperTypes")
    public void testMppSuperTypes() throws Exception {
        runTest("kotlin/idea/testData/fir/multiModule/mppSuperTypes/");
    }

    @TestMetadata("overrideWithJava")
    public void testOverrideWithJava() throws Exception {
        runTest("kotlin/idea/testData/fir/multiModule/overrideWithJava/");
    }

    @TestMetadata("withStdlib")
    public void testWithStdlib() throws Exception {
        runTest("kotlin/idea/testData/fir/multiModule/withStdlib/");
    }
}
