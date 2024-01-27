/**
 * 
 */
package Lec9;

import java.util.Scanner;

/**
 * 
 */
public class LCMOfTwoNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		input.close();
		
		int divider = number1;
		int dividend = number2;
		int HCF = 0;
		while (divider > 0) {
			HCF = divider;
			divider = dividend % divider;
			dividend = HCF;
		}
		
		int LCM = (number1 * number2) / HCF;
		System.out.println(LCM);
	}
}
