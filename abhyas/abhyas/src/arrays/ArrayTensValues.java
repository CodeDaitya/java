package arrays;

import java.util.Scanner;

public class ArrayTensValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int [] array = new int[7];

		// input
		for (int i = 0; i < size; ++i) {
			array[i] = (i+1)*10;
		}

		// output
		for (int i = 0; i < size; ++i) {
			System.out.println(array[i]);
		}
		
		input.close();
	}
}
