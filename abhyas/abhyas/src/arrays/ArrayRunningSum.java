/**
 * 
 */
package arrays;

import java.util.Scanner;

/**
 * 
 */
public class ArrayRunningSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		do {
			int length = input.nextInt();
			int [] nums = new int[length];
			for (int i = 0; i < length; ++i) {
				nums[i] = input.nextInt();
			}
	
			int [] runnigSum = RunningSum(nums);
			for (int i = 0; i < runnigSum.length; ++i) {
				System.out.println(runnigSum[i]);
			}
			System.out.print("Continue? (y/n): ");
			String cont = input.next();
			if (cont.toLowerCase() != "y") {
				break;
			}
		} while(true);
		input.close();
	}

	private static int[] RunningSum(int[] nums) {
		// TODO Auto-generated method stub
		int [] runningSum = new int[nums.length];
		runningSum[0] = nums[0];
		for (int i = 1; i < nums.length; ++i) {
			runningSum[i] = runningSum[i - 1] + nums[i];
		}
		return runningSum;
	}
}
