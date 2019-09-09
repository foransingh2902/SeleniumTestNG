package listInterfaceInCollectionInterface;

import java.util.ArrayList;
import java.util.List;

public class ListArrayListPuzzles {

	public static void main(String[] args) {
		// here auto-boxing of the primitive data types by wrapper classes.
		// As list don't take primitive data types as input
		// here we didn't specify the type of List
		List words = List.of("apple", 'A', 34, "bat", 1.0, 2.0f);
		System.out.println("List of different data types:" + words);
		System.out.println(words.get(2) instanceof Integer);
		System.out.println(words.get(1) instanceof Character);
		System.out.println(words.get(4) instanceof Double);
		System.out.println(words.get(0) instanceof String);
		System.out.println(words.get(5) instanceof Float);
		List<Integer> num = List.of(101, 102, 103, 104);
		List<Integer> numAl = new ArrayList<Integer>(num);
		System.out.println(numAl);
		// we have 2 remove() methods. One take object and other integer
		// Integer.valueOf(input) is more efficient than -new Integer(input);
		numAl.remove(Integer.valueOf(101));
		System.out.println(numAl);

	}

}
