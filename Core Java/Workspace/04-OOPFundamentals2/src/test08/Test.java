package test08;

class A{
	public void show() {
		System.out.println("show method of A");
	}
}
class B extends A{
	@Override
	public void show() {
		System.out.println("show mehtod of B");
	}
}
class C extends A{
	@Override
	public void show() {
		System.out.println("show mehtod of C");
	}
}

public class Test {
	public static void main(String[] args) {
		A ref = null;
		ref = new C();
		ref.show();
		
		ref = new B();
		ref.show();
	}
}
