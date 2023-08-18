package test04;

public class BookApp {
	public static void main(String[] args) {
		Book b1 = new Book(1234567890123L, "Let Us C", 450.50);
		Book b2 = new Book(9087654321234L, "Java Vol-1", 1250.50);
		
		//Book b3 = new Book();
		
		b1.display();
		b2.display();
	}
}
