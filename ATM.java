package ATM_machine;
import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Account acc;
		System.out.println("choose account type");
		System.out.println("1.current Account");
		System.out.println("2.saving Account");
		int choice=scan.nextInt();
		if(choice==1) {
			acc=new CurrentAccount("vasanth",5000,2000);
		}else {
			acc=new SavingsAccount("vasanth",5000);
		}
		
		while(true) {
			System.out.println("%____ATM menu___%");
			System.out.println("1.check balance");
			System.out.println("2.Deposit");
			System.out.println("3.Widthdraw");
			System.out.println("4.Exit");
			
			int option =scan.nextInt();
			switch(option) {
				case 1: System.out.println("Balance:"+acc.getBalance());
				break;
				
				case 2: System.out.println("enter amount");
						double amt=scan.nextDouble();
						acc.deposit(amt);
						break;
				case 3:System.out.println("enter amount");
					   double wd=scan.nextDouble();
					   acc.widthdraw(wd);
					   break;
				case 4:System.out.println("Thank you");
				return;
				default:System.out.println("invalid choice");
				break;
					
			}
		}
		
	}

}
