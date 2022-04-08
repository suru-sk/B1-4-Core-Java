package com.this0;

public class Example2 {
	void print(Example2 e)
	{
		System.out.println("SSP Developer");
	}
	void display()
	{
		print(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2 e=new Example2();
		e.display();
	}
}
