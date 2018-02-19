package btes2;

import java.util.Scanner;

public class Palindrome implements Check
{

	public boolean checkString(String str )
	{
		 String rev = "";
	 
	      int length = str.length();
	     for ( int i = length - 1; i >= 0; i-- )
	     {
	         rev = rev + str.charAt(i);
	     }
	     if (str.equals(rev))
	     {
	         return (true);
	     }
	      else
	      {
	         return(false);
	      }
	}
	
	public boolean checkInt(int i)
	{
	   int rev=0,rem,x;
		x=i;
		while(x>0)
		{
			rem=x%10;
			rev=rev*10+rem;
			x=x/10;
		}
		if(i==rev)
		{
			return (true);
		}
		else
		{
			return (false);
		}
	}


}
