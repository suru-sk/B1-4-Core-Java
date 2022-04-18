package com.multithreading;
public class Example7 {
	class Test extends Thread
	{
	    public void run ()
	    {
	        System.out.println(" thread passed ");
	}
	public class Main
	{
	    public void main(String args[])
	    {
	        Test create=new Test ();
	        create.start();
	        create.start();
}
}
	}
}