package com.qq.entity;

public class qs {
private Integer qid;
private String qname;
public Integer getQid() {
	return qid;
}
public void setQid(Integer qid) {
	this.qid = qid;
}
public String getQname() {
	return qname;
}
public void setQname(String qname) {
	this.qname = qname;
}
@Override
public String toString() {
	return "qs [qid=" + qid + ", qname=" + qname + "]";
}


}
