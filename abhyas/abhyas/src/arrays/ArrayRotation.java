/**
 * 
 */
package arrays;

import java.util.Scanner;

/**
 * 
 */
public class ArrayRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		do {
			int numberOfRotations = input.nextInt();
			
			int length = input.nextInt();
			if (length <= 0) {
				break;
			}
			
			int [] arr = new int[length];
			for (int i = 0; i < length; ++i) {
				arr[i] = input.nextInt();
			}
			RotateArray(arr, numberOfRotations);
		} while(true);
		input.close();
	}
	
	public static void ReverseSubArray(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		for (int in = i, inj = j; in <= inj; ++in, --inj) {
			int temp = arr[in];
			arr[in] = arr[inj];
			arr[inj] = temp;
		}
	}

	private static void RotateArray(int[] nums, int k) {
		// TODO Auto-generated method stub
		k = k % nums.length;
		ReverseSubArray(nums, 0, nums.length - 1);
		ReverseSubArray(nums, 0, k - 1);
		ReverseSubArray(nums, k, nums.length  - 1);
	}
}
