package test07;

public class StringDemo4 {
	public static void main(String[] args) {
		String str = "Hello Wolrd!";
		str = str + str;
		
		str = str.substring(0, 5);
		
		System.out.println(str);
	}
}
