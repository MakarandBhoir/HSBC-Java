package test10;

public class Test {

	public static void main(String[] args) {
		//Account acc = new Account();
		Account acc = null;
		acc = new Saving();
		acc.showAccountInfo();
		
		acc = new Current();
		acc.showAccountInfo();
	}

}
