package com.revature.acs.login.controller;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.acs.login.domain.AcsUser;
import com.revature.acs.login.service.LoginService;

@CrossOrigin(origins = "http://localhost:8085")
@RestController
public class LoginCtrl {
	@Autowired
	private LoginService service;
	
	@GetMapping("/isLoggedIn")
	public ResponseEntity<AcsUser> loadLoginPage(HttpServletRequest req) {
		HttpSession session = req.getSession(false);
		if (session != null) {
			AcsUser acsu = (AcsUser) session.getAttribute("user");
			if (acsu != null) {
				System.out.println("Definitely have a cookie yo");
				return new ResponseEntity<>(acsu, HttpStatus.OK);
			}
		}

		System.out.println("Where is my cookie?!");
		return new ResponseEntity<>(new AcsUser(), HttpStatus.OK);
	}
	
	@PostMapping("/loginUser")
	public ResponseEntity<AcsUser> loginAcsUser(@RequestBody AcsUser partial, HttpServletRequest req) {
		AcsUser acsu = service.getUserByUsername(partial);
		if (acsu != null) {
			HttpSession session = req.getSession(true);
			session.setAttribute("user", acsu);
			System.out.println((AcsUser) session.getAttribute("user"));
			return new ResponseEntity<>(acsu, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.CONFLICT);
	}
}
