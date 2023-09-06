package test06;

import java.util.ArrayList;
import java.util.List;

import test03.Student;

public class TestMethodReference2 {

	public static void main(String[] args) {
		Student student1 = new Student(101, "Shivam", 80);
		Student student2 = new Student(102, "Sindhu", 83);
		Student student3 = new Student(103, "Pavan", 78);
		Student student4 = new Student(104, "Srilaxmi", 85);
		Student student5 = new Student(105, "Ishita", 87);

		List<Student> list = new ArrayList<>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		list.add(student5);
		
		list.stream().parallel().map(s -> s.getStudentName()).forEach(System.out :: println);
		System.out.println("=====================================================");
		list.parallelStream().map(s -> s.getStudentName()).forEach(System.out :: println);
	}

}
