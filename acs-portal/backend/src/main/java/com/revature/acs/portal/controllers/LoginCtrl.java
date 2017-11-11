package com.revature.acs.portal.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginCtrl 
{
	@GetMapping("/home")
	public ModelAndView loadLoginPage()
	{
		return new ModelAndView("login.html");
	}
//	@PostMapping("/loginCtrl")
//	public 
}
