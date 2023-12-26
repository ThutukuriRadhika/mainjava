
 class Bike
 {
	String name,color;
	int price;
	void details()
	{
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.price);
	}
	public static void main(String[] args) 
	{
	  Bike B1=new Bike();
	  B1.name="Ninja";
	  B1.color="Green";
	  B1.price=1200000;
	  B1.details();
	  Bike B2=new Bike();
	  B2.name="Duke";
	  B2.color="Orange";
	  B2.price=230000;
	  B2.details();
	}
  }
