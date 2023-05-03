package com.perficient.samples.patterns.providers;

public interface IProviderRecharge {

	float recharge(String cellNumber, float amount);

	float recordPayment(float amount, String cellNumber);
	
	String getCompanyName();

}