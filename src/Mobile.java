
 class Mobile 
 {
  String brand;
  String name;
  String ram;
  int price;
  Mobile(String b,String n,String r,int p)
  {
	  this.brand=b;
	  this.name=n;
	  this.ram=r;
	  this.price=p;
  }
  public static void main(String[] args) 
  {
	Mobile M1=new Mobile("Realme","8pro","8gb",19999);
	Mobile M2=new Mobile("Redmi","9pro","8gb",19496);
	Mobile M3=new Mobile("Apple","iphone 12","6gb",119900);
	System.out.println(M1.brand+""+M1.name+""+M1.ram+""+M1.price);
	System.out.println(M2.brand+""+M2.name+""+M2.ram+""+M2.price);
	System.out.println(M3.brand+""+M3.name+""+M3.ram+""+M3.price);
   }
 }
 
 
  
 
  


