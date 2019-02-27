package com.qq.entity;

public class mx {
	private Integer mid;
	private String mname;
	private Integer mnum;
	private String rdate;
	private String ldate;
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public Integer getMnum() {
		return mnum;
	}
	public void setMnum(Integer mnum) {
		this.mnum = mnum;
	}
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	public String getLdate() {
		return ldate;
	}
	public void setLdate(String ldate) {
		this.ldate = ldate;
	}
	@Override
	public String toString() {
		return "mx [mid=" + mid + ", mname=" + mname + ", mnum=" + mnum + ", rdate=" + rdate + ", ldate=" + ldate + "]";
	}
	
}
