package btes;

import java.util.Scanner;
class Days
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter days");
int days=sc.nextInt();
int months=days/30;
days=days%30;
System.out.println(months+" months "+days+" days");
}
}
