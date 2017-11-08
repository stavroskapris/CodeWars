/*Write a method, that gets an array of integer-numbers and return an array of 
the averages of each integer-number and his follower, if there is one.
Example:
Input:  [ 1, 3, 5, 1, -10]
Output:  [ 2, 4, 3, -4.5]

If the array has 0 or 1 values or is null or None, 
your method should return an empty array.*/
package katas;

public class AverageOfNumbers {
	public double[] averages(int[] numbers) {

		if (numbers == null || numbers.length < 2)
			return new double[] {};
		double[] ans = new double[numbers.length - 1];
		for (int i = 0; i < ans.length; i++)
			ans[i] = (numbers[i] + numbers[i + 1]) / 2.0;
		return ans;

	}

}
