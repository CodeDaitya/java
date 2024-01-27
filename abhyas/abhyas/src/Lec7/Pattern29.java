/**
 * 
 */
package Lec7;

import java.util.Scanner;

/**
 * 
 */
public class Pattern29 {

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
				System.out.print("  ");
			}
			
			for(int j = 1; j <= 2*i - 1; ++j) {
				if(j == 1 || j == 2*i - 1) {
					System.out.print(i);
					System.out.print(" ");
				} else {
					System.out.print(0);
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
