/**
 * 
 */
package Lec_4;
import java.util.Scanner;

/**
 * 
 */
public class HelloWorldX5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int iterations = input.nextInt();
		input.close();
		
		System.out.println("For loop:");
		for(int i = 1; i <= iterations; ++i) {
			System.out.println(i + ". Hello World");
		}
		
		int i = 1;
		System.out.println("\nWhile loop:");
		while(i <= iterations) {
			System.out.println(i + ". Hello World");
			++i;
		}
	}

}
