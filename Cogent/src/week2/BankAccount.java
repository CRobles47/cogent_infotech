package week2;

public class BankAccount {
	private int accNo;
	private String custName;
	private String accType;
	private float balance;
	
	public BankAccount(int accNo, String name, String type, float bal) throws InvalidAcctType, LowBalanceException, NegativeAmount{
		this.accNo = accNo;
		this.custName = name;
		if(type.toLowerCase().equals("checking") || type.toLowerCase().equals("savings")) {
			this.accType = type;
		} else {
			throw new InvalidAcctType("Account must be Checking or Savings");
		}
		if(bal<0) {
			throw new NegativeAmount("Account balance cannot be negative");
		} else if( (type.toLowerCase().equals("savings") && bal<1000) || (type.toLowerCase().equals("checking") && bal<5000) ) {
			throw new LowBalanceException("Balance too low to open acct");
		} else {
			this.balance = bal;
		}
	}
	
	public void deposit(float amt) throws NegativeAmount{
		if(amt>=0) {
			this.balance+=amt;
		} else {
			throw new NegativeAmount("Deposit amount cannot be negative");
		}
	}
	
	public void withdraw(float amt) throws InsufficientFunds, NegativeAmount{
		if(amt<0) {
			throw new NegativeAmount("Deposit amount cannot be negative");
		} else {
			if( (this.accType.toLowerCase().equals("savings") && this.balance<1000) || (this.accType.toLowerCase().equals("checking") && this.balance<5000) ) {
				throw new InsufficientFunds("Insufficient Funds");
			} else {
				this.balance-=amt;
			}
		}
	}
	
	public float getBalance() throws LowBalanceException, NegativeAmount{
		if(this.balance<0) {
			throw new NegativeAmount("Negative account balance: $" + this.balance);
		} else if( (this.accType.toLowerCase().equals("savings") && this.balance<1000) || (this.accType.toLowerCase().equals("checking") && this.balance<5000) ) {
			throw new LowBalanceException("Low Balance: $" + this.balance);
		} else {
			return this.balance;
		}
	}
}
