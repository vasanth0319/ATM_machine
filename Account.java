package ATM_machine;

 abstract class Account {
	 private String name;
	 private double balance;
	 
	 public Account(String name,double balance) {
		 this.name=name;
		 this.balance=balance;
	 }
	 
	 public String getName() {
		 return name;
	 }
	 public double getBalance() {
		 return balance;
	 }
	 
	 protected void setBalance(double balance) {
		 this.balance=balance;
	 }
	 public void deposit(double amount) {
		 if(amount>0) {
			 setBalance(getBalance()+amount);
			 System.out.println("Deposited"+amount);
		 }else {
			 System.out.println("Invalid amount...!");
		 }
	 }
	 abstract void widthdraw(double amount);
	 
		 
	 

}
