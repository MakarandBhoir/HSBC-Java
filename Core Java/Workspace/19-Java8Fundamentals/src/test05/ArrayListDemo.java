package test05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListDemo {
	public static void print(List<Student> list) {
		for(Student student : list) {
			System.out.println(student);
		}
	}
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		
		Student s1 = new Student(1, "Apoorva", 83);
		Student s2 = new Student(2, "Shruti", 85);
		Student s3 = new Student(3, "Aditi", 87);
		Student s4 = new Student(4, "Test", 40);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		System.out.println("Before Sorting: ");
		print(list);
		
		System.out.println("After sorting by student name: ");
		Comparator<Student> comparator = (Student o1, Student o2) -> {
			int result = o1.getStudentName().compareTo(o2.getStudentName());
			return result;
		};
		
		Collections.sort(list, comparator );
		print(list);
		
		System.out.println("After sorting by student score: ");
		Collections.sort(list, 
				(o1, o2) -> (o1.getStudentScore() < o2.getStudentScore()) ? 1 : -1 );
		print(list);
		
	}
}






