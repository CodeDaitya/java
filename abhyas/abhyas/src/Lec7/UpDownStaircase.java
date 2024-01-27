/**
 * 
 */
package Lec7;
import java.util.Scanner;

/**
 * 
 */
public class UpDownStaircase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		int i = 1;
		while(i <= n) {
			int j = 1;
			while (j <= i) {
				System.out.print("* ");
				++j;
			}
			
			j = 1;
			while (j <= 2*(n - i) - 1) {
				System.out.print("  ");
				++j;
			}
			
			j = i;
			while(j <= 2*i - 1) {
				if (j == 2*n - 1) {
					continue;
				}
				System.out.print("* ");
				++j;
			}
			
			System.out.println();
			++i;
		}
	}

}
