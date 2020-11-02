function tests = prelab11b
tests = functiontests(localfunctions);
end
function testRandFloatValue(testCase)
for i = 1:10;
    number = randFloatValue(20,35);
    verifyGreaterThanOrEqual(testCase,number,20);
    verifyLessThanOrEqual(testCase,number,35);
end
end
function testGetValue(testCase)
    prompt = 'Enter values in the following order: 10000,5,500\n';
    value = getValue(prompt,400,600);
    verifyEqual(testCase,value,500);
end
function testGetFile(testCase)
    filename = getFile();
    verifyEqual(testCase,filename(end-3:end),'.txt');
end
function testCalcBounds(testCase)
    [al au] = calcBounds(50,20);
    verifyEqual(testCase,[al au], [40 60]);
end
function testWriteFile(testCase)
    filename = 'tester.txt';
    writeFile(filename,10,5,15);
    data = load(filename);
    verifyGreaterThanOrEqual(testCase,data,5);
    verifyLessThanOrEqual(testCase,data,15);
    verifyEqual(testCase,length(data),10);
end

