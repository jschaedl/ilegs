package com.ilegs.core.model;

import java.util.Date;

public interface IIdentity {
	public String getFirstname();
	public void setFirstname(String firstname);
	
	public String getLastname();
	public void setLastname(String lastname);
	
	public Date getBirthday();
	public void setBirthday(Date birthday);
}
