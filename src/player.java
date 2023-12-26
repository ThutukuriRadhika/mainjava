
public class player
{
String name,team;
int jersyno;
player(String name,String team,int jersyno)
{
	this.name=name;
	this.team=team;
	this.jersyno=jersyno;
}
public static void main(String[] args) {
	player p1=new player("rohit sharma","ODI,test T20",45);
	player p2=new player("yuvraj singh","N/A",12);
	player p3=new player("zaheer khan","test",34);
	player x[]= {p1,p2,p3};
	//            0  1  2
	for(int i=0;i<x.length;i++)
	{
		System.out.println(x[i].name+""+x[i].team+""+x[i].jersyno);
}
}

}
