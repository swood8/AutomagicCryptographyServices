package com.revature.acs.portal.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ACS_MESSAGE")
public class AcsMessage implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -198654618655097975L;

	public static long getSerialversionuid() 
	{
		return serialVersionUID;
	}

	@Id
	@Column(name="ACSM_ID")
	private int acsmId;
	
	@OneToOne
	@JoinColumn(name="ACSM_SENDER")
	private AcsUser sender;
	
	@OneToOne
	@JoinColumn(name="ACSM_RECEIVER")
	private AcsUser receiver;
	
	@Column(name="ACSM_MESSAGE")
	private String message;
	
	@Column(name="ACSM_SENT")
	private Date timeSent;
	
	@Column(name="ACSM_RECEIVED")
	private Date timeReceived;
	
	public AcsMessage()
	{
		
	}

	public AcsMessage(int acsmId, AcsUser sender, AcsUser receiver, String message, Date timeSent, Date timeReceived) 
	{
		super();
		this.acsmId = acsmId;
		this.sender = sender;
		this.receiver = receiver;
		this.message = message;
		this.timeSent = timeSent;
		this.timeReceived = timeReceived;
	}

	public int getAcsmId() 
	{
		return acsmId;
	}

	public void setAcsmId(int acsmId) 
	{
		this.acsmId = acsmId;
	}

	public String getMessage() 
	{
		return message;
	}

	public void setMessage(String message) 
	{
		this.message = message;
	}

	public Date getTimeSent() 
	{
		return timeSent;
	}

	public void setTimeSent(Date timeSent) 
	{
		this.timeSent = timeSent;
	}

	public Date getTimeReceived() 
	{
		return timeReceived;
	}

	public void setTimeReceived(Date timeReceived) 
	{
		this.timeReceived = timeReceived;
	}

	public AcsUser getSender()
	{
		return sender;
	}

	public void setSender(AcsUser sender) 
	{
		this.sender = sender;
	}

	public AcsUser getReceiver()
	{
		return receiver;
	}

	public void setReceiver(AcsUser receiver) 
	{
		this.receiver = receiver;
	}

	@Override
	public String toString() 
	{
		return "AcsMessage [acsmId=" + acsmId + ", sender=" + sender + ", receiver=" + receiver + ", message=" + message
				+ ", timeSent=" + timeSent + ", timeReceived=" + timeReceived + "]";
	}
	
	
	
	
	
}
