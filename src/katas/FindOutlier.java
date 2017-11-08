/*You are given an array (which will have a length of at least 3, but could be very large)
containing integers. The array is either entirely comprised of odd integers or 
entirely comprised of even integers except for a single integer N. 
Write a method that takes the 
array as an argument and returns this "outlier" N.
Examples
[2, 4, 0, 100, 4, 11, 2602, 36]
Should return: 11 (the only odd number)

[160, 3, 1719, 19, 11, 13, -21]
Should return: 160 (the only even number
*/

package katas;

public class FindOutlier {

	public static void main(String[] args) {
		int[] ints = { 160, 3, 1719, 19, 11, 13, -21 };
		

		System.out.println(FindOutlier.find(ints));

	}

	public static  int find(int[] integers) {
		int count = 0;
		int result = 0;
		int pos = 0;
		for (int i = 0; i < integers.length; i++) {
			if (integers[i] % 2 == 0) {
				count++;
				pos = i;
			}
		}
		if (count == 1) {

			return integers[pos];
		}
		for (int i = 0; i < integers.length; i++) {

			if (integers[i] % 2 != 0) {
				result = integers[i];
			}
		}

		return result;
	}
}

