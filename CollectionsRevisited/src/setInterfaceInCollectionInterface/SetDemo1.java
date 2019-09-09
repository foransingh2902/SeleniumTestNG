package setInterfaceInCollectionInterface;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {

	public static void main(String[] args) {
		// Unique things only -Does not allow duplication
		// if obj1.equals(obj2) then only one of them can be in the set
		// Does not provide positional access
		Set<String> set = Set.of("Apple", "Banana", "Cat", "Orange");
		Set<String> hashSet = new HashSet<String>(set);
		System.out.println(hashSet);
		// output is [Apple,Cat,Banana] so position already lost.
		// it does't matter about position in set as it don't give index access.
		// won't be allowed as 'apple' already present
		System.out.println(hashSet.add("Apple"));

	}

}
