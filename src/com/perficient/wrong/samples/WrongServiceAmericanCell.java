package com.perficient.wrong.samples;

import java.util.HashMap;
import java.util.Map;

public class WrongServiceAmericanCell {

	public boolean recharge(String cellNumber, float amount) {
		boolean result=false;
		boolean payment=false;
		//get connection properties
		Map<String, String> properties=new HashMap<String, String>();
		properties.put("host","127.0.0.1");
		properties.put("user","PeterParker");
		properties.put("password","1@m$p1d3rm4n");
		//connect to provider
		System.out.println("Connecting to American Cell at " + properties.get("host") + "services...");
		System.out.println("Connecting as: " + properties.get("user"));
		System.out.println("Connection established to American Cell");
		// Payment process
		System.out.println("Payment received by American Cell");
		payment = true;
		// amount from provider
		if (payment) {
			System.out.println("Adding " + amount + " of European Cell credit to " + cellNumber);
		}
		result = true;

		return result;
	}

//	American Cell
//	--------------------------------------------------------------------------------
//	private boolean rechargeAmericanCell(String cellNumber, float amount) {
//		boolean result=false;
//		if(recordPaymentAmericanCell(amount, cellNumber)) {
//			System.out.println("Adding " + amount + " of American Cell credit to " + cellNumber);
//			result=true;
//		}
//		return result;
//	}
//	
//	private boolean recordPaymentAmericanCell(float amount, String cellNumber) {
//		connectToAmericanCellService();
//		System.out.println("Payment received by American Cell");
//		return true;
//	}
//
//	private void connectToAmericanCellService() {
//		Map<String, String> properties=getConnectionPropertiesAmericanCell();
//		System.out.println("Connecting to American Cell at " + properties.get("host") +"services...");
//		System.out.println("Connecting as: " + properties.get("user"));
//		System.out.println("Connection established to American Cell");
//		
//	}

//	private Map<String, String> getConnectionPropertiesAmericanCell() {
//		Map<String, String> properties=new HashMap<String, String>();
//		properties.put("host","127.0.0.2");
//		properties.put("user","OzzyOsborne");
//		properties.put("password","1@mTh31r0nm4n");
//		return properties;
//	}

}
