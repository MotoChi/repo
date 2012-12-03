var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"id":495,"sl":25,"methods":[{"sl":42,"el":57,"sc":5},{"sl":59,"el":64,"sc":5},{"sl":66,"el":71,"sc":5},{"sl":73,"el":79,"sc":5},{"sl":81,"el":86,"sc":5},{"sl":88,"el":93,"sc":5},{"sl":95,"el":100,"sc":5},{"sl":102,"el":105,"sc":5},{"sl":107,"el":112,"sc":5},{"sl":114,"el":119,"sc":5},{"sl":121,"el":126,"sc":5},{"sl":128,"el":133,"sc":5},{"sl":135,"el":140,"sc":5},{"sl":142,"el":147,"sc":5},{"sl":149,"el":154,"sc":5},{"sl":156,"el":161,"sc":5},{"sl":163,"el":168,"sc":5},{"sl":170,"el":180,"sc":5},{"sl":182,"el":186,"sc":5},{"sl":188,"el":190,"sc":5},{"sl":192,"el":210,"sc":5},{"sl":212,"el":219,"sc":5}],"el":220,"name":"MockingTest"},{"id":495,"sl":29,"methods":[{"sl":30,"el":32,"sc":9},{"sl":34,"el":36,"sc":9}],"el":37,"name":"MockingTest.ClassToMock"}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_48":{"methods":[{"sl":30},{"sl":107},{"sl":170},{"sl":182},{"sl":188},{"sl":192},{"sl":212}],"name":"testPartialClassMocking","statements":[{"sl":31},{"sl":109},{"sl":111},{"sl":172},{"sl":173},{"sl":174},{"sl":175},{"sl":176},{"sl":177},{"sl":178},{"sl":179},{"sl":184},{"sl":185},{"sl":189},{"sl":193},{"sl":195},{"sl":196},{"sl":197},{"sl":198},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":206},{"sl":213},{"sl":214}],"pass":true},"test_4":{"methods":[{"sl":30},{"sl":163},{"sl":170},{"sl":182},{"sl":188},{"sl":192},{"sl":212}],"name":"testDeprecatedNicePartialClassMocking","statements":[{"sl":31},{"sl":165},{"sl":167},{"sl":172},{"sl":173},{"sl":174},{"sl":175},{"sl":176},{"sl":177},{"sl":178},{"sl":179},{"sl":184},{"sl":185},{"sl":189},{"sl":193},{"sl":195},{"sl":196},{"sl":197},{"sl":198},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":206},{"sl":213},{"sl":214}],"pass":true},"test_29":{"methods":[{"sl":88},{"sl":182},{"sl":188},{"sl":192}],"name":"testStrictClassMocking","statements":[{"sl":90},{"sl":92},{"sl":184},{"sl":185},{"sl":189},{"sl":193},{"sl":195},{"sl":196},{"sl":197},{"sl":198},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":206}],"pass":true},"test_28":{"methods":[{"sl":135},{"sl":182},{"sl":188},{"sl":192}],"name":"testDeprecatedStrictClassMocking","statements":[{"sl":137},{"sl":139},{"sl":184},{"sl":185},{"sl":189},{"sl":193},{"sl":195},{"sl":196},{"sl":197},{"sl":198},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":206}],"pass":true},"test_68":{"methods":[{"sl":81},{"sl":182},{"sl":188},{"sl":192}],"name":"testClassMocking","statements":[{"sl":83},{"sl":85},{"sl":184},{"sl":185},{"sl":189},{"sl":193},{"sl":195},{"sl":196},{"sl":197},{"sl":198},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":206}],"pass":true},"test_79":{"methods":[{"sl":73},{"sl":102},{"sl":188},{"sl":192}],"name":"testStrictInterfaceMocking","statements":[{"sl":76},{"sl":78},{"sl":103},{"sl":104},{"sl":189},{"sl":193},{"sl":195},{"sl":196},{"sl":197},{"sl":198},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":206}],"pass":true},"test_72":{"methods":[{"sl":30},{"sl":149},{"sl":170},{"sl":182},{"sl":188},{"sl":192},{"sl":212}],"name":"testDeprecatedPartialClassMocking","statements":[{"sl":31},{"sl":151},{"sl":153},{"sl":172},{"sl":173},{"sl":174},{"sl":175},{"sl":176},{"sl":177},{"sl":178},{"sl":179},{"sl":184},{"sl":185},{"sl":189},{"sl":193},{"sl":195},{"sl":196},{"sl":197},{"sl":198},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":206},{"sl":213},{"sl":214}],"pass":true},"test_88":{"methods":[{"sl":30},{"sl":156},{"sl":170},{"sl":182},{"sl":188},{"sl":192},{"sl":212}],"name":"testDeprecatedStrictPartialClassMocking","statements":[{"sl":31},{"sl":158},{"sl":160},{"sl":172},{"sl":173},{"sl":174},{"sl":175},{"sl":176},{"sl":177},{"sl":178},{"sl":179},{"sl":184},{"sl":185},{"sl":189},{"sl":193},{"sl":195},{"sl":196},{"sl":197},{"sl":198},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":206},{"sl":213},{"sl":214}],"pass":true},"test_41":{"methods":[{"sl":142},{"sl":182},{"sl":188},{"sl":192}],"name":"testDeprecatedNiceClassMocking","statements":[{"sl":144},{"sl":146},{"sl":184},{"sl":185},{"sl":189},{"sl":193},{"sl":195},{"sl":196},{"sl":197},{"sl":198},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":206}],"pass":true},"test_23":{"methods":[{"sl":30},{"sl":121},{"sl":170},{"sl":182},{"sl":188},{"sl":192},{"sl":212}],"name":"testNicePartialClassMocking","statements":[{"sl":31},{"sl":123},{"sl":125},{"sl":172},{"sl":173},{"sl":174},{"sl":175},{"sl":176},{"sl":177},{"sl":178},{"sl":179},{"sl":184},{"sl":185},{"sl":189},{"sl":193},{"sl":195},{"sl":196},{"sl":197},{"sl":198},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":206},{"sl":213},{"sl":214}],"pass":true},"test_24":{"methods":[{"sl":59},{"sl":102},{"sl":188},{"sl":192}],"name":"testInterfaceMocking","statements":[{"sl":62},{"sl":63},{"sl":103},{"sl":104},{"sl":189},{"sl":193},{"sl":195},{"sl":196},{"sl":197},{"sl":198},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":206}],"pass":true},"test_33":{"methods":[{"sl":30},{"sl":114},{"sl":170},{"sl":182},{"sl":188},{"sl":192},{"sl":212}],"name":"testStrictPartialClassMocking","statements":[{"sl":31},{"sl":116},{"sl":118},{"sl":172},{"sl":173},{"sl":174},{"sl":175},{"sl":176},{"sl":177},{"sl":178},{"sl":179},{"sl":184},{"sl":185},{"sl":189},{"sl":193},{"sl":195},{"sl":196},{"sl":197},{"sl":198},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":206},{"sl":213},{"sl":214}],"pass":true},"test_14":{"methods":[{"sl":42}],"name":"testTwoMocks","statements":[{"sl":44},{"sl":46},{"sl":47},{"sl":49},{"sl":52},{"sl":55},{"sl":56}],"pass":true},"test_15":{"methods":[{"sl":66},{"sl":102},{"sl":188},{"sl":192}],"name":"testNiceInterfaceMocking","statements":[{"sl":69},{"sl":70},{"sl":103},{"sl":104},{"sl":189},{"sl":193},{"sl":195},{"sl":196},{"sl":197},{"sl":198},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":206}],"pass":true},"test_55":{"methods":[{"sl":128},{"sl":182},{"sl":188},{"sl":192}],"name":"testDeprecatedClassMocking","statements":[{"sl":130},{"sl":132},{"sl":184},{"sl":185},{"sl":189},{"sl":193},{"sl":195},{"sl":196},{"sl":197},{"sl":198},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":206}],"pass":true},"test_18":{"methods":[{"sl":95},{"sl":182},{"sl":188},{"sl":192}],"name":"testNiceClassMocking","statements":[{"sl":97},{"sl":99},{"sl":184},{"sl":185},{"sl":189},{"sl":193},{"sl":195},{"sl":196},{"sl":197},{"sl":198},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":206}],"pass":true}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [33, 23, 48, 72, 4, 88], [33, 23, 48, 72, 4, 88], [], [], [], [], [], [], [], [], [], [], [14], [], [14], [], [14], [14], [], [14], [], [], [14], [], [], [14], [14], [], [], [24], [], [], [24], [24], [], [], [15], [], [], [15], [15], [], [], [79], [], [], [79], [], [79], [], [], [68], [], [68], [], [68], [], [], [29], [], [29], [], [29], [], [], [18], [], [18], [], [18], [], [], [15, 24, 79], [15, 24, 79], [15, 24, 79], [], [], [48], [], [48], [], [48], [], [], [33], [], [33], [], [33], [], [], [23], [], [23], [], [23], [], [], [55], [], [55], [], [55], [], [], [28], [], [28], [], [28], [], [], [41], [], [41], [], [41], [], [], [72], [], [72], [], [72], [], [], [88], [], [88], [], [88], [], [], [4], [], [4], [], [4], [], [], [33, 23, 48, 72, 4, 88], [], [33, 23, 48, 72, 4, 88], [33, 23, 48, 72, 4, 88], [33, 23, 48, 72, 4, 88], [33, 23, 48, 72, 4, 88], [33, 23, 48, 72, 4, 88], [33, 23, 48, 72, 4, 88], [33, 23, 48, 72, 4, 88], [33, 23, 48, 72, 4, 88], [], [], [33, 18, 29, 23, 48, 55, 72, 68, 4, 41, 88, 28], [], [33, 18, 29, 23, 48, 55, 72, 68, 4, 41, 88, 28], [33, 18, 29, 23, 48, 55, 72, 68, 4, 41, 88, 28], [], [], [33, 18, 29, 23, 48, 15, 55, 72, 68, 24, 4, 41, 88, 28, 79], [33, 18, 29, 23, 48, 15, 55, 72, 68, 24, 4, 41, 88, 28, 79], [], [], [33, 18, 29, 23, 48, 15, 55, 72, 68, 24, 4, 41, 88, 28, 79], [33, 18, 29, 23, 48, 15, 55, 72, 68, 24, 4, 41, 88, 28, 79], [], [33, 18, 29, 23, 48, 15, 55, 72, 68, 24, 4, 41, 88, 28, 79], [33, 18, 29, 23, 48, 15, 55, 72, 68, 24, 4, 41, 88, 28, 79], [33, 18, 29, 23, 48, 15, 55, 72, 68, 24, 4, 41, 88, 28, 79], [33, 18, 29, 23, 48, 15, 55, 72, 68, 24, 4, 41, 88, 28, 79], [], [], [33, 18, 29, 23, 48, 15, 55, 72, 68, 24, 4, 41, 88, 28, 79], [33, 18, 29, 23, 48, 15, 55, 72, 68, 24, 4, 41, 88, 28, 79], [33, 18, 29, 23, 48, 15, 55, 72, 68, 24, 4, 41, 88, 28, 79], [33, 18, 29, 23, 48, 15, 55, 72, 68, 24, 4, 41, 88, 28, 79], [], [33, 18, 29, 23, 48, 15, 55, 72, 68, 24, 4, 41, 88, 28, 79], [], [], [], [], [], [33, 23, 48, 72, 4, 88], [33, 23, 48, 72, 4, 88], [33, 23, 48, 72, 4, 88], [], [], [], [], [], []]