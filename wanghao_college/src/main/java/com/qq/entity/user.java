package com.qq.entity;

import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

public class user {
	private Integer uid;
	private String uname;
	private String upwd;
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	@Override
	public String toString() {
		return "user [uid=" + uid + ", uname=" + uname + ", upwd=" + upwd + "]";
	}
	
}
