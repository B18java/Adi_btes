package btes;
import java.util.Scanner;

public class add_without_plus
{
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter two no.s");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int sum=a-(-b);
	System.out.println("sum without using + operator is= "+sum);
	
}
}
