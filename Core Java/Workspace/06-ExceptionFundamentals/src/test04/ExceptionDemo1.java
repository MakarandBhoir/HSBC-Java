package test04;

import java.io.IOException;

public class ExceptionDemo1 {

	public static void meth1() {
		throw new NullPointerException();
	}
	
	public static void meth2() throws IOException{
		throw new IOException();
	}
	
	public static void main(String[] args) {
		try {
			meth1();
			meth2();
		}catch(IOException | NullPointerException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
