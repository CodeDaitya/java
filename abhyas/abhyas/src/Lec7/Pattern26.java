/**
 * 
 */
package Lec7;

import java.util.Scanner;

/**
 * 
 */
public class Pattern26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		for(int i = 1; i <= n; ++i) {
			for(int j = 1; j <= n - i; ++j) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= 2*i - 1; ++j) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
