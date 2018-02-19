package btes;
import java.util.Scanner;

public class abs
{
	public static void main(String[]args)
	{
		figure [] f=new figure[6];
		f[0]=new circle();
		f[1]=new circle();
		System.out.println("for 1st circle");
		f[0].findarea();
		f[0].findparameter();
		System.out.println(f[0].toString());
		System.out.println("for 2nd circle");
		f[1].findarea();
		f[1].findparameter();
		f[2]=new rectangle();
		f[3]=new rectangle();
		System.out.println("for 1st rectangle");
		f[2].findarea();
		f[2].findparameter();
		System.out.println(f[2].toString());
		System.out.println("for 2nd rectangle");
		f[3].findarea();
		f[3].findparameter();
		f[4]=new triangle();
		f[5]=new triangle();
		System.out.println("for 1st triangle");
		f[4].findarea();
		f[4].findparameter();
		System.out.println(f[4].toString());
		System.out.println("for 2nd triangle");
		f[5].findarea();
		f[5].findparameter();	
	}
}
abstract class figure
{
double d1;
abstract void findarea();
abstract void findparameter();
Scanner sc=new Scanner(System.in);
	
}

class circle extends figure
{
	final double pi=3.14;
	
	
void findarea()

{
	System.out.println("enter radius for area");
	 d1=sc.nextInt();
	double area=pi*d1*d1;
	System.out.println("area ="+area);
}

void findparameter()
{
	System.out.println("enter radius for parametre");
	d1=sc.nextInt();
double para=2*pi*d1;
System.out.println("parameter="+para);
}

public String toString()
{
	return("override of circle");
}
}

class rectangle extends figure
{
	int d2;
	void findarea()

	{
		System.out.println("enter lenght and breadth for area");
		 d1=sc.nextInt();
		 d2=sc.nextInt();
		double area=d1*d2;
		System.out.println("area ="+area);
	}

	void findparameter()
	{
		System.out.println("enter length and breadth for parametre");
		d1=sc.nextInt();
		d2=sc.nextInt();
	double para=2*(d1+d2);
	System.out.println("parameter="+para);
	}

	public String toString()
	{
		return("override of rect.");
	}
}

class triangle extends figure
{
	int d2,d3;
	void findarea()

	{
		System.out.println("enter lenght, breadth and height for area");
		 d1=sc.nextInt();
		 d2=sc.nextInt();
		 d3=sc.nextInt();
		double s=(d1+d2+d3)/2;
		double area=Math.sqrt(s*(s-d1)*(s-d2)*(s-d3));
		System.out.println("area ="+area);
	}

	void findparameter()
	{
		System.out.println("enter length, breadth and height for parametre");
		d1=sc.nextInt();
		d2=sc.nextInt();
		d3=sc.nextInt();
	double para=d1+d2+d3;
	System.out.println("parameter="+para);
	}

	public String toString()
	{
		return("override of triangle");
	}	
}
   
