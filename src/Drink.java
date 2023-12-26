
 class Drink
 {
   String brand,color,quantity;
   int price;
   Drink(String b,String c,int p,String q)
   {
	   this.brand=b;
	   this.color=c;
	   this.price=p;
	   this.quantity=q;
   }
   public static void main(String[] args)
   {
	   Drink D1=new Drink("JW","Brown",5500,"750ml");
	   Drink D2=new Drink("redwine","red",2500,"1000ml");
	   Drink D3=new Drink("king fisher","brown",3000,"500ml");
	   System.out.println(D1.brand+""+D1.color+""+D1.price+""+D1.quantity);
	   System.out.println(D2.brand+""+D2.color+""+D2.price+""+D2.quantity);
	   System.out.println(D3.brand+""+D3.color+""+D3.price+""+D3.quantity);
	}
  }


