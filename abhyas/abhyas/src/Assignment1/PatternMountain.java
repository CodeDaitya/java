package Assignment1;

import java.util.Scanner;

public class PatternMountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		if (n <= 0 || n >= 10) {
			return;
		}
		
		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print(Integer.toString(j) + "\t");
			}
			for (int j = 1; j <= 2*(n - i) - 1; ++j) {
				System.out.print("\t");
			}
			for (int j = i; j >= 1; --j) {
				if (i == n && j == i) {
					continue;
				}
				System.out.print(Integer.toString(j) + "\t");
			}
			
			System.out.println();
		}
	}
}
