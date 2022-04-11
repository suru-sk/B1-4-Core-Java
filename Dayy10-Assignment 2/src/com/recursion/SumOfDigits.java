
package com.recursion;

import java.util.Scanner;

public class SumOfDigits {
	int sum = 0;
    public static void main(String[] args) 
    {
    	int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        SumOfDigits d = new SumOfDigits();
        int a = d.add(n);
        System.out.println("Sum:"+a);
        s.close();
    }
    int add(int n)
    {
        sum = n % 10;
        if(n == 0)
        {
            return 0;
        }
        else
        {
             return sum+(n/10);
             
        }
        
    }
}