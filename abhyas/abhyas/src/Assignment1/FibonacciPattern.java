/**
 * 
 */
package Assignment1;

import java.util.Scanner;

/**
 * 
 */
public class FibonacciPattern {

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
		
		int counter = 1;
		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print(Integer.toString(NthFibonacciNumber(counter++)) + "\t");
			}
			
			System.out.println();
		}
	}
	
	public static int NthFibonacciNumber(int n) {
		int n1 = 0;
		int n2 = 1;
		int FibonacciNumber = 0;
		for (int i = 2; i < n; ++i) {
			FibonacciNumber = n1 + n2;
			n1 = n2;
			n2 = FibonacciNumber;
		}
		
		if (n == 1) {
			FibonacciNumber = 0;
		} else if (n == 2) {
			FibonacciNumber = 1;
		}
		
		return FibonacciNumber;
	}
}
