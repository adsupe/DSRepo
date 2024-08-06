package com.capgemini.springbootprofile.beans;

public class MyDataSource {
	String username;
	String password;
	@Override
	public String toString() {
		return "MyDataSource [username=" + username + ", password=" + password + "]";
	}
	public MyDataSource() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyDataSource(String username, String password) {
		super();
		this.username = username;
		this.password = password;
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

}
