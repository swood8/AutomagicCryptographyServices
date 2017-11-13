package com.revature.acs.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.acs.dao.AcsDao;
import com.revature.acs.domain.AcsMessage;
import com.revature.acs.domain.AcsUser;

@Component("AcsMessageService")
@Transactional
public class AcsMessageService {
	
	@Autowired
	private AcsDao dao;
	
	
	public AcsMessage createMessage(AcsMessage message) {
		return dao.createMessage(message);
	}
}
