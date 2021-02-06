package interfacemethod;

public class Bussinessmen implements Richman, socialworker {

	public void helpToOther() {
		System.out.println("helping");
		
	}

	public void earnMoney() {
		// TODO Auto-generated method stub
		System.out.println("earn money");
		
	}

	public void donation() {
		// TODO Auto-generated method stub
		System.out.println("donatin");
		
	}

	public void party() {
		// TODO Auto-generated method stub
		System.out.println("party");
		
	}
	public static void main(String[] args) {
		Richman r = new Bussinessmen();
		socialworker s = new Bussinessmen();
		r.donation();
		r.earnMoney();
		r.party();
		s.helpToOther();
	}
		
	}


