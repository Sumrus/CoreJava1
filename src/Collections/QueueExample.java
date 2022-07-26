package Collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Syntax for PriorityQueue
		
		PriorityQueue<String> pq1 = new PriorityQueue<String>();
		
		pq1.add("Lisa");
		pq1.add("John");
		pq1.add("Faruq");
		
		System.out.println(pq1);
		
		System.out.println("The first element " + pq1.peek()); // to view first eliment
		System.out.println("First Element " + pq1.poll()); // to remove 
		
		System.out.println(pq1);
		
		//Syntax for ArrayDeque
		ArrayDeque<String> dq1 = new ArrayDeque<String>();
		
		dq1.add("Nik");
		dq1.add("Mathew");
		dq1.add("Lisa");
		System.out.println(dq1);
		
		System.out.println(dq1.peek());
		System.out.println(dq1.peekFirst());
		System.out.println(dq1.peekLast());
		
		System.out.println(dq1.poll());
		System.out.println(dq1.pollFirst());
		System.out.println(dq1.pollLast());
		
		System.out.println(dq1);
		

	}

}
