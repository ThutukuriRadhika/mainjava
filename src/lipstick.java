
public class lipstick {
	String name;
	String shade;
	int price;
	lipstick(String name,String shade,int price)
	{
		this.name=name;
		this.shade=shade;
		this.price=price;
	}
	@ Override
	public String toString()
	{
		return this.name+""+this.shade+""+this.price;
	}
	public static void main(String[] args) {
			lipstick L1=new lipstick("lakme","merun",300);
			lipstick L2=new lipstick("mabline","diamond purple",400);
			lipstick L3=new lipstick("mac","redmirchi",500);
			lipstick x[]= {L1,L2,L3};
			for (int i=0;i<x.length;i++)
			{
				System.out.println(x[i]);
			}
	  }
	}


