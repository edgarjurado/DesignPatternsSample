package com.perficient.samples.patterns.providers;

public class MexicanCellRecharge implements IProviderRecharge {

	private String companyName="Mexican Cell";

	public MexicanCellRecharge() {
	}
	
	@Override
	public boolean recharge(String cellNumber, float amount) {
		System.out.println("Adding " + amount + " of " + companyName + " credit to " + cellNumber);
		return true;
	}

	@Override
	public boolean recordPayment(float amount, String cellNumber) {
		System.out.println("Payment received by " + companyName);
		return true;
	}
	
	@Override
	public String getCompanyName() {
		return companyName;
	}

}
