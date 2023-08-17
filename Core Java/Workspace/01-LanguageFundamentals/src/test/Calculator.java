package test;

public class Calculator {
	
	public static int addtion(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	public static void main(String[] args) {
		int result = Calculator.addtion(10, 15);
		System.out.println("Result = "+result);
	}

}
