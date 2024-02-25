/**
 * 
 */
package sorting;

import java.util.Scanner;

/**
 * 
 */
public class SelectionSort {

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
			
			Sort(array);
			
			for (int i = 0; i < length; ++i) {
				System.out.print(array[i] + " ");
			}
		} while (true);
		input.close();
	}

	private static void Sort(int[] array) {
		// TODO Auto-generated method stub
		for (int i = 0; i < array.length; ++i) {
			int MinOfArray = Integer.MAX_VALUE;
			int MinIndex = 0;
			for (int j = 1; j < array.length; ++j) {
				// alternate if (array[i] < array[MinIndex]. Don't track minimum value
				if (array[i] < MinOfArray) {
					MinOfArray = array[j];
					MinIndex = i;
				}
			}
			int temp = array[i];
			array[i] = array[MinIndex];
			array[MinIndex] = temp;
		}
	}
}
