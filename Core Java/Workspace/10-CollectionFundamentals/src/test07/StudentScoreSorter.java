package test07;

import java.util.Comparator;

public class StudentScoreSorter implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getStudentScore() < o2.getStudentScore()) {
			return 1;
		}else {
			return -1;
		}
	}
}
