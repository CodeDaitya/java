/**
 * 
 */
package arrays;

import java.util.Scanner;

/**
 * 
 */
public class InputInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int arrayLength = input.nextInt();
		int [] array = new int[arrayLength];

		// input
		for (int i = 0; i < arrayLength; ++i) {
			array[i] = input.nextInt();
		}

		// output
		for (int i = 0; i < arrayLength; ++i) {
			System.out.println(array[i]);
		}
		
		input.close();
	}
}
