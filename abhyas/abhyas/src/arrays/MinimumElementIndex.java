/**
 * 
 */
package arrays;

import java.util.Scanner;

/**
 * 
 */
public class MinimumElementIndex {

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
			
			System.out.print(MinimumIndex(array));
		} while (true);
		input.close();

	}
	
	private static int MinimumIndex(int[] array) {
		// TODO Auto-generated method stub
		int MinOfArray = Integer.MAX_VALUE;
		int MinIndex = 0;
		for (int i = 1; i < array.length; ++i) {
			// alternate if (array[i] < array[MinIndex]. Don't track minimum value
			if (array[i] < MinOfArray) {
				MinOfArray = array[i];
				MinIndex = i;
			}
		}
		
		return MinIndex;
	}
}
