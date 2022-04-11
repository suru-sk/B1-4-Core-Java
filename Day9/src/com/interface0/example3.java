
package com.interface0;
interface example3 
{
	void myMethod();
}
interface Example31 
{
	void myOtherMethod();
}
class Suru implements example3,Example31 
{
	public void myMethod() 
	{
		System.out.println("FirstInterface");
	}
	public void myOtherMethod() 
	{
		System.out.println("SecondInterface");
	}
}
class Main123
	{
	public static void main(String[] args) {
		Suru myObj = new Suru();
		myObj.myMethod();
		myObj.myOtherMethod();
		
	}
}