package test04;

public class Test {
	public static void main(String[] args) {
		Max max1 = (int n1, int n2) -> {
			if (n1 > n2)
				return n1;
			else
				return n2;
		};

		Max max2 = (n1, n2) -> {
			int result = (n1 > n2) ? n1 : n2;
			return result;
		};

		Max max3 = (n1, n2) -> (n1 > n2) ? n1 : n2;
		
//		Max max4 = (n1, n2) -> System.out.println("Max");

		System.out.println("Result1 = " + max1.max(10, 20));
		System.out.println("Result2 = " + max2.max(25, 18));
		System.out.println("Result3 = " + max3.max(260, 14));
	}
}
