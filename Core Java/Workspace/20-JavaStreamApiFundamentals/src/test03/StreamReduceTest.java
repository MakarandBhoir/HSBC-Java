package test03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamReduceTest {

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

		List<Double> scoreList = list.stream().map(element -> element.getStudentScore()).collect(Collectors.toList());

		BinaryOperator<Double> operator = (n1, n2) -> n1 + n2;

		double sum = scoreList.stream().reduce(operator).get();
		double sum2 = scoreList.stream().mapToDouble(e -> e.doubleValue()).sum();
		double avg = scoreList
						.stream()
						.mapToDouble(e->e.doubleValue())
						.average()
						.getAsDouble();
	}
}
