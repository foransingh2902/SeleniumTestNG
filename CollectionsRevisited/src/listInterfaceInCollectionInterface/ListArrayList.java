package listInterfaceInCollectionInterface;

import java.util.ArrayList;
import java.util.List;

public class ListArrayList {

	public static void main(String[] args) {
		// List.of will create immutable list. It's a feature of JAVA 9.
		List<String> words = List.of("apple", "orange", "ball", "bat");
		// Creating mutable lists
		List<String> arrayList = new ArrayList<String>(words);
		System.out.println(arrayList);
		// as index is not specified, therefore inserted at the end
		arrayList.add("wicket");
		System.out.println(arrayList);
		// inserting at specific index
		arrayList.add(0, "first");
		System.out.println(arrayList);
		// allowing duplicate elements
		arrayList.add("wicket");
		System.out.println(arrayList);
		List<String> newList = List.of("num1", "num2", "num3");
		// here also we can specify index for the insertion
		arrayList.addAll(newList);
		System.out.println(arrayList);
		// setting value at index 1 to "second"
		arrayList.set(0, "second");
		System.out.println(arrayList);
		// removing a specific element. Only first occurrence is removed
		arrayList.remove("ball");
		System.out.println(arrayList);
		arrayList.remove(5);
		System.out.println(arrayList);


	}

}
