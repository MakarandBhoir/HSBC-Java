package test02;

class A{
	private int a;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
}
class B extends A{
	private int b;
	
	public int sum() {
		return this.getA() + this.b;
	}
}
public class Test {
	public static void main(String[] args) {
		B obj = new B();
		int sum = obj.sum();
		System.out.println("Sum = "+sum);
		
		B obj2 = new B();
		int sum2 = obj2.sum();
		System.out.println("Sum2 = "+sum2);
	}
}
