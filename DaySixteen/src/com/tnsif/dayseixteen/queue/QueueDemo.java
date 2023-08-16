package com.tnsif.dayseixteen.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();
		
		q.add(10);
		
		for(int i=1;i<5;i++)
			q.add(i);
		
		System.out.println(q);
		
		//to remove-poll
		int r=q.poll();
		System.out.println(r);
		System.out.println(q);
		
	  //to remove-remove
		int r1=q.remove();
		System.out.println(r1);
		System.out.println(q);
		
		
		//to retrieve-peek
		int r2=q.peek();
		System.out.println(r2);
		System.out.println(q);
		
		//offer
		
		q.offer(34);
		System.out.println(q);
		
		//size & Contains
		int size=q.size();
		System.out.println(size);
		System.out.println(q.contains(56));
		
		q.clear();
		System.out.println(q);
		int size1=q.size();
		System.out.println(size1);
		
	    System.out.println(q.peek());
		
	}

}
