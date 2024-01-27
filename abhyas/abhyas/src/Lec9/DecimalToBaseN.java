/**
 * 
 */
package Lec9;

import java.util.Scanner;

/**
 * 
 */
public class DecimalToBaseN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int decimal = input.nextInt();
		int n = input.nextInt();
		input.close();
		
		int nBase = 0;
		while (n > 0) {
			nBase *= 10;
			nBase += decimal % n;
			decimal /= n;
		}
		
		System.out.print(nBase);
	}

}
