package com.polymorphism;

public class Overloading1 {
	void assign(int a, int b)
	{
	System.out.println("Area of Rectangle: "+(a*a));
	}
    void assign(float a, float b)
    {
	System.out.println("Area of Rectangle:"+(a*b));
    }
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Overloading1 o=new Overloading1();
	o.assign(5,10);
	o.assign(10,20);
}

}
