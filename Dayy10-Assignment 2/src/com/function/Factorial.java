package com.function;

import java.util.Scanner;

public class Factorial 
{
	public static int factorial(int n)
	{
		int fact=n;
		for(int i=1;i<n;i++)
		{
			fact=i*fact;
		}
		return fact;
	}
	public static void main(String[] args) {
	
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(factorial(n));
		s.close();
	}

}