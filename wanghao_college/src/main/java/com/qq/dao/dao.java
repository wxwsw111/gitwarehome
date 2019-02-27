package com.qq.dao;

import java.util.List;
import java.util.Map;

import com.qq.entity.mx;
import com.qq.entity.qs;
import com.qq.entity.student;
import com.qq.entity.user;

public interface dao {

	List<Map<Object, Object>> zlist(student st);

	user login(user us);

	int count(student st);

	student toupd(Integer sid);

	List<qs> llist();

	qs supd(student st);

	int zs(Integer qid);

	void upd(student st);

	List<mx> mlist(mx mm);

	void mmupd(mx mm1);

	void add(mx mm2);

	void qtupd(student st);

	int numcount(Object object);

}
