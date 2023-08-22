package test11;

interface I1{
	void meth1();
}

class C implements I1{
	public void meth1() {
		System.out.println("meth1 of C");
	}
}

public class Test {
	public static void main(String[] args) {
		I1 ref = new C();
		ref.meth1();
	}
}
