var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = { "classes" : [
    {"id" : 1890, "sl" : 14, "el" : 165, "name" : "UsageOverloadedMethodTest",
    "methods" : [
              {"sl" : 20, "el" : 24, "sc" : 5},  {"sl" : 26, "el" : 104, "sc" : 5},  {"sl" : 106, "el" : 116, "sc" : 5},  {"sl" : 118, "el" : 164, "sc" : 5}  ]}
    
 ]
};

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {
		"test_443" : {
					  "name" : "nullReturnValue",
					  "pass" : true ,
					  "methods" : [{"sl": 106 },],
					  "statements" : [{"sl": 109 },{"sl": 110 },{"sl": 112 },{"sl": 114 },]
					  },
		"test_449" : {
					  "name" : "moreThanOneResultAndOpenCallCount",
					  "pass" : true ,
					  "methods" : [{"sl": 118 },],
					  "statements" : [{"sl": 120 },{"sl": 121 },{"sl": 122 },{"sl": 123 },{"sl": 124 },{"sl": 126 },{"sl": 128 },{"sl": 129 },{"sl": 130 },{"sl": 131 },{"sl": 133 },{"sl": 134 },{"sl": 136 },{"sl": 137 },{"sl": 140 },{"sl": 143 },{"sl": 144 },{"sl": 147 },{"sl": 150 },{"sl": 151 },{"sl": 154 },{"sl": 157 },{"sl": 158 },{"sl": 159 },{"sl": 160 },{"sl": 161 },{"sl": 163 },]
					  },
		"test_379" : {
					  "name" : "overloading",
					  "pass" : true ,
					  "methods" : [{"sl": 26 },],
					  "statements" : [{"sl": 29 },{"sl": 30 },{"sl": 31 },{"sl": 32 },{"sl": 34 },{"sl": 35 },{"sl": 36 },{"sl": 37 },{"sl": 39 },{"sl": 40 },{"sl": 41 },{"sl": 42 },{"sl": 44 },{"sl": 45 },{"sl": 46 },{"sl": 47 },{"sl": 49 },{"sl": 50 },{"sl": 51 },{"sl": 52 },{"sl": 54 },{"sl": 55 },{"sl": 56 },{"sl": 57 },{"sl": 59 },{"sl": 60 },{"sl": 61 },{"sl": 62 },{"sl": 64 },{"sl": 65 },{"sl": 66 },{"sl": 67 },{"sl": 69 },{"sl": 70 },{"sl": 71 },{"sl": 72 },{"sl": 74 },{"sl": 76 },{"sl": 77 },{"sl": 79 },{"sl": 80 },{"sl": 82 },{"sl": 83 },{"sl": 85 },{"sl": 86 },{"sl": 88 },{"sl": 89 },{"sl": 91 },{"sl": 92 },{"sl": 94 },{"sl": 95 },{"sl": 97 },{"sl": 98 },{"sl": 100 },{"sl": 101 },{"sl": 103 },]
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
  [ 379   ] ,
  [  ] ,
  [  ] ,
  [ 379   ] ,
  [ 379   ] ,
  [ 379   ] ,
  [ 379   ] ,
  [  ] ,
  [ 379   ] ,
  [ 379   ] ,
  [ 379   ] ,
  [ 379   ] ,
  [  ] ,
  [ 379   ] ,
  [ 379   ] ,
  [ 379   ] ,
  [ 379   ] ,
  [  ] ,
  [ 379   ] ,
  [ 379   ] ,
  [ 379   ] ,
  [ 379   ] ,
  [  ] ,
  [ 379   ] ,
  [ 379   ] ,
  [ 379   ] ,
  [ 379   ] ,
  [  ] ,
  [ 379   ] ,
  [ 379   ] ,
  [ 379   ] ,
  [ 379   ] ,
  [  ] ,
  [ 379   ] ,
  [ 379   ] ,
  [ 379   ] ,
  [ 379   ] ,
  [  ] ,
  [ 379   ] ,
  [ 379   ] ,
  [ 379   ] ,
  [ 379   ] ,
  [  ] ,
  [ 379   ] ,
  [ 379   ] ,
  [ 379   ] ,
  [ 379   ] ,
  [  ] ,
  [ 379   ] ,
  [  ] ,
  [ 379   ] ,
  [ 379   ] ,
  [  ] ,
  [ 379   ] ,
  [ 379   ] ,
  [  ] ,
  [ 379   ] ,
  [ 379   ] ,
  [  ] ,
  [ 379   ] ,
  [ 379   ] ,
  [  ] ,
  [ 379   ] ,
  [ 379   ] ,
  [  ] ,
  [ 379   ] ,
  [ 379   ] ,
  [  ] ,
  [ 379   ] ,
  [ 379   ] ,
  [  ] ,
  [ 379   ] ,
  [ 379   ] ,
  [  ] ,
  [ 379   ] ,
  [ 379   ] ,
  [  ] ,
  [ 379   ] ,
  [  ] ,
  [  ] ,
  [ 443   ] ,
  [  ] ,
  [  ] ,
  [ 443   ] ,
  [ 443   ] ,
  [  ] ,
  [ 443   ] ,
  [  ] ,
  [ 443   ] ,
  [  ] ,
  [  ] ,
  [  ] ,
  [ 449   ] ,
  [  ] ,
  [ 449   ] ,
  [ 449   ] ,
  [ 449   ] ,
  [ 449   ] ,
  [ 449   ] ,
  [  ] ,
  [ 449   ] ,
  [  ] ,
  [ 449   ] ,
  [ 449   ] ,
  [ 449   ] ,
  [ 449   ] ,
  [  ] ,
  [ 449   ] ,
  [ 449   ] ,
  [  ] ,
  [ 449   ] ,
  [ 449   ] ,
  [  ] ,
  [  ] ,
  [ 449   ] ,
  [  ] ,
  [  ] ,
  [ 449   ] ,
  [ 449   ] ,
  [  ] ,
  [  ] ,
  [ 449   ] ,
  [  ] ,
  [  ] ,
  [ 449   ] ,
  [ 449   ] ,
  [  ] ,
  [  ] ,
  [ 449   ] ,
  [  ] ,
  [  ] ,
  [ 449   ] ,
  [ 449   ] ,
  [ 449   ] ,
  [ 449   ] ,
  [ 449   ] ,
  [  ] ,
  [ 449   ] ,
  [  ] ,
  [  ] 
];
