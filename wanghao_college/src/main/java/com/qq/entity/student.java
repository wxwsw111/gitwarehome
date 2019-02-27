package com.qq.entity;

import com.qq.utils.BaseModel;

public class student extends BaseModel{
	private Integer sid;
	private String sname;
	private String sex;
	private String sxy;
	private String sdatea;
	private Integer qid;
	private int snum;
	private String dangqian;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSxy() {
		return sxy;
	}
	public void setSxy(String sxy) {
		this.sxy = sxy;
	}
	public String getSdatea() {
		return sdatea;
	}
	public void setSdatea(String sdatea) {
		this.sdatea = sdatea;
	}
	public Integer getQid() {
		return qid;
	}
	public void setQid(Integer qid) {
		this.qid = qid;
	}
	public int getSnum() {
		return snum;
	}
	public void setSnum(int snum) {
		this.snum = snum;
	}
	public String getDangqian() {
		return dangqian;
	}
	public void setDangqian(String dangqian) {
		this.dangqian = dangqian;
	}
	@Override
	public String toString() {
		return "student [sid=" + sid + ", sname=" + sname + ", sex=" + sex + ", sxy=" + sxy + ", sdatea=" + sdatea
				+ ", qid=" + qid + ", snum=" + snum + ", dangqian=" + dangqian + "]";
	}
	
}
