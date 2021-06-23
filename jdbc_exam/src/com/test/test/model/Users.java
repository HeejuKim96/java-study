package com.test.test.model;

public class Users {

	private String id;
	private String pwd;
	private String phoneNo;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", pwd=" + pwd + ", phoneNo=" + phoneNo + "]";
	}
	
	
}
