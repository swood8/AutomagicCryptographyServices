package com.revature.acs.domain;

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
	private int id;
	
	@OneToOne
	@JoinColumn(name="ACSM_SENDER")
	private AcsUser Sender;
	
	@OneToOne
	@JoinColumn(name="ACSM_RECEIVER")
	private AcsUser Receiver;
	
	@Column(name="ACSM_MESSAGE")
	private String message;
	
	public AcsMessage() { }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AcsUser getSender() {
		return Sender;
	}

	public void setSender(AcsUser sender) {
		Sender = sender;
	}

	public AcsUser getReceiver() {
		return Receiver;
	}

	public void setReceiver(AcsUser receiver) {
		Receiver = receiver;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "AcsMessage [id=" + id + ", Sender=" + Sender + ", Receiver=" + Receiver + ", message=" + message + "]";
	}
	
	
}
