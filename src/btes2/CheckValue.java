package btes2;

public class CheckValue implements Check
{
public boolean checkString(String str)
{
	int i,flag=0;
	for(i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch==' ')
		{
			flag=1;
			break;
		}
	}
	if(flag==1)
	{
		return true;
	}
	else
	{
		return false;
	}
}

public boolean checkInt(int num)
{
	int rem,flag=0;
		while(num>0)
	{
		rem=num%10;
		if(rem==0)
		{
		  flag=1;
		  break;
		}
		num=num/10;
	}
	if(flag==1)
	{
		return (true);
	}
	else
	{
		return (false);
	}
	
}
}
