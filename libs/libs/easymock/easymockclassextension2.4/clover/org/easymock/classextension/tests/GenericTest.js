var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"id":441,"sl":18,"methods":[{"sl":30,"el":37,"sc":5},{"sl":59,"el":66,"sc":5}],"el":67,"name":"GenericTest"},{"id":441,"sl":20,"methods":[],"el":22,"name":"GenericTest.C"},{"id":441,"sl":24,"methods":[{"sl":25,"el":27,"sc":9}],"el":28,"name":"GenericTest.B"},{"id":449,"sl":39,"methods":[{"sl":40,"el":42,"sc":9}],"el":45,"name":"GenericTest.AbstractFoo"},{"id":451,"sl":47,"methods":[{"sl":48,"el":50,"sc":9}],"el":51,"name":"GenericTest.ConcreteFoo"}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2":{"methods":[{"sl":59}],"name":"testPackageScope","statements":[{"sl":61},{"sl":62},{"sl":63},{"sl":64},{"sl":65}],"pass":true},"test_63":{"methods":[{"sl":30}],"name":"testBridgeUnmocked","statements":[{"sl":32},{"sl":33},{"sl":34},{"sl":35},{"sl":36}],"pass":true}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [63], [], [63], [63], [63], [63], [63], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2], [], [2], [2], [2], [2], [2], [], []]
