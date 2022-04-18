package com.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer>q=new PriorityQueue<Integer>();
		q.add(11);
		q.add(12);
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.poll());
		
	}

}