/**
 * 
 */
package Lec9;

import java.util.Scanner;

/**
 * 
 */
public class NumberOfDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		int number = 0;
		while (n > 0) {
			++number;
			 n /= 10;
		}
		
		System.out.println(number);
	}
}
