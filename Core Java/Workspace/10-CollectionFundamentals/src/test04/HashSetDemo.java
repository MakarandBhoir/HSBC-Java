package test04;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		
		Student s1 = new Student(1, "Vishawjeet", 89);
		Student s2 = new Student(2, "Anjali", 86);
		Student s3 = new Student(1, "Vishawjeet", 89);
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		System.out.println(set);
	}
}
