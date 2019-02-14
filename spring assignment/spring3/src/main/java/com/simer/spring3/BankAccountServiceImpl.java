package com.simer.spring3;

import java.util.ArrayList;

public class BankAccountServiceImpl implements BankAccountService{

	ArrayList<BankAccount> tempList=null;
	UserDAO dao=new UserDAO();
	
	@Override
	public double withdraw(long accountId, double accountBalance) {
       tempList=dao.UserDAO();
       for(BankAccount account: tempList)
       {
    	   if(accountId == account.getAccountId())
    	   {
    		   if(accountBalance<account.getAccountBalance())
    		   {
    			   double bal=account.getAccountBalance();
    			   bal=bal-accountBalance;
    			   System.out.println(bal);
    		   }
    	   }
       }
		return 0;
	}

	@Override
	public double deposit(long accountId, double accountBalance) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getBalance(long accountId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean fundTransfer(long fromAccount, long toAccount, double amont) {
		// TODO Auto-generated method stub
		return false;
	}
	
public static void main(String[] args) {
	BankAccountServiceImpl accountServiceImpl=new BankAccountServiceImpl();
	accountServiceImpl.withdraw(2, 5000);
}
}
