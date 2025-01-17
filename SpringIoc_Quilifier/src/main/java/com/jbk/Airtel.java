package com.jbk;

import org.springframework.stereotype.Component;

@Component("Airtel")
public class Airtel implements Sim{

	@Override
	public String Calling() {
		
		return "you are calling from Airtel";
	}

	
}
