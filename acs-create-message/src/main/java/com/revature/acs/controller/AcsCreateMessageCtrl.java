package com.revature.acs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.acs.domain.AcsMessage;
import com.revature.acs.service.AcsMessageService;

@RestController
public class AcsCreateMessageCtrl {
	
	@Autowired
	AcsMessageService service;
	
	
	//should be a POST
	//a AcsMessage should be passed
	//everything should be filled
	@GetMapping("/create")
	public void createMessage(AcsMessage acs) {
		//TEST
		AcsMessage message = new AcsMessage();
		message.setMessage("test");
		service.createMessage(message, "nothing right now");
	}
	
}
