package programming;
import java.util.Scanner;
public class sanjugeetha {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter integer value");
		int a=sc.nextInt();
		if(a%3==0)
			System.out.println("sanju");
		else if(a%5==0)
			System.out.println("geetha");
		else if(a%3==0 && a%5==0)
			System.out.println("sanju weds geetha");
		else 
			System.out.println("Breakup");
		
		
	}

}
