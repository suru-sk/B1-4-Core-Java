
package com.annotation;
class Parent1
{
	@Deprecated
	void print()
	{
		System.out.println("Here comes");
	}
	@Deprecated
	void print1()
	{
		System.out.println("Suresh");
	}
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent1 p=new Parent1();
		p.print();
		p.print1();
	}

}