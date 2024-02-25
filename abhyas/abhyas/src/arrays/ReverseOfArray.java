/**
 * 
 */
package arrays;

import java.util.Scanner;

/**
 * 
 */
public class ReverseOfArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int [] arr = new int[5];
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = input.nextInt();
		}
		input.close();

		PrintReverseOfArray(arr);
		for (int i = 0; i < arr.length; ++i) {
			System.out.println(arr[i]);
		}
	}
	
	public static void PrintReverseOfArray(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length / 2; ++i) {
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
	}
}
