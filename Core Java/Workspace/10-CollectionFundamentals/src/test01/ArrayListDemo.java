package test01;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		//ArrayList list = new ArrayList();
		
		ArrayList<String> list = new ArrayList<>();
		
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
