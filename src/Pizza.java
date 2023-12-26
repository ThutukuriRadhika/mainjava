
 class Pizza 
{
	 String type;
	 String topings;
	 int price;
	 Pizza(String t,String tp,int p)
	 {
		 this.type=t;
		 this.topings=tp;
		 this.price=p;
	 }
	 void bill(String name,long Phno)
	 {
		 System.out.println("===================");
         System.out.println("Name :"+name);	
         System.out.println("Ph-Number :"+Phno);
         System.out.println("Type :"+this.type);
         System.out.println("Topings :"+this.topings);
         System.out.println("Price :"+this.price);
         System.out.println("Grand-Total :"+((0.18*this.price)+this.price));
         System.out.println("====================");
         System.out.println();
	 }
	 public static void main(String[] args)
	 {
		 Pizza P1=new Pizza("Regular","Golden-corn",150);
		 Pizza P2=new Pizza("Medium","paneer",250);
		 Pizza P3=new Pizza("Large","veggie",350);
		 P2.bill("Rahul",939263593);
		 P1.bill("yash",910074327);
		 P3.bill("virat",900090981);
	 }
   }


