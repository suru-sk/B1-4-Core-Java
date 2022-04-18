package com.multithreading;

public class Example2 {
	  public synchronized void display()
	    {
	        System.out.println("Current thread " + Thread . currentThread().getName()); 
	        for(int i = 0; i < 5 ; i++)
	        {
	            System.out.println(Thread.currentThread().getName() + " i - " +i);
	            try 
	            {
	                Thread.sleep(50);
	            }
	            catch (InterruptedException e) 
	            {
	                e.printStackTrace();
	            }
	    
	        }    
	    }
	class Valueof implements Runnable{
	    Thread t; 
	    Example2 val; 
	    Valueof(Example2 val)
	    {
	        this.val = val; 
	        t = new Thread(this);
	        t.start();
	    }
	    public void run() 
	    {
	        val.display();
	    }
	}
	public class Main1{
	    public Valueof t2;
		public Valueof t1;
		public void main(String[] args) { 
	    	Example2 obj1 = new Example2();
	    	Example2 obj2 = new Example2();
	        t1 = new Valueof(obj1);
	        t2 = new Valueof(obj2);
	    }
	    public void display() {
			// TODO Auto-generated method stub
			
		}
	
	}
	}