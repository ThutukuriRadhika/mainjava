package programming;
import java.util.Scanner;
public class MainSmallest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three integer values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a<b && a<c)
			System.out.println(a+"is Smallest");
		else if(b<c)
			System.out.println(b+"is Smallest");
		else 
			System.out.println(c+"is Smallest"); 
			
		
		
	}

}
