var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"id":459,"sl":17,"methods":[{"sl":36,"el":44,"sc":5},{"sl":46,"el":58,"sc":5},{"sl":60,"el":71,"sc":5},{"sl":73,"el":78,"sc":5},{"sl":80,"el":92,"sc":5}],"el":94,"name":"PartialMockingTest"},{"id":459,"sl":19,"methods":[{"sl":25,"el":27,"sc":9},{"sl":29,"el":31,"sc":9}],"el":34,"name":"PartialMockingTest.A"}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1":{"methods":[{"sl":60}],"name":"testPartialMock_ConstructorNotFound","statements":[{"sl":62},{"sl":63}],"pass":true},"test_10":{"methods":[{"sl":80}],"name":"testPartialMock_ExceptionInConstructor","statements":[{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":87},{"sl":90}],"pass":true},"test_32":{"methods":[{"sl":25},{"sl":46}],"name":"testPartialMock_ProtectedConstructor","statements":[{"sl":26},{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":54},{"sl":55},{"sl":56},{"sl":57}],"pass":true},"test_54":{"methods":[{"sl":36}],"name":"testPartialMock_PublicConstructor","statements":[{"sl":39},{"sl":40},{"sl":41},{"sl":43}],"pass":true},"test_20":{"methods":[{"sl":73}],"name":"testPartialMock_InvalidParams","statements":[{"sl":75},{"sl":76}],"pass":true}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [32], [32], [], [], [], [], [], [], [], [], [], [54], [], [], [54], [54], [54], [], [54], [], [], [32], [], [32], [32], [32], [32], [], [], [32], [32], [32], [32], [], [], [1], [], [1], [1], [], [], [], [], [], [], [], [], [], [20], [], [20], [20], [], [], [], [10], [], [10], [10], [10], [10], [], [10], [], [], [10], [], [], [], []]
