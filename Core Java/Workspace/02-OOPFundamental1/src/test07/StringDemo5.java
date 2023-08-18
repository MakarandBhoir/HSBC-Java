package test07;

public class StringDemo5 {

	public static void main(String[] args) {
		System.out.println("Program is started...");
		String str1 = "Hello"; // String is immutable object.
		long start = System.currentTimeMillis();
		for(int i=1; i<1000000; i++) {
			str1 = str1 + "W";
		}
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken to execute: "+(end-start)+" ms");
	}

}
