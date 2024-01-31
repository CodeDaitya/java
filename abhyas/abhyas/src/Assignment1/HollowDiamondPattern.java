/**
 * 
 */
package Assignment1;
import java.util.Scanner;

/**
 * 
 */
public class HollowDiamondPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.close();
		
		if (num <= 0 || num >= 10 && num%2 == 0) {
			return;
		}
		
		int n = num / 2 + 1;
		for (int i = 1; i <= 2*n - 1; ++i) {
			if (i <= n) {
				for (int j = n - i + 1; j >= 1; --j) {
					System.out.print("*\t");
				}
				for (int j = 1; j <= 2*i - 3; ++j) {
					System.out.print("\t");
				}
				for (int j = n - i + 1; j >= 1; --j) {
					if (i == 1 && j == 1) {
						continue;
					}
					
					System.out.print("*\t");
				}
			} else {
				for (int j = n + 1; j <= i + 1; ++j) {
					System.out.print("*\t");
				}
				for (int j = 1; j <= 2*(2*n - i) - 3; ++j) {
					System.out.print("\t");
				}
				for (int j = n + 1; j <= i + 1; ++j) {
					if (i == 2*n - 1 && j == i + 1) {
						continue;
					}
					
					System.out.print("*\t");
				}
			}
			
			System.out.println();
		}
	}
}
