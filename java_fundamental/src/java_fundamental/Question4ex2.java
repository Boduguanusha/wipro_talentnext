package java_fundamental;
import java.util.Scanner;

public class Question4ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number:");
		int a=sc.nextInt();
		System.out.println("Enter a second number:");
		int b=sc.nextInt();
		boolean result=(a%10)==(b%10);
		System.out.println("same last digit:"+result);

	}

}
