package test10;

public abstract class Account {
	abstract public void showAccountInfo();
}

class Saving extends Account{

	@Override
	public void showAccountInfo() {
		System.out.println("Saving Account Info");
	}
}

class Current extends Account{
	@Override
	public void showAccountInfo() {
		System.out.println("Current Account Info");
	}
}