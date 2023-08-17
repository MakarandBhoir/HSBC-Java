package test02;

public class Book {
	private long bookIsbn;
	private String bookName;
	private double bookPrice;
	
	public void display() {
		System.out.println("ISBN = "+bookIsbn);
		System.out.println("Name = "+bookName);
		System.out.println("Price = "+bookPrice);
	}
}
