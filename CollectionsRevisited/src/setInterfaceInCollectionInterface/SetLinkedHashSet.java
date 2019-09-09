package setInterfaceInCollectionInterface;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetLinkedHashSet {

	public static void main(String[] args) {
		// Operations of HashSet and LinkedHashSet are similar
		Set<Integer> numbers = new LinkedHashSet<Integer>();
		numbers.add(8);
		numbers.add(3);
		numbers.add(7);
		numbers.add(2);
		numbers.add(16);
		numbers.add(12);
		// ordering of numbers according to insertion. But no
		// duplication.
		System.out.println(numbers);
	}

}
