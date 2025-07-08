package java_fundamental;
import java.util.*;

public class ArraysQuestion6 {

	public static void main(String[] args) {
		int a[] = new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numbers:");
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		int n=a.length;
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-1; j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] =a [j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println("Sorted Arrays:"+ Arrays.toString(a));
		

	}

}
