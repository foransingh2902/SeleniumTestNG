package listInterfaceInCollectionInterface;

import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		// List.of will create immutable list. It's a feature of JAVA 9.
		List<String> words = List.of("apple", "orange", "ball", "bat");
		System.out.println(words);
		System.out.println("Size of List  : " + words.size());
		System.out.println("Is Empty? : " + words.isEmpty());
		System.out.println("Element at index 1 : " + words.get(1));
		System.out.println("Contains 'ball'? : " + words.contains("ball"));
		System.out.println("Index of a specific element : " + words.indexOf("bat"));
		// if element is not present then -1 is returned
		System.out.println("Index of an element not present in list :" + words.indexOf("abc"));

	}

}
