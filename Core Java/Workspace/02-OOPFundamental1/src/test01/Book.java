package test01;

public class Book {
	long bookIsbn;
	String bookName;
	double bookPrice;
	
	public void display() {
		System.out.println("ISBN = "+bookIsbn);
		System.out.println("Name = "+bookName);
		System.out.println("Price = "+bookPrice);
	}
}
