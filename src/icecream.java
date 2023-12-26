
public class icecream {
	String flavour="chocolate";
	int price=200;
	boolean quantity;
	String toping1,toping2;
	//chocolate icecream two topings&quantity optional
	icecream(String t1,String t2,boolean quantity)
	{
		this.toping1=t1;
		this.toping2=t2;
		this.quantity=quantity;
		if(quantity==true)
		{
			this.price=this.price+80+70;
		}
		else
		{
			this.price=this.price+80;
		}
	}
	//chocolate icecream 
		
		
		
	}


