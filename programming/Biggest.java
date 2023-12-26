package programming;
import java.util.Scanner;
public class Biggest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the four double values");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double d=sc.nextDouble();
		if(a>b && a>d && a>d)
			System.out.println(a+"is Biggest");
		else if(b>c && b>d)
			System.out.println(b+"is Biggest");
		else if(c>d)
			System.out.println(c+"is Biggest");
		else
			System.out.println(d+"is Biggest");
			
		
	}

}
