package test12;

interface I1{
	public static final int X = 100;
	
	void meth1();
}
interface I2{
	void meth1();
}
interface I3 extends I1, I2{
	void meth3();
}
//class C implements I3{
//}

class C implements I1, I2{
	public void meth1() {
		System.out.println("meth1");
	}
}
public class Test {
	public static void main(String[] args) {
		I1 ref1 = new C();
		I2 ref2 = new C();
		
		ref1.meth1();
		ref2.meth1();
	}
}
