package Lec_4;
import java.util.Scanner;

public class NNaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		int i = 1;
		while (i <= n) {
			System.out.println(i);
			++i;
		}
	}

}
