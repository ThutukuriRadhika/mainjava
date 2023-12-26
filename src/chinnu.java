
public class chinnu {
   String firstname(String fname)
{
	return "$"+fname;
}
   String lastname(String lname)
   {
	   return lname+"$";
   }
   void fullname(String fn,String ln)
   {
	   String fullname=fn+""+ln;
	   System.out.println(fullname);
   }
   public static void main(String[] args) {
	chinnu c1=new chinnu();
	String x=c1.firstname("Sachin");
	String y=c1.lastname("Tendulkar");
	c1.fullname(x,y);
	}
 }

