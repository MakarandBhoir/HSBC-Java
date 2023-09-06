package test07;

import test05.Student;

public class Test2<T1, T2> {

	public void add(T1 n1, T2 n2) {
		System.out.println("n1 typeof "+n1.getClass().getName());
		System.out.println("n2 typeof "+n2.getClass().getName());
	}
	
	public static void main(String[] args) {
		Test2<Integer, Double> obj = new Test2<>(); 
		
		var v1 = 100;
		var v2 = 100.5;
		
		obj.add(v1, v2);
		
		Test2<String, Student> obj2 = new Test2<>(); 
//		obj2.add(null, null);
		
		System.out.println(v1);
		System.out.println(v2);
	}

}
