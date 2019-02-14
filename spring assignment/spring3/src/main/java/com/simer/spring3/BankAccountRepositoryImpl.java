package com.simer.spring3;

import java.util.ArrayList;

public class BankAccountRepositoryImpl implements BankAccountRepository{

	
	ArrayList<BankAccount> tempList=null;
	UserDAO dao=new UserDAO();
	
	@Override
	public double getBalance(long accountId) {
		tempList=dao.UserDAO();
		for(BankAccount user:tempList)
		{
	     		if(accountId==user.getAccountId())
	     		{
	     			//System.out.println(user.getAccountBalance());
	     			return user.getAccountBalance();
	     		}
		}
		return 0;
	}
	
	@Override
	public double updateBalance(long accountId, double accountBalance) {
	
		tempList=dao.UserDAO();
		double updateBal=0;
		for(BankAccount user: tempList)
		{
			if(accountId==user.getAccountId())
			{
				
				updateBal=user.getAccountBalance()+accountBalance;
				//System.out.println(updateBal);
				
			}
		}
		
		return updateBal;
	}
public static void main(String[] args) {
	BankAccountRepositoryImpl accountRepositoryImpl=new BankAccountRepositoryImpl();
	System.out.println(accountRepositoryImpl.getBalance(2));
	System.out.println(accountRepositoryImpl.updateBalance(1, 5000));
}
}
