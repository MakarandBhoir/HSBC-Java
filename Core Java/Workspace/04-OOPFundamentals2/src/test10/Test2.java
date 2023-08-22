package test10;

public class Test2 {

	public static void main(String[] args) {
		Account acc = null;
		Saving saving = new Saving();
		Current current = new Current();
		
		if(Math.random() > 0.5) {
			acc = saving;
		}else {
			acc = current;
		}
		
		acc.showAccountInfo();
		
	}

}
