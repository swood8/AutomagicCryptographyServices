package com.revature.acs.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.acs.dao.AcsDao;
import com.revature.acs.domain.AcsMessage;

@Component("AcsMessageService")
@Transactional
public class AcsMessageService {
	
	@Autowired
	private AcsDao dao;
	
	public AcsMessage createMessage(AcsMessage message, String keyword) {
		//take message in AcsMessage, currently not encoded
		//use keyword to encode it
		//set it to current message
		//create message with encoded message
		return dao.createMessage(message);
	}
}
