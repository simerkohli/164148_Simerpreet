package com.simer.test;
import com.simer.bank.BankAccount;
import com.simer.bank.CurrentAccount;
import com.simer.bank.SavingsAccount;
import com.simer.bank.SavingsAccountVer2;
public class TestBankAccount {
     public static void testBankAccountMethod()
     {
    	 //BankAccount acc1=new BankAccount();
    	 //acc1.setAccountHolderName("Simer");
     }
     /*
     public static void testSavingsAccount()
     {
    	 SavingsAccount account=new SavingsAccount("Simer",5000);
    	System.out.println("Account No is "+account.getaccountno());
    	 System.out.println("Account Balance is "+account.getAccountBalance());
         account.deposit(200);
         System.out.println("==============");
         System.out.println("Account balance "+  account.getAccountBalance());
         account.withdraw(100);
         System.out.println("Account balance "+ account.getAccountBalance());
     }*/
     
     public static void testCurrentAccount()
     {
    	 CurrentAccount account1=new CurrentAccount("Rahul",101);
    	System.out.println("Account No is "+account1.getaccountno());
    	 System.out.println("Account Balance is "+account1.getAccountBalance());
       //  account1.deposit(200);
        // System.out.println("Account balance "+  account1.getAccountBalance());
         //System.out.println("==============");
         account1.withdraw(45000);
         //System.out.println("Account balance "+ account1.getAccountBalance());
    	 
     }
     
     public static BankAccount getBankAccount(String accountType)
     {
    	 BankAccount acc=null;
    	 if(accountType.equals("Saving"))
    	 {
    		 acc=new SavingsAccount("Simer",4000);
    	 }
    	 else if(accountType.equals("Current"))
    	 {
    		 acc=new CurrentAccount("Rahul",5000);
    	 }
    	 else
    	 {
    		 acc=null;
    	 }
    	 return acc;
     }
     public static void main(String[] args) {
		SavingsAccountVer2 acc=new SavingsAccountVer2();
		acc.deposit(4000);
		acc.isSalaryAccount();
		acc.getInsuranceName();
	}
}
