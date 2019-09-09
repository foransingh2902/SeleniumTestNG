package queueInterfaceInCollectionInterface;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

//don't give access specifier public. It will give error.
class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String value1, String value2) {
		// TODO Auto-generated method stub
		// this will give ascending order
		return Integer.compare(value1.length(), value2.length());
	}
}
public class QueuePriorityQueueOwnComparator {

	public static void main(String[] args) {
		// we can also give out custom comparator
		Queue<String> queue = new PriorityQueue<String>();
		queue.addAll(List.of("Zebra", "Monkey", "Cat", "LionKing", "Elephant"));
		// or Queue<String> queue = new PriorityQueue<String>(List.of("Zebra", "Monkey",
		// "Cat"));
		System.out.println("queue is : " + queue);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println("*********own comparator based on string length*********");
		Queue<String> queue1 = new PriorityQueue<String>(new StringLengthComparator());
		queue1.addAll(List.of("Zebra", "Monkey", "Cat", "LionKing", "Elephant"));
		// it got sorted due to the comparator we made
		System.out.println("queue is : " + queue1);
		System.out.println(queue1.poll());
		System.out.println(queue1.poll());
		System.out.println(queue1.poll());
		System.out.println(queue1.poll());
		System.out.println(queue1.poll());

	}

}

