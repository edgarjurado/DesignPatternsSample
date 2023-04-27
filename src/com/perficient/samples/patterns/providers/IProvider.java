package com.perficient.samples.patterns.providers;

public interface IProvider {

	String getCompanyName();

	String getOtherProperties();

	void setOtherProperties(String otherProperties);

	boolean recharge(String cellNumber, float amount);

}