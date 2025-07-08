package java_fundamental;
import java.util.*;

public class ArraysQuestion9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter " + n + " array elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] result = new int[n];
		int index = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] != 10) {
				result[index++] = arr[i];
			}
		}

		System.out.println("Array after removing 10's:");
		System.out.println(Arrays.toString(result));

	}

}
