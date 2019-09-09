package setInterfaceInCollectionInterface;

import java.util.Set;
import java.util.TreeSet;

public class SetTreeSetOperations {

	public static void main(String[] args) {
		// Operations of HashSet and LinkedHashSet are similar
		// but TreeSet have some more functions as it implements NavigableSet
		// interface in addition to Set interface
		TreeSet<Integer> numbers = new TreeSet<Integer>(Set.of(4, 7, 1, 9, 2, 8));
		System.out.println(numbers);
		// floor is inclusive. Will give you number from the TreeSet which is most
		// nearly less than the number
		System.out.println("Floor of 6 : " + numbers.floor(6));
		System.out.println("Floor of 7 : " + numbers.floor(7));
		// lower is similar to floor except it is not inclusive.
		System.out.println("Lower of 7 : " + numbers.lower(7));
		// ceiling is inclusive. Will give you number from the TreeSet which is most
		// nearly greater than the number
		System.out.println("Ceiling of 6 : " + numbers.ceiling(6));
		// higher is similar to ceiling except it is not inclusive.
		System.out.println("Higher of 7 : " + numbers.higher(7));
		// lower limit in inclusive in subSet but upper limit is not inclusive
		System.out.println("Subset of range 3-10 : " + numbers.subSet(3, 10));
		// to include both the limits. Here both are true so both are includes.
		// if We want to exclude any of the limit then we will make it false.
		System.out.println("Subset of range 3-10 with both limits included : " + numbers.subSet(3, true, 10, true));
		// HeadSet
		System.out.println("HeadSet of 3 : " + numbers.headSet(3));
		// TailSet
		System.out.println("TailSet of 5 : " + numbers.tailSet(5));
	}

}
