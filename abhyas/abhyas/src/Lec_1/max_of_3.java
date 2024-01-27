package Lec_1;
import java.util.*;

public class max_of_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number_1 = input.nextInt();
		int number_2 = input.nextInt();
		int number_3 = input.nextInt();
		
		input.close();
		
		int max = number_1;
		
		if(number_2 > max) {
			max = number_2;
		}
		
		if (number_3 > max) {
			max = number_3;
		}
		
		System.out.println("Largest: " + max);
		
		if(number_1 > number_2 && number_1 > number_3) {
			System.out.println("Largest: " + number_1);
		} else if(number_2 > number_1 && number_2 > number_3) {
			System.out.println("Largest: " + number_2);
		} else {
			System.out.println("Largest: " + number_3);
		}
	}
}
