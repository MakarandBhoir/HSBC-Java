package test06;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		//Set<Number> set = new TreeSet<>();
		
		set.add(1000);
		int x = 204;
		
		Integer obj = x;
		
		set.add(obj);
		
		set.add(102);
		
		set.add(84);
		set.add(1000);
		
		//set.add(100.50);
		
		System.out.println(set);
	}
}
