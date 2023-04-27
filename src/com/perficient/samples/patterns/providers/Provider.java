package com.perficient.samples.patterns.providers;

import java.util.Map;

import com.perficient.samples.patterns.configuration.ConnectionProperties;

public class Provider implements IProvider {
	
	protected String companyName;
	protected String otherProperties;
	protected IProviderRecharge recharge;
	
	public Provider(IProviderRecharge recharge) {
		this.recharge = recharge;
		companyName=recharge.getCompanyName();
	}
	
	@Override
	public String getOtherProperties() {
		return otherProperties;
	}

	@Override
	public void setOtherProperties(String otherProperties) {
		this.otherProperties = otherProperties;
	}
	
	protected boolean recordPayment(float amount, String cellNumber) {
		connectToProviderService();
		return recharge.recordPayment(amount, cellNumber);
	}
	
	protected void connectToProviderService() {
		Map<String, String> properties=ConnectionProperties.getProperties(companyName);
		System.out.println("Connecting to " + companyName + " at " + properties.get("host") +" services...");
		System.out.println("Connecting as: " + properties.get("user"));
		System.out.println("Connection established to " + companyName);
	}
	
	@Override
	public boolean recharge(String cellNumber, float amount) {
		boolean result=false;
		if (recordPayment(amount, cellNumber)) {
			result=recharge.recharge(cellNumber, amount);
		}
		return result;
	}

	@Override
	public String getCompanyName() {
		return companyName;
	}
	
	
}
