package listInterfaceInCollectionInterface;

import java.util.Iterator;
import java.util.List;

public class ListIterateArrayList {

	public static void main(String[] args) {
		List<String> words = List.of("apple", "orange", "ball", "bat");
		for (int i = 0; i < words.size(); i++) {
			System.out.println(words.get(i));
		}
		System.out.println("****************************");
		for (String string : words) {
			System.out.println(string);
		}
		System.out.println("****************************");
		Iterator<String> wordsIterator = words.iterator();
		// hasNext is pointing to the start
		// Returns true if the iteration has more elements. (In other words, returns
		// true if next() would return an element rather than throwing an exception.)
		while (wordsIterator.hasNext()) {
			// System.out.println("*");
			// next() will return the current element and starts pointing to the next
			// element
			// if no next element found then NoSuchElementException is thrown after
			// which hasNext will return false.
			System.out.println(wordsIterator.next());

		}

	}

}
