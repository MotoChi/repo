var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"id":1237,"sl":15,"methods":[{"sl":34,"el":44,"sc":5},{"sl":49,"el":52,"sc":5},{"sl":59,"el":62,"sc":5}],"el":63,"name":"ConstructorTest"},{"id":1237,"sl":17,"methods":[{"sl":18,"el":21,"sc":9}],"el":22,"name":"ConstructorTest.FooClass"},{"id":1239,"sl":24,"methods":[],"el":25,"name":"ConstructorTest.EmptyConstructorClass"},{"id":1239,"sl":27,"methods":[{"sl":29,"el":31,"sc":9}],"el":32,"name":"ConstructorTest.ConstructorCallingPublicMethodClass"}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_59":{"methods":[{"sl":34},{"sl":49}],"name":"emptyConstructor","statements":[{"sl":35},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":42},{"sl":43},{"sl":51}],"pass":true},"test_11":{"methods":[{"sl":34},{"sl":59}],"name":"constructorCallingPublicMethod","statements":[{"sl":35},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":42},{"sl":43},{"sl":61}],"pass":true}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [59, 11], [59, 11], [], [59, 11], [59, 11], [59, 11], [59, 11], [59, 11], [59, 11], [59, 11], [], [], [], [], [], [59], [], [59], [], [], [], [], [], [], [], [11], [], [11], [], []]
