package listInterfaceInCollectionInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListChoosingIterationApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = List.of("apple", "orange", "ball", "bat", "cat");
		List<String> wordsAl = new ArrayList<String>(words);
		System.out.println("words ending with 'at'");
		for (String string : words) {
			if (string.endsWith("at"))
				System.out.println(string);
		}
		System.out.println("*****************");
		// the deletion in foreach loop won't work correctly. Si it's not a good option
		System.out.println(wordsAl);
		for (String string : wordsAl) {
			if (string.endsWith("at")) {
				wordsAl.remove(string);
			}
		}
		System.out.println(wordsAl);
		System.out.println("*****************");
		List<String> arrayList = new ArrayList<String>(words);
		System.out.println(arrayList);
		Iterator<String> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().endsWith("at")) {
				iterator.remove();
			}
		}
		System.out.println(arrayList);
	}

}
