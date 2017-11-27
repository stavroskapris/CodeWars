/*Complete the solution so that it reverses all of the 
words within the string passed in. */
package katas;
public class ReverseWords {

	public static void main(String[] args) {
		ReverseWords rw = new ReverseWords();
		System.out.println(rw.reverseWords("this is a test just a test") + "|");
	}

	public String reverseWords(String str) {
		String[] words = str.split(" ");
		String result = " ";
		for (int i = words.length - 1; i > 0; i--) {
			result += words[i] + " ";
		}
		return result + words[0];
	}
}
