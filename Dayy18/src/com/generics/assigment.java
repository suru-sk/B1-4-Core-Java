package com.generics;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class assigment {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer>q=new PriorityQueue<Integer>();
		q.offer(12);
		q.offer(14);
		System.out.println(q);
		Iterator<Integer> itr=q.iterator();
		Integer s=q.peek();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(q);
	}
	}