package java_fundamental;
import java.util.*;

public class ArraysQuestion14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][3];
		System.out.println("Enter 9 integer numbers to fill the 3x3 array:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (sc.hasNextInt()) {
					arr[i][j] = sc.nextInt();
				} else {
					System.out.println("Please enter only integer values.");
					return;
				}
			}
		}
		System.out.println("The given array is:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		int max = arr[0][0];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}

		System.out.println("The biggest number in the given array is " + max);

	}

}
