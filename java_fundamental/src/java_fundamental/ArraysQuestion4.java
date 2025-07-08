package java_fundamental;
import java.util.*;

public class ArraysQuestion4 {

	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
			System.out.print((char)a[i]+" ");
		}

	}

}
