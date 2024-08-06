package com.mayas.config;

import java.util.concurrent.atomic.AtomicInteger;

public class UserInfoDto {
	public String userName;
	public String friendName;
	public Integer count;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFriendName() {
		return friendName;
	}
	public void setFriendName(String friendName) {
		this.friendName = friendName;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	
	

}
