package test02;

public class Book {
	public long bookIsbn;
	public String bookName;
	public double bookPrice;
	
	public void display() {
		System.out.println("ISBN = "+bookIsbn);
		System.out.println("Name = "+bookName);
		System.out.println("Price = "+bookPrice);
	}
}
