package com.in28minutes.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class WelcomeService {
	
	@Value("${welcome.message}")
	private String welcomeMessage;
	
	public String getMessage(){
		return "WelcomeService  Rest Controller";
	}
	
	public String getConfigMessage(){
		return welcomeMessage;
	}
}

