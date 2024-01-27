package Lec_4;

import java.util.Scanner;

public class LongStaircasePattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		int j = n;
		int nstr = 1;
		while(j >= 1) {
			int i = 1;
			while (i <= nstr) {
				System.out.print("*");
				++i;
			}
			
			// prepare for the next row
			--j;
			nstr += 2;
			System.out.println();
		}
		
		System.out.println();
		j = 0;
		while(j < n) {
			int i = 1;
			while (i <= 2*j + 1) {
				System.out.print("*");
				++i;
			}
			
//			if (j > 0) {
//				System.out.print('*');
//			}
			
			// prepare for the next row
			++j;
			System.out.println();
		}
	}
}
