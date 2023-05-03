package com.perficient.samples.patterns.services;

public class ClientService implements IClientService {

	int clientId;
	
	public ClientService(int clientId) {
		this.clientId=clientId;
	}
	
	@Override
	public float getCredit() {
		//Logs in the client
		logIn();
		//Gets the points the user has in his account
		float points=200;
		//calculates the equivalent of points to currency
		float credit=points/10;
		System.out.println("Client with id " + clientId + " has " + points + " of balance in account");
		System.out.println("This is equivalent to " + credit + " pesos");
		return credit;
	}



	@Override
	public void logIn() {
		System.out.println("Client with id " + clientId + " logged in...");
		
	}

}
