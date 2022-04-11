package com.interface0;

public interface example2 
{
	void display();
	void print();
}

	class Main1 implements example2
	{
		public void display() 
		 {
			 System.out.println(" Hi Everyone");
		 }
		public void print()
		{
			System.out.println(" Hi James");
		}
		 public static void main(String args[])
		 {
			 Main1 m=new Main1();
			 m.display();
			 m.print();
			
		}
}

