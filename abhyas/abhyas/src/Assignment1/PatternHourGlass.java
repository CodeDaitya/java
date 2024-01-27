/**
 * 
 */
package Assignment1;

import java.util.Scanner;

/**
 * 
 */
public class PatternHourGlass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		if (n > 20) {
			return;
		}
		
		for(int i = 1; i <= 2*n + 1; ++i) {
			if (i <= n) {
				for (int j = 1; j <= i - 1; ++j) {
					System.out.print("  ");
				}
				for (int j = n - i + 1; j >= 1; --j) {
					System.out.print(Integer.toString(j) + " ");
				}
				System.out.print(Integer.toString(0) + " ");
				for (int j = 1; j <= n - i + 1; ++j) {
					System.out.print(Integer.toString(j) + " ");
				}
			} else if (i == n + 1) {
				for (int j = 1; j <= i - 1; ++j) {
					System.out.print("  ");
				}
				System.out.print(0);
			} else {
				for (int j = 2*n - i + 1; j >= 1; --j) {
					System.out.print("  ");
				}
				for (int j = i - n - 1; j >= 1; --j) {
					System.out.print(Integer.toString(j) + " ");
				}
				System.out.print(Integer.toString(0) + " ");
				for (int j = 1; j <= i - n - 1; ++j) {
					System.out.print(Integer.toString(j) + " ");
				}
			}
			
			System.out.println();
		}
	}
}
