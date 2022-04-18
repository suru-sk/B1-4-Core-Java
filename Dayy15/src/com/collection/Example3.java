package com.collection;
import java.util.LinkedList;

public class Example3 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		LinkedList obj = new LinkedList<>();
		obj.add(10);
		obj.add("James");
		obj.add(30.0);
		obj.add(40);
		System.out.println(obj);
		obj.addFirst(5);
		obj.addLast(5);
		
		System.out.println(obj);
		System.out.println(obj.size());
		@SuppressWarnings("rawtypes")
		LinkedList obj1 = new LinkedList<>();
		obj1.add("Souj");
		obj1.add("Rocky");
		obj1.add("KGF");
		obj.addAll(2,obj1);
		System.out.println(obj);
	}

}