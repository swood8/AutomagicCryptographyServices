package com.revature.acs.dao;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.acs.domain.AcsMessage;
import com.revature.acs.domain.AcsUser;

@Repository
@Transactional
public class AcsDaoImpl implements AcsDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public AcsMessage createMessage(AcsMessage message) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(message);
		return message;
	}

	@Override
	public AcsUser getAcsUserByUsername(AcsUser user) {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(AcsUser.class);
		
		return (AcsUser) criteria.add(Restrictions.eq("username", user.getUsername())).uniqueResult();
	}
	
	
}
