
package com.inheritance;


class Parent
{
	void print()
	{
		System.out.println("Hello,This is Suresh");
	}
}
class Child extends Parent
{
	void display()
	{
		System.out.println("Single Inheritance");
	}
}
class single_inheritance
{

	public static void main(String[] args)
	{
		Child c=new Child();
		c.display();
		c.print();

	}

}