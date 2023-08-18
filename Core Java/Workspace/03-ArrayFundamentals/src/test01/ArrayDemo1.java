package test01;

import java.util.Scanner;

public class ArrayDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		System.out.println("Enter 5 numbers = ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		ArrayDemo1.suqareNumbers(arr);
	}
	
	public static void suqareNumbers(int arr[]) {
		for(int number : arr) {
			System.out.println("Number = "+number+", Square = "+Math.pow(number, 3));
		}
	}
}
