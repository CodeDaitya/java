package Lec_4;
import java.util.*;

public class SumNNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		int sum = 0;
		int i = 1;
		while (i <= n) {
			sum += i;
			++i;
		}
		
		System.out.println(sum);
	}
}
