%{
    calcBounds.m

    This function accepts the alien attack rate and percent variance, and
    calculates the upper and lower bounds to be used with randomFloatValue.

    @param a_rate - the rate of alien attackers

    @param var - the percent variance of attackers

    @author Thomas Wilkins
%}
function [lower_bound, upper_bound] = calcBounds(a_rate,var)

variation_amount = a_rate * (var/100);

lower_bound = a_rate - variation_amount;
upper_bound = a_rate + variation_amount;

end

