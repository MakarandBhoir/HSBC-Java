package test05;

public class Book {
	private long bookIsbn;
	private String bookName;
	private double bookPrice;
	private static double bookDiscount;
	
//	Book(){
//		System.out.println("Book constructor");
//	}
	
	public static void setDiscount(double bookDiscount) {
		Book.bookDiscount = bookDiscount;
	}
	static {
		System.out.println("static-1");
		bookDiscount = 10.0;
	}
//	static {
//		System.out.println("static-2");
//	}
	
	private double calculateDiscount() {
		double actual = bookPrice - ((Book.bookDiscount / 100.0) * bookPrice);
		return actual;
	}
	
	Book(long isbn, String bookName, double bookPrice){
		this.bookIsbn = isbn;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	public void display() {
		System.out.println("ISBN = "+this.bookIsbn);
		System.out.println("Name = "+this.bookName);
		System.out.println("Price = "+this.bookPrice);
		System.out.println("Price after discount = " + calculateDiscount());
		System.out.println("-------------------");
	}
}
