package test06;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo2 {
	public static void main(String[] args) {
		Set<Student> set = new TreeSet<>();
		
		Student s1 = new Student(1, "Deepti", 84);
		Student s2 = new Student(2, "Divya", 85);
		Student s3 = new Student(3, "Bibhanshu", 87);
		Student s4 = new Student(3, "Bibhanshu", 87);
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		
		System.out.println(set);
	}
}
