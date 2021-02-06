package setget;

public class Testshape1 {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.setBorderWidth(4);
		c.setColor("red");
		c.setRadius(2);
		System.out.println("color is  "+c.getColor());
		System.out.println("Border is  "+c.getBorderWidth());
		System.out.println("radius is  "+c.getRadius()); 
		System.out.println("area is = " +c.area());
		
	}

}
