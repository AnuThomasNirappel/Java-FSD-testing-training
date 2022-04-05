package sba;

import java.util.Iterator;
import java.util.PriorityQueue;



public class PriorityQueMthd {

	public static void main(String[] args) {
		// Creating empty priority queue
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		// Adding items to the pQueue using add()
		pQueue.add(10);
		pQueue.add(12);
		pQueue.add(20);
		pQueue.add(100);
		pQueue.add(155);
		System.out.println("the priority queue: " + pQueue);
		// Creating an iterator
		 Iterator <Integer>value =pQueue.iterator();
		 
		 // Displaying the values after iterating through the queue
		 System.out.println("The iterator values are: ");
		 while (value.hasNext()) {
		 System.out.println(value.next());
		 }
		 // Check for "4" in the queue
		 System.out.println("Does the Queue contains 12? "+pQueue.contains(12));
		 // Inserting using offer()
		 pQueue.offer(1000);
		 pQueue.offer(2000);
		 // Displaying th final Queue
		 System.out.println("Priority queue after Insertion: " +pQueue );
		// Printing the top element of PriorityQueue
		System.out.println("top element of PriorityQueue: " + pQueue.peek());
		// Printing the top element and removing it
		// from the PriorityQueue container
		System.out.println("top element and removing from the PriorityQueue container: " + pQueue.poll());
		// Printing the top element again
		System.out.println("new top element: " + pQueue.peek());
		// using the method
		pQueue.remove(12);
		System.out.println("After Remove - " + pQueue);
		//to find size
		System.out.println("the size of queue: "+pQueue.size());
		//element()
		System.out.println("The head of the element"+pQueue.element());
		// Creating an iterator
		 
		//clear()
		pQueue.clear();
		System.out.println("after clear method the pqueue is: "+pQueue);
		}
		}

	


