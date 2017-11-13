package com.revature.acs.login.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.acs.login.domain.AcsUser;

@Repository
public interface LoginDao extends CrudRepository<AcsUser, String> {
	public AcsUser getAcsUserByUsername(String username);
}
