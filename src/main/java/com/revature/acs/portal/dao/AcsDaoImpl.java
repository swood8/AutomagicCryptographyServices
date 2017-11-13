package com.revature.acs.portal.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.acs.portal.model.AcsMessage;
import com.revature.acs.portal.model.AcsUser;

@Repository
@Transactional
public class AcsDaoImpl implements AcsDao
{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public AcsMessage createMessage(AcsMessage message) 
	{
		Session session = sessionFactory.getCurrentSession();
		session.save(message);
		return message;
	}

	@Override
	public AcsUser getAcsUserByUsername(AcsUser user) 
	{
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(AcsUser.class);
		
		return (AcsUser) criteria.add(Restrictions.eq("username", user.getUsername())).uniqueResult();
	}

	@Override
	public List<AcsMessage> getMessagesByAcsUser(AcsUser user) 
	{
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(AcsMessage.class);


		return (ArrayList<AcsMessage>) criteria.add(Restrictions.eq("receiver.id",user.getId())).list();
	}

}
