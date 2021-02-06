package overriding;

public class Circle extends Shape {
	public int radius;
	
	public Circle(int r) {
		radius = r;
		// TODO Auto-generated constructor stub
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double area(){
		double d = 3.14*radius*radius;
		return d;
	}
		//return 3.14*radius*radius;
	

	public static void main(String[] args) {
		
		//Circle c = new Circle();
		//c.setRadius(3);
		
		Shape s= new Circle(2);
		s.setColor("red");
		s.setBorderwidth(5);
		s.area();
		
		
		
		System.out.println(s.getBorderwidth());
		System.out.println(s.getColor());
		System.out.println(s.area());
	}

}
