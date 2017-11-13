package com.revature.acs.inbox.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.acs.inbox.domain.AcsMessage;
import com.revature.acs.inbox.domain.AcsUser;
import com.revature.acs.inbox.service.InboxService;

@CrossOrigin(origins = "http://localhost:8085")
@RestController
public class InboxCtrl {
	@Autowired
	private InboxService service;

	@PostMapping("/get")
	public ResponseEntity<AcsMessage[]> getMessages(@RequestBody AcsUser acsu, HttpServletRequest req) {
		AcsMessage[] messages = service.getMessages(acsu);
		return new ResponseEntity<>(messages, HttpStatus.OK);
	}

}
