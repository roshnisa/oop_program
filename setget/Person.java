package setget;

import java.util.Date;

public class Person {
	private String name;
	private String address;
	private Date dob;
	public static  int AVG_AGE;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setDate(String name, Date string){
		this.dob =string;
	}
	public Date getdob(){
		return dob;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public static int getAVG_AGE() {
		return AVG_AGE;
	}
	public static void setAVG_AGE(int aVG_AGE) {
		AVG_AGE = aVG_AGE;
	}
	public void setDate(int i) {
		// TODO Auto-generated method stub
		
	}
}
