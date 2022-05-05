package com.generics;

public class Generic_method {
	public static<E>void print(E[]elements)
	{
		for(E itr:elements)
		{
			System.out.println(itr);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr= {11,22,33};
		Character[] arr1= {'w','e','1'};
		print(arr);
		print(arr1);
	}
}
