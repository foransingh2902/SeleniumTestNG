package queueInterfaceInCollectionInterface;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePriorityQueue {

	public static void main(String[] args) {
		// Queue- Arranged in the order of processing.
		Queue<String> queue = new PriorityQueue();
		// Retrieves and removes the head of this queue, or returns null if this queue
		// is empty.
		System.out.println("to extract element from the priority queue : " + queue.poll());
		// inserting elements
		queue.offer("Apple");
		queue.offer("Bat");
		// another way of adding elements
		queue.addAll(List.of("Ball", "Orange"));
		queue.add("News");
		System.out.println(queue);
		System.out.println(queue.poll());
		// first element is removed
		System.out.println(queue);
	}

}

