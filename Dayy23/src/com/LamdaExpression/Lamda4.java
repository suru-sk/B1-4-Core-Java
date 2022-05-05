package com.LamdaExpression;
interface D
{
	int mul(int x,int y);
}

public class Lamda4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D obj=(x,y)->(x*y);
		System.out.println(obj.mul(40, 30));
	}

}