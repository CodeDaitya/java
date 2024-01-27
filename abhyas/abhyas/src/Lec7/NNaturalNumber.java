package Lec7;
import java.util.Scanner;

public class NNaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		for (int i = 1; i <= n; ++i) {
			System.out.println(i);
		}
	}

}
