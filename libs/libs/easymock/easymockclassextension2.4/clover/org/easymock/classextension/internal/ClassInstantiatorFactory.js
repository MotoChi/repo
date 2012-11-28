var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"id":1224,"sl":10,"methods":[{"sl":15,"el":16,"sc":5},{"sl":25,"el":27,"sc":5},{"sl":34,"el":36,"sc":5},{"sl":38,"el":40,"sc":5},{"sl":47,"el":49,"sc":5},{"sl":58,"el":60,"sc":5},{"sl":65,"el":67,"sc":5}],"el":68,"name":"ClassInstantiatorFactory"}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_59":{"methods":[{"sl":47}],"name":"emptyConstructor","statements":[{"sl":48}],"pass":true},"test_58":{"methods":[{"sl":47}],"name":"testNiceMock","statements":[{"sl":48}],"pass":true},"test_11":{"methods":[{"sl":47}],"name":"constructorCallingPublicMethod","statements":[{"sl":48}],"pass":true},"test_50":{"methods":[{"sl":47}],"name":"testToString_WithOverload","statements":[{"sl":48}],"pass":true},"test_16":{"methods":[{"sl":47}],"name":"testToString_WithTwoOverload","statements":[{"sl":48}],"pass":true},"test_17":{"methods":[{"sl":47},{"sl":58}],"name":"getInstantiator_Overriden","statements":[{"sl":48},{"sl":59}],"pass":true},"test_51":{"methods":[{"sl":34},{"sl":38},{"sl":47}],"name":"serializable","statements":[{"sl":35},{"sl":39},{"sl":48}],"pass":true},"test_52":{"methods":[{"sl":47}],"name":"testNiceMock_Partial","statements":[{"sl":48}],"pass":true},"test_14":{"methods":[{"sl":47}],"name":"testTwoMocks","statements":[{"sl":48}],"pass":true},"test_55":{"methods":[{"sl":47}],"name":"testDeprecatedClassMocking","statements":[{"sl":48}],"pass":true},"test_93":{"methods":[{"sl":47}],"name":"testMocksControl_PartialMock_NoConstructorCalled","statements":[{"sl":48}],"pass":true},"test_56":{"methods":[{"sl":47}],"name":"emptyConstructor","statements":[{"sl":48}],"pass":true},"test_18":{"methods":[{"sl":47}],"name":"testNiceClassMocking","statements":[{"sl":48}],"pass":true},"test_19":{"methods":[{"sl":47}],"name":"privateConstructor","statements":[{"sl":48}],"pass":true},"test_48":{"methods":[{"sl":47}],"name":"testPartialClassMocking","statements":[{"sl":48}],"pass":true},"test_86":{"methods":[{"sl":47}],"name":"testEquals_WithOverload","statements":[{"sl":48}],"pass":true},"test_85":{"methods":[{"sl":47}],"name":"testMocksControl_Class_WithName","statements":[{"sl":48}],"pass":true},"test_84":{"methods":[{"sl":25}],"name":"getJVM","statements":[{"sl":26}],"pass":true},"test_83":{"methods":[{"sl":47}],"name":"testCheckOrder","statements":[{"sl":48}],"pass":true},"test_89":{"methods":[{"sl":47}],"name":"abstractClass","statements":[{"sl":48}],"pass":true},"test_88":{"methods":[{"sl":47}],"name":"testDeprecatedStrictPartialClassMocking","statements":[{"sl":48}],"pass":true},"test_87":{"methods":[{"sl":47}],"name":"testStrictMock_Partial","statements":[{"sl":48}],"pass":true},"test_41":{"methods":[{"sl":47}],"name":"testDeprecatedNiceClassMocking","statements":[{"sl":48}],"pass":true},"test_42":{"methods":[{"sl":47}],"name":"testResetReplay","statements":[{"sl":48}],"pass":true},"test_40":{"methods":[{"sl":47}],"name":"testMakeThreadSafe","statements":[{"sl":48}],"pass":true},"test_82":{"methods":[{"sl":47}],"name":"testNamedMock","statements":[{"sl":48}],"pass":true},"test_46":{"methods":[{"sl":47}],"name":"testHashCode_WithOverload","statements":[{"sl":48}],"pass":true},"test_80":{"methods":[{"sl":47}],"name":"testMocksControl_Class","statements":[{"sl":48}],"pass":true},"test_43":{"methods":[{"sl":47}],"name":"testStrictMock","statements":[{"sl":48}],"pass":true},"test_44":{"methods":[{"sl":47}],"name":"testEquals","statements":[{"sl":48}],"pass":true},"test_2":{"methods":[{"sl":47}],"name":"testPackageScope","statements":[{"sl":48}],"pass":true},"test_4":{"methods":[{"sl":47}],"name":"testDeprecatedNicePartialClassMocking","statements":[{"sl":48}],"pass":true},"test_37":{"methods":[{"sl":47}],"name":"protectedWithPrimitiveConstructor","statements":[{"sl":48}],"pass":true},"test_39":{"methods":[{"sl":47}],"name":"getInstantiator_Default","statements":[{"sl":48}],"pass":true},"test_0":{"methods":[{"sl":47},{"sl":58},{"sl":65}],"name":"getInstantiator_BackToDefault","statements":[{"sl":48},{"sl":59},{"sl":66}],"pass":true},"test_9":{"methods":[{"sl":47}],"name":"primitiveType","statements":[{"sl":48}],"pass":true},"test_5":{"methods":[{"sl":47}],"name":"testHashCode","statements":[{"sl":48}],"pass":true},"test_7":{"methods":[{"sl":47}],"name":"objectParamRecusion","statements":[{"sl":48}],"pass":true},"test_8":{"methods":[{"sl":47}],"name":"testToString","statements":[{"sl":48}],"pass":true},"test_77":{"methods":[{"sl":47}],"name":"testMocksControl_NamedPartialMock_NoConstructorCalled","statements":[{"sl":48}],"pass":true},"test_76":{"methods":[{"sl":47}],"name":"finalType","statements":[{"sl":48}],"pass":true},"test_78":{"methods":[{"sl":34},{"sl":38}],"name":"badSerializable","statements":[{"sl":35},{"sl":39}],"pass":true},"test_73":{"methods":[{"sl":47}],"name":"constructorWithCodeLimitation","statements":[{"sl":48}],"pass":true},"test_72":{"methods":[{"sl":47}],"name":"testDeprecatedPartialClassMocking","statements":[{"sl":48}],"pass":true},"test_74":{"methods":[{"sl":47}],"name":"testMock_Partial","statements":[{"sl":48}],"pass":true},"test_33":{"methods":[{"sl":47}],"name":"testStrictPartialClassMocking","statements":[{"sl":48}],"pass":true},"test_34":{"methods":[{"sl":47}],"name":"newInstance","statements":[{"sl":48}],"pass":true},"test_70":{"methods":[{"sl":47}],"name":"privateConstructorLimitation","statements":[{"sl":48}],"pass":true},"test_35":{"methods":[{"sl":47}],"name":"test","statements":[{"sl":48}],"pass":true},"test_31":{"methods":[{"sl":47}],"name":"testGetControl_EasyMockClassExtension","statements":[{"sl":48}],"pass":true},"test_29":{"methods":[{"sl":47}],"name":"testStrictClassMocking","statements":[{"sl":48}],"pass":true},"test_28":{"methods":[{"sl":47}],"name":"testDeprecatedStrictClassMocking","statements":[{"sl":48}],"pass":true},"test_27":{"methods":[{"sl":47}],"name":"testResetTo","statements":[{"sl":48}],"pass":true},"test_26":{"methods":[{"sl":47}],"name":"testCompare","statements":[{"sl":48}],"pass":true},"test_68":{"methods":[{"sl":47}],"name":"testClassMocking","statements":[{"sl":48}],"pass":true},"test_67":{"methods":[{"sl":47}],"name":"testNormalMock","statements":[{"sl":48}],"pass":true},"test_66":{"methods":[{"sl":47}],"name":"testVarargs","statements":[{"sl":48}],"pass":true},"test_64":{"methods":[{"sl":47}],"name":"testClassMocking","statements":[{"sl":48}],"pass":true},"test_63":{"methods":[{"sl":47}],"name":"testBridgeUnmocked","statements":[{"sl":48}],"pass":true},"test_23":{"methods":[{"sl":47}],"name":"testNicePartialClassMocking","statements":[{"sl":48}],"pass":true},"test_60":{"methods":[{"sl":47}],"name":"protectedConstructor","statements":[{"sl":48}],"pass":true},"test_22":{"methods":[{"sl":47}],"name":"mockFinalMethod","statements":[{"sl":48}],"pass":true}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [84], [84], [], [], [], [], [], [], [], [78, 51], [78, 51], [], [], [78, 51], [78, 51], [], [], [], [], [], [], [], [31, 33, 85, 17, 68, 88, 5, 22, 28, 42, 64, 39, 82, 9, 80, 73, 87, 86, 50, 77, 29, 7, 89, 58, 93, 43, 67, 55, 34, 59, 14, 26, 46, 74, 11, 40, 19, 41, 44, 0, 72, 56, 48, 63, 51, 60, 16, 4, 27, 66, 52, 76, 83, 18, 2, 23, 70, 35, 8, 37], [31, 33, 85, 17, 68, 88, 5, 22, 28, 42, 64, 39, 82, 9, 80, 73, 87, 86, 50, 77, 29, 7, 89, 58, 93, 43, 67, 55, 34, 59, 14, 26, 46, 74, 11, 40, 19, 41, 44, 0, 72, 56, 48, 63, 51, 60, 16, 4, 27, 66, 52, 76, 83, 18, 2, 23, 70, 35, 8, 37], [], [], [], [], [], [], [], [], [], [17, 0], [17, 0], [], [], [], [], [], [0], [0], [], []]
