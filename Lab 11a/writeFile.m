%{
    writeFile.m

    This function uses randFloatValue to write num_sims random numbers between lower and upper to
    a file with the name stored in the filename variable. Notice the
    function does not return anything.

    Only one number should be written per line

    @param filename - string that holds the name of the file that contains
    all the data from the simulation

    @param num_sim - the number of random numbers to be generated and
    written to the file

    @param lower - the lowest value that a random number can be

    @param upper - the highest value that a random number can be

    @author Thomas Wilkins
%}

function writeFile(filename, num_sim, lower, upper)
file = fopen(filename, 'w');

for i = 0:num_sim-1
    r = randFloatValue(lower, upper);
    fprintf(file, '%f \n', r);
end

fclose(file);
end

