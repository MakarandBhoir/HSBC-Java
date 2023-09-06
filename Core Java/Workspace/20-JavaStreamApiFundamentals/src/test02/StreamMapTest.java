package test02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMapTest {

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
		
		Function<Student, String> mapFunction = (Student s) -> {
			String name = s.getStudentName();
			return name;
		};
		
		List<String> nameList = list
									.stream()
									.map(mapFunction)
									.collect(Collectors.toList());
		
		nameList.forEach(e -> System.out.println(e));
		
		
		List<String> nameList2 = list
									.stream()
									.map( s -> s.getStudentName() )
									.collect(Collectors.toList());
	}
}





