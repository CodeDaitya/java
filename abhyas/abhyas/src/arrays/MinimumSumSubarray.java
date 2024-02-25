/**
 * 
 */
package arrays;

import java.util.Scanner;

/**
 * 
 */
public class MinimumSumSubarray {

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
			
			int [] nums = new int[length];
			for (int i = 0; i < length; ++i) {
				nums[i] = input.nextInt();
			}
			
			int maxSum = nums[0];
			int subArraySum = 0;
	        for (int i = 0; i < nums.length; ++i) {
	            subArraySum += nums[i];
	
	            maxSum = subArraySum > maxSum ? maxSum : subArraySum;
	            if (subArraySum > 0) {
	                subArraySum = 0;
	            }
	
	        }
	
	        System.out.println(maxSum);
		} while (true);
		input.close();
	}
}
