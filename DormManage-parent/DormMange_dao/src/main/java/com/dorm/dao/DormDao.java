package com.dorm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.Dorm.pojo.User;

public interface DormDao {
    @Select("select * from user where uname=#{uname} and pwd=#{pwd}")
	List<User> list(User us);

}
