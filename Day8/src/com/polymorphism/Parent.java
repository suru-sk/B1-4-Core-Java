
package com.polymorphism;

class Base {
	void method1()
	{
		System.out.println("Parent");
	}
}
class derived extends Base
{
	void method1()
	{
		System.out.println("Child");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b=new Base();
		b.method1();
		derived d=new derived();
		d.method1();
	}

}