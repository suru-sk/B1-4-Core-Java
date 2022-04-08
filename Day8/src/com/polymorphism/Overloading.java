package com.polymorphism;

public class Overloading {
	void assign(float a,float b)
	{
	System.out.println("Area of Rectangle:"+(a*a));
	}
    void assign(int a, int b)
    {
	System.out.println("Area of Rectangle:"+(float) (a*b));
    }
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Overloading o=new Overloading();
	o.assign(5f,10f);
	o.assign(10,20);
}
}
