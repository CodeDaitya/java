/**
 * 
 */
package Lec_4;
import java.util.Scanner;


/**
 * 
 */
public class Grade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int marks = input.nextInt();
		input.close();
		
		if (marks > 90) {
			System.out.println("Grade is A");
		} else if (marks > 80) {
			System.out.println("Grade is B");
		} else if (marks > 70) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}
}
