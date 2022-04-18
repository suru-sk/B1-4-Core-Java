package com.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class Example9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer>q=new PriorityQueue<Integer>();
		q.offer(4);
		q.offer(8);
		q.add(4);
		q.add(16);
		q.add(20);
		System.out.println(q);
		System.out.println("The head is:"+q.peek());
	}

}