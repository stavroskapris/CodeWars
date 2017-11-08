/*Given two integers a and b, which can be 
positive or negative, find the sum of all 
the numbers between including them too and 
return it. If the two numbers are 
equal return a or b.
Note: a and b are not ordered!*/

package katas;

public class SumOfNUmbers {
	public int GetSum(int a, int b){
    	int min = Math.min(a, b);
		int max = Math.max(a, b);
		int result = 0;
		if(a==b) return a;
		for (int i = min; i <= max; i++) {
      result=result+i;
		}
		return result;
     }

}
