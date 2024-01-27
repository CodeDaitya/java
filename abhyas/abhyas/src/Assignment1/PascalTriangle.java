/**
 * 
 */
package Assignment1;

import java.util.Scanner;

/**
 * 
 */
public class PascalTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		if (n < 0 || n > 100) {
			return;
		}
		
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j <= i; ++j) {
				System.out.print(Integer.toString(nCr(i, j)) + "\t");
			}
			System.out.println();
		}
	}
	
	public static int nFactorial (int number) {
		int factorial = 1;
		for (int i = number; i > 0; --i) {
			factorial *= i;
		}
		
		return factorial;
	}
	
	public static int nCr (int n, int r) {
		return nFactorial(n) / (nFactorial(r) * nFactorial (n - r));
	}
}
