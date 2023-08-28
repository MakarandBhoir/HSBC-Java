package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");

		Date date = new Date();
        
		String formattedDate = sdf.format(date);
        System.out.println("Date formatted : "+formattedDate);
        
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        Date date2 = sdf.parse(input);
        
        System.out.println(date2);
	}
}
