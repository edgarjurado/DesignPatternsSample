package com.perficient.samples.patterns.providers;

public class EuropeanCellRecharge implements IProviderRecharge {

	private String companyName="European Cell";

	public EuropeanCellRecharge() {
	}
	
	@Override
	public float recharge(String cellNumber, float amount) {
		System.out.println("Adding " + amount + " of " + companyName + " credit to " + cellNumber);
		return amount;
	}

	@Override
	public float recordPayment(float amount, String cellNumber) {
		System.out.println("Payment received by " + companyName);
		return amount;
	}
	
	@Override
	public String getCompanyName() {
		return companyName;
	}

}
