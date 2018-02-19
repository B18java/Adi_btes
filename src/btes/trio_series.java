package btes;

import java.util.Scanner;

public class trio_series {
	public static void main(String[] args)
	{
		
		int n,a=0,b=1,c=1,d;
		System.out.println("enter length");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		System.out.print(a+"\t");
		System.out.print(b+"\t");
		System.out.print(c+"\t");
		
		for(int i=2;i<n;i++)
		{
			d=a+b+c;
			System.out.print(d+"\t");
			a=b;
			b=c;
			c=d;
		}
			
		
	}
}

