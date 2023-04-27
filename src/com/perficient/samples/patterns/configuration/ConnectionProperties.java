package com.perficient.samples.patterns.configuration;

import java.util.HashMap;
import java.util.Map;

public final class ConnectionProperties {

public static Map<String,Map<String, String>> connectionProperties;
	
	public static Map<String, String> getProperties(String company) {
		if (connectionProperties==null) {
			loadMap();
		}
		return connectionProperties.get(company);
	}

	private static void loadMap() {
		
		connectionProperties=new HashMap <String, Map<String, String>>();
		connectionProperties.put("European Cell", getEuropeanCellProperties());
		connectionProperties.put("American Cell", getAmericanCellProperties());
		connectionProperties.put("Mexican Cell", getMexicanCellProperties());
	}
	
	public static Map<String, String> getAmericanCellProperties() {
		Map<String, String> properties=new HashMap<String, String>();
		properties.put("host","127.0.0.1");
		properties.put("user","PeterParker");
		properties.put("password","1@m$p1d3rm4n");
		return properties;
	}
	
	protected static Map<String, String> getEuropeanCellProperties() {
		Map<String, String> properties=new HashMap<String, String>();
		properties.put("host","127.0.0.2");
		properties.put("user","OzzyOsborne");
		properties.put("password","1@mTh31r0nm4n");
		return properties;
	}
	
	protected static Map<String, String> getMexicanCellProperties() {
		Map<String, String> properties=new HashMap<String, String>();
		properties.put("host","127.0.0.2");
		properties.put("user","3lS4nt0");
		properties.put("password","1@mTh31r0nm4n");
		return properties;
	}
}
