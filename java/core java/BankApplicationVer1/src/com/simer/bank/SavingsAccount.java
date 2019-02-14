package com.simer.bank;

public class SavingsAccount extends BankAccount {
	
	private boolean isSalaryAccount;
	
	public SavingsAccount (String accountHolderName,double accountBalance)
	{
		super(accountHolderName,accountBalance);
	}
	
	public SavingsAccount(){
		this.isSalaryAccount=true;
	}
	
	public void withdraw(int amount) {
		if ((this.accountBalance - amount) >= 1000 && amount>0 && amount<this.accountBalance) {
			System.out.println((this.accountBalance-amount));
		} else {
			System.out.println("Minimum account balance should be 1000");
		}
	}
	
	public SavingsAccount(String accountHolderName, double accountBalance, boolean isSalaryAccount)
	{
		super(accountHolderName,accountBalance);
		this.isSalaryAccount=isSalaryAccount;
	}
	public boolean isSalaryAccount(){
		return isSalaryAccount;
	}
}