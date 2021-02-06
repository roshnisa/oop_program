package setget;

public class Triangle {
	private int Lenght;
	private int Width;
	
	public int getLenght() {
		return Lenght;
	}
	public void setLenght(int lenght) {
		Lenght = lenght;
	}
	public int getWidth() {
		return Width;
	}
	public void setWidth(int width) {
		Width = width;
	}
	public double area(){
		return Lenght*Width;
		}
	public static void main(String[] args) {
		Triangle t = new Triangle();
		
		t.setLenght(12);
		t.setWidth(6);
		System.out.println("Lenght is = "+t.getLenght());
		System.out.println("Width is = "+t.getWidth());
		System.out.println("area is  = " +t.area());
		
	}
	
	

}
