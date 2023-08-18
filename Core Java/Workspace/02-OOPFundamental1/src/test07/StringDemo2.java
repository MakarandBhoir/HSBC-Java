package test07;

public class StringDemo2 {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = new String("hello");
		String str3 = "Hello";
		
		
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
		System.out.println("--------------------------------------");
		
		if(str1.equals(str2)) {
			System.out.println("str1 is equal to str2");
		}else {
			System.out.println("str1 is not equal to str2");
		}
		
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("str1 is equal to str2");
		}else {
			System.out.println("str1 is not equal to str2");
		}
		
		if(str1.equals(str3)) {
			System.out.println("str1 is equal to str3");
		}else {
			System.out.println("str1 is not equal to str3");
		}
	}
}
