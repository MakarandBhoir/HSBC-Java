package test01;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		System.out.println("Start of program");
		
		String str = null;
		int length = str.length();
		
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		
		int result = n1 / n2;
		
		System.out.println("Division = "+result);
		
		System.out.println("End of program");
	}
}
