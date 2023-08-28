package test07;

import java.util.Comparator;

public class StudentNameSorter implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getStudentName().compareTo(o2.getStudentName());
	}

}
