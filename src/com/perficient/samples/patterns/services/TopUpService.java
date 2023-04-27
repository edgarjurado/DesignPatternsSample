package com.perficient.samples.patterns.services;

import com.perficient.samples.patterns.configuration.Companies;
import com.perficient.samples.patterns.providers.IProvider;
import com.perficient.samples.patterns.providers.PromotionalProvider;
import com.perficient.samples.patterns.providers.Provider;

public class TopUpService implements ITopupService {

	IProvider provider;
	
	@Override
	public IProvider getProvider() {
		return provider;
	}

	private void recordRequest() {
		System.out.println("Topup requested for " + provider.getCompanyName());
	}
	
	@Override
	public boolean recharge(String cellNumber, float amount, String company) {
		provider=new Provider(Companies.getProvider(company));
		recordRequest();
		return provider.recharge(cellNumber, amount);
	}
	
	@Override
	public boolean promotionalRecharge(String cellNumber, int code,  String company) {
		
		provider=new PromotionalProvider(Companies.getProvider(company), code);
		recordRequest();
		return provider.recharge(cellNumber, 0);
	}
}
