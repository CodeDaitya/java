/**
 * 
 */
package Assignment1;

import java.util.Scanner;

/**
 * 
 */
public class R4Pattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		if (n <= 0 || n > 100) {
			return;
		}
		
		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
