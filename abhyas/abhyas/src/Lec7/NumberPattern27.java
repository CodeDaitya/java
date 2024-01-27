/**
 * 
 */
package Lec7;

import java.util.Scanner;

/**
 * 
 */
public class NumberPattern27 {

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
			while (j <= i) {
				System.out.print(j + " ");
				++j;
			}
			
			j -= 2;
			while (j >= 1) {
				System.out.print(j + " ");
				--j;
			}
			
			System.out.println();
			++i;
		}
	}

}
