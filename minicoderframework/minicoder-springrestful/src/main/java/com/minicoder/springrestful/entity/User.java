package com.minicoder.springrestful.entity;

/**
 * 
 * <p><b>User Description:</b> TODO(user entity)</p>
 * @author jevno (rucky2013@163.com)
 * <b>DATE</b> 2014年11月6日 下午2:07:59
 */
public class User {
	private String userId;
	
	private String userName;
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + "]";
	}
	
}
