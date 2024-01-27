/**
 * 
 */
package Lec8;

import java.util.Scanner;

/**
 * 
 */
public class nCr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int r = input.nextInt();
		input.close();
		
		int nCr = nFactorial(n) / (nFactorial(r) * nFactorial (n - r));
		System.out.println(nCr);
	}
	
	public static int nFactorial (int number) {
		int factorial = 1;
		for (int i = number; i > 0; --i) {
			factorial *= i;
		}
		
		return factorial;
	}
}
