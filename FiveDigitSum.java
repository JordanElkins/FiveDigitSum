package cst105n.w1.e2;

import java.util.Scanner;

//Class Name
public class FiveDigitSum {
	// Creates class variable
	static Scanner input;

	// Main Method
	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.print("Enter a 5-digit positive integer : ");
		int num = input.nextInt();
		// 5-digit integer to be read as abcde EX: 30458 a=3 b=0 c=4 d=5 e=8
		// Initialize each letter then set how it defines each digit to letter
		int a;
		a = (num / 10000) % 10;
		/*
		 * Ex: 30458/10000 = int of 3. 3 % 10 = 3 as 10 cannot go into 3 so 3 is the
		 * remainder
		 */
		int b;
		b = (num / 1000) % 10;
		/*
		 * Ex: 30458/1000 = int of 30. 30 % 10 = 0 as 10 can go into 30 3 times with 0
		 * as a remainder
		 */
		int c;
		c = (num / 100) % 10;
		/*Ex: 30458/100 = int of 304. 304 % 10 = 4 as 10 will go into is 3 times with a
		 * remainder of 4
		 */
		int d;
		d = (num / 10) % 10;
		/*
		 * Ex: 30458/10 = int of 3045. 3045 % 10 = 5 as 10 will go into 3045 34 times
		 * with a remainder of 5
		 */
		int e;
		e = num % 10;
		/*
		 * Ex: 30458 % 10 = 8 as 10 will go into 30458 3045 times with a remainder of 8
		 */
		// This will add all five digits together
		int sum = a + b + c + d + e;
		// Display results
		System.out.print("The sum of the 5-digits is " 
		+ a + " + " + b + " + " + c + " + " + d + " + " + e + " = " + sum);

	}
}