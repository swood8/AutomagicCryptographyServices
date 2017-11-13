package com.revature.acs.login.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.acs.login.dao.LoginDao;
import com.revature.acs.login.domain.AcsUser;

@Component
@Transactional
public class LoginService {
	@Autowired
	private LoginDao dao;
	
	public AcsUser getUserByUsername(AcsUser partial) {
		AcsUser acsu = dao.getAcsUserByUsername(partial.getUsername());
		if (acsu != null && acsu.getUsername().equals(partial.getUsername()) &&
				acsu.getPassword().equals(partial.getPassword())) {
			return acsu;
		}
		return null;
	}
}
