/*You have an array of numbers.
Your task is to sort ascending odd numbers but even 
numbers must be on their places.
Zero isn't an odd number and you don't need to move it. 
If you have an empty array, you need to return it.
Example
sortArray([5, 3, 2, 8, 1, 4]) == [1, 3, 2, 8, 5, 4]*/
package katas;

import java.util.ArrayList;
import java.util.Collections;

public class SortTheOdd {
	public  int[] sortArray(int[] array) {
		  ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
				for (int i = 0; i < array.length; i++) {
					if (array[i] % 2 != 0) {
						oddNumbers.add(array[i]);

					}
				}
				Collections.sort(oddNumbers);
				int counter = 0;
				for (int i = 0; i < array.length; i++) {
					if (array[i] % 2 != 0) {

						array[i] = oddNumbers.get(counter);
						counter++;
					}

				}
				for (int i = 0; i < array.length; i++){
					System.out.print(array[i]+",");
					}
		  
		  
		  
		    return array;
		  }
		}


