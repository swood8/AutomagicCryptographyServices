package com.revature.acs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.acs.domain.AcsMessage;
import com.revature.acs.service.AcsMessageService;

@RestController
public class AcsCreateMessageCtrl {
	
	@Autowired
	AcsMessageService service;
	
	//should be a POST
	//a AcsMessage should be passed
	//everything should be filled but time_received
	@PostMapping("/create")	
	public void createMessage(@RequestBody AcsMessage msg) {
		service.createMessage(msg);
	}
}
