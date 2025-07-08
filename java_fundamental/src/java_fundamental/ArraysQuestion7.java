package java_fundamental;
import java.util.*;

public class ArraysQuestion7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int num = sc.nextInt();
        
        int a[] = new int[num];
        System.out.println("Enter " + num + " elements:");
        for (int i = 0; i < num; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int temp[] = new int[num];
        int j = 0;
        for (int i = 0; i < num - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }
        temp[j++] = a[num - 1];

        System.out.println("Without duplicate values:");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
