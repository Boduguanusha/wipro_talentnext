package java_fundamental;
import java.util.*;

public class ArraysQuestion1 {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
			sum=sum+a[i];
		}
		double Average = (double)sum/a.length;
		System.out.println("Sum:"+sum);
		System.out.println("Average:"+Average);
		
	}

}
