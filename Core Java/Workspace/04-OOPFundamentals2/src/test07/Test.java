package test07;

class A{
	public int show() {
		System.out.println("showing A properties");
		return 1;
	}
	public Object show2() {
		return null;
	}
}

class B extends A{
	@Override
	public int show() {
		System.out.println("showing B properties");
		return 2;
	}
	@Override
	public B show2() {
		return null;
	}
}

public class Test {
	public static void main(String[] args) {
		B obj = new B();
		obj.show();
		
		if(obj instanceof A) {
			System.out.println("obj instanceof A");
		}
	}
}
