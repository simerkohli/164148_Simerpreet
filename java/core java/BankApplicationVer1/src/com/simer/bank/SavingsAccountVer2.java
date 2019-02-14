package com.simer.bank;

public class SavingsAccountVer2 extends SavingsAccount implements Insurance{

	@Override
	public String getInsuranceName() {
		// TODO Auto-generated method stub
		return "Jivan Bima";
	}

	@Override
	public double getInsuranceamount() {
		// TODO Auto-generated method stub
		return 5_00_000;
	}

}
