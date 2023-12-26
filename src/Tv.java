
public class Tv {
String name;
String type;
int price;
public static void main(String[] args)
{
	Tv T1=new Tv();
	T1.name="sony";
	T1.type="lcd";
	T1.price=45000;
	Tv T2=new Tv();
	T2.name="Mi";
	T2.type="led";
	T2.price=28765;
	Tv T3=new Tv();
	T3.name="oneplus";
	T3.type="led";
	T3.price=25664;
	System.out.println(T1.name+T1.type+T1.price);
	System.out.println(T2.name+T2.type+T2.price);
	System.out.println(T3.name+T3.type+T3.price);
}	
}

