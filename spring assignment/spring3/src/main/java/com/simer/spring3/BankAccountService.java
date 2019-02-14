package com.simer.spring3;

public interface BankAccountService {

	public double withdraw(long accountId, double accountBalance);
	public double deposit(long accountId, double accountBalance);
	public double getBalance(long accountId);
	public boolean fundTransfer(long fromAccount, long toAccount, double amont);
}
