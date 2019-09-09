package listInterfaceInCollectionInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o2.getId(), o1.getId());
	}
}
public class StudentCollectionRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = List.of(new Student(1, "Foran"), new Student(3, "foran1"), new Student(2, "foran2"));
		System.out.println(students);
		// we want to sort. therefore arraylist, as it's mutable
		List<Student> studentsAl = new ArrayList<Student>(students);
		// Collections.sort(studentsAl);
		// this won't work as Collections Class can sort only those classes which
		// implements comparable interface e.g Integer Class
		Collections.sort(studentsAl);
		System.out.println(studentsAl);
		// providing comparator in sort
		// Collections.sort(studentsAl, new DescendingStudentComparator());
		// providing comparator to sort() of List
		studentsAl.sort(new DescendingStudentComparator());
		System.out.println(studentsAl);
	}

}
