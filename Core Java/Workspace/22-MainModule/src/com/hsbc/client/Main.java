package com.hsbc.client;

import com.hsbc.calcy.Calculator;
import com.hsbc.calcy.CalculatorImpl;
//import com.hsbc.utility.MathUtil;

public class Main {
	public static void main(String[] args) {
		Calculator calcy = new CalculatorImpl();
		
		System.out.println("Addition = "+calcy.addition(103, 907));
//		System.out.println("Multiply = "+MathUtil.mul(10, 20));
	}
}
