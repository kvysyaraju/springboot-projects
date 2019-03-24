package com.in28minutes.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.model.BasicConfiguration;
import com.in28minutes.service.WelcomeService;

@RestController
public class WelcomeRestController {
	
	@Autowired
	private WelcomeService ws;
	
	@Autowired
	private BasicConfiguration config;
	
	@RequestMapping("/welcome")
	public String welcome(){
		return ws.getMessage();
	}
	
	@RequestMapping("/config")
	public String getConfigMessage(){
		return ws.getConfigMessage();
	}
	
	
	@RequestMapping("/basicconfig")
	public String getBasicConfigDetails(){
		return config.isValue()+ " " + config.getMessage()+ " "
				+config.getNumber();
				
	}
	
}

