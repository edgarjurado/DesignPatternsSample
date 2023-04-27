package com.perficient.samples.patterns.services;

import com.perficient.samples.patterns.providers.IProvider;

public interface ITopupService {

	IProvider getProvider();

	boolean recharge(String cellNumber, float amount, String company);

	boolean promotionalRecharge(String cellNumber, int code, String company);

}