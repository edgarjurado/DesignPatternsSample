package com.perficient.samples.patterns.services;

import com.perficient.samples.patterns.configuration.Companies;
import com.perficient.samples.patterns.providers.IProvider;
import com.perficient.samples.patterns.providers.PromotionalProvider;
import com.perficient.samples.patterns.providers.Provider;
import com.perficient.samples.patterns.providers.RegisteredClientProvider;

public class TopUpService implements ITopupService {

	IProvider provider;
	int code=-1;
	int clientId=-1;
	
	
	@Override
	public IProvider getProvider() {
		return provider;
	}

	@Override
	public int getCode() {
		return code;
	}
	@Override
	public void setCode(int code) {
		this.code = code;
	}
	@Override
	public int getClientId() {
		return clientId;
	}
	@Override
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	private void recordRequest() {
		System.out.println("Topup requested for " + provider.getCompanyName());
	}
	
	@Override
	public boolean recharge(String cellNumber, float amount, String company) {
		
		provider=getProvider(company);

		recordRequest();
		float amountBilled=provider.recharge(cellNumber, amount);
		return amountBilled>-1;
	}
	
	private IProvider getProvider(String company) {
		IProvider provider=new Provider(Companies.getProvider(company));
		if (code>-1) {
			provider=new PromotionalProvider(provider, code);
		}
		
		if (clientId>-1) {
			provider=new RegisteredClientProvider(provider, clientId);
			
		}
		return provider;
	}
		
}
