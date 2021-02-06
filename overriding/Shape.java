package overriding;

public class Shape {
	public String color;
	public int Borderwidth;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBorderwidth() {
		return Borderwidth;
	}
	public void setBorderwidth(int borderwidth) {
		Borderwidth = borderwidth;
	}
	public double area(){
		return 0;
		
	}
	

}
