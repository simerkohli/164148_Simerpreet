package com.simer.bank;
import java.util.Scanner;
import java.io.ObjectInputStream.GetField;

/**
 * @author simkohli
 *
 */
public abstract class BankAccount {
     Scanner scanner=new Scanner(System.in);
	// static variable (one copy shared among the objects)
	private static int autoAccountNo=0;

	// instance variable (we cannot access instance variable without creation of
	// object)
	private int accountno;
	private String accountHolderName;
	protected double accountBalance;

	// init block(it will call before the constructor )
	{

		accountno = ++autoAccountNo;
	}

	// job of const. is to initialise the class variable nothing else
	public BankAccount() {
		// accountno=++autoAccountNo;
		accountHolderName = "Unknown";
		accountBalance =40000;

	}

	public BankAccount(String accountHolderName, double accountBalance)
	{
		// accountno=++autoAccountNo;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
		System.out.println("wELCOME " + this.accountHolderName);
		
	}

	// setter method -- when i want to reinitialise the member variable
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}
	
	public double getaccountno() {
		return accountno;
	}
	// service methods
	public void deposit(int amount) {
	
		if(amount>0)
		{
		System.out.println(this.accountBalance+amount);
		}
		else {
			System.out.println("Please enter valid amount");
		}
	}

	/*public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		BankAccount bankAccount2 = new BankAccount("Simer", 5000);
		//bankAccount2.deposit();
		// bankAccount2.deposit(200);

	}*/
}
