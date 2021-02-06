package overriding;

public class Testtriangle extends Shape {
	private int base;
	private int height;
	public Testtriangle(int b,int h){
		this.base=b;
		this.height= h;
		
	}
	public double area() {
		return 0.5*base*height;
	}
	public static void main(String[] args) {
		Shape s =new Testtriangle(4,2);
		s.setBorderwidth(2);
		s.setColor("green");
		System.out.println(s.getBorderwidth());
		System.out.println(s.getColor());
		System.out.println(s.area());
	}
	

}
