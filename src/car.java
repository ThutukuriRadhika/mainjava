
 class Car
{
	 String name;
	 int price;
	 Car(String n,int p)
	 {
		 this.name=n;
		 this.price=p;
	 }
	 void details()
	 {
		 System.out.println(this.name+""+this.price);
	 }
	 public static void main(String[] arg)
	 {
		Car C1=new Car("civic",900000);//CC
		Car C2=new Car("scorpio",1300000);//CC
		C1.details();//Method-call
		C2.details();//Method-call
	 }
  }
