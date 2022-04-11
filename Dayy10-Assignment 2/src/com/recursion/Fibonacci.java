package com.recursion;
import java.util.Scanner;
public class Fibonacci {
public static void fib(int n,int a,int b,int c,int count) {
	if (count==n)
	   return;
	else
	{
	  count++;
	  System.out.print(a+" ");
	    c=b;
	    b=a;
	  a=b+c;
	  fib(n,a,b,c,count);
	 
	}
	}
public static void main(String[] arguments) {
	Scanner s= new Scanner(System.in);
	int n= s.nextInt(),a=1,b=0,c=0,count=1;
	System.out.print("0,");
	fib(n,a,b,c,count);
	s.close();
	}


}