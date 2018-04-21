
//Bu import Scanner klassından istifadə etmək üçündür.
//Scanner klassıda usernən əlaqə saxlamaq və userin daxil etdiklərini götürmək üçündür.
import java.util.Scanner;

//Exercise 3 – Conditional statements
public class Exercise3 {

	public static void main(String[] args) {
		//ReadLine metodu userdən rəqəmləri götürmək üçündür.
		ReadLine();
	}

	//	1. Specify (give the signature) a method that asks a user to input 2 integers and returns:
	//	2. Write your method using a Scanner for the keyboard inputs
	public static void ReadLine() {
		System.out.println("Please enter two integers: ");
		Scanner scn = new Scanner(System.in);
		System.out.print("First integer: ");
		int a = scn.nextInt();
		System.out.print("Second integer: ");
		int b = scn.nextInt();
		System.out.println("");

		// Calculation metodunu burda çağırırıq və userin daxil etdiyi 2 integeri (a və b-ni) Calculation metoduna ötürürük, ardını o metod hesablayıb qaytaracaq.
		Calculation(a, b);
	}

	// Bütün yoxlamaları bu Calculation metodu aparır.
	public static void Calculation(int a, int b) {
		//	a. The sum of a and b if both integers are even
		if (a % 2 == 0 && b % 2 == 0) {
			int sum = a + b;
			System.out.println("b. These 2 numbers are even so the answer is: " + sum);
		}
		//	b. The multiplication of a by b if both integers are odd
		else if (a % 2 != 0 && b % 2 != 0) {
			int mult = a * b;
			System.out.println("b. These 2 numbers are odd so the answer is: " + mult);
		}
		//	c. Else, the square of each integer
		else {
			int sqa = a * a;
			int sqb = b * b;
			System.out.println("c. Else, square of each integer is: " + sqa + " and " + sqb);
		}
	}
}
