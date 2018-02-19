package btes;
import btes2.CheckValue;
import btes2.Palindrome;

public class interface_main 
{
	public static void main(String[]args)
	{
		CheckValue c=new CheckValue();
		Palindrome p=new Palindrome();
		boolean x,y,z,w;
		x=c.checkString("good boy");
		if(x==true)
		  System.out.println("space is there");
		else
			System.out.println("there is no space");
		y=c.checkInt(101);
		if(y==true)
		  System.out.println("0 is present");
		else
			System.out.println("0 is not present");
		z=p.checkString("mom");
		if(z==true)
			System.out.println(" string is palindrome");
		else
			System.out.println("string is not palindrome");
		w=p.checkInt(343);
		if(w==true)
			System.out.println("no. is palindrome");
		else
			System.out.println("no. is not palindrome");
	}
}
