package Lec_6;
import java.util.Scanner;

public class StarExclaimationPyramid {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		
		int j = n;
		while (j > 0) {
			int k = 0;
			while (k < j - 1) {
				System.out.print("  ");
				++k;
			}
			
			int i = 0;
			while (i < 2*(n-j) + 1) {
				if (i % 2 == 0) {
					System.out.print("* ");
				} else {
					System.out.print("! ");
				}
				++i;
			}
			
			System.out.println();
			--j;
		}
	}
}
