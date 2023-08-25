package test02;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("HSBC");
		set.add("HDFC");
		set.add("ITC");
		set.add("ICICI");
		set.add("ITC");
		
		System.out.println(set);
	}
}
