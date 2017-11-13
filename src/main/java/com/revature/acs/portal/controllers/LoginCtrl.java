package com.revature.acs.portal.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.revature.acs.portal.dtos.AcsUserAndMessages;
import com.revature.acs.portal.model.AcsMessage;
import com.revature.acs.portal.model.AcsUser;
import com.revature.acs.portal.service.AcsServices;

@RestController
public class LoginCtrl 
{
	@Autowired
	private AcsServices service;
	
//	@GetMapping("/")
//	public ModelAndView loadLoginPage(HttpServletRequest req)
//	{
//		HttpSession session = req.getSession(false);
//		if (session != null) {
//			AcsUser acsu = (AcsUser) session.getAttribute("user");
//			if (acsu != null) {
//				return new ModelAndView("home.html");
//			}
//		}
//		return new ModelAndView("login.html");
//	}
//	
//	@PostMapping("/loginCtrl")
//	public AcsUserAndMessages loginAcsUser(String u_name, String p_word)
//	{
//		//This is the DTO which contains both the user information and the messages for that user
//		AcsUserAndMessages spy = new AcsUserAndMessages();
//		
//		//These are necessary for retrieving the user information and messages from the database
//		AcsUser user = new AcsUser();
//		
//		//This ArrayList will hold the messages
//		ArrayList<AcsMessage> spyMessages = new ArrayList<AcsMessage>();
//		
//		//Populate the user object
//		user = service.getUserByUsername(u_name, p_word);
//
//
//		if(user != null)
//		{
//			//Populate the list of messages
//			spyMessages = (ArrayList<AcsMessage>) service.getMessagesByAcsUser(user);
//
//			//Now populate the DTO
//			spy.setAcsUserId(user.getId());
//			spy.setAcsUsername(user.getUsername());
//			spy.setFn(user.getFn());
//			spy.setLn(user.getLn());
//			spy.setMessages(spyMessages);
//			
//			//And return the DTO
//			return spy;
//		}
//		else
//		{
//			return null;
//		}
//		
//	}

}
