
 class Laptop 
 {
   String brand;
   String name;
   String processor;
   int price;
   Laptop(String b,String n,String p1,int p)
   {
	   this.brand=b;
	   this.name=n;
	   this.processor=p1;
	   this.price=p;
	}
   public static void main(String[] args)
   {
	 Laptop L1=new Laptop("dell","inspiron","i3",78665);
	 Laptop L2=new Laptop("hp","pavilion","i7",62990);
	 Laptop L3=new Laptop("apple","mac-book","i7",110000);
	 System.out.println(L1.brand+""+L1.name+""+L1.processor+""+L1.price);
	 System.out.println(L2.brand+""+L2.name+""+L2.processor+""+L2.price);
	 System.out.println(L3.brand+""+L3.name+""+L3.processor+""+L3.price);
    }
}
