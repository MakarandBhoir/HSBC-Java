package test05;

class A{
	public A() {
		System.out.println("A()");
	}
	public A(int a) {
		System.out.println("A(int a)");
	}
}

class B extends A{
	public B() {
		this(10);
		//super(10);
		System.out.println("B()");
	}
	public B(int b) {
		super(b);
		System.out.println("B(int b)");
	}
}

public class Test {
	public static void main(String[] args) {
		B obj = new B();
		B obj2 = new B(100);
	}
}
