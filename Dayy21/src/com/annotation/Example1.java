
package com.annotation;
class Parent
{
	void accept()
	{
		System.out.println("Parent Class");
	}
}
class Child extends Parent
{
	@Override
	void accept()
	{
		System.out.println("Child Class");
	}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		
		c.accept();
	}

}