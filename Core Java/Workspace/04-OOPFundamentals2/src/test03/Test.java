package test03;
class A{
	private int a;
	public A(int a) {
		this.a = a;
	}
	public int getA() {
		return a;
	}
}
class B extends A{
	private int b;
	
	public B(int b) {
		super(b);
		this.b = b;
	}
	public B(int a, int b) {
		super(a);
		this.b = b;
	}
	public int sum() {
		return this.getA() + this.b;
	}
}
public class Test {
	public static void main(String[] args) {
		B obj = new B(10);
		int sum = obj.sum();
		System.out.println("Sum = "+sum);
		
		B obj2 = new B(5, 7);
		int sum2 = obj2.sum();
		System.out.println("Sum2 = "+sum2);
	}
}
