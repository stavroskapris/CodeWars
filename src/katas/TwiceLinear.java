/*Consider a sequence u where u is defined as follows:

    The number u(0) = 1 is the first one in u.
    For each x in u, then y = 2 * x + 1 and z = 3 * x + 1 must be in u too.
    There are no other numbers in u.

Ex: u = [1, 3, 4, 7, 9, 10, 13, 15, 19, 21, 22, 27, ...]

1 gives 3 and 4, then 3 gives 7 and 10, 4 gives 9 and 13, then 7 gives 15 and 22 and so on...

#Task: Given parameter n the function dbl_linear (or dblLinear...) 
returns the element u(n) of the ordered (with <) sequence u.

#Example: dbl_linear(10) should return 22

#Note: Focus attention on efficiency
*/
package katas;

import java.util.TreeSet;

public class TwiceLinear {

	public static void main(String[] args) {
		TwiceLinear tl = new TwiceLinear();
		System.out.println(tl.dblLinear(12));

	}

	public int dblLinear(int n) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(1);
		for (int i = 0; i < n; i++) {
			int x = set.first();
			set.add(2 * x + 1);
			set.add(3 * x + 1);
			set.remove(x);
		}
		// System.out.println(set);
		return set.first();
	}
}