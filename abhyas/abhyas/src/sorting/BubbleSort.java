/**
 * 
 */
package sorting;

import java.util.Scanner;

/**
 * 
 */
public class BubbleSort {

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
		for (int round = 0; round < array.length - 1; ++round) {
			for (int j = 0; j < array.length - round - 1; ++j) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
}
