package com.perficient.samples.patterns.services;

import com.perficient.samples.patterns.providers.IProvider;

public interface ITopupService {

	IProvider getProvider();

	boolean recharge(String cellNumber, float amount, String company);

	void setClientId(int clientId);

	int getClientId();

	void setCode(int code);

	int getCode();

//	boolean promotionalRecharge(String cellNumber, String company, float amount);

}