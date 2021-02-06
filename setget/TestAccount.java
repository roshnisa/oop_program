package setget;

public class TestAccount {
	public static void main(String[] args) {
		
		Account a=new Account();
		a.setAccountType("saving acount");
		a.setBalance(6000);
		a.setNumber("8982858576");
		
	    System.out.println("Account number = " +a.getAccountType());
		System.out.println("Balance = "+a.getBalance());
		System.out.println("number = "+a.getNumber());
	
		Account b= new Account();
		b.setAccountType("Saving account");
		b.setBalance(5000);
		b.setNumber("9926882063");
	
		System.out.println("saving account1" +b.getAccountType());
		System.out.println("balance1"+b.getBalance());
		System.out.println("number1 "+b.getNumber());
		
		//Account c= new Account();
		//c.setAccountType("Bill payment");
		//c.setBalance(1000);
		//c.setNumber("6260122699");
		
		
		//System.out.println("Bill payment" +c.getAccountType());
	//System.out.println("PAID bill"+c.getBalance());
	//System.out.println("got paymet"+c.getNumber());
	
	TestAccount.deposit(1500, a);
	TestAccount.withdrawal(500, a);
		transfer(1000,a,b);
		//paidbill(500,a,c);
		
		
		/*
	 *  Non-Static method calling 
	 *  ClassName classObject = new ClassName();
	 *  classObject.methodName();
	 * 	TestAccount obj = new TestAccount();
	 * obj..deposit(1500);
	 */
	/*
		 *  Static method calling 
		 *  className.methodName();
		 *   */
	}		
		
		
	//private static void paidbill(int i, Account a, Account c) {
		// TODO Auto-generated method stub
		
	//}

		//}
		public static   void deposit (int depositAmount, Account a){
		//	Account a=new Account();
			double currentbalance=a.getBalance();
			a.setBalance(currentbalance + depositAmount);			
			System.out.println("Amount deposited successfully !!!  "  + a.getBalance());
		}
		public static void withdrawal(int withdrawalAmount,Account a){
			//Account b=new Account();
			double currentbalance=a.getBalance();
			a.setBalance(currentbalance - withdrawalAmount);
			System.out.println("Amount withdrawal.... "+a.getBalance());
		}
		public static void transfer(double transferAmount,Account sender, Account receiver){
		double senderBalance = sender.getBalance();
		double receiverBalance = receiver.getBalance();
		if(transferAmount < senderBalance){
			sender.setBalance(senderBalance-transferAmount);
			System.out.println("Sender Current Balance  =  " +  sender.getBalance());
			receiver.setBalance(receiverBalance + transferAmount);
			System.out.println("Receiver Current Balance  =  " +  receiver.getBalance());
			System.out.println("Amount Transferred Successfully !!! ");
			
		}
		else{
			System.out.println("fund cannot be transfered");
		}

			
		}
}
		
	
	
	

	
	
	
	

