package Assignment1;

import java.util.Scanner;

public class HollowRhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		if (n > 20) {
			return;
		}
		
		for (int i = 1; i <= n; ++i) {
			for(int j = n - i; j >= 1; --j) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n; ++j) {
				if (i == 1 || i == n) {
					System.out.print("*");
				} else if (j == 1 || j == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}
}
