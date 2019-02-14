package com.simer.spring3;

import java.util.ArrayList;

public class UserDAO {

	ArrayList<BankAccount> list=new ArrayList<BankAccount>();
	
	public ArrayList<BankAccount> UserDAO(){
	list.add(new BankAccount(1,"Simer","savings",25000));
	list.add(new BankAccount(2,"Akshay","savings",20000));
	list.add(new BankAccount(3,"Ayush","current",21000));
	list.add(new BankAccount(4,"Don","savings",5000));
	
	return list;
	}
	
	public static void main(String[] args) {
		
		
		
	}
}
