package Lec7;

import java.util.Scanner;

public class Pattern30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		for(int i = 1; i <= n; ++i) {
			for(int j = n; j >= 1; --j) {
				System.out.print(j);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
