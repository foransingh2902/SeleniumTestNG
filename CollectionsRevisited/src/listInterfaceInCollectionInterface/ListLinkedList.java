package listInterfaceInCollectionInterface;

import java.util.LinkedList;
import java.util.List;

public class ListLinkedList {

	public static void main(String[] args) {
		// List.of will create immutable list. It's a feature of JAVA 9.
		List<String> words = List.of("apple", "orange", "ball", "bat");
		// Creating mutable lists
		List<String> linkedList = new LinkedList<String>(words);
		System.out.println(linkedList);
		// as index is not specified, therefore inserted at the end
		linkedList.add("wicket");
		System.out.println(linkedList);
		// inserting at specific index
		linkedList.add(0, "first");
		System.out.println(linkedList);

	}

}
