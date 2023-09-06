package test01;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class StreamTest2 {

	public static void main(String[] args) {
		String arr[] = {"HSBC", "ICICI", "Yes Bank", "hDFC", "SBI", "ITC"};
		
		List<String> list = Arrays.asList(arr);
		
		//1. For each
		//2. Iterator
//		Iterator<String> itr = list.iterator();
//		while(itr.hasNext()) {
//			String element = itr.next();
//			if(element.toUpperCase().startsWith("H"))
//				System.out.println(element);
//		}	
		
		//3. Stream API
		Predicate<String> predicate = (String str) -> {
			if(str.toLowerCase().startsWith("h")) {
				return true;
			}else {
				return false;
			}
		};
		list.stream().filter(predicate).forEach( str -> System.out.println(str) );
		
		System.out.println("===============================================");
		list
			.stream()
			.filter( str -> str.toLowerCase().startsWith("h"))
			.forEach( str -> System.out.println(str) );
		
	}
}





