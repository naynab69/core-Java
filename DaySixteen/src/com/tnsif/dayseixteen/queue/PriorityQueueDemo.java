package com.tnsif.dayseixteen.queue;

import java.util.*;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<String> pq = new PriorityQueue<>();

		pq.add("React");
		pq.add("HTML");
		pq.add("Core Java");
		pq.add("Hibernate");
		pq.add("Angular");

		pq.add("Spring");

		System.out.println(pq);

		pq.remove();
		System.out.println(pq);
		/*
		 * pq.remove(); System.out.println(pq); pq.remove(); System.out.println(pq);
		 * pq.remove(); System.out.println(pq); pq.remove(); System.out.println(pq);
		 * pq.remove(); System.out.println(pq);
		 * 
		 * pq.remove("React"); System.out.println(pq);
		 */

		Iterator<String> it = pq.iterator();
		while (it.hasNext()) {
			System.out.println(it.next() + " ");
		}

	}

}
