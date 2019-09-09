package listInterfaceInCollectionInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListDemo2 {

	public static void main(String[] args) {
		// List.of will create immutable list. It's a feature of JAVA 9.
		List<String> words = List.of("apple", "orange", "ball", "bat");
		// Creating mutable lists
		List<String> linkedList = new LinkedList<String>(words);
		// linked list in java is a doubly linked list
		List<String> arrayList = new ArrayList<String>(words);
		List<String> vectorList = new Vector<String>(words);
		System.out.println(arrayList);
		arrayList.add("wicket");
		System.out.println(arrayList);

	}

}
