package test01;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		
		list.add("HSBC");
		list.add("City Bank");
		list.add("JPM");
		list.add("HDFC");
		list.add("ICICI");
		list.add(2, "ITC");
		
		list.add("HSBC");
		list.add("City Bank");
		list.add("JPM");
		list.add("HDFC");
		list.add("ICICI");
		list.add(2, "ITC");
		System.out.println(list);
	}
}
