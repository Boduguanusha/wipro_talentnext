package java_fundamental;
import java.util.*;

public class ArraysQuestion2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n= sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		int max=a[0];
		int min=a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Maximum:"+max);
		System.out.println("Minimum:"+min);

	}

}
