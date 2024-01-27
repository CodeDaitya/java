/**
 * 
 */
package Lec_6;

import java.util.Scanner;

/**
 * 
 */
public class InvertedPyramidPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		int j = 0;
		while (j < n) {
			int k = j;
			while (k > 0) {
				System.out.print("  ");
				--k;
			}
			
			int i = 2*(n-j) - 1;
			while (i > 0) {
				System.out.print("* ");
				--i;
			}
			
			System.out.println();
			++j;
		}
	}
}
