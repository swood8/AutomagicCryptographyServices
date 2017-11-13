package com.revature.acs.portal.dao;

import java.util.List;

import com.revature.acs.portal.model.*;

public interface AcsDao 
{
	public AcsMessage createMessage(AcsMessage message);
	public AcsUser getAcsUserByUsername(AcsUser user);
	public List<AcsMessage> getMessagesByAcsUser(AcsUser user);
}
