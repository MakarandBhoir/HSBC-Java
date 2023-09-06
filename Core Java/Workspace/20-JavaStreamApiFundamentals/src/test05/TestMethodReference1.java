package test05;
@FunctionalInterface
interface MyInterface{
	void display();
}

class AnotherImpl{
	public void show() {
		System.out.println("diplay something...");
	}
	public static void anotherShow() {
		System.out.println("diplay something...");
	}
}
public class TestMethodReference1 {
	public static void main(String[] args) {
		MyInterface ref1 = () -> System.out.println("diplay something...");
		MyInterface ref2 = () -> new AnotherImpl().show();
		MyInterface ref3 = new AnotherImpl() :: show;
		MyInterface ref4 = AnotherImpl :: anotherShow;
		
		ref1.display();
		ref2.display();
		ref3.display();
		ref4.display();
		
		//MyInterface ref = new AnotherImpl();
	}
}
