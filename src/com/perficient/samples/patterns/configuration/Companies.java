package com.perficient.samples.patterns.configuration;

import java.util.HashMap;
import java.util.Map;

import com.perficient.samples.patterns.providers.AmericanCellRecharge;
import com.perficient.samples.patterns.providers.EuropeanCellRecharge;
import com.perficient.samples.patterns.providers.IProviderRecharge;
import com.perficient.samples.patterns.providers.MexicanCellRecharge;

public final class Companies {
	
	public static Map<String,IProviderRecharge> companies;
	
	public static IProviderRecharge getProvider(String company) {
		if (companies==null) {
			loadMap();
		}
		return companies.get(company);
	}

	private static void loadMap() {
		
		companies=new HashMap <String, IProviderRecharge>();
		companies.put("European Cell", new EuropeanCellRecharge());
		companies.put("American Cell", new AmericanCellRecharge());
		companies.put("Mexican Cell", new MexicanCellRecharge());
	}

}
