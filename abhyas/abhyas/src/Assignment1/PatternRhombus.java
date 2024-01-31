package Assignment1;

import java.util.Scanner;

public class PatternRhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		if (n <= 0 || n >= 10) {
			return;
		}
		
		for (int i = 1; i <= 2*n - 1; ++i) {
			if (i <= n) {
				for (int j = n - i; j >= 1; --j) {
					System.out.print("\t");
				}
				for (int j = i; j <= 2*i - 1; ++j) {
					if (i == 1 && j > 1) {
						continue;
					}
					System.out.print(Integer.toString(j) + "\t");
				}
				for (int j = 2*(i - 1); j >= i; --j) {
					System.out.print(Integer.toString(j) + "\t");
				}
			} else {
				for (int j = 1; j <= i - n; ++j) {
					System.out.print("\t");
				}
				for (int j = 2*n - i; j <= 2*(2*n - i) - 1; ++j) {
					System.out.print(Integer.toString(j) + "\t");
				}
				for (int j = 2*(2*n - i) - 2; j >= 2*n - i; --j) {
					System.out.print(Integer.toString(j) + "\t");
				}
			}
			
			System.out.println();
		}
	}
}
