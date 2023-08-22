package test14;

public class PersonDemo {

	public static void main(String[] args) {
		Person p1 = new Person("Vaishnavi", "T", "Pune");
		Person p2 = new Person("Deepti", "N", "Nashik");
		//Person p3 = p1;
		Person p3 = new Person("Vaishnavi", "T", "Pune");
		
		System.out.println("p1 hashCode = "+p1.hashCode());
		System.out.println("p2 hashCode = "+p2.hashCode());
		System.out.println("p3 hashCode = "+p3.hashCode());
		
		if(p1.equals(p2)) {
			System.out.println("p1 is equal to p2");
		}
		if(p1.equals(p3)) {
			System.out.println("p1 is equal to p3");
		}
		
		System.out.println(new String("hello").hashCode());
		System.out.println(new String("hello").hashCode());
		
	}
}
