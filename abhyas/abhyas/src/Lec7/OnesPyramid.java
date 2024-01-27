/**
 * 
 */
package Lec7;

import java.util.Scanner;

/**
 * 
 */
public class OnesPyramid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		int i = 1;
		while (i <= n) {
			int j = 1;
			while (j <= n - i) {
				System.out.print("  ");
				++j;
			}
			
			j = 1;
			while (j <= 2*i - 1) {
				System.out.print("1 ");
				++j;
			}
			
			System.out.println();
			++i;
		}
	}

}
