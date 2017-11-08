/*//Write a function, persistence, 
//that takes in a positive parameter num and 
//returns its multiplicative persistence, 
//which is the number of times you must multiply 
//the digits in num until you reach a single digit.
*/
package katas;

import java.util.ArrayList;
import java.util.Collections;

public class Persist {

	public static void main(String[] args) {

		Persist pr = new Persist();

		System.out.println(pr.persistence(4));

	}

	public int persistence(long n) {
		int persist = 0;
		long mult = 1;
		int length = String.valueOf(n).length();

		while (length > 1) {
			ArrayList<Long> nList = new ArrayList<Long>();
			persist += 1;
			;
			for (int i = 0; i < length; i++) {
				nList.add(n % 10);
				n = n / 10;

			}
			Collections.reverse(nList);

			for (int i = 0; i < nList.size(); i++) {

				mult = mult * nList.get(i);
			}

			length = String.valueOf(mult).length();
			n = mult;
			mult = 1;
		}

		return persist;
	}
}
