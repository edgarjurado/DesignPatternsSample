package com.perficient.wrong.samples;

import java.util.HashMap;
import java.util.Map;

public class WrongServiceEuropeanCell {

	public boolean recharge(String cellNumber, float amount) {
		boolean result=false;
		boolean payment=false;
		
		Map<String, String> properties=new HashMap<String, String>();
		properties.put("host","127.0.0.2");
		properties.put("user","OzzyOsborne");
		properties.put("password","1@mTh31r0nm4n");
		
		System.out.println("Connecting to European Cell at " + properties.get("host") + "services...");
		System.out.println("Connecting as: " + properties.get("user"));
		System.out.println("Connection established to European Cell");
		
		System.out.println("Payment received by European Cell");
		payment = true;
		
		if (payment) {
			System.out.println("Adding " + amount + " of European Cell credit to " + cellNumber);
		}
		result = true;

		return result;
	}

//	//European Cell
//	//--------------------------------------------------------------------------------
//	private boolean rechargeEuropeanCell(String cellNumber, float amount) {
//		boolean result=false;
//		if(recordPaymentEuropeanCell(amount, cellNumber)) {
//			System.out.println("Adding " + amount + " of European Cell credit to " + cellNumber);
//			result=true;
//		}
//		return result;
//	}
//
//	private boolean recordPaymentEuropeanCell(float amount, String cellNumber) {
//		connectToEuropeanCellService();
//		System.out.println("Payment received by European Cell");
//		return true;
//	}
//
//	private void connectToEuropeanCellService() {
//		Map<String, String> properties=getConnectionPropertiesEuropeanCell();
//		System.out.println("Connecting to European Cell at " + properties.get("host") +"services...");
//		System.out.println("Connecting as: " + properties.get("user"));
//		System.out.println("Connection established to European Cell");
//		
//	}
//
//	private Map<String, String> getConnectionPropertiesEuropeanCell() {
//		Map<String, String> properties=new HashMap<String, String>();
//		properties.put("host","127.0.0.2");
//		properties.put("user","OzzyOsborne");
//		properties.put("password","1@mTh31r0nm4n");
//		return properties;
//	}
}
