/*Write a function that takes in a string of one or more words, and returns the same string, 
but with all five or more letter words reversed (Just like the name of this Kata). 
Strings passed in will consist of only letters and spaces. 
Spaces will be included only when more than one word is present.

Examples:

spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
spinWords( "This is a test") => returns "This is a test"
spinWords( "This is another test" )=> returns "This is rehtona test"
*/

package katas;

public class SpinWords {

	public String spinWords(String sentence) {
		String[] resultArr = sentence.split("\\s+");
		for (int i = 0; i < resultArr.length; i++) {
			if (resultArr[i].length() >= 5) {
				StringBuilder sb = new StringBuilder(resultArr[i]);
				resultArr[i] = sb.reverse().toString();
			}
		}
		StringBuilder ssb = new StringBuilder();
		for (String s1 : resultArr) {
			ssb.append(s1 + " ");
		}
		String result = ssb.toString().trim();
		return result;
	}
}
