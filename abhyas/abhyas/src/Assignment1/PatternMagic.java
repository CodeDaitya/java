package Assignment1;

import java.util.Scanner;

public class PatternMagic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		for (int i = 1; i <= 2*n - 1; ++i) {
			if (i <= n) {
				for (int j = n - i + 1; j >= 1; --j) {
					System.out.print("*");
				}
				for (int j = 1; j <= 2*i - 3; ++j) {
					System.out.print(" ");
				}
				for (int j = n - i + 1; j >= 1; --j) {
					if (i == 1 && j == 1) {
						continue;
					}
					
					System.out.print("*");
				}
			} else {
				for (int j = n + 1; j <= i + 1; ++j) {
					System.out.print("*");
				}
				for (int j = 2; j <= 2*(2*n - i) - 2; ++j) {
					System.out.print(" ");
				}
				for (int j = n + 1; j <= i + 1; ++j) {
					if (i == 2*n - 1 && j == i + 1) {
						continue;
					}
					
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
	}
}
