package btes;
import java.util.Scanner;

public class stringrev
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string to reverse");
		String s=sc.next();
		char [] a=new char[s.length()];
		for(int i=s.length()-1;i>=0;i--)
		{
			a[i]=s.charAt(i);
		}
	}

}
