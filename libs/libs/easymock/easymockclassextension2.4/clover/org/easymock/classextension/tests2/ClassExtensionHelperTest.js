var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"id":335,"sl":24,"methods":[{"sl":26,"el":30,"sc":5},{"sl":32,"el":36,"sc":5},{"sl":38,"el":47,"sc":5},{"sl":49,"el":64,"sc":5},{"sl":53,"el":56,"sc":21},{"sl":66,"el":74,"sc":5}],"el":75,"name":"ClassExtensionHelperTest"}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_75":{"methods":[{"sl":66}],"name":"testGetControl_NotAMock","statements":[{"sl":68},{"sl":69},{"sl":72}],"pass":true},"test_25":{"methods":[{"sl":38}],"name":"testGetControl_EnhancedButNotAMock","statements":[{"sl":40},{"sl":41},{"sl":42},{"sl":45}],"pass":true},"test_90":{"methods":[{"sl":49}],"name":"testGetControl_ProxyButNotMock","statements":[{"sl":51},{"sl":58},{"sl":59},{"sl":62}],"pass":true},"test_31":{"methods":[{"sl":32}],"name":"testGetControl_EasyMockClassExtension","statements":[{"sl":34},{"sl":35}],"pass":true},"test_57":{"methods":[{"sl":26}],"name":"testGetControl_EasyMock","statements":[{"sl":28},{"sl":29}],"pass":true}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [57], [], [57], [57], [], [], [31], [], [31], [31], [], [], [25], [], [25], [25], [25], [], [], [25], [], [], [], [90], [], [90], [], [], [], [], [], [], [90], [90], [], [], [90], [], [], [], [75], [], [75], [75], [], [], [75], [], [], []]
