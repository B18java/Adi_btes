package btes;
import java.util.Scanner;

public class palin 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to check");
		int num=sc.nextInt();
		int rev=0,rem,x;
		x=num;
		while(x>0)
		{
			rem=x%10;
			rev=rev*10+rem;
			x=x/10;
		}
		if(num==rev)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}
