/**
 * 
 */
package arrays;

import java.util.Scanner;

/**
 * 
 */
public class PrintSubArray {

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
			
			for (int i = 0; i < length; ++i) {
				for (int j = i; j < length; ++j) {
					System.out.println("(" + i + ", " + j + ")");
					for (int k = i; k <= j; ++k) {
						System.out.print(nums[k] + " ");
					}
					System.out.println();
				}
			}
		} while (true);
		input.close();
	}
}
