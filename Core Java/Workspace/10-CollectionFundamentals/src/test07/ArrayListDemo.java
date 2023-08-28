package test07;

import java.util.ArrayList;
import java.util.Collections;
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
		Collections.sort(list, new StudentNameSorter());
		print(list);
		
		System.out.println("After sorting by student score: ");
		Collections.sort(list, new StudentScoreSorter());
		print(list);
		
	}
}






