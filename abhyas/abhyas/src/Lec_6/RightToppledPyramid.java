package Lec_6;
import java.util.Scanner;

public class RightToppledPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		int j = 2*n - 1;
		while(j >= 1) {
			if (j > n) {
				int i = j  - n;
				while (i < n) {
					System.out.print("* ");
					++i;
				}
			} else {
				int i = j;
				while (i >= 1) {
					System.out.print("* ");
					--i;
				}
			}
			
			// prepare for the next row
			--j;
			System.out.println();
		}
		
//		j = n - 1;
//		while(j >= 1) {
//			int i = j;
//			while (i >= 1) {
//				System.out.print("* ");
//				--i;
//			}
//			
//			// prepare for the next row
//			--j;
//			System.out.println();
//		}
	}
}
