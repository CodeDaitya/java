package Lec_1;
import java.util.Scanner;

public class Lec_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner input = new Scanner(System.in);
		
		float principle = input.nextFloat();
		float interest = input.nextFloat();
		float time = input.nextFloat();
		
		input.close();
		
		System.out.println(principle*interest*time/100);
	}

}
