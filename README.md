# Peek Finder
## Problem
There is an array of integers which represents a series of weather temperature in one area. We need a function 
consume this series and find a 'peek' number. A number is called a peek, if the difference between that number and its 
previous number is the greatest in the series. For example in array of {1, 2, 5, 6} the peek is happening at index 2, 
because at index 2 we have 5 which is 3 more than the index 1 that is 2.
Examples: <br>
{1, 2, 5, 6} -> 2 <br>
{3, 4, 1} -> 1 <br>
{1} -> 0 <br>
{} -> -1 <br>

## Solution 
Two solutions have been implemented, first via class PeekFinder which uses classic imperative approach to look for the result. 
The second solution via class EnhancedPeekFinder uses the Java Stream API to find it.

## Setup/Requirements
* Java 11 or up
* Maven 3
