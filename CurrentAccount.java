package ATM_machine;

class CurrentAccount extends Account{
	private double overdraftLimit;
	
	public CurrentAccount(String name,double balance,double limit){
		super(name,balance);
		this.overdraftLimit=limit;
		
	}
	
	@Override
	void widthdraw(double amount) {
		if(amount<=getBalance()+overdraftLimit) {
			System.out.println("widthdraw:"+amount);
		}else {
			System.out.println("overdraftlimit exceed");
		}
		
	}

}
