package java_fundamental;
import java.util.*;

public class ArraysQuestion4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a array size:");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
			System.out.print((char)a[i]+" ");
		}

	}

}
