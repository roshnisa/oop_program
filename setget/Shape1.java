package setget;

public class Shape1 {
	public class Circle extends Shape {
		private int  radius;
		public int getRadius () {
			return radius;
				}
		public void setradius (int radius) {
			this.radius =radius;
		    	}
		public double area () {
			return 3.14*radius*radius;
			
		}
		
	}

}
   