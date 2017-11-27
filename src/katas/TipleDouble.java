/*Write a function

TripleDouble(long num1, long num2)

which takes in numbers num1 and num2 and returns 1 if there is 
a straight triple of a number at any place in num1 and also
a straight double of the same number in num2.
*/

package katas;

public class TipleDouble {
	public int TripleDouble(long num1, long num2) {

		int len1 = Long.toString(num1).length();
		long[] array1 = new long[len1];

		int len2 = Long.toString(num2).length();
		long[] array2 = new long[len2];

		long triple = 0;
		boolean hasTriple = false;
		boolean hasDouble = false;

		for (int index = 0; index < len1; index++) {
			array1[index] = num1 % 10;
			num1 /= 10;
		}
		for (int index = 0; index < len2; index++) {
			array2[index] = num2 % 10;
			num2 /= 10;
		}
		for (int i = 0; i < array1.length - 2; i++) {
			if (array1[i] == array1[i + 1] && array1[i + 1] == array1[i + 2]) {
				hasTriple = true;
				triple = array1[i];
			}
		}
		for (int i = 0; i < array2.length - 1; i++) {
			if (array2[i] == array2[i + 1] && array2[i] == triple) {
				hasDouble = true;
			}
		}
		if (hasTriple && hasDouble) {
			return 1;
		} else {
			return 0;
		}
	}
}
