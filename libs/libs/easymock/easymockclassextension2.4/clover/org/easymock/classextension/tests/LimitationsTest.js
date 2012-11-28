var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"id":315,"sl":19,"methods":[{"sl":32,"el":38,"sc":5},{"sl":40,"el":44,"sc":5},{"sl":46,"el":57,"sc":5},{"sl":59,"el":62,"sc":5}],"el":63,"name":"LimitationsTest"},{"id":315,"sl":21,"methods":[{"sl":22,"el":24,"sc":9}],"el":25,"name":"LimitationsTest.MyClass"},{"id":317,"sl":27,"methods":[{"sl":28,"el":29,"sc":9}],"el":30,"name":"LimitationsTest.PrivateClass"}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_89":{"methods":[{"sl":40}],"name":"abstractClass","statements":[{"sl":42},{"sl":43}],"pass":true},"test_22":{"methods":[{"sl":22},{"sl":46}],"name":"mockFinalMethod","statements":[{"sl":23},{"sl":48},{"sl":50},{"sl":52},{"sl":53}],"pass":true},"test_19":{"methods":[{"sl":59}],"name":"privateConstructor","statements":[{"sl":61}],"pass":true}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [22], [22], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [89], [], [89], [89], [], [], [22], [], [22], [], [22], [], [22], [22], [], [], [], [], [], [19], [], [19], [], []]
