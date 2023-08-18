package test06;

public class ShapeTest {
	public static void main(String[] args) {
		Shape shape = new Shape();
		double result = shape.area(5);
		System.out.println("Area of Circle = " + result);
		System.out.println("Area of Rect = " + shape.area(5, 7));
	}
}
