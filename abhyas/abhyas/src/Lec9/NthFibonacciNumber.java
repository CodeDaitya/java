/**
 * 
 */
package Lec9;

import java.util.Scanner;

/**
 * 
 */
public class NthFibonacciNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
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
		
		System.out.println(FibonacciNumber);
	}
}
