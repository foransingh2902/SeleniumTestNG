package listInterfaceInCollectionInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListArrayListSorting {

	public static void main(String[] args) {
		List<Integer> num = List.of(23, 78, 11, 10);
		List<Integer> numAl = new ArrayList<Integer>(num);
		System.out.println(numAl);
		// static method of Collections class
		Collections.sort(numAl);
		System.out.println(numAl);
	}

}
