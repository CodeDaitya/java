/**
 * 
 */
package Assignment1;

import java.util.Scanner;

/**
 * Assignment Patter 5
 */
public class MirrorStarPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		if (n <= 0 || n >= 10 && n % 2 == 0) {
			return;
		}
		
		n = n / 2 + 1;
		for (int i = 1; i <= 2*n - 1; ++i) {
			if (i <= n) {
				for (int j = n - i; j >= 1; --j) {
					System.out.print("\t");
				}
				for (int j = 1; j <= i; ++j) {
					System.out.print("*\t");
				}
				for (int j = 2; j <= i; ++j) {
					System.out.print("*\t");
				}
			} else {
				for (int j = 1; j <= i - n; ++j) {
					System.out.print("\t");
				}
				for (int j = 1; j <= 2*n - i; ++j) {
					System.out.print("*\t");
				}
				for (int j = 1; j <= 2*n - i - 1; ++j) {
					System.out.print("*\t");
				}
			}
			
			System.out.println();
		}
	}
}
