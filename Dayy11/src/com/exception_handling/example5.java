package com.exception_handling;
import java.io.IOException;
public class example5 {
	void Example5(int num)throws IOException, ClassNotFoundException{
		if(num==1)
		throw new IOException("IOexception Occured");
		else
			throw new 
	ClassNotFoundException("ClassNotFoundException");	
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	try {
		example5 obj=new example5();
		obj.Example5(1);
	}
	catch(Exception ex) {
		System.out.println(ex);
	}
	
}
}
