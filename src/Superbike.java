
 class Superbike 
 {
   String model;
   String engine;
   String topspeed;
   int price;
   Superbike(String m,String e,String t,int p)
   {
	   this.model=m;
	   this.engine=e;
	   this.topspeed=t;
	   this.price=p;
   }
   public static void main(String[] args)
   {
	  Superbike S1=new Superbike("KawasakiZ650","649CC","210kmph",594000);
	  Superbike S2=new Superbike("Street triple R","765CC","225kmph",884000);
	  Superbike S3=new Superbike("Ducati panigale v2","955CC","257kmph",1700000);
	  System.out.println(S1.model+""+S1.engine+""+S1.topspeed+""+S1.price);
	  System.out.println(S2.model+""+S2.engine+""+S2.topspeed+""+S2.price);
	  System.out.println(S3.model+""+S3.engine+""+S3.topspeed+""+S3.price);
    }
 }
			   
	
	
	
	  
   
   


