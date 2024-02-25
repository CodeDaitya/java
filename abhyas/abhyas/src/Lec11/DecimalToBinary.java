/**
 * 
 */
package Lec11;

import java.util.Scanner;

/**
 * 
 */
public class DecimalToBinary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Integer:");
		int integer = input.nextInt();
		System.out.print("Long Integer:");
		long longInt = input.nextLong();
		input.close();
		
		System.out.println(Integer.toBinaryString(integer));
		System.out.println(Long.toBinaryString(longInt));
	}
}
