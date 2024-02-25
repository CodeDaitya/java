/**
 * 
 */
package arrays;

import java.util.Scanner;

/**
 * 
 */
public class MaximizeStockProfit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		do {
			int length = input.nextInt();
			if (length <= 0) {
				break;
			}
			int [] arr = new int[length];
			for (int i = 0; i < length; ++i) {
				arr[i] = input.nextInt();
			}
			int maximumProfit = MaximizeProfit(arr);
			System.out.println(maximumProfit);
		} while(true);
		input.close();
	}

	private static int MaximizeProfit(int[] prices) {
		// TODO Auto-generated method stub
		/*
		 * int maxProfit = 0; for (int i = 0; i < arr.length - 1; ++i) { for (int j = i
		 * + 1; j < arr.length; ++j) { if (arr[j] - arr[i] > maxProfit) { maxProfit =
		 * arr[j] - arr[i]; } } }
		 * 
		 * return maxProfit;
		 */
		// optimized solution
		int maxProfit = 0;
		int currentMin = prices[0];
		for (int i = 0; i < prices.length; ++i) {
			int currentProfit = prices[i] - currentMin;
			maxProfit = Math.max(maxProfit, currentProfit);
			currentMin = Math.min(currentMin, prices[i]);
		}
		return maxProfit;
	}
}
