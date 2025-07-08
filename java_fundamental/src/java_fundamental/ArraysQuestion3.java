package java_fundamental;
import java.util.*;

public class ArraysQuestion3 {

	public static void main(String[] args) {
		int a[] = {1,4,34,56,7};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int search=a[0];
		int index=-1;
		for(int i=0; i<a.length; i++) {
			if(a[i]==num) {
				index=i;
				break;
			}
		}
		System.out.println("Index:"+index);

	}

}
