package com.qq.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import com.qq.dao.dao;
import com.qq.entity.mx;
import com.qq.entity.qs;
import com.qq.entity.student;
import com.qq.entity.user;

@Controller
@MapperScan("com.qq.dao")
public class controller {
@Autowired
dao mdao;

@RequestMapping("login")
@ResponseBody
public Integer login(user us) {
	us=mdao.login(us);
	if(null!=us) {
		return 1;
	}else {
		
		return 2;
	}
}
@RequestMapping("zlist")
public String zlist(Model mode,student st,Integer pd) {
	int count=mdao.count(st);
	st.setTotalCount(count);
	st.calculatePage();
	
    List<Map<Object, Object>> zList=mdao.zlist(st);
    for(int i=0;i<zList.size();i++) {
    	Map map=zList.get(i);
    	int numcount=mdao.numcount(map.get("qid"));
    	map.put("snum", numcount);
    }
    mode.addAttribute("zlist",zList);
    mode.addAttribute("st",st);
    if(st.getQid()!=null) {
    	
    	mode.addAttribute("pd",1);
    }
	return "zlist";
}
@RequestMapping("toupd")
@ResponseBody
public student toupd(Integer sid) {
	student st=mdao.toupd(sid);
	qs ss=mdao.supd(st);
	st.setDangqian(ss.getQname());
	return st;
}
@RequestMapping("xl")
@ResponseBody
public List<qs> xl() {
	List<qs> llist=mdao.llist();
	return llist;
}
@RequestMapping("js")
@ResponseBody
public int js(Integer qid) {
	int zs=mdao.zs(qid);
	if(zs>=8) {
		return 0;
	}else {
	    return 1;
	}
}
@RequestMapping("upd")
public String upd(student st) {
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	String format2 = format.format(new Date());
	st.setSdatea(format2);
	mx mm1=new mx();
	mm1.setMname(st.getDangqian());
	mm1.setMnum(st.getSnum()-1);
	mm1.setLdate(format2);
	mx mm2=new mx();
	int zs=mdao.zs(st.getQid());
	st.setSnum(zs+1);
	mdao.upd(st);
	
	qs ss=mdao.supd(st);
	st.setDangqian(ss.getQname());
	mm2.setMid(st.getSid());
	mm2.setMname(st.getDangqian());
	mm2.setMnum(st.getSnum());
	mm2.setRdate(format2);
	mm2.setLdate("至今");
	mdao.mmupd(mm1);
	mdao.add(mm2);
	return "redirect:zlist";
}
@RequestMapping("mx")
public String mx(Model mode,mx mm) {
	  List<mx> mList=mdao.mlist(mm);
	  mode.addAttribute("mlist",mList);
	return "mx";
}

}
