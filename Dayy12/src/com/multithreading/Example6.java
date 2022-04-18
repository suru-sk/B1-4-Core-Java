package com.multithreading;
public class Example6 {
	class Test extends Thread
	{
	    public void run ()
	    {
	        System.out.println("Process Error");
	}
	public class Main
	{
	    public void main(String args[])
	    {
	        Test create=new Test ();
	        create.start();
	         create.run ();
	         create.run () ;
}
	}
}
}