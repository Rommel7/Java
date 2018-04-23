
//Bu import Arrays klassından istifadə etmək üçündür.

import java.util.Arrays;

//Exercise 2 – Working with integer arrays

public class Exercise2 {
	// myList Array
	static int[] myList = { 3, 4, 7, 10, 22, 30 };

	// 1. Write a method int min(int[] array) that returns the smallest value stored in the array

	public static int Min(int[] array) {
		int minValue = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < minValue) {
				minValue = array[i];
			}
		}
		return minValue;
	}

	// 2. Write a method int find(int[] array, int value) that returns the position of the 
	// first occurrence of value in the array. If the value is not found, the method returns -1.

	public static int Find(int[] array, int value) {
		int j = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				j = i;
				break;
			}
		}
		return j;
	}

	// 3. Write a method int sumArray(int[] array) that returns the sum of all the elements in the array.
	public static int sumArray(int[] array) {
		int total = 0;

		for (int i = 0; i < myList.length; i++) {
			total += myList[i];
		}

		return total;
	}

	// 4. Write a method void printArray(int[] array) that prints the values storedin the array.
	public static void printArray(int[] array) {
		System.out.print("4. All values stored in the array is: ");
		for (int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + " ");
		}
	}

	// 5. Write a method int[] reverseArray(int[] array) that returns a new array that stores the elements 
	// of the array given as argument.

	public static int[] reverseArray(int[] array) {

		System.out.print("\n5. Reversed array: ");
		int[] newArray = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[array.length - 1 - i];
		}

		System.out.println(Arrays.toString(newArray));
		return newArray;
	}

	// 6. Write a method main to test the above methods

	public static void main(String[] args) {
		//1
		System.out.println("1. Min metod: " + Min(myList));
		//1 Array.sort();
		Arrays.sort(myList);
		System.out.println("1. Min-2 metod: " + myList[0]);

		//2
		System.out.println("2. Find metod: " + Find(myList, 22));
		//2 Array.sort();
		Arrays.sort(myList);
		System.out.println("1. Find-2 metod: " + Arrays.binarySearch(myList, 22));

		//3
		System.out.println("3. Sum of all the elements in the array: " + sumArray(myList));

		//4
		printArray(myList);

		//5
		reverseArray(myList);
	}
}
