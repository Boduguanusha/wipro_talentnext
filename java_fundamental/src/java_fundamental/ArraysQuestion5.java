package java_fundamental;
import java.util.*;

public class ArraysQuestion5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of arrays:");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for(int i=0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);

      
        int smallest1 = numbers[0];
        int smallest2 = numbers[1];

     
        int largest1 = numbers[numbers.length - 1];
        int largest2 = numbers[numbers.length - 2];

      
        System.out.println("Smallest two numbers: " + smallest1 + ", " + smallest2);
        System.out.println("Largest two numbers: " + largest1 + ", " + largest2);

	}

}
