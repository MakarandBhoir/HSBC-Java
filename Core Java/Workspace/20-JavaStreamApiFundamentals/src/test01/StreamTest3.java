package test01;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTest3 {
	
	private static void print(Collection<String> collection) 
	{
		collection.stream().forEach(str -> System.out.println(str));
	}
	
	public static void main(String[] args) {
		String arr[] = {"HSBC", "ICICI", "Yes Bank", "HDFC", "SBI", "ITC", "hdfc"};
		
		List<String> list = Arrays.asList(arr);
		
		print(list);
		
		System.out.println("===============================================");
		Set<String> set = list
							.stream()
							.filter( str -> str.toLowerCase().startsWith("h"))
							.collect( Collectors.toSet() );
		
		print(set);
	}
}





