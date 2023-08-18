package test07;

public class StringDemo1 {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = new String("Hello");
		String str3 = "hello";
		
		
		if(str1 == str2) {
			System.out.println("str1 == str2");
		}else {
			System.out.println("str1 != str2");
		}
		
		if(str1 == str3) {
			System.out.println("str1 == str3");
		}else {
			System.out.println("str1 != str3");
		}
		
	}
}
