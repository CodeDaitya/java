package arrays;

import java.util.Scanner;

public class MinimumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int [] arr = new int[5];
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = input.nextInt();
		}
		input.close();
		
		System.out.print(getMin(arr));
	}

	private static int getMin(int[] arr) {
		// TODO Auto-generated method stub
		int MinOfArray = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; ++i) {
			if (arr[i] < MinOfArray) {
				MinOfArray = arr[i];
			}
		}
		return MinOfArray;
	}
}
