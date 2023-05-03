package com.perficient.samples.patterns.providers;

public interface IProvider {

	String getCompanyName();

	String getOtherProperties();

	void setOtherProperties(String otherProperties);

	float recharge(String cellNumber, float amount);

	IProviderRecharge getRecharge();

	void setRecharge(IProviderRecharge recharge);

	float recordPayment(float amount, String cellNumber);

}