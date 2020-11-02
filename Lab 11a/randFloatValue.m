%{
This function returns a random floating point value between lower and upper.

@param lower
    Lower bound of the range for the random number.

@param upper 
    Upper bound of the range for the random number.
    
@author Michael McCormick
%}

function val = randFloatValue(lower, upper)

val = lower + (upper-lower) * rand(1);

end