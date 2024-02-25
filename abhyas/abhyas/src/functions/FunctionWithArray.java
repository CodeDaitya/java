/**
 * 
 */
package functions;

/**
 * 
 */
public class FunctionWithArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1, 2, 3, 4, 5};
		int [] brr = {10, 20, 30, 40, 50};
		System.out.println(arr[0] + ", " + brr[0]);
		swap(arr, brr);
		System.out.println(arr[0] + ", " + brr[0]);

		System.out.println(arr[0] + ", " + arr[1]);
		swap(arr, 0, 1);
		System.out.println(arr[0] + ", " + arr[1]);
	}

	public static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void swap(int[] arr, int[] brr) {
		// TODO Auto-generated method stub
		int [] temp = arr;
		arr = brr;
		brr = temp;
	}
}
