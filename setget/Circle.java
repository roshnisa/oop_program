package setget;

public class Circle extends Shape  {
private int radius;

public int getRadius() {
	return radius;
}

public void setRadius(int radius) {
	this.radius = radius;
}
public double area(){
	
		double d= Math.PI*radius*radius;
		return d;
		}
public static void main(String[] args) {
Circle c=new Circle();
c.setRadius(2);
System.out.println("area of circle "+c.getRadius());
System.out.println("BorderWidth of circle" +c.getBorderWidth() );
System.out.println("color of circle ="+c.getColor());

}





        
		
		
	}
	
	


