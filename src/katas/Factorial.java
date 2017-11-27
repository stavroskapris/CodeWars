/*In mathematics, the factorial of a non-negative integer n, denoted by n!, 
is the product of all positive integers less than or equal to n. 
For example: 5! = 5 * 4 * 3 * 2 * 1 = 120. By convention the value of 0! is 1.

Write a function to calculate factorial for a given input. 
If input is below 0 or above 12 throw an exception of type 
ArgumentOutOfRangeException (C#) or IllegalArgumentException (Java) 
or RangeException (PHP) or throw a RangeError (JavaScript).*/
package katas;

public class Factorial {
	public static void main(String[] args) {
		Factorial fac = new Factorial();
		fac.factorial(13);
	}

	public int factorial(int n) {
		if (n < 0 || n > 12) {
			throw new IllegalArgumentException("!!");
		}
		int result = 1;
		for (int i = 0; i < n; i++) {
			result = result * (n - i);
		}
		// System.out.println("To paragontiko tou " + n + " einai : " + result);
		return result;
	}
}
