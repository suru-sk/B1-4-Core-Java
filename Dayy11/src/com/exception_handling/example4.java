package com.exception_handling;

public class example4 {
	static void display(int age, int weight)
	{
		if(age>18 && weight>50)
		{
			
			System.out.println("You are eligible");
		}
		else
		{
			throw new ArithmeticException("Not eligible");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display(16,55);
		System.out.println("Exception Handled");
	}
}
