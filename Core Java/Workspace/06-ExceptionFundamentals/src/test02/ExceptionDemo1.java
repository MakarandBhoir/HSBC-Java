package test02;

public class ExceptionDemo1 {
	public int division(int n1, int n2) {
		int result = n1 / n2;
		return result;
	}

	public static void main(String[] args) {
		System.out.println("Start of program");
		try
		{
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			ExceptionDemo1 obj = new ExceptionDemo1();
			
			try {
				int result = obj.division(n1, n2);
				System.out.println("Division = "+result);
			}
			catch(ArithmeticException ex) {
				System.out.println("Please pass correct arguments.");
			}
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Please pass 2 arguments.");
		}
		catch(NumberFormatException ex) {
			System.out.println("Please pass 2 numbers only.");
		}
		System.out.println("End of program");
	}
}
