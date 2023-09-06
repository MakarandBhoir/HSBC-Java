package test04;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import test03.Student;

public class PrimitiveStreamTest {

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

		Stream<Double> scoreStream1 = list.stream().map(s -> s.getStudentScore());
		DoubleStream scoreStream2 = list.stream().mapToDouble(s -> s.getStudentScore());

		double sum = scoreStream2.sum();
		System.out.println("Sum = " + sum);
		OptionalDouble maxOptional = list.stream().mapToDouble(s -> s.getStudentScore()).max();
		if (maxOptional.isPresent()) {
			System.out.println("Max = " + maxOptional.getAsDouble());
		}
		double min = list.stream().mapToDouble(s->s.getStudentScore()).min().getAsDouble();
		
		//System.out.println(list.stream().mapToDouble(s->s.getStudentScore()).min());
		list.stream()
			.mapToDouble(s -> s.getStudentScore())
			.average()
			.ifPresent( e -> System.out.println(e) );
	}
}









