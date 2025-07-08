package java_fundamental;
import java.util.*;

public class ArraysQuestion10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter " + n + " array elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		List<Integer> even = new ArrayList<>();
		List<Integer> odd = new ArrayList<>();
		for (int num : arr) {
			if (num % 2 == 0)
				even.add(num);
			else
				odd.add(num);
		}
		even.addAll(odd);
		System.out.println("Rearranged array:");
		System.out.println(even);

	}

}
