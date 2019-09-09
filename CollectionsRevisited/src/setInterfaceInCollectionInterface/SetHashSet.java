package setInterfaceInCollectionInterface;

import java.util.HashSet;
import java.util.Set;

public class SetHashSet {

	public static void main(String[] args) {
		// Operations of HashSet and LinkedHashSet are similar
		Set<Integer> numbers = new HashSet<Integer>();
		numbers.add(8);
		numbers.add(3);
		numbers.add(7);
		numbers.add(2);
		numbers.add(16);
		numbers.add(12);
		// no ordering of numbers. Randomly added, not in the order of insertion. But no
		// duplication.
		System.out.println(numbers);

	}

}
