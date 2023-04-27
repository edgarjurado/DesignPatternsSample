package com.perficient.samples.patterns.providers;

public interface IProviderRecharge {

	boolean recharge(String cellNumber, float amount);

	boolean recordPayment(float amount, String cellNumber);
	
	String getCompanyName();

}