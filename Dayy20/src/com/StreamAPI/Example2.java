
package com.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
//import java.util.stream.Collectors;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integer[] arr=new Integer[] {11,22,33};
				List<Integer>values=Arrays.asList(11,22,33);
				Optional<Integer>var=values.stream().reduce((a,b)->a+b);
				System.out.println(var);
			}
	}