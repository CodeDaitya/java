/**
 * 
 */
package arrays;

import java.util.Scanner;

/**
 * 
 */
public class MinMaxSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int [] arr = new int[5];
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = input.nextInt();
		}
		input.close();
		
		int [] MinMaxSum = new int[3];
		MinMaxSum = GetMinMaxSum(arr);
		System.out.print(MinMaxSum[0] + ", " + MinMaxSum[1] + ", " + MinMaxSum[2]);
	}

	/**
	 * 
	 * @param arr
	 * @return int []
	 */
	private static int[] GetMinMaxSum(int[] arr) {
		// TODO Auto-generated method stub
		int [] MinMaxSum = new int[3];
		
		MinMaxSum[0] = Integer.MAX_VALUE;
		MinMaxSum[1] = Integer.MIN_VALUE;
		MinMaxSum[2] = 0;
		for (int i = 0; i < arr.length; ++i) {
			if (arr[i] < MinMaxSum[0]) {
				MinMaxSum[0] = arr[i];
			}
			
			if (arr[i] > MinMaxSum[1]) {
				MinMaxSum[1] = arr[i];
			}
			
			MinMaxSum[2] += arr[i];
		}
		
		return MinMaxSum;
	}
}
