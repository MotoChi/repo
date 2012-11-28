var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = { "classes" : [
    {"id" : 1773, "sl" : 16, "el" : 200, "name" : "UsageStrictMockTest",
    "methods" : [
              {"sl" : 19, "el" : 25, "sc" : 5},  {"sl" : 27, "el" : 32, "sc" : 5},  {"sl" : 34, "el" : 45, "sc" : 5},  {"sl" : 47, "el" : 61, "sc" : 5},  {"sl" : 63, "el" : 77, "sc" : 5},  {"sl" : 79, "el" : 127, "sc" : 5},  {"sl" : 129, "el" : 167, "sc" : 5},  {"sl" : 169, "el" : 199, "sc" : 5}  ]}
    
 ]
};

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {
		"test_313" : {
					  "name" : "tooManyCallsFailure",
					  "pass" : true ,
					  "methods" : [{"sl": 47 },],
					  "statements" : [{"sl": 49 },{"sl": 50 },{"sl": 52 },{"sl": 53 },{"sl": 54 },{"sl": 56 },{"sl": 58 },]
					  },
		"test_400" : {
					  "name" : "tooFewCallsFailure",
					  "pass" : true ,
					  "methods" : [{"sl": 63 },],
					  "statements" : [{"sl": 65 },{"sl": 66 },{"sl": 67 },{"sl": 68 },{"sl": 70 },{"sl": 71 },{"sl": 74 },]
					  },
		"test_317" : {
					  "name" : "orderedCallsSucces",
					  "pass" : true ,
					  "methods" : [{"sl": 27 },],
					  "statements" : [{"sl": 29 },{"sl": 30 },{"sl": 31 },]
					  },
		"test_394" : {
					  "name" : "differentMethods",
					  "pass" : true ,
					  "methods" : [{"sl": 79 },],
					  "statements" : [{"sl": 82 },{"sl": 84 },{"sl": 85 },{"sl": 86 },{"sl": 87 },{"sl": 88 },{"sl": 89 },{"sl": 90 },{"sl": 92 },{"sl": 93 },{"sl": 94 },{"sl": 96 },{"sl": 97 },{"sl": 98 },{"sl": 100 },{"sl": 101 },{"sl": 108 },{"sl": 112 },{"sl": 114 },{"sl": 115 },{"sl": 116 },{"sl": 118 },{"sl": 119 },{"sl": 124 },]
					  },
		"test_381" : {
					  "name" : "stubBehavior",
					  "pass" : true ,
					  "methods" : [{"sl": 169 },],
					  "statements" : [{"sl": 171 },{"sl": 173 },{"sl": 174 },{"sl": 175 },{"sl": 176 },{"sl": 178 },{"sl": 180 },{"sl": 181 },{"sl": 182 },{"sl": 183 },{"sl": 184 },{"sl": 186 },{"sl": 187 },{"sl": 188 },{"sl": 190 },{"sl": 191 },{"sl": 196 },]
					  },
		"test_316" : {
					  "name" : "unorderedCallsFailure",
					  "pass" : true ,
					  "methods" : [{"sl": 34 },],
					  "statements" : [{"sl": 36 },{"sl": 37 },{"sl": 38 },{"sl": 40 },{"sl": 42 },]
					  },
		"test_384" : {
					  "name" : "range",
					  "pass" : true ,
					  "methods" : [{"sl": 129 },],
					  "statements" : [{"sl": 132 },{"sl": 134 },{"sl": 135 },{"sl": 136 },{"sl": 137 },{"sl": 138 },{"sl": 139 },{"sl": 140 },{"sl": 141 },{"sl": 143 },{"sl": 145 },{"sl": 146 },{"sl": 148 },{"sl": 149 },{"sl": 150 },{"sl": 152 },{"sl": 154 },{"sl": 155 },{"sl": 157 },{"sl": 158 },{"sl": 164 },]
					  }
 };

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [  [],   [  ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [ 317   ] ,
  [  ] ,
  [ 317   ] ,
  [ 317   ] ,
  [ 317   ] ,
  [  ] ,
  [  ] ,
  [ 316   ] ,
  [  ] ,
  [ 316   ] ,
  [ 316   ] ,
  [ 316   ] ,
  [  ] ,
  [ 316   ] ,
  [  ] ,
  [ 316   ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [ 313   ] ,
  [  ] ,
  [ 313   ] ,
  [ 313   ] ,
  [  ] ,
  [ 313   ] ,
  [ 313   ] ,
  [ 313   ] ,
  [  ] ,
  [ 313   ] ,
  [  ] ,
  [ 313   ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [ 400   ] ,
  [  ] ,
  [ 400   ] ,
  [ 400   ] ,
  [ 400   ] ,
  [ 400   ] ,
  [  ] ,
  [ 400   ] ,
  [ 400   ] ,
  [  ] ,
  [  ] ,
  [ 400   ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [ 394   ] ,
  [  ] ,
  [  ] ,
  [ 394   ] ,
  [  ] ,
  [ 394   ] ,
  [ 394   ] ,
  [ 394   ] ,
  [ 394   ] ,
  [ 394   ] ,
  [ 394   ] ,
  [ 394   ] ,
  [  ] ,
  [ 394   ] ,
  [ 394   ] ,
  [ 394   ] ,
  [  ] ,
  [ 394   ] ,
  [ 394   ] ,
  [ 394   ] ,
  [  ] ,
  [ 394   ] ,
  [ 394   ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [ 394   ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [ 394   ] ,
  [  ] ,
  [ 394   ] ,
  [ 394   ] ,
  [ 394   ] ,
  [  ] ,
  [ 394   ] ,
  [ 394   ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [ 394   ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [ 384   ] ,
  [  ] ,
  [  ] ,
  [ 384   ] ,
  [  ] ,
  [ 384   ] ,
  [ 384   ] ,
  [ 384   ] ,
  [ 384   ] ,
  [ 384   ] ,
  [ 384   ] ,
  [ 384   ] ,
  [ 384   ] ,
  [  ] ,
  [ 384   ] ,
  [  ] ,
  [ 384   ] ,
  [ 384   ] ,
  [  ] ,
  [ 384   ] ,
  [ 384   ] ,
  [ 384   ] ,
  [  ] ,
  [ 384   ] ,
  [  ] ,
  [ 384   ] ,
  [ 384   ] ,
  [  ] ,
  [ 384   ] ,
  [ 384   ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [ 384   ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [ 381   ] ,
  [  ] ,
  [ 381   ] ,
  [  ] ,
  [ 381   ] ,
  [ 381   ] ,
  [ 381   ] ,
  [ 381   ] ,
  [  ] ,
  [ 381   ] ,
  [  ] ,
  [ 381   ] ,
  [ 381   ] ,
  [ 381   ] ,
  [ 381   ] ,
  [ 381   ] ,
  [  ] ,
  [ 381   ] ,
  [ 381   ] ,
  [ 381   ] ,
  [  ] ,
  [ 381   ] ,
  [ 381   ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [ 381   ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [  ] 
];
