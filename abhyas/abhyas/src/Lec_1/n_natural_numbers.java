/**
 * 
 */
package Lec_1;
import java.util.Scanner;

/**
 * 
 */
public class n_natural_numbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		input.close();
		for (int i = 0; i <= n; ++i) {
			System.out.println(i);
		}	
	}
}
