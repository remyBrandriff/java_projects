%{
This function uses a prompt string to ask the user to enter a value between
 min and max. The function will ask the user to enter another number  with 
 the prompt if the user enters a number that is not between lower and upper.

@param prompt
    The string that prompts the user to enter a value between min and max.

@param lower 
    The lowest value that the user can enter when prompted.

@param upper 
    The highest value that the user can enter when prompted.
    
@author Michael McCormick
%}

function val = getValue(prompt, lower, upper)

val = input(prompt);

while val < lower || val > upper
        val = input(prompt);
end

end