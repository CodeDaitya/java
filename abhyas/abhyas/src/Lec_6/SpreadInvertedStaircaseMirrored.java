package Lec_6;

import java.util.Scanner;

public class SpreadInvertedStaircaseMirrored {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		int j = 2*n - 1;
		while(j >= 1) {

			if (j >= n) {
				int i = j - n;
				while (i > 0) {
					System.out.print("    ");
					--i;
				}
				
				i = 0;
				while (i < j - n + 1) {
					System.out.print("* ");
					++i;
				}
			} else {
				int i = 0;
				while (i < n - j) {
					System.out.print("    ");
					++i;
				}
				
				i = j - 1;
				while (i < n) {
					System.out.print("* ");
					++i;
				}
			}
			
			// prepare for the next row
			--j;
			System.out.println();
		}
	}
}
