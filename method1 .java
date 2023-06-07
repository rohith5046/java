ackage practice.java;

public class Bank1 {
	static int currentbalance = 1000;
	 public static void greetcustomer() {
		 System.out.println("Hello welcome to bank");
		 	  }
	 public  void deposit(int amount) {
	currentbalance	= currentbalance+amount;
	System.out.println("Amount is depoisted sucessfully");
	 }
	 public static void withrawn(int amount) {
		 currentbalance	= currentbalance-amount;
		 System.out.println("Amount is withdrawn sucessfully");
	 }
	 public int getcurrentbalance() {
		 return currentbalance;
	 }
		  public static void main(String[] args) {
			  Bank1 bank1 = new Bank1();
		 	 greetcustomer();
		 	 System.out.println("Current balance is : "+bank1.getcurrentbalance());
		 	 bank1.deposit(500);
		 	 System.out.println("Current balance is : "+bank1.getcurrentbalance());
		 	 withrawn(300);
		 	System.out.println("Current balance is : "+bank1.getcurrentbalance());
		 	 
		 	 
		 }
		 }

