package overriding;

public class Triangle extends Shape {
	private int base;
	private int height;

	public Triangle() {
	}

	public Triangle(int b, int h) {
		base = b;
		height = h;
	}

	public double area() {
		double d = 0.5 * base * height;
		return d;
	}

	public static void main(String[] args) {
		Shape s = new Triangle(5, 6);
		s.setBorderwidth(4);
		s.setColor("blue");
		double area = s.area();
		System.out.println(area);

		System.out.println("border is =" + s.getBorderwidth());
		System.out.println("color is = " + s.getColor());

	}
}
