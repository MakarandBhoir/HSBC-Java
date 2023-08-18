package test04;

public class Book {
	private long bookIsbn;
	private String bookName;
	private double bookPrice;
	
//	Book(){
//		System.out.println("Book constructor");
//	}
	
	Book(long isbn, String bookName, double bookPrice){
		this.bookIsbn = isbn;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	
	public void display() {
		String bookName = "X";
		System.out.println("ISBN = "+this.bookIsbn);
		System.out.println("Name = "+this.bookName);
		System.out.println("Price = "+this.bookPrice);
		System.out.println("-------------------");
	}
}
