package test01;

// 1. Create new Class
// 2. Implements interface
// 3. Override abstract methods
// 4. Define body of methods
// 5. Call methods

public class Impl1 implements FI 
{
	@Override
	public void meth1() {
		System.out.println("meth1 of class");
	}
	
	public static void main(String[] args) 
	{
		FI ref = new Impl1();
		ref.meth1();
		ref.meth2();
		FI.meth3();
		//ref.meth4();
	}
}
