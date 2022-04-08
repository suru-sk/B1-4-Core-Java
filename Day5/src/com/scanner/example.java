package com.scanner;

import java.util.Scanner;

public class example
{
	
	public static void main(String[] args) {
		

	Scanner s=new Scanner(System.in);
	int age=s.nextInt();
	int weight=s.nextInt();
	if(age>18 && weight>50)
	{
		System.out.println("Eligible to donate a blood");
	}
	else
	{
		System.out.println("Not Eligible to donate a blood");
	}
	s.close();
}
}