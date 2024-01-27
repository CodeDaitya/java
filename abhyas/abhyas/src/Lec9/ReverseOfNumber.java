/**
 * 
 */
package Lec9;

import java.util.Scanner;

/**
 * 
 */
public class ReverseOfNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.close();
		
		int reverseNumber = 0;
		while (number > 0) {
			reverseNumber *= 10;
			reverseNumber += number % 10;
			number /= 10;
		}
		
		System.out.println(reverseNumber);
	}

}
