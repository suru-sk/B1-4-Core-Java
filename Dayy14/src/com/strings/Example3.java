package com.strings;
import java.util.StringTokenizer;
public class Example3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st3 = new StringTokenizer("Java:CodeString", ":", false);
		while(st3.hasMoreTokens())
		System.out.println(st3.nextToken());
			
	}
		
	}