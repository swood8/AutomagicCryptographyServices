package com.revature.acs.inbox.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.acs.inbox.dao.InboxDao;
import com.revature.acs.inbox.domain.AcsMessage;
import com.revature.acs.inbox.domain.AcsUser;

@Component
@Transactional
public class InboxService {
	@Autowired
	private InboxDao dao;
	
	public AcsMessage[] getMessages(AcsUser acsu) {
		return dao.getByReceiver(acsu.getId());
	}

}
