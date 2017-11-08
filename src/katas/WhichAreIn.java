/*Given two arrays of strings a1 and a2 return a sorted array r in lexicographical
 order of the strings of a1 which are substrings of strings of a2.

#Example 1: a1 = ["arp", "live", "strong"]

a2 = ["lively", "alive", "harp", "sharp", "armstrong"]

returns ["arp", "live", "strong"]

#Example 2: a1 = ["tarp", "mice", "bull"]

a2 = ["lively", "alive", "harp", "sharp", "armstrong"]

returns []
Notes:

Arrays are written in "general" notation. See "Your Test Cases" for examples in your language.

In Shell bash a1 and a2 are strings. The return is a string where words are separated by commas.

Beware: r must be without duplicates.

*/

/*public static String[] inArray(String[] array1, String[] array2) {
      TreeSet<String> strings = new TreeSet<>();
      for (String s1 : array1) 
        for (String s2 : array2) 
          if (s2.contains(s1)) strings.add(s1);
      return strings.toArray(new String[strings.size()]);
  }
}*/

package katas;

import java.util.ArrayList;
import java.util.Arrays;

public class WhichAreIn {

	public static void main(String[] args) {
		String[] a1 = { "arp", "live", "strong" };

		String[] a2 = { "lively", "alive", "harp", "sharp", "armstrong" };

		WhichAreIn wh = new WhichAreIn();

		String[] finalRes = wh.WhichAre(a1, a2);
		for (String s : finalRes) {
			System.out.print(s + ",");
		}
	}

	public String[] WhichAre(String[] array1, String[] array2) {

		ArrayList<String> halfResult = new ArrayList<String>();

		for (String s1 : array1) {
			for (String s2 : array2) {

				if (s2.indexOf(s1) != -1 && !(halfResult.contains(s1))) {
					halfResult.add(s1);
				}
			}
		}
		String[] result = new String[halfResult.size()];
		result = halfResult.toArray(result);
		Arrays.sort(result);
		return result;
	}
}
