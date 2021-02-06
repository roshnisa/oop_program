package setget;

public class Testshape {
	public static void main(String[] args) {
		Shape s=new Shape();
		s.setBorderWidth(6);
		s.setColor("red");
		s.getBorderWidth();
		s.getColor();
		System.out.println(s.getBorderWidth());
		System.out.println(s.getColor());
		
	}

}
