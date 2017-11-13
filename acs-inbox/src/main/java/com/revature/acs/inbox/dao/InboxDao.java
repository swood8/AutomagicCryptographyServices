package com.revature.acs.inbox.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.acs.inbox.domain.AcsMessage;

@Repository
public interface InboxDao extends CrudRepository<AcsMessage, Integer> {
	public AcsMessage[] getByReceiver(Integer receiverId);
}
