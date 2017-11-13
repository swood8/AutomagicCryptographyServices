package com.revature.acs.portal.dtos;

import java.io.Serializable;
import java.util.List;

import com.revature.acs.portal.model.AcsMessage;

public class AcsUserAndMessages implements Serializable
{

	private static final long serialVersionUID = -4849178409596477093L;
	private int acsUserId;
	private String fn;
	private String ln;
	private String acsUsername;
	private List<AcsMessage> messages;
	
	public AcsUserAndMessages()
	{
		
	}

	public AcsUserAndMessages(int acsUserId, String fn, String ln, String acsUsername, List<AcsMessage> messages) 
	{
		super();
		this.acsUserId = acsUserId;
		this.fn = fn;
		this.ln = ln;
		this.acsUsername = acsUsername;
		this.messages = messages;
	}

	public int getAcsUserId() 
	{
		return acsUserId;
	}

	public void setAcsUserId(int acsUserId) 
	{
		this.acsUserId = acsUserId;
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

	public String getAcsUsername() 
	{
		return acsUsername;
	}

	public void setAcsUsername(String acsUsername) 
	{
		this.acsUsername = acsUsername;
	}

	public List<AcsMessage> getMessages() 
	{
		return messages;
	}

	public void setMessages(List<AcsMessage> messages) 
	{
		this.messages = messages;
	}

	public static long getSerialversionuid() 
	{
		return serialVersionUID;
	}

	@Override
	public String toString() 
	{
		return "AcsUserAndMessages [acsUserId=" + acsUserId + ", fn=" + fn + ", ln=" + ln + ", acsUsername="
				+ acsUsername + ", messages=" + messages + "]";
	}
	
	
	
	
	
}
