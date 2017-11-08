/*Given an array of 3 integers a, b and c, determine if they form a pythagorean triple.

A pythagorean triple is formed when:
c2 = a2 + b2

where c is the largest value of a, b, c.

For example: a = 3, b = 4, c = 5 forms a pythagorean triple, because 52 = 32 + 42
Return Values

    1 if a, b and c form a pythagorean triple
    0 if a, b and c do not form a pythag*/

package katas;
public class PythagoreanTriple {
	public static void main(String[] args) {

		int[] numbers = { 3, 7, 5 };

		PythagoreanTriple pr = new PythagoreanTriple();

		System.out.println(pr.pythagoreanTriple(numbers));

	}
	public int pythagoreanTriple(int[] triple){
	   int first = triple[0];
		int second = triple[1];
		int third = triple[2];

		int max = Math.max(Math.max(first, second), third);

		if (max == triple[0]) {
			if (Math.pow(max, 2) == (Math.pow(second, 2) + Math.pow(third, 2))) {
				return 1;
			}
		}
			if (max == triple[1]) {
				if (Math.pow(max, 2) == (Math.pow(first, 2) + Math.pow(third, 2))) {
					return 1;
				}
			}
				if (max == triple[2]) {
					if (Math.pow(max, 2) == (Math.pow(first, 2) + Math.pow(second, 2))) {
						return 1;
					}
				}
			
		
		return 0;

	}
}
