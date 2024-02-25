/**
 * 
 */
package arrays;

import java.util.Scanner;

/**
 * 
 */
public class SearchInArray {

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
			
			int query = input.nextInt();
			int [] arr = new int[length];
			for (int i = 0; i < length; ++i) {
				arr[i] = input.nextInt();
			}
			
			int index = GetQueryInArray(arr, query);
			System.out.println(index > -1 ? index : "Not Found");
		} while (true);
		input.close();
	}

	private static int GetQueryInArray(int[] arr, int query) {
		// TODO Auto-generated method stub
		int index = -1;
		for (int i = 0; i < arr.length; ++i) {
			if (arr[i] == query) {
				index = i;
				break;
			}
		}
		
		return index;
	}
}
