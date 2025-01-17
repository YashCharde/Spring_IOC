package com.jbk;

import org.springframework.stereotype.Component;

@Component("Jio")
public class Jio implements Sim {

	@Override
	public String Calling() {
		
		return "you are calling from Jio";
	}

	
}
