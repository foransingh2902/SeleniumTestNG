package setInterfaceInCollectionInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetSelectingDifferentSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Character> alphabets = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
		System.out.println("The List : " + alphabets);
		Set<Character> hSet = new HashSet<Character>(alphabets);
		System.out.println("If you want only unique elements irrsepective of their order of insertion:\n" + hSet);
		Set<Character> lhSet = new LinkedHashSet<Character>(alphabets);
		System.out.println("If you want only unique elements in the order of their insertion:\n" + lhSet);
		Set<Character> tSet = new TreeSet<Character>(alphabets);
		System.out.println("If you want only unique elements and that to in sorted order of their insertion:\n" + tSet);
	}

}
