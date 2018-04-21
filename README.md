 <h1 align="center">Object Oriented Programming</h1>
 <h2 align="center">Year 1 – Common curriculum</h2>
 <h3 align="center">Tutorial / Lab session #1: Java fundamentals</h3>

``NB: all the methods of exercises 1 to 6 are going to be defined as static ``

### Exercise 1 – Working with integers 
1. Write a method int add(int a, int b) that returns the sum of a and b.
2.  Write a method int mult(int a, int b) that returns the multiplication of a by b.
3. Write a method int max(int a, int b) that returns the maximum of a and b.
4. Write a method int min(int a, int b, int c) that returns the minimum of a, b and c. 
5. Write a method int gcd(int a, int b) that returns the greater common divider of a and b. 

### Exercise 2 – Working with integer arrays 
1. Write a method int min(int[] array) that returns the smallest value stored in the array 
2. Write a method int find(int[] array, int value) that returns the position of the first occurrence of value in the array. If the value is not found, the method returns -1. 
3. Write a method int sumArray(int[] array) that returns the sum of all the elements in the array. 
4. Write a method void printArray(int[] array) that prints the values stored in the array. 
5. Write a method int[] reverseArray(int[] array) that returns a new array that stores the elements of the array given as argument. 
6. Write a method main to test the above methods. 

### Exercise 3 – Conditional statements 
1. Specify (give the signature) a method that asks a user to input 2 integers and returns: 
	a. The sum of a and b if both integers are even.
	b. The multiplication of a by b if both integers are odd.
	c. Else, the square of each integers.
2. Write your method using a Scanner for the keyboard inputs.

### Exercise 4 – A basic calculator 
Write a program that apply an arithmetic operation between 2 integers that were asked to the user. The operand is ask with a basic menu : use a switch to analyze which operation should be performed. Here is an example of expected output :
Give 2 integers successively : 
2 
1 
Choose an operation : 
 1. sum
 2. sub
 3. mult
 4. div

Operation : 1 
Output : 2 + 1 = 3 

### Exercise 5 – Two dimensional arrays 
Write a method float[][] product(float[][] matA, float[][] matB) that computes the products of matrices matA and matB. The method returns the resulting matrix or null, if the dimensions of the matrices don’t match. 


### Exercice 6 – Searching arrays 
1. Give the signature of a method that search a given integer value in an integer array. Implement your method : you must perform a “raw” search, i.e.: loop over the array from the start and compare each element to the searched value. Return the index of the value if it is found, else return -1. 
2. Specify and implement a similar method to search for a value in a two dimensional array.
