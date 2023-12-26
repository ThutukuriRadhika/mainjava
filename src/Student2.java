
 class Student2 
 {
	 int boys(int p,int c,int m)
	 {
		 return p+c+m;
	 }
	 void girls(int total)
	 {
		 double perc=total/300.0*100.0;
	    System.out.println(perc);
	 }
	 public static void main(String[] args)
	 {
	Student2 S1=new Student2();
	int X=S1.boys(75,75,75);
	S1.girls(X);
	}
}


