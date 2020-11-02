%{
    getFile.m

    This function should ask the user for a filename ending in .txt 
    and store it in the return variable filename.
    It should then verify that the file name ends in .txt. If it does not,
    then print an error message and ask the user to enter the filename
    again
  
    @author Thomas Wilkins
%}
function filename = getFile

filename = input('Enter file name: ', 's');
test = strsplit(filename, '.');
test = test(2);
r = strcmp(test, 'txt');
%disp(r);

end
