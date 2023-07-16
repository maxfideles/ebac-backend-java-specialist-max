# Ordering numbers in an array

#### Technical:
 Java Class package used:
- Scanner




#### Getting the numbers 
It's created two arrays and a string variable, then follow the next:

- It's asked for the user a list of numbers separated by comma, and it will be saved into the string variable *numbers*;
- Using the method split on the *numbers* variable, it's saved each number in a different position into the array *numberArray*;

#### Converting 
As the  *numberArray* is an array of string elements, it's needed to convert its elements to compare them later on.
Due to it, was necessary to create the function *stringToInt*.

-  Used the function *stringToInt* to convert the *numberArray*'s elements from String into int type;
- The return from the function is saved into the third array *numberArrayInt*.

#### Comparing

As it's needed to go throughout the *numberArrayInt* , now with numbers of int type, to compare each elements, was used looping using two *for* , one inside the other.
Was created the variable *aux* to help in this operation.
- One *for* to go through each position on the array *numberArrayInt*;
- The other *for* to compare the element on the current position to the next one.

#### Example

Inputing integers on the console:
9,3,1,5,8

the output will be:
1
3
5
8
9


