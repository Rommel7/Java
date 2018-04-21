
//Bu import Scanner klassından istifadə etmək üçündür.
//Scanner klassıda usernən əlaqə saxlamaq və userin daxil etdiklərini götürmək üçündür.
import java.util.Scanner;

//Exercise 4 – A basic calculator
public class Exercise4 {

	/*  Write a program that apply an arithmetic operation between 2 integers that were asked to the
		user. The operand is ask with a basic menu : use a switch to analyze which operation should be
		performed. Here is an example of expected output :
		Give 2 integers successively :
		2
		1
		Choose an operation :
		1. +
		2. –
		3. *
		4. /
		5. %
		Operation : 1
		Output : 2 + 1 = 3
	*/

	public static void main(String[] args) {
		//ReadLine metodu userdən rəqəmləri və arefmetik operatoru götürmək üçündür.
		ReadLine();
	}

	public static void ReadLine() {
		System.out.println("Please enter two integers: ");
		Scanner scn = new Scanner(System.in);
		System.out.print("I integer: ");
		int a = scn.nextInt();
		System.out.print("II integer: ");
		int b = scn.nextInt();
		System.out.println("Please choose an operation: \n1. +\n2. -\n3. *\n4. /");
		System.out.print(">>>>>>>> ");
		int operation = scn.nextInt();

		// Calculation metodunu burda çağırırıq və userin daxil etdiyi 3 integeri (a, b və operation-u) Calculation metoduna ötürürük, ardını o metod hesablayıb qaytaracaq.
		Calculation(a, b, operation);
	}

	// Bütün yoxlamaları bu Calculation metodu aparır.
	public static void Calculation(int a, int b, int operation) {
		//Switch-Case istifadə edib uzerin seçdiyi arifmetik operationun nömrəsinə görə hesablama aparırıq.
		switch (operation) {
		case 1:
			int sum = a + b;
			System.out.println("Output: " + sum);
			break;
		case 2:
			int sub = a - b;
			System.out.println("Output: " + sub);
			break;
		case 3:
			int mult = a * b;
			System.out.println("Output: " + mult);
			break;
		case 4:
			if (b != 0) {
				int div = a / b;
				System.out.println("Output: " + div);
			}
			System.out.println("Can't divide by zero! :P");
			break;
		default:
			System.out.println("\nPlease choose the valid operation and try again!\n");
			ReadLine();
			break;
		}
	}
}
