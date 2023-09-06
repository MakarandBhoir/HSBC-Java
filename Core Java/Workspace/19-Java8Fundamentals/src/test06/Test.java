package test06;

import java.util.function.Consumer;

public class Test {
	public static void main(String[] args) {

		Consumer<String> consumer = (String s1) -> System.out.println("str = " + s1);
		consumer.accept("HSBC");

		System.out.println("=================================================");

		Consumer<Integer> consumer2 = (Integer i1) -> System.out.println("int = " + i1);
		consumer2.accept(100);

	}
}
