package com.Enum_REGEX;

interface Pizza
{
	public void print();
}
enum Size implements Pizza
{
	small,medium,large,extralarge;
	public void print()
	{
		System.out.println("Size is: "+this);
	}
	
}
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Size.large.print();
	}

}