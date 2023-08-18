package test07;

public class StringDemo7 {
	public static void main(String[] args) {
		String str = "Infinity"; //a, e, i, o, u
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch =='i' || ch=='I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
				count++;
			}
		}
		System.out.println("Count = "+count);
	}
}
