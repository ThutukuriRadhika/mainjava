
 class student1 
{
	 String name;
	 int phy,che,maths;
	 student1(String n,int p,int c,int m)
	 {
		 this.name=n;
		 this.phy=p;
		 this.che=c;
		 this.maths=m;
	 }
	 void totalmarks()
	 {
		 System.out.println(this.phy+this.che+this.maths);
	 }
	 void percentage()
	 {
		 System.out.println((this.phy+this.che+this.maths)/300.0f*100.0f);
	 }
	 void details()
	 {
		 System.out.println(this.name);
		 System.out.println(this.phy);
		 System.out.println(this.che);
		 System.out.println(this.maths);
	 }
	 public static void main(String[] args) 
	 {
		 student1 s1=new student1("Rahul",78,55,93);
		 student1 s2=new student1("Yash",87,56,98);
		 s2.totalmarks();
		 s1.percentage();
		 s2.percentage();
	}
 }
	  

 
 
 
 
 
 
 
 
 
