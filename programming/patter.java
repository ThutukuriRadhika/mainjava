package programming;
import java.util.Scanner;
public class patter {
public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the value of n:");
			int n=sc.nextInt();
			for(int i=1; i<=n; i++)
			{
				for(int j=1;j<=n;j++)
				{
					System.out.print((char)(i+96)+"");
				}
				System.out.println();
			}
			
					
			
		}
	}


