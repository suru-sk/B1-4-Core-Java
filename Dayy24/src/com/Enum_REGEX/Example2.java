package com.Enum_REGEX;

public class Example2 {
	enum Margin
	{
		Top,Right,Bottom,Left
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1;
		for(Margin m:Margin.values())
		{
			System.out.printf("Margin %d=%s\n",count++,m);
		}
	}
}
