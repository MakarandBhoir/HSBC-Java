package test02;

public class BookApp {
	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book();
		
		b1.bookIsbn = 1234567890123L;
		b1.bookName = "C Language";
		b1.bookPrice = 350.50;
		
		b2.bookIsbn = 9087654321234L;
		b2.bookName = "Java Language";
		b2.bookPrice = 1200.50;
				
		b1.display();
		b2.display();
	}
}
