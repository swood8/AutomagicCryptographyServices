package com.revature.acs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.revature.acs.domain.AcsMessage;
import com.revature.acs.service.AcsMessageService;

@RestController
public class AcsCreateMessageCtrl {
	
	@Autowired
	AcsMessageService service;
	
	@GetMapping("/create")
	public String pageView() {
		return "TEST";
//		return new ModelAndView("/acsCreate.html");
	}
	
	@PostMapping("/create")
	public void createMessage() {
		//TEST
		AcsMessage message = new AcsMessage();
		message.setMessage("test");
		service.createMessage(message, "nothing right now");
	}
}
