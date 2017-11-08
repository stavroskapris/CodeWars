/*A pangram is a sentence that contains every single 
letter of the alphabet at least once. 
For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, 
because it uses the letters A-Z at least once (case is irrelevant).

Given a string, detect whether or not it is a pangram. 
Return True if it is, False if not. Ignore numbers and punctuation.
*/

package katas;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class PangramChecker {

	public static void main(String[] args) {
		String s="The quick brown fox jumps over the lazy dog";
		PangramChecker pr =new PangramChecker();
		System.out.println(pr.check(s));
	}
	public boolean check(String sentence){
	    String alphabet = "abcdefghijklmnopqrstuvwxyz";
	    String [] alph=alphabet.split("");
	    
	    
	    String [] phr=sentence.toLowerCase().split("");
	    
	    Set<String> alphSet=new TreeSet<>(Arrays.asList(alph));
			
			Set<String> phrSet=new TreeSet<>(Arrays.asList(phr));
	    
	 return   phrSet.containsAll(alphSet);
	  }
}


