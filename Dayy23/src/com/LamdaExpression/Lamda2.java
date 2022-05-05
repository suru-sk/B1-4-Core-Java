package com.LamdaExpression;
interface A1
{
	void show(int i);
}
public class Lamda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 obj=(int i)->
	    {
			System.out.println("Welcome to Lambda Expression");
		};
		obj.show(5);
	}

}