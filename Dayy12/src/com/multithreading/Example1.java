package com.multithreading;

public class Example1 extends Thread 
{
	public void run()
	{
		System.out.println("Thread is going to run");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 e=new Example1();
		e.start();
		
	}

}
