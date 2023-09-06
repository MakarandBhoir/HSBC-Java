package test01;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamTest1 {

	public static void main(String[] args) {
		String arr[] = {"HSBC", "ICICI", "Yes Bank", "HDFC", "SBI", "ITC"};
		
		List<String> list = Arrays.asList(arr);
		
		//1. For each
		//2. Iterator
//		Iterator<String> itr = list.iterator();
//		while(itr.hasNext()) {
//			String element = itr.next();
//			System.out.println(element);
//		}
		//3. Stream API
		Stream<String> stream1 = list.stream();
		Consumer<String> consumer = (String str) -> System.out.println(str);
		stream1.forEach(consumer);
		//stream1.forEach(consumer);
		
		list.stream().forEach( str -> System.out.println(str) );
		
		
	}

}
