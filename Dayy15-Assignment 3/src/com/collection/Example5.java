package com.collection;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigableMap<Integer,String>s=new TreeMap<Integer,String>();
		s.put(15, "Suru");
		s.remove(12, null);
		s.remove(12);
		System.out.println(s);
		s.firstEntry();
	}

}