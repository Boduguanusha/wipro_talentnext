package java_fundamental;
import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("odd");
		}

	}

}
