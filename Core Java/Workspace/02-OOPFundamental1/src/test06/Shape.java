package test06;

public class Shape {
	public double area(int radius) {
		final double PI = 3.14;
		double circleArea = PI * radius * radius;
		return circleArea;
	}
	public int area(int l, int b) {
		return l * b;
	}
}
