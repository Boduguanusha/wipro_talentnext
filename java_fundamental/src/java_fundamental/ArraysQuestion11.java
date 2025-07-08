package java_fundamental;
import java.util.*;

public class ArraysQuestion11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter " + n + " array elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		boolean only14 = true;
		for (int num : arr) {
			if (num != 1 && num != 4) {
				only14 = false;
				break;
			}
		}

		System.out.println("Contains only 1 and 4? " + only14);

	}

}
