package btes;

public class this1 
{

public static void main(String[]args)
{
	demo d=new demo();
}
	
}


class demo
{
	int id; 
	String name;
	
	demo()
	{
		this(2,"shivi");
		id =1;
		name="adi";
		System.out.println(id+"  "+name);
	}
	
	demo(int id,String name)
	{
		this.id=id;
		this.name=name;
		System.out.println(id+"  "+name);
	}
	  
	
}