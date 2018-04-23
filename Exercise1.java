//Exercise 1 – Working with integers

public class Exercise1 {
	
	// 1. Write a method int add(int a, int b) that returns the sum of a and b;
	public static int Add(int a, int b) {
		return a + b;
	}

	// 2. Write a method int mult(int a, int b) that returns the multiplication of a by b;
	public static int Mult(int a, int b) {
		return a * b;
	}

	// 3. Write a method int max(int a, int b) that returns the maximum of a and b;
	public static int Max(int a, int b) {
		if (a == b) {
			return a - b;
		} else if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	// 4. Write a method int min(int a, int b, int c) that returns the minimum of a, b and c;

	public static int Min(int a, int b, int c) {
		return Math.min(Math.min(a, b), c);
	}

	// 5. Write a method int gcd(int a, int b) that returns the greater common divider of a and b;
	public static int Gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return Gcd(b, a % b);
	}

	public static void main(String[] args) {
		//1
		System.out.println("1. Add metod: " + Add(10, 15));
		//2
		System.out.println("2. Mult metod: " + Mult(10, 15));
		//3
		System.out.println("3. Max metod: " + Max(100, 20));
		//3 Math.max();
		System.out.println("3. Max-2 metod: " + Math.max(250, 450));
		//4
		System.out.println("4. Min metod: " + Min(100, 20, 500));
		//5
		System.out.println("5. Gcd metod: " + Gcd(10, 4));
		
		System.out.println(Add(500,1500));
	}
}
