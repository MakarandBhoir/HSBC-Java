package test03;

public class ExceptionDemo1 {
	public int division(int n1, int n2) {
		try {
			int result = n1 / n2;
			return result;
		}
		catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("finally block executed.");
		}
		return 0;
	}

	public static void main(String[] args) {
		int div = new ExceptionDemo1().division(10, 3);
		System.out.println("Division = "+div);
	}
}
