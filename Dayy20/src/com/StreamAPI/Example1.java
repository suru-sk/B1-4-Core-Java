package com.StreamAPI;
import java.util.stream.*;
import java.util.*;
//import java.util.stream.Stream;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integer[] arr=new Integer[] {11,22,33};
		List<Integer>values=Arrays.asList(11,22,33);
		//values.stream().map(var->var.foreach(System.out.println));
		List<Integer>var=values.stream().map(i->i*i*i*i).collect(Collectors.toList());
		//Stream<Integer>obj=Arrays.stream(arr);
		System.out.println(var);
	}

		}