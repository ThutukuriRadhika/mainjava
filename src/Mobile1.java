
public class Mobile1 {
public static void main(String[] args) {
	String Mobile1[]= {"redmi","realme","vivo","apple","samsung","iphone","redmi 11i","oppo","micromax"};
	int lastindex=Mobile1.length-1;
	System.out.println("forward diretion");
	for(int i=0;i<=lastindex;i++)
	{
		System.out.println(Mobile1[i]);
	}
	System.out.println("backword direction");
	for(int i=lastindex;i>=0;i--)
	{
		System.out.println(Mobile1[i]);
	}
	System.out.println("except first and lastdata");
	for(int i=1;i<lastindex;i++)
	{
		System.out.println(Mobile1[i]);
	}
	System.out.println("last four data");
	for(int i=5;i<=lastindex;i++)
	{
		System.out.println(Mobile1[i]);
	}
	System.out.println("except first 2 and last 2");
	for(int i=2;i<=lastindex-2;i++)
	{
		System.out.println(Mobile1[i]);
	}
	
			
}
}
