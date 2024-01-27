/**
 * 
 */
package Lec9;

import java.util.Scanner;

/**
 * 
 */
public class HCFOfTwoNumbers {

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
		
		System.out.println(HCF);
	}
}
