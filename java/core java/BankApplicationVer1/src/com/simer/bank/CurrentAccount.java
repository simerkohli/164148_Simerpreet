package com.simer.bank;

public class CurrentAccount extends BankAccount {
   private double OdLimit=10000;
   
   public CurrentAccount (String accountHolderName,double accountBalance)
	{
		super(accountHolderName,accountBalance);
	}
   
   public void withdraw(int amount)
   {
	   System.out.println("Your Odlimit is "+ OdLimit );
	   
	   System.out.println("Your are withdrawing "+ amount);
	  if( (this.accountBalance-amount)>=0)
	  {
		  System.out.println("Your account balance is "+ (this.accountBalance-amount));
	  }
	  else if(this.accountBalance + OdLimit - amount >=0)
	  {
		  System.out.println("Account balance is "+ 0 +" and ODlimit remaining is "+ (this.accountBalance+OdLimit-amount));
	  }
	  else
	  {
		  System.out.println("No limit");
	  }
   }
}
