package programming;
import java.util.Scanner;
 class mainpattern{
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		int n=sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print((char)(j+96)+"");
			}
			System.out.println();
		}
		
				
		
	}
}
