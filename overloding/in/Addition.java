package overloding.in;

public class Addition {
	public void add(int a,int b){
		System.out.println(a+b);
	}
	public void add(int a, int b ,int c) {
		System.out.println(a+b+c);
	}
	public void add(float a, int b){
		System.out.println(a+b);
	}
	public void add(int a,double b){
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Addition a = new Addition();
		a.add(2, 4);
		a.add(6f, 5);
		a.add(4, 6.8);
		a.add(2, 3, 4);
	}
}
