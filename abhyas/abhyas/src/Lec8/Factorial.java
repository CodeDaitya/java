/**
 * 
 */
package Lec8;

import java.util.Scanner;

/**
 * 
 */
public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		n = Math.abs(n);
		int factorial = 1;
		for (int i = n; i > 0; --i) {
			factorial *= i;
		}
		
		System.out.println(factorial);
	}
}
