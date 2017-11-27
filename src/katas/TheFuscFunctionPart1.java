/*The fusc function is defined recursively as follows:

fusc(0) = 0
fusc(1) = 1
fusc(2n) = fusc(n)
fusc(2n + 1) = fusc(n) + fusc(n + 1)

Your job is to produce the code for the fusc function. 
In this kata, your function will be tested with small 
values of n,so you should not need to be concerned about 
stack overflow or timeouts.*/
package katas;

public class TheFuscFunctionPart1 {

	public static void main(String[] args) {
	}

	public int fusc(int n) {
		if (n == 0 || n == 1)
			return n;
		if (n % 2 == 0)
			return fusc(n / 2);
		return fusc(n / 2) + fusc(n / 2 + 1);
	}
}
