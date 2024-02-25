/**
 * 
 */
package arrays;

import java.util.Scanner;

/**
 * 
 */
public class ArrayProductExceptItself {

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
	
			int [] arrayProduct = ArrayProduct(nums);
			for (int i = 0; i < length; ++i) {
				System.out.println(arrayProduct[i]);
			}
			System.out.print("Continue? (y/n): ");
			String cont = input.next();
			if (!cont.toLowerCase().contentEquals("y")) {
				break;
			}
		} while(true);
		input.close();
	}
	
	public static int SubArrayProduct(int[] nums, int i, int j) {
		int product = 1;
		for (; i <= j; ++i) {
			product *= nums[i];
		}
		return product;
	}

	private static int[] ArrayProduct(int[] nums) {
		// TODO Auto-generated method stub
		int [] arrayProduct = new int[nums.length];
		
		for (int i = 0; i < nums.length; ++i) {
			int product = 1;
			for (int j = 0; j < nums.length; ++j) {
				if (i == j) {
					continue;
				}
				product *= nums[j];
			}
			arrayProduct[i] = product;
			// arrayProduct[i] = SubArrayProduct(nums, 0, i - 1) * SubArrayProduct(nums, i + 1, nums.length - 1);
		}
		
		// optimized solution
		int length = nums.length;
		int[] leftProducts = new int[length];
		leftProducts[0] = 1;
		for (int i = 1; i < length; ++i) {
			leftProducts[i] = leftProducts[i - 1]*nums[i - 1];
		}
		
		int[] rightProducts = new int[length];
		rightProducts[length - 1] = 1;
		for (int i = length - 2; i >= 0; --i) {
			rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
		}
		
		for (int i = 0; i < length; ++i) {
			arrayProduct[i] = leftProducts[i]*rightProducts[i];
		}
		return arrayProduct;
	}

}
