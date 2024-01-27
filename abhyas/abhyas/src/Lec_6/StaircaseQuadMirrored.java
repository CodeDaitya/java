package Lec_6;

import java.util.Scanner;

// incomplete

public class StaircaseQuadMirrored {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		int j = n;
		while (j > 0) {
			if (j < n/2) {
				int i = (j / 2) -1;
				while (i > 0) {
					System.out.print("  ");
					--i;
				}
				
				i = (j / 2) - 1;
				while (i < n / 2) {
					System.out.print("* ");
					++i;
				}
				
				i = (j / 2) -1;
				while (i > 0) {
					System.out.print("  ");
					--i;
				}
				
				i = (j / 2) - 1;
				while (i < n / 2) {
					System.out.print("* ");
					++i;
				}
			} else if (j == n/2 + 1) {
				int i = n;
				while (i > 0) {
					System.out.print("  ");
					--i;
				}
				
				System.out.println();
			} else {
				
			}
			
			// prepare for the next row
			--j;
			System.out.println();
		}
	}
}
