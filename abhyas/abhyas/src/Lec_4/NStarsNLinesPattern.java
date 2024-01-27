package Lec_4;
import java.util.*;

public class NStarsNLinesPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		int j = 0;
		while(j < n) {
			int i = 0;
			while (i < n) {
				System.out.print("* ");
				++i;
			}
			++j;
			System.out.println("");
		}
	}
}
