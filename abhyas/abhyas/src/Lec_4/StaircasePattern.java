package Lec_4;

import java.util.Scanner;

public class StaircasePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		int j = n;
		while(j >= 1) {
			int i = j-1;
			while (i < n) {
				System.out.print("*");
				++i;
			}
			
			// prepare for the next row
			--j;
			System.out.println();
		}
	}

}
