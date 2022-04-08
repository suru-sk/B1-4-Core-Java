package com.abstract1;

class Example11
{
	void display()
	{
		System.out.println("Hello Students");
	}
}
public class test extends Example11
{
	 
	
	void display()
	{
		
		System.out.println("Welcome to C2TC");
	}

	public static void main(String[] args) 
	{
		test e=new test();
		e.display();

	}

}