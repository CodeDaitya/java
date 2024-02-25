/**
 * 
 */
package arrays;

import java.util.Scanner;

/**
 * 
 */
public class ReverseSubArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		do {
			int StartIndex = input.nextInt();
			int EndIndex = input.nextInt();
			int [] arr = new int[10];
			for (int i = 0; i < arr.length; ++i) {
				arr[i] = input.nextInt();
			}
	
			PrintReverseOfSubArray(arr, StartIndex, EndIndex);
			for (int i = 0; i < arr.length; ++i) {
				System.out.println(arr[i]);
			}
			System.out.print("Continue? (y/n): ");
			String cont = input.next();
			if (cont.toLowerCase() != "y") {
				break;
			}
		} while(true);
		input.close();
	}
	
	public static void PrintReverseOfSubArray(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		for (int in = i, inj = j; in <= inj; ++in, --inj) {
			int temp = arr[in];
			arr[in] = arr[inj];
			arr[inj] = temp;
		}
	}

}
