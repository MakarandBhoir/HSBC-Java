package test13;

public class PersonDemo {

	public static void main(String[] args) {
		Person p1 = new Person("Vaishnavi", "T", "Pune");
		Person p2 = new Person("Deepti", "N", "Nashik");
		
		System.out.println(p1);
		System.out.println(p2.toString());
		
		p1 = null;
		p2 = null;
		System.gc();
	}
}
