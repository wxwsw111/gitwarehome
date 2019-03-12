package com.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Dorm.pojo.User;
import com.dorm.service.DormService;

@Controller
public class LoginController {
@Autowired
DormService dormService;

@RequestMapping("login")
public String login(User us) {
	List<User> list=dormService.list(us);
	if(us!=null){
		System.out.println(us);
	}else {
		System.out.println("错");
	}
	return "list";	
}
}
