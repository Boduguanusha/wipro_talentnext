package java_fundamental;
import java.util.*;

public class Question8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter characters");
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		Arrays.sort(ch);
		for(int i=0;i<ch.length;i++) {
			if(i==ch.length-1) {
				System.out.print(ch[i]);
			}else {
				System.out.print(ch[i]+",");
			}
		}
		sc.close();


	}

}
