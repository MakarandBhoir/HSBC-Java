package com.hsbc.calcy;

import com.hsbc.utility.MathUtil;

public class CalculatorImpl implements Calculator {
	@Override
	public int addition(int n1, int n2) {
		return MathUtil.add(n1, n2);
	}
}
