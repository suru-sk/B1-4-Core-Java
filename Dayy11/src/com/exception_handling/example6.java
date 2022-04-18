package com.exception_handling;

public class example6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		     int num=121/0;
		      System.out.println (num);
		}
		catch (ArithmeticException e) {
		   System.out.println("Number should not be divided by zero");
		}
		   finally{
		 System.out.println ("This is finally block");
		}
		System.out.println("Out of try-catch-finally");
	}
}
