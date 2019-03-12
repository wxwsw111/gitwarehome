package com.dorm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.Dorm.pojo.User;
import com.dorm.dao.DormDao;
import com.dorm.service.DormService;

public class DormServiceImpl implements DormService{
    @Autowired
    DormDao dormDao;
    
	@Override
	public List<User> list(User us) {
		// TODO Auto-generated method stub
		return dormDao.list(us);
	}

}
