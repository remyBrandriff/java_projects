%{
Lab11.m

This is the main driver for your program. It puts all of your other
functions together.

This file should do several things: 

(1)Print out a message to welcome the user.

(2)Use getValue to ask the user to enter the number of simulation
values. Store in a varible named num_sims.

(3)Use the input function to ask the user to enter the desired average rate
of alien attackers. Store in a variable named a_rate.

(4)Use getValue to ask the user to enter the percentage variance for
the generated data. Store in a variable var.

(5)Use the getFile function to get a file name from the user and create a
file that has this name. Store the file name in a variable filename

(6)Use the calcBounds function to calculate the upper and lower bounds
of variance for your simulation.

(8)Use writeFile to write random values in the range a_rate +/- var. 

(9)Print out a message that tells the user that the data was generated and
tells the user where to find the data.

(10) Load the data points

(11)Calculate the mean, max, min, standard deviation and number of the data
points. Be sure to store them in the correct variables
(d_mean,d_max,d_min,d_std and d_size).

(12) Print the results from (11) to the user.

(13) Plot the original data points from step (10)

@author Michael McCormick, Thomas Wilkins
%}
function [filename,d_mean,d_max,d_min,d_std,d_size] = Lab11
fprintf('Welcome User \n');

num_sim = getValue('Enter the number of simulations to run: ',25,5000);

a_rate = input('Enter the number of alien attackers: ');

var = getValue('Enter the percent variance of attackers: ',5,95);

filename = getFile();

[lower,upper] = calcBounds(a_rate,var);

writeFile(filename, num_sim, lower, upper);

fprintf('data written to file \n'); 
fprintf('the file is %s \n', filename);

data = load(filename);

d_mean = mean(data);
d_max = max(data);
d_min = min(data);
d_std = std(data);
d_size = length(data);
disp(d_mean);
disp(d_max);
disp(d_min);
disp(d_std);
disp(d_size);

plot(data);

end
