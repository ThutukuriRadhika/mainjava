package programming;
import java.util.Scanner;
public class monthName {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the month number");
		int m=sc.nextInt();
		if(m==1)
			System.out.println("jan");
		else if(m==2)
		System.out.println("feb");
		else if(m==3)
			System.out.println("mar");
		else if(m==4)
			System.out.println("apr");
		else if(m==5)
			System.out.println("may");
		else if(m==6)
			System.out.println("june");
		else if(m==7)
			System.out.println("july");
		else if(m==8)
			System.out.println("Aug");
		else if(m==9)
			System.out.println("sep");
		else if(m==10)
			System.out.println("oct");
		else if(m==11)
			System.out.println("nov");
		else if(m==12)
			System.out.println("dec");
		else
			System.out.println("invalid");
		
		
		
	}
	

}
