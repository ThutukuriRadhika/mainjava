
public class shoe {
	String brand;
	String color;
	int price;
	shoe(String brand,String color,int price)
	{
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	void details()
	{
		System.out.println(this.brand+""+this.color+""+this.price);
	}
	public static void main(String[] args) {
		shoe S1=new shoe("nike " ,"pink " ,10000);
		shoe S2=new shoe("quechua " ,"grey " ,1499);
		shoe S3=new shoe("sparx ","navyblue ",1000);
		shoe x[]= {S1,S2,S3};
		//          0  1  2
		for (int i=0;i<x.length;i++)
		{
			 x[i].details();
		}
	
		
	}
	
		
	}


