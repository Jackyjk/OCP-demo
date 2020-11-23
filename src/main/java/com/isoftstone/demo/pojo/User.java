package com.isoftstone.demo.pojo;

/**
 * 普通用户
 */
public class User {
	
	Integer id;

	String username;
	
	String password;
	//0代表普通用户，1代表经销商，2代表root用户
	Integer roleType;

	public Integer getRoleType() {
		return roleType;
	}

	public void setRoleType(Integer roleType) {
		this.roleType = roleType;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
