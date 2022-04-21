package com.recursion;
import java.util.Scanner;

public class Example2 {
	
		public static int minSteps(int m, int n){
			int s = 0;
	        if(m==1 || n==1)
	            return 1;
	        
	        while((m!=1) || (n!=1))
	        {
	            if((m-n)>=1)
	            {
	                m = m-n;
	                ++s;
	            }
	            else if((n-m)>=1)
	            {
	                n= n-m;
	                ++s;
	            }
	            else if(m==n)
	            {
	                return 1;
	            }
	        }
			return s;

	        
		}
		public static void main(String args[])
		    {
		    	Scanner s= new Scanner(System.in);
				int n= s.nextInt();
				int m=s.nextInt();
				int a=minSteps(n,m);
				System.out.print(a);
				s.close();

		    }
	}