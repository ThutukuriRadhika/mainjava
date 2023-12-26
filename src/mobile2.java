
public class mobile2 {
	String brand;
	String name;
	String color;
	int price;
	mobile2(String brand,String name,String color,int price)
	{
		this.brand=brand;
		this.name=name;
		this.color=color;
		this.price=price;
	}
	public static void main(String[] args) {
	mobile2 M1=new mobile2("realme","8pro","speed blue",15000);
	mobile2 M2=new mobile2("redmi","9pro","black",20000);
	mobile2 M3=new mobile2("apple","iphone 12","gold",30000);
	mobile2 x[]= {M1,M2,M3};
	//             0  1  2
	for (int i=0;i<x.length;i++)
	{
		System.out.println(x[i].brand+""+x[i].name+""+x[i].color+""+x[i].price);
	}
	}

}
