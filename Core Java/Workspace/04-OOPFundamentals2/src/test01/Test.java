package test01;

class A{
	protected int a;
}

class B extends A{
	private int b;
	
	public int sum() {
		return a + b;
	}
}

public class Test {
	public static void main(String[] args) {
		B obj = new B();
		obj.a = -1;
		int sum = obj.sum();
		System.out.println("Sum = "+sum);
	}
}
