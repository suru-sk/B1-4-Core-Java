package com.generics;

public class Generic_class<I> {
	I val;	
	public static void main(String[] args) {
		
		Generic_class<Character>obj=new Generic_class <>();
		obj.val='z';
		obj.println("");
	}
	public void println(String string) {
		// TODO Auto-generated method stub
		
	}

}