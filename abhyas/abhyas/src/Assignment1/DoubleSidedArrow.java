package Assignment1;

import java.util.Scanner;

public class DoubleSidedArrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		if (n % 2 == 0) {
			return;
		}
		
		n = n /2 + 1;
		for (int i = 1; i <= 2*n - 1; ++i) {
			if (i <= n) {
				for (int j = 2*(n - i); j >= 1; --j) {
					System.out.print("  ");
				}
				for (int j = i; j >= 1; --j) {
					System.out.print(Integer.toString(j)+ " ");
				}
				for (int j = 1; j <= 2*i - 3; ++j) {
					System.out.print("  ");
				}
				for (int j = 1; j <= i; ++j) {
					if (i == 1) {
						continue;
					}
					System.out.print(Integer.toString(j) + " ");
				}
			} else {
				for (int j = 1; j <= 2*(i - n); ++j) {
					System.out.print("  ");
				}
				for (int j = 2*n - i; j >= 1; --j) {
					System.out.print(Integer.toString(j) + " ");
				}
				for (int j = 1; j <= 2*(2*n - i) - 3; ++j) {
					System.out.print("  ");
				}
				for (int j = 1; j <= 2*n - i; ++j) {
					if (i == 2*n - 1) {
						continue;
					}
					System.out.print(Integer.toString(j) + " ");
				}
			}
			
			System.out.println();
		}
	}
}
