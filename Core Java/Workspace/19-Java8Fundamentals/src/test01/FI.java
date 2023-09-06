package test01;

@FunctionalInterface
public interface FI {
	public abstract void meth1();
	public default void meth2() {
		System.out.println("default method of interface.");
		meth4();
	}
	public static void meth3() {
		System.out.println("static method of interface.");
		//meth4();
	}
	private void meth4() {
		System.out.println("private method of intreface.");
	}
}
