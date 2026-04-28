package ATM_machine;

class SavingsAccount  extends Account{
	public SavingsAccount(String name,double balance) {
		super(name,balance);
	}
	@Override
	void widthdraw(double amount) {
		if(amount<=getBalance()) {
			setBalance(getBalance()-amount);
			System.out.println("Widthdraw:"+amount);
		}else {
			System.out.println("Insufficient balance..!");
		}
		
	}

}
