package com.revature.acs.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.acs.domain.AcsMessage;

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
	
}
