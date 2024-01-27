/**
 * 
 */
package Lec9;

import java.util.Scanner;

/**
 * throwing reverse
 */
public class DecimalToBinary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		int binary = 0;
		while (n > 0) {
			binary *= 10;
			binary += n % 2;
			n /= 2;
		}
		
		System.out.print(binary);
	}

}
