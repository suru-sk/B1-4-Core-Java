package com.abstract1;

class Example3{
Example3()
{
	System.out.println("Animal is created");
}
}
class Tiger extends Example3
{
	Tiger(){
	super();
	System.out.println("Tiger is created");
	}
}
class Main
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Tiger z=new Tiger();
	}

}