package com.perficient.samples.patterns.providers;

import com.perficient.samples.patterns.services.ClientService;
import com.perficient.samples.patterns.services.IClientService;

public class RegisteredClientProvider extends Provider {

	private int clientId;
	IClientService clientService;
	private float credit;
	IProvider provider;
	
	public RegisteredClientProvider(IProvider provider, int clientId) {
		super(provider.getRecharge());
		this.provider=provider;
		this.clientId=clientId;
		clientService=new ClientService(clientId);
	}
	
	@Override
	public float recharge(String cellNumber, float amount) {
//		credit=clientService.getCredit();
//		System.out.println("Credit  for code: " + credit + " for " + credit + " of free credit");
//		System.out.println("recharge billed to client: " + (amount-credit));
		credit=clientService.getCredit();
		float amountToPay= provider.recharge(cellNumber, amount);
		if (credit>0) {
			System.out.println("Getting " + credit + "  of credit from user " + clientId);
		}
		System.out.println("Total payment: " + (amountToPay-credit));
		return (amountToPay-credit);
	}

}
