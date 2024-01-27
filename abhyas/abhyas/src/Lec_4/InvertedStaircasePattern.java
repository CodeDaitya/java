package Lec_4;
import java.util.Scanner;

public class InvertedStaircasePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		int j = n;
		while(j >= 1) {
			int i = j;
			while (i >= 1) {
				System.out.print("*");
				--i;
			}
			
			// prepare for the next row
			--j;
			System.out.println();
		}
	}
}
