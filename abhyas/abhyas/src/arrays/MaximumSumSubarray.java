/**
 * 
 */
package arrays;

import java.util.Scanner;

/**
 * 
 */
public class MaximumSumSubarray {

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
			
			int maxSum = Integer.MIN_VALUE;
			for (int i = 0; i < length; ++i) {
				for (int j = i; j < length; ++j) {
					System.out.print("(" + i + ", " + j + ") sum: ");
					int subArraySum = 0;
					for (int k = i; k <= j; ++k) {
						subArraySum += nums[k];
					}
					
					if (maxSum < subArraySum) {
						maxSum = subArraySum;
					}
					System.out.println();
				}
			}
			
			System.out.println(maxSum);
			
			// O(n^2)
			for (int i = 0; i < length; ++i) {
				for (int j = i; j < length; ++j) {
					System.out.print("(" + i + ", " + j + ") sum: ");
					int subArraySum = 0;
					for (int k = i; k <= j; ++k) {
						subArraySum += nums[k];
					}
					
					if (maxSum < subArraySum) {
						maxSum = subArraySum;
					}
					System.out.println();
				}
			}
			
			System.out.println(maxSum);
			
			// O(n), with Cadence
			int subArraySum = 0;
			for (int i = 0; i < length; ++i) {
				subArraySum += nums[i];
				
				if (subArraySum < 0) {
					subArraySum = 0;
				}
			}
			
			System.out.println(maxSum);

			// O(n), with Cadence - Even quicker
			// reduce function calls and defined value lookup
			maxSum = nums[0];
	        for (int i = 0; i < nums.length; ++i) {
	            subArraySum += nums[i];

	            maxSum = subArraySum > maxSum ? subArraySum : maxSum;
	            if (subArraySum < 0) {
	                subArraySum = 0;
	            }

	        }

	        System.out.println(maxSum);
		} while (true);
		input.close();
	}

}
