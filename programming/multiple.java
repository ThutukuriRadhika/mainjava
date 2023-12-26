package programming;
import java.util.Scanner;
public class multiple {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values");
		if(n%3==0 && n%5==0)
			System.out.println(n+"is divisible by 3 and 5");
		else
			System.out.println(n+"is not divisible by 3 and 5");
	}

}
