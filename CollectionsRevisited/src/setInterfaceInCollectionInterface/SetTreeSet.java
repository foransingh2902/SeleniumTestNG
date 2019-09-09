package setInterfaceInCollectionInterface;

import java.util.Set;
import java.util.TreeSet;

public class SetTreeSet {

	public static void main(String[] args) {
		Set<Integer> numbers = new TreeSet<Integer>();
		numbers.add(8);
		numbers.add(3);
		numbers.add(7);
		numbers.add(2);
		numbers.add(16);
		numbers.add(12);
		// ordering of numbers not according to insertion, but in sorted order. But no
		// duplication.
		System.out.println(numbers);

	}

}
