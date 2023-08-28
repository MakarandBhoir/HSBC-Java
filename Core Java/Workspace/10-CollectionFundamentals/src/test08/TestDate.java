package test08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestDate {
	public static void main(String[] args) {
//		Date date = new Date();
//		System.out.println("Today Date is = " + date);
		
		System.out.println("Enter your DOB in (dd/mm/yyyy) format: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MMMM-yyyy");
		
		
		try {
			Date dob = sdf.parse(input);
			System.out.println(dob);
			String output = sdf2.format(dob);
			System.out.println(output);
			
		} 
		catch (ParseException e) {
			System.out.println("Parse exception");
		}
	}
}
