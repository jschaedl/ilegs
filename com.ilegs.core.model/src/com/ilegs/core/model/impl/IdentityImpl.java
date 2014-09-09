package com.ilegs.core.model.impl;

import java.util.Date;

import com.ilegs.core.model.IIdentity;

public class IdentityImpl implements IIdentity {

	private String firstname;
	private String lastname;
	private Date birthday;
	
	@Override
	public String getFirstname() {
		return this.firstname;
	}

	@Override
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@Override
	public String getLastname() {
		return this.lastname;
	}

	@Override
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public Date getBirthday() {
		return this.birthday;
	}

	@Override
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}
