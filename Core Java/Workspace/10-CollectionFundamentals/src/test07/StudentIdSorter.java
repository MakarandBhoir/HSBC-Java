package test07;

import java.util.Comparator;

public class StudentIdSorter implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getStudentId() > o2.getStudentId()) {
			return 1;
		}else {
			return -1;
		}
	}

}
