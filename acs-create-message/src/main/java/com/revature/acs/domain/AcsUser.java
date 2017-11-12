package com.revature.acs.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ACS_USER")
public class AcsUser {
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
	
	public AcsUser() { }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFn() {
		return fn;
	}

	public void setFn(String fn) {
		this.fn = fn;
	}

	public String getLn() {
		return ln;
	}

	public void setLn(String ln) {
		this.ln = ln;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AcsUser [id=" + id + ", fn=" + fn + ", ln=" + ln + ", username=" + username + ", password=" + password
				+ "]";
	}
	
	
}
