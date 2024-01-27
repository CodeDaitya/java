/**
 * 
 */
package Assignment1;
import java.util.Scanner;

/**
 * incomplete
 */
public class HollowDiamondPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		if (n <= 0 || n >= 10 && n%2 == 1) {
			return;
		}
		
		for (int i = 1; i <= n; ++i) {
			if (i <= 1 + n/2) {
				for (int j = 1; j <= (n - i)/2 + 1 ; ++j) {
					System.out.print("*\t");
					if (i == 1 + n/2) {
						++j;
					}
				}
				for (int j = 1; j <= 2*(i - 1) - 1; ++j) {
					System.out.print("\t");
				}
				for (int j = 1; j <= (n - i)/2 + 1 ; ++j) {
					System.out.print("*\t");
				}
			} else {
				
			}
			
			System.out.println();
		}
	}
}
