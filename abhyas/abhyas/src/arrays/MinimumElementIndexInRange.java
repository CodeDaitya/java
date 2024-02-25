/**
 * 
 */
package arrays;

import java.util.Scanner;

/**
 * 
 */
public class MinimumElementIndexInRange {

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
			
			int start = input.nextInt();
			int end = input.nextInt();
			
			System.out.print(MinimumIndexInRange(array, start, end));
		} while (true);
		input.close();

	}
	
	private static int MinimumIndexInRange(int[] array, int start, int end) {
		// TODO Auto-generated method stub
		int MinOfArray = Integer.MAX_VALUE;
		int MinIndex = start;
		for (int i = start + 1; i <= end; ++i) {
			// alternate if (array[i] < array[MinIndex]. Don't track minimum value
			if (array[i] < MinOfArray) {
				MinOfArray = array[i];
				MinIndex = i;
			}
		}
		
		return MinIndex;
	}
}
