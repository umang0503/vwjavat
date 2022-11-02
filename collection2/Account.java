package collection2;


public class Account implements Comparable<Account>  {
	private String accountHolderName;
	private int acctNo;
	private double balance;
	
	
	public Account(String accountHolderName, int acctNo, double balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.acctNo = acctNo;
		this.balance = balance;
	}


	public String getAccountHolderName() {
		return accountHolderName;
	}


	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public int getAcctNo() {
		return acctNo;
	}

	
	public void deposit(double amt)
	{
		this.balance = this.balance + amt;
	}
	
	public double withdraw(double amt) throws InsufficientBalanceException
	{
		if(amt <= this.balance )
		{
			this.balance = this.balance - amt;
			System.out.println("Current Balance is"+ this.balance+" after withdrawing amt:"+amt);
		}
		else
		{
			//System.out.println("Insufficient Balance: amt:"+amt+" is greater than your balance:"+this.balance);
			
			throw new InsufficientBalanceException(this.balance,amt,this.acctNo);
		}
		
		
		return amt;
	}

	@Override
	public String toString() {
		return "Account [accountHolderName=" + accountHolderName + ", acctNo=" + acctNo + ", balance=" + balance + "]";
	}
	
	 public boolean equals(Object obj)
	    {
	    	return this.acctNo==((Account)obj).acctNo;
	    }
	    @Override
	    public int hashCode()
	    {
	    	System.out.println("hashCode of this employee with empid:"+this.acctNo+" is :"+this.acctNo);
	    	return this.acctNo;
	    }
	    
	    @Override
	    public int compareTo(Account e)
	    {
	    	return this.acctNo-e.acctNo;
	    }
	   
	
}
