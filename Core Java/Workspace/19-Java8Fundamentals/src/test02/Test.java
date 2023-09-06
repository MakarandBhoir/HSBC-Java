package test02;

import test01.FI;

//1. Create new Class - NOT REQUIRE, Create anonymous class implicitly
//2. Implements interface - NOT REQUIRE
//3. Override abstract methods
//4. Define body of methods
//5. Call methods

public class Test {
	public static void main(String[] args) {
		FI ref = new FI() {
			@Override
			public void meth1() {
				System.out.println("method of anonymous class");
			}
		};
		
		ref.meth1();
	}
}
