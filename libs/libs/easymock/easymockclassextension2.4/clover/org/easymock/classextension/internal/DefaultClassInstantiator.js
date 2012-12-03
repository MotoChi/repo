var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"id":1082,"sl":17,"methods":[{"sl":26,"el":58,"sc":5},{"sl":67,"el":69,"sc":5},{"sl":80,"el":92,"sc":5},{"sl":101,"el":123,"sc":5},{"sl":125,"el":143,"sc":5},{"sl":145,"el":167,"sc":5},{"sl":169,"el":195,"sc":5},{"sl":197,"el":202,"sc":5}],"el":204,"name":"DefaultClassInstantiator"}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_76":{"methods":[{"sl":26},{"sl":67},{"sl":80},{"sl":101},{"sl":125},{"sl":145},{"sl":197}],"name":"finalType","statements":[{"sl":28},{"sl":29},{"sl":30},{"sl":42},{"sl":43},{"sl":44},{"sl":45},{"sl":68},{"sl":82},{"sl":83},{"sl":86},{"sl":90},{"sl":103},{"sl":105},{"sl":107},{"sl":110},{"sl":114},{"sl":122},{"sl":126},{"sl":127},{"sl":128},{"sl":129},{"sl":130},{"sl":131},{"sl":132},{"sl":134},{"sl":136},{"sl":138},{"sl":139},{"sl":140},{"sl":141},{"sl":142},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":151},{"sl":152},{"sl":199},{"sl":201}],"pass":true},"test_78":{"methods":[{"sl":26},{"sl":67},{"sl":125},{"sl":145},{"sl":169},{"sl":197}],"name":"badSerializable","statements":[{"sl":28},{"sl":29},{"sl":30},{"sl":68},{"sl":126},{"sl":127},{"sl":128},{"sl":129},{"sl":130},{"sl":131},{"sl":132},{"sl":134},{"sl":136},{"sl":138},{"sl":139},{"sl":140},{"sl":141},{"sl":142},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":171},{"sl":194},{"sl":199},{"sl":201}],"pass":true},"test_37":{"methods":[{"sl":26},{"sl":67},{"sl":80},{"sl":101}],"name":"protectedWithPrimitiveConstructor","statements":[{"sl":28},{"sl":42},{"sl":43},{"sl":44},{"sl":45},{"sl":68},{"sl":82},{"sl":83},{"sl":86},{"sl":90},{"sl":103},{"sl":105},{"sl":107},{"sl":109},{"sl":122}],"pass":true},"test_73":{"methods":[{"sl":26},{"sl":67},{"sl":80},{"sl":101}],"name":"constructorWithCodeLimitation","statements":[{"sl":28},{"sl":42},{"sl":43},{"sl":44},{"sl":45},{"sl":55},{"sl":68},{"sl":82},{"sl":83},{"sl":103},{"sl":105},{"sl":122}],"pass":true},"test_60":{"methods":[{"sl":26},{"sl":67},{"sl":80},{"sl":101}],"name":"protectedConstructor","statements":[{"sl":28},{"sl":42},{"sl":43},{"sl":44},{"sl":45},{"sl":68},{"sl":82},{"sl":83},{"sl":103},{"sl":105},{"sl":122}],"pass":true},"test_9":{"methods":[{"sl":26},{"sl":67},{"sl":80},{"sl":101}],"name":"primitiveType","statements":[{"sl":28},{"sl":42},{"sl":43},{"sl":44},{"sl":45},{"sl":68},{"sl":82},{"sl":83},{"sl":86},{"sl":90},{"sl":103},{"sl":105},{"sl":107},{"sl":109},{"sl":122}],"pass":true},"test_51":{"methods":[{"sl":26},{"sl":67},{"sl":125},{"sl":145},{"sl":169},{"sl":197}],"name":"serializable","statements":[{"sl":28},{"sl":29},{"sl":30},{"sl":68},{"sl":126},{"sl":127},{"sl":128},{"sl":129},{"sl":130},{"sl":131},{"sl":132},{"sl":134},{"sl":136},{"sl":138},{"sl":139},{"sl":140},{"sl":141},{"sl":142},{"sl":147},{"sl":148},{"sl":171},{"sl":194},{"sl":199},{"sl":201}],"pass":true},"test_71":{"methods":[{"sl":26},{"sl":67},{"sl":80}],"name":"privateConstructor","statements":[{"sl":28},{"sl":42},{"sl":68},{"sl":82},{"sl":83},{"sl":86},{"sl":87}],"pass":true},"test_34":{"methods":[{"sl":26},{"sl":67},{"sl":80},{"sl":101}],"name":"newInstance","statements":[{"sl":28},{"sl":42},{"sl":43},{"sl":44},{"sl":45},{"sl":68},{"sl":82},{"sl":83},{"sl":103},{"sl":105},{"sl":122}],"pass":true},"test_70":{"methods":[{"sl":26},{"sl":67},{"sl":80}],"name":"privateConstructorLimitation","statements":[{"sl":28},{"sl":42},{"sl":68},{"sl":82},{"sl":83},{"sl":86},{"sl":87}],"pass":true},"test_7":{"methods":[{"sl":26},{"sl":67},{"sl":80},{"sl":101},{"sl":125},{"sl":145},{"sl":197}],"name":"objectParamRecusion","statements":[{"sl":28},{"sl":29},{"sl":30},{"sl":42},{"sl":43},{"sl":44},{"sl":45},{"sl":68},{"sl":82},{"sl":83},{"sl":86},{"sl":90},{"sl":103},{"sl":105},{"sl":107},{"sl":110},{"sl":114},{"sl":117},{"sl":118},{"sl":119},{"sl":122},{"sl":126},{"sl":127},{"sl":128},{"sl":129},{"sl":130},{"sl":131},{"sl":132},{"sl":134},{"sl":136},{"sl":138},{"sl":139},{"sl":140},{"sl":141},{"sl":142},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":151},{"sl":152},{"sl":199},{"sl":201}],"pass":true},"test_56":{"methods":[{"sl":26},{"sl":67},{"sl":80},{"sl":101}],"name":"emptyConstructor","statements":[{"sl":28},{"sl":42},{"sl":43},{"sl":44},{"sl":45},{"sl":68},{"sl":82},{"sl":83},{"sl":103},{"sl":105},{"sl":122}],"pass":true}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [37, 76, 73, 51, 34, 60, 70, 71, 9, 78, 7, 56], [], [37, 76, 73, 51, 34, 60, 70, 71, 9, 78, 7, 56], [76, 51, 78, 7], [76, 51, 78, 7], [], [], [], [], [], [], [], [], [], [], [], [37, 76, 73, 34, 60, 70, 71, 9, 7, 56], [37, 76, 73, 34, 60, 9, 7, 56], [37, 76, 73, 34, 60, 9, 7, 56], [37, 76, 73, 34, 60, 9, 7, 56], [], [], [], [], [], [], [], [], [], [73], [], [], [], [], [], [], [], [], [], [], [], [37, 76, 73, 51, 34, 60, 70, 71, 9, 78, 7, 56], [37, 76, 73, 51, 34, 60, 70, 71, 9, 78, 7, 56], [], [], [], [], [], [], [], [], [], [], [], [37, 76, 73, 34, 60, 70, 71, 9, 7, 56], [], [37, 76, 73, 34, 60, 70, 71, 9, 7, 56], [37, 76, 73, 34, 60, 70, 71, 9, 7, 56], [], [], [37, 76, 70, 71, 9, 7], [70, 71], [], [], [37, 76, 9, 7], [], [], [], [], [], [], [], [], [], [], [37, 76, 73, 34, 60, 9, 7, 56], [], [37, 76, 73, 34, 60, 9, 7, 56], [], [37, 76, 73, 34, 60, 9, 7, 56], [], [37, 76, 9, 7], [], [37, 9], [76, 7], [], [], [], [76, 7], [], [], [7], [7], [7], [], [], [37, 76, 73, 34, 60, 9, 7, 56], [], [], [76, 51, 78, 7], [76, 51, 78, 7], [76, 51, 78, 7], [76, 51, 78, 7], [76, 51, 78, 7], [76, 51, 78, 7], [76, 51, 78, 7], [76, 51, 78, 7], [], [76, 51, 78, 7], [], [76, 51, 78, 7], [], [76, 51, 78, 7], [76, 51, 78, 7], [76, 51, 78, 7], [76, 51, 78, 7], [76, 51, 78, 7], [], [], [76, 51, 78, 7], [], [76, 51, 78, 7], [76, 51, 78, 7], [76, 78, 7], [76, 78, 7], [76, 7], [76, 7], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [51, 78], [], [51, 78], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [51, 78], [], [], [76, 51, 78, 7], [], [76, 51, 78, 7], [], [76, 51, 78, 7], [], [], []]