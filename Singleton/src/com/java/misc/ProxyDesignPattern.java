package com.java.misc;

import java.util.ArrayList;
import java.util.List;

interface Internet {
	
	public void connectTo(String url) throws Exception;
	
}

class RealInternet implements Internet {

	@Override
	public void connectTo(String url) {
		System.out.println("Connecting to " +url);
		
	}
	
}

class ProxyInternet implements Internet {
	
	private Internet internet= new RealInternet();
	private static List<String> bannedSites = new ArrayList<String>();
	
	static {
		bannedSites.add("abc.com");
		bannedSites.add("xyz.com");
		bannedSites.add("def.com");
		bannedSites.add("google.com");
	}

	@Override
	public void connectTo(String url) throws Exception {
		if(bannedSites.contains(url.toLowerCase())) {
			throw new Exception("Access denied");
		}
		
		internet.connectTo(url);	
	}
	
}

public class ProxyDesignPattern {

	public static void main(String[] args) {
		Internet internet = new ProxyInternet();
		try {
			internet.connectTo("karunesh.com");
			internet.connectTo("abc.com");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
