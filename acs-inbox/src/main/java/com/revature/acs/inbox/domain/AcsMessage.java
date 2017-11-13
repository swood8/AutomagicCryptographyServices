package com.revature.acs.inbox.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ACS_MESSAGE")
public class AcsMessage {
	@Id
	@Column(name="ACSM_ID")
	private Integer id;
	
	@OneToOne
	@JoinColumn(name="ACSM_SENDER")
	private AcsUser sender;
	
	@OneToOne
	@JoinColumn(name="ACSM_RECEIVER")
	private AcsUser receiver;
	
	@Column(name="ACSM_MESSAGE")
	private String message;
	
	//sent/received timestamps
	@Column(name="ACSM_SENT")
	private Date timeSent;
	
	@Column(name="ACSM_RECEIVED")
	private Date timeReceived;
	
	public AcsMessage() {
		this.id = 0;
		this.sender = new AcsUser();
		this.receiver = new AcsUser();
		this.message = "";
		this.timeSent = new Date();
		this.timeReceived = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AcsUser getSender() {
		return sender;
	}

	public void setSender(AcsUser sender) {
		this.sender = sender;
	}

	public AcsUser getReceiver() {
		return receiver;
	}

	public void setReceiver(AcsUser receiver) {
		this.receiver = receiver;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getTimeSent() {
		return timeSent;
	}

	public void setTimeSent(Date timeSent) {
		this.timeSent = timeSent;
	}

	public Date getTimeReceived() {
		return timeReceived;
	}

	public void setTimeReceived(Date timeReceived) {
		this.timeReceived = timeReceived;
	}

	@Override
	public String toString() {
		return "AcsMessage [id=" + id + ", sender=" + sender.getId() + ", receiver=" + receiver.getId() + ", message=" + message
				+ ", timeSent=" + timeSent + ", timeReceived=" + timeReceived + "]";
	}
	
}
