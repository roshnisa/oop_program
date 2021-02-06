package setget;

public class Shape {
	private String color= null;
	private int borderWidth = 0;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBorderWidth() {
		return borderWidth;
	}
	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	public Shape(){
		System.out.println("default constructor");
		}
	public Shape (String color, int bw){
		this.color=color;
		borderWidth=bw;
		
	}
public double area() {
	return 0;
}

}


