package com.multithreading;

public class Example4 {
		// TODO Auto-generated method stub
		class Test extends Thread
		{
		    public void run ()
		    {
		        System.out.println ("thread is running...") ;
		    }
		class Main
		{
		    public void main(String args[]) {
		        Test create=new Test (); //Object creation
		        create.start();
	}
		    }
}
}