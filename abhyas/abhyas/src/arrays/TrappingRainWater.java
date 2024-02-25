/**
 * 
 */
package arrays;

import java.util.Scanner;

/**
 * 
 */
public class TrappingRainWater {

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
			
			int [] array = new int[length];
			for (int i = 0; i < length; ++i) {
				array[i] = input.nextInt();
			}
			
			System.out.print(TrappedWater(array));
		} while (true);
		input.close();
	}

	/**
	 * 
	 * @param array
	 * @return int[] trappedWater
 	 */
	private static int TrappedWater(int[] array) {
		// TODO Auto-generated method stub
		int length = array.length;
		
		// max left traps
		int[] leftTrap = new int[length];
		leftTrap[0] = array[0];
		for (int i = 1; i < length; ++i) {
			leftTrap[i] = leftTrap[i - 1] > array[i] ? leftTrap[i - 1] : array[i];
			leftTrap[i] = Math.max(leftTrap[i - 1], array[i]);
		}
		
		// max right traps
		int[] rightTrap = new int[length];
		rightTrap[length - 1] = array[length - 1];
		for (int i = length - 2; i >= 0; --i) {
			 rightTrap[i] = rightTrap[i + 1] > array[i] ? rightTrap[i + 1] : array[i];
			rightTrap[i] = Math.max(rightTrap[i + 1], array[i]);
		}

		int TotalTrappedWater = 0;
		for (int i = 0; i < length; ++i) {
			int minTrapSupport = 0;
			minTrapSupport = rightTrap[i] > leftTrap[i] ? leftTrap[i]: rightTrap[i];
			TotalTrappedWater += minTrapSupport - array[i];
		}
		
		return TotalTrappedWater;
	}
}
