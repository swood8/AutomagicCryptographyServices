package com.revature.acs.portal.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.acs.portal.dao.AcsDao;
import com.revature.acs.portal.model.AcsMessage;
import com.revature.acs.portal.model.AcsUser;

@Component("AcsServices")
@Transactional
public class AcsServices 
{
	@Autowired
	private AcsDao dao;
	
	public AcsUser getUserByUsername(String u_name,String p_word)
	{
		AcsUser user = new AcsUser();
		user.setUsername(u_name);

		user = dao.getAcsUserByUsername(user);

		if(user.getPassword().equals(p_word))
		{
			return user;
		}
		else
			return null;
	}
	public List<AcsMessage> getMessagesByAcsUser(AcsUser user)
	{
		ArrayList<AcsMessage> list = new ArrayList<>();

		list = (ArrayList<AcsMessage>) dao.getMessagesByAcsUser(user);
		

		if(list != null)
		{
			return list;
		}
		else
			return null;
	}
}
