/*
 * Copyright 2010-2014 JetBrains s.r.o.
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

package org.jetbrains.jet.resolve.calls;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import java.util.regex.Pattern;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.resolve.calls.AbstractResolvedCallsTest;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/resolvedCalls")
@InnerTestClasses({ResolvedCallsTestGenerated.Arguments.class, ResolvedCallsTestGenerated.DifferentCallElements.class, ResolvedCallsTestGenerated.FunctionTypes.class, ResolvedCallsTestGenerated.Invoke.class, ResolvedCallsTestGenerated.RealExamples.class, ResolvedCallsTestGenerated.ThisOrSuper.class})
public class ResolvedCallsTestGenerated extends AbstractResolvedCallsTest {
    public void testAllFilesPresentInResolvedCalls() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/resolvedCalls"), Pattern.compile("^(.+)\\.kt$"), true);
    }
    
    @TestMetadata("explicitReceiverIsReceiverArgument.kt")
    public void testExplicitReceiverIsReceiverArgument() throws Exception {
        doTest("compiler/testData/resolvedCalls/explicitReceiverIsReceiverArgument.kt");
    }
    
    @TestMetadata("explicitReceiverIsThisObject.kt")
    public void testExplicitReceiverIsThisObject() throws Exception {
        doTest("compiler/testData/resolvedCalls/explicitReceiverIsThisObject.kt");
    }
    
    @TestMetadata("hasBothThisObjectAndReceiverArgument.kt")
    public void testHasBothThisObjectAndReceiverArgument() throws Exception {
        doTest("compiler/testData/resolvedCalls/hasBothThisObjectAndReceiverArgument.kt");
    }
    
    @TestMetadata("hasBothThisObjectAndReceiverArgumentWithoutExplicitReceiver.kt")
    public void testHasBothThisObjectAndReceiverArgumentWithoutExplicitReceiver() throws Exception {
        doTest("compiler/testData/resolvedCalls/hasBothThisObjectAndReceiverArgumentWithoutExplicitReceiver.kt");
    }
    
    @TestMetadata("implicitReceiverIsReceiverArgument.kt")
    public void testImplicitReceiverIsReceiverArgument() throws Exception {
        doTest("compiler/testData/resolvedCalls/implicitReceiverIsReceiverArgument.kt");
    }
    
    @TestMetadata("implicitReceiverIsThisObject.kt")
    public void testImplicitReceiverIsThisObject() throws Exception {
        doTest("compiler/testData/resolvedCalls/implicitReceiverIsThisObject.kt");
    }
    
    @TestMetadata("impliedThisNoExplicitReceiver.kt")
    public void testImpliedThisNoExplicitReceiver() throws Exception {
        doTest("compiler/testData/resolvedCalls/impliedThisNoExplicitReceiver.kt");
    }
    
    @TestMetadata("simpleCall.kt")
    public void testSimpleCall() throws Exception {
        doTest("compiler/testData/resolvedCalls/simpleCall.kt");
    }
    
    @TestMetadata("compiler/testData/resolvedCalls/arguments")
    @InnerTestClasses({Arguments.FunctionLiterals.class, Arguments.GenericCalls.class, Arguments.NamedArguments.class, Arguments.OneArgument.class, Arguments.RealExamples.class, Arguments.SeveralCandidates.class})
    public static class Arguments extends AbstractResolvedCallsTest {
        public void testAllFilesPresentInArguments() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/resolvedCalls/arguments"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("compiler/testData/resolvedCalls/arguments/functionLiterals")
        public static class FunctionLiterals extends AbstractResolvedCallsTest {
            public void testAllFilesPresentInFunctionLiterals() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/resolvedCalls/arguments/functionLiterals"), Pattern.compile("^(.+)\\.kt$"), true);
            }
            
            @TestMetadata("chainedLambdas.kt")
            public void testChainedLambdas() throws Exception {
                doTest("compiler/testData/resolvedCalls/arguments/functionLiterals/chainedLambdas.kt");
            }
            
            @TestMetadata("notInferredLambdaReturnType.kt")
            public void testNotInferredLambdaReturnType() throws Exception {
                doTest("compiler/testData/resolvedCalls/arguments/functionLiterals/notInferredLambdaReturnType.kt");
            }
            
            @TestMetadata("notInferredLambdaType.kt")
            public void testNotInferredLambdaType() throws Exception {
                doTest("compiler/testData/resolvedCalls/arguments/functionLiterals/notInferredLambdaType.kt");
            }
            
            @TestMetadata("simpleGenericLambda.kt")
            public void testSimpleGenericLambda() throws Exception {
                doTest("compiler/testData/resolvedCalls/arguments/functionLiterals/simpleGenericLambda.kt");
            }
            
            @TestMetadata("simpleLambda.kt")
            public void testSimpleLambda() throws Exception {
                doTest("compiler/testData/resolvedCalls/arguments/functionLiterals/simpleLambda.kt");
            }
            
            @TestMetadata("unmappedLambda.kt")
            public void testUnmappedLambda() throws Exception {
                doTest("compiler/testData/resolvedCalls/arguments/functionLiterals/unmappedLambda.kt");
            }
            
        }
        
        @TestMetadata("compiler/testData/resolvedCalls/arguments/genericCalls")
        public static class GenericCalls extends AbstractResolvedCallsTest {
            public void testAllFilesPresentInGenericCalls() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/resolvedCalls/arguments/genericCalls"), Pattern.compile("^(.+)\\.kt$"), true);
            }
            
            @TestMetadata("inferredParameter.kt")
            public void testInferredParameter() throws Exception {
                doTest("compiler/testData/resolvedCalls/arguments/genericCalls/inferredParameter.kt");
            }
            
            @TestMetadata("simpleGeneric.kt")
            public void testSimpleGeneric() throws Exception {
                doTest("compiler/testData/resolvedCalls/arguments/genericCalls/simpleGeneric.kt");
            }
            
            @TestMetadata("uninferredParameter.kt")
            public void testUninferredParameter() throws Exception {
                doTest("compiler/testData/resolvedCalls/arguments/genericCalls/uninferredParameter.kt");
            }
            
            @TestMetadata("uninferredParameterTypeMismatch.kt")
            public void testUninferredParameterTypeMismatch() throws Exception {
                doTest("compiler/testData/resolvedCalls/arguments/genericCalls/uninferredParameterTypeMismatch.kt");
            }
            
        }
        
        @TestMetadata("compiler/testData/resolvedCalls/arguments/namedArguments")
        public static class NamedArguments extends AbstractResolvedCallsTest {
            public void testAllFilesPresentInNamedArguments() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/resolvedCalls/arguments/namedArguments"), Pattern.compile("^(.+)\\.kt$"), true);
            }
            
            @TestMetadata("positionedAfterNamed.kt")
            public void testPositionedAfterNamed() throws Exception {
                doTest("compiler/testData/resolvedCalls/arguments/namedArguments/positionedAfterNamed.kt");
            }
            
            @TestMetadata("shiftedArgsMatch.kt")
            public void testShiftedArgsMatch() throws Exception {
                doTest("compiler/testData/resolvedCalls/arguments/namedArguments/shiftedArgsMatch.kt");
            }
            
        }
        
        @TestMetadata("compiler/testData/resolvedCalls/arguments/oneArgument")
        public static class OneArgument extends AbstractResolvedCallsTest {
            public void testAllFilesPresentInOneArgument() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/resolvedCalls/arguments/oneArgument"), Pattern.compile("^(.+)\\.kt$"), true);
            }
            
            @TestMetadata("argumentHasNoType.kt")
            public void testArgumentHasNoType() throws Exception {
                doTest("compiler/testData/resolvedCalls/arguments/oneArgument/argumentHasNoType.kt");
            }
            
            @TestMetadata("simpleMatch.kt")
            public void testSimpleMatch() throws Exception {
                doTest("compiler/testData/resolvedCalls/arguments/oneArgument/simpleMatch.kt");
            }
            
            @TestMetadata("typeMismatch.kt")
            public void testTypeMismatch() throws Exception {
                doTest("compiler/testData/resolvedCalls/arguments/oneArgument/typeMismatch.kt");
            }
            
            @TestMetadata("unmappedArgument.kt")
            public void testUnmappedArgument() throws Exception {
                doTest("compiler/testData/resolvedCalls/arguments/oneArgument/unmappedArgument.kt");
            }
            
        }
        
        @TestMetadata("compiler/testData/resolvedCalls/arguments/realExamples")
        public static class RealExamples extends AbstractResolvedCallsTest {
            public void testAllFilesPresentInRealExamples() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/resolvedCalls/arguments/realExamples"), Pattern.compile("^(.+)\\.kt$"), true);
            }
            
            @TestMetadata("emptyList.kt")
            public void testEmptyList() throws Exception {
                doTest("compiler/testData/resolvedCalls/arguments/realExamples/emptyList.kt");
            }
            
            @TestMetadata("emptyMutableList.kt")
            public void testEmptyMutableList() throws Exception {
                doTest("compiler/testData/resolvedCalls/arguments/realExamples/emptyMutableList.kt");
            }
            
        }
        
        @TestMetadata("compiler/testData/resolvedCalls/arguments/severalCandidates")
        public static class SeveralCandidates extends AbstractResolvedCallsTest {
            public void testAllFilesPresentInSeveralCandidates() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/resolvedCalls/arguments/severalCandidates"), Pattern.compile("^(.+)\\.kt$"), true);
            }
            
            @TestMetadata("mostSpecific.kt")
            public void testMostSpecific() throws Exception {
                doTest("compiler/testData/resolvedCalls/arguments/severalCandidates/mostSpecific.kt");
            }
            
        }
        
        public static Test innerSuite() {
            TestSuite suite = new TestSuite("Arguments");
            suite.addTestSuite(Arguments.class);
            suite.addTestSuite(FunctionLiterals.class);
            suite.addTestSuite(GenericCalls.class);
            suite.addTestSuite(NamedArguments.class);
            suite.addTestSuite(OneArgument.class);
            suite.addTestSuite(RealExamples.class);
            suite.addTestSuite(SeveralCandidates.class);
            return suite;
        }
    }
    
    @TestMetadata("compiler/testData/resolvedCalls/differentCallElements")
    public static class DifferentCallElements extends AbstractResolvedCallsTest {
        public void testAllFilesPresentInDifferentCallElements() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/resolvedCalls/differentCallElements"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("annotationCall.kt")
        public void testAnnotationCall() throws Exception {
            doTest("compiler/testData/resolvedCalls/differentCallElements/annotationCall.kt");
        }
        
        @TestMetadata("delegatorToSuperCall.kt")
        public void testDelegatorToSuperCall() throws Exception {
            doTest("compiler/testData/resolvedCalls/differentCallElements/delegatorToSuperCall.kt");
        }
        
        @TestMetadata("simpleArrayAccess.kt")
        public void testSimpleArrayAccess() throws Exception {
            doTest("compiler/testData/resolvedCalls/differentCallElements/simpleArrayAccess.kt");
        }
        
    }
    
    @TestMetadata("compiler/testData/resolvedCalls/functionTypes")
    public static class FunctionTypes extends AbstractResolvedCallsTest {
        public void testAllFilesPresentInFunctionTypes() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/resolvedCalls/functionTypes"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("invokeForExtensionFunctionType.kt")
        public void testInvokeForExtensionFunctionType() throws Exception {
            doTest("compiler/testData/resolvedCalls/functionTypes/invokeForExtensionFunctionType.kt");
        }
        
        @TestMetadata("invokeForFunctionType.kt")
        public void testInvokeForFunctionType() throws Exception {
            doTest("compiler/testData/resolvedCalls/functionTypes/invokeForFunctionType.kt");
        }
        
        @TestMetadata("valOfExtensionFunctionType.kt")
        public void testValOfExtensionFunctionType() throws Exception {
            doTest("compiler/testData/resolvedCalls/functionTypes/valOfExtensionFunctionType.kt");
        }
        
        @TestMetadata("valOfExtensionFunctionTypeInvoke.kt")
        public void testValOfExtensionFunctionTypeInvoke() throws Exception {
            doTest("compiler/testData/resolvedCalls/functionTypes/valOfExtensionFunctionTypeInvoke.kt");
        }
        
        @TestMetadata("valOfFunctionType.kt")
        public void testValOfFunctionType() throws Exception {
            doTest("compiler/testData/resolvedCalls/functionTypes/valOfFunctionType.kt");
        }
        
        @TestMetadata("valOfFunctionTypeInvoke.kt")
        public void testValOfFunctionTypeInvoke() throws Exception {
            doTest("compiler/testData/resolvedCalls/functionTypes/valOfFunctionTypeInvoke.kt");
        }
        
    }
    
    @TestMetadata("compiler/testData/resolvedCalls/invoke")
    public static class Invoke extends AbstractResolvedCallsTest {
        public void testAllFilesPresentInInvoke() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/resolvedCalls/invoke"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("bothReceivers.kt")
        public void testBothReceivers() throws Exception {
            doTest("compiler/testData/resolvedCalls/invoke/bothReceivers.kt");
        }
        
        @TestMetadata("implicitReceiverForInvoke.kt")
        public void testImplicitReceiverForInvoke() throws Exception {
            doTest("compiler/testData/resolvedCalls/invoke/implicitReceiverForInvoke.kt");
        }
        
        @TestMetadata("receiverArgumentAsReceiverForInvoke.kt")
        public void testReceiverArgumentAsReceiverForInvoke() throws Exception {
            doTest("compiler/testData/resolvedCalls/invoke/receiverArgumentAsReceiverForInvoke.kt");
        }
        
        @TestMetadata("thisObjectAsReceiverForInvoke.kt")
        public void testThisObjectAsReceiverForInvoke() throws Exception {
            doTest("compiler/testData/resolvedCalls/invoke/thisObjectAsReceiverForInvoke.kt");
        }
        
    }
    
    @TestMetadata("compiler/testData/resolvedCalls/realExamples")
    public static class RealExamples extends AbstractResolvedCallsTest {
        public void testAllFilesPresentInRealExamples() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/resolvedCalls/realExamples"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("stringPlusInBuilders.kt")
        public void testStringPlusInBuilders() throws Exception {
            doTest("compiler/testData/resolvedCalls/realExamples/stringPlusInBuilders.kt");
        }
        
    }
    
    @TestMetadata("compiler/testData/resolvedCalls/thisOrSuper")
    public static class ThisOrSuper extends AbstractResolvedCallsTest {
        public void testAllFilesPresentInThisOrSuper() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/resolvedCalls/thisOrSuper"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("labeledSuper.kt")
        public void testLabeledSuper() throws Exception {
            doTest("compiler/testData/resolvedCalls/thisOrSuper/labeledSuper.kt");
        }
        
        @TestMetadata("labeledThis.kt")
        public void testLabeledThis() throws Exception {
            doTest("compiler/testData/resolvedCalls/thisOrSuper/labeledThis.kt");
        }
        
        @TestMetadata("simpleSuper.kt")
        public void testSimpleSuper() throws Exception {
            doTest("compiler/testData/resolvedCalls/thisOrSuper/simpleSuper.kt");
        }
        
        @TestMetadata("simpleThis.kt")
        public void testSimpleThis() throws Exception {
            doTest("compiler/testData/resolvedCalls/thisOrSuper/simpleThis.kt");
        }
        
        @TestMetadata("thisInExtensionFunction.kt")
        public void testThisInExtensionFunction() throws Exception {
            doTest("compiler/testData/resolvedCalls/thisOrSuper/thisInExtensionFunction.kt");
        }
        
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("ResolvedCallsTestGenerated");
        suite.addTestSuite(ResolvedCallsTestGenerated.class);
        suite.addTest(Arguments.innerSuite());
        suite.addTestSuite(DifferentCallElements.class);
        suite.addTestSuite(FunctionTypes.class);
        suite.addTestSuite(Invoke.class);
        suite.addTestSuite(RealExamples.class);
        suite.addTestSuite(ThisOrSuper.class);
        return suite;
    }
}
