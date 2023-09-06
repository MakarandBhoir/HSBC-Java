package test03;

import test01.FI;

//1. Create new Class - NOT REQUIRE
//2. Implements interface - NOT REQUIRE
//3. Override abstract methods - NOT REQUIRE
//4. Define body of methods
//5. Call methods
public class Test {
	public static void main(String[] args) {
		
		FI ref = ()-> System.out.println("method from lambda.");
		
		ref.meth1();
		
	}
}
