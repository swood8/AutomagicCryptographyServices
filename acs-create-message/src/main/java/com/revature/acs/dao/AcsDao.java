package com.revature.acs.dao;

import com.revature.acs.domain.AcsMessage;
import com.revature.acs.domain.AcsUser;

public interface AcsDao {
	public AcsMessage createMessage(AcsMessage message);
	
	public AcsUser getAcsUserByUsername(AcsUser user);
}
