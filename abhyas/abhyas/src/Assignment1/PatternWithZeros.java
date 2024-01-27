/**
 * 
 */
package Assignment1;

import java.util.Scanner;

/**
 * 
 */
public class PatternWithZeros {

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
		
		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= i; ++j) {
				if (j == 1 || j == i) {
					System.out.print(Integer.toString(i) + "\t");
				} else {
					System.out.print(Integer.toString(0) + "\t");
				}
			}
			System.out.println();
		}
	}

}
