package com.polymorphism;

public class Audi {
	String color;
	int speed;
	Audi()
	{
		System.out.println("I bought AUDI R8 in 2021");
	}
	Audi(String color, int speed)
	{
		this.color=color;
		this.speed=speed;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Audi r = new Audi();
		Audi r1 = new Audi("RED",210);
		System.out.println(r1.color+" "+r1.speed);
	}

}