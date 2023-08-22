package test06;

class A{
	void show() {
		System.out.println("showing A properties");
	}
}

class B extends A{
//	@Override
//	public void show() {
//		System.out.println("showing B properties");
//	}
	@Override
	void show() {
		System.out.println("showing B properties");
		super.show();
	}

}

public class Test {
	public static void main(String[] args) {
		B obj = new B();
		obj.show();
	}
}
