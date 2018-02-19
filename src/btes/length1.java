package btes;
import java.util.Scanner;

public class length1 
{
public static void main(String[]args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int digit=sc.nextInt();
	int count=0;
	while(digit>0)
	{
		count++;
		digit=digit/10;
	}
	System.out.println("count="+count);
	
	}
}
