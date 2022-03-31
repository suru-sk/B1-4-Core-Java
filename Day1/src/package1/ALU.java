package package1;

import java.util.Scanner;

public class ALU {

	public static void main(String[] args)
	{
	  int a,b,s,out = 0;
	  Scanner n1 = new Scanner(System.in);
	  System.out.println("Enter the first number");
	  a = n1.nextInt();
	  Scanner n2 = new Scanner(System.in);
      System.out.println("Enter the second number");
      b = n2.nextInt();
      
      System.out.println("Enter the operation:- "
      		+ " "
      		+ "1 - Addition "
      		+ "2 - Substraction "
      		+ "3 - Division "
      		+ "4 - Modulus "
      		+ "5 - Multiplication ");
      Scanner y = new Scanner(System.in);
      s = y.nextInt();
      
      switch(s) 
      {
      case 1: out = a+b;
      break;
      
      case 2: out = a-b;
      break;
      
      case 3: out = a/b;
      break;
      
      case 4: out = a%b;
      break;
      
      case 5: out = a*b;
      break;
      
      }
      
      System.out.print("Output is ");
      System.out.println(out);
      
      }

}
