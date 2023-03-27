package week2;
import java.util.Scanner;

public class BankAcctMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter bank account number");
		int acctNum = Integer.parseInt(sc.nextLine());
		System.out.println("Enter customer name");
		String custName = sc.nextLine();
		System.out.println("Enter bank account type");
		String acctType = sc.nextLine();
		System.out.println("Enter account balance number");
		float bal = Float.parseFloat(sc.nextLine());

		try {
			BankAccount ba = new BankAccount(acctNum, custName, acctType, bal);
			
			int choice = 0;
			
			do {
				System.out.println("*******Menu*******");
				System.out.println("1- Deposit");
				System.out.println("2- Withdraw");
				System.out.println("3- Get Balance");
				System.out.println("4- Exit");
				
				System.out.println("Please enter your selection");
				choice = Integer.parseInt(sc.nextLine());
				
				switch(choice) {
					case 1:
						System.out.println("How much would you like to deposit?");
						try {
							ba.deposit(Float.parseFloat(sc.nextLine()));
						} catch(NegativeAmount e) {
							System.out.println(e.getMessage());
						}
						break;
					case 2:
						System.out.println("How much would you like to withdraw?");
						try {
							ba.withdraw(Float.parseFloat(sc.nextLine()));
						} catch (InsufficientFunds | NegativeAmount e) {
							System.out.println(e.getMessage());
						}
						break;
					case 3:
						try {
							System.out.printf("%s $%,.2f\n", "The balance is: ", ba.getBalance());
						}catch(LowBalanceException | NegativeAmount e) {
							System.out.println(e.getMessage());
						}
						break;
					case 4:
						break;
				}
				
			} while(choice!=4);
		} catch (LowBalanceException | NegativeAmount | InvalidAcctType e) {
			System.out.println(e.getMessage());
		}
		
	}

}
