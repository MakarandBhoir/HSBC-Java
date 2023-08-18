package test07;

public class StringBufferDemo6 {

	public static void main(String[] args) {
		System.out.println("Program is started...");
		
		//String str1 = "Hello";
		StringBuffer str1 = new StringBuffer("Hello"); // It is mutable object.
		
		long start = System.currentTimeMillis();
		for(int i=1; i<1000000; i++) {
			str1 = str1.append("W");
		}
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken to execute: "+(end-start)+" ms");
	}

}
