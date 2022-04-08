package com.looping;

import java.util.Scanner;

public class Do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int x=n;
		do
		{
			System.out.println("x:" +x);
			x++;
		}
		while(x<40);
		s.close();
	}

}