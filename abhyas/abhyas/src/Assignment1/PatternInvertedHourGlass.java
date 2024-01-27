/**
 * 
 */
package Assignment1;

import java.util.Scanner;

/**
 * 
 */
public class PatternInvertedHourGlass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		for(int i = 1; i <= 2*n + 1; ++i) {
			if (i <= n) {
				for (int j = n; j >= n - i + 1; --j) {
					System.out.print(Integer.toString(j) + " ");
				}
				for (int j = 1; j <= 2*(n - i) + 1; ++j) {
					System.out.print("  ");
				}
				for (int j = n - i + 1; j <= n; ++j) {
					System.out.print(Integer.toString(j) + " ");
				}
			} else if (i == n + 1) {
				for (int j = n; j >= 1; --j) {
					System.out.print(Integer.toString(j) + " ");
				}
				System.out.print(Integer.toString(0) + " ");
				for (int j = 1; j <= n; ++j) {
					System.out.print(Integer.toString(j) + " ");
				}
			} else {
				for (int j = n; j >= i - n -1; --j) {
					System.out.print(Integer.toString(j) + " ");
				}
				for (int j = 1; j <= 2*(i - n - 1) - 1; ++j) {
					System.out.print("  ");
				}
				for (int j = i - n - 1; j <= n; ++j) {
					System.out.print(Integer.toString(j) + " ");
				}
			}
			
			System.out.println();
		}
	}
}
