package com.revature.acs.portal.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ACS_USER")
public class AcsUser implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 557879872042566402L;

	@Id
	@Column(name="ACSU_ID")
	private int id;
	
	@Column(name="ACSU_FN")
	private String fn;
	
	@Column(name="ACSU_LN")
	private String ln;
	
	@Column(name="ACSU_USERNAME")
	private String username;
	
	@Column(name="ACSU_PASSWORD")
	private String password;
	
//	@OneToMany(mappedBy="ACS_USER", fetch = FetchType.EAGER)
//	private Set<AcsMessage> inbox;
	
//	public Set<AcsMessage> getInbox() 
//	{
//		return inbox;
//	}
//
//	public void setInbox(Set<AcsMessage> inbox) 
//	{
//		this.inbox = inbox;
//	}


	public AcsUser() 
	{ 
		
	}
	

	public AcsUser(int id, String fn, String ln, String username, String password)
	{
		super();
		this.id = id;
		this.fn = fn;
		this.ln = ln;
		this.username = username;
		this.password = password;
	}


	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getFn() 
	{
		return fn;
	}

	public void setFn(String fn) 
	{
		this.fn = fn;
	}

	public String getLn() 
	{
		return ln;
	}

	public void setLn(String ln) 
	{
		this.ln = ln;
	}

	public String getUsername() 
	{
		return username;
	}

	public void setUsername(String username) 
	{
		this.username = username;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}

	public static long getSerialversionuid() 
	{
		return serialVersionUID;
	}

	@Override
	public String toString() 
	{
		return "AcsUser [id=" + id + ", fn=" + fn + ", ln=" + ln + ", username=" + username + ", password=" + password
				+ "]";
	}


	
}
