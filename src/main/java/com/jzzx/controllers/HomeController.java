package com.jzzx.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jzzx.models.User;
import com.jzzx.services.UserManagerService;

@RequestMapping("/Home")
@Controller
public class HomeController {
	
	@Autowired
	private UserManagerService userServiceImpl;
	
	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("message", "Hello！ 阿里巴巴Java Spring Boot2.0实战开发课程");
		List<User> listUsers = (List<User>) userServiceImpl.findAll();
		System.out.println(userServiceImpl.getUserByName("222").size());
		System.out.println(listUsers.size());
		//修改
		userServiceImpl.updateUserById("Tom", "123456", 1);
		return mv;
	}
	@RequestMapping("/addUser")
	@ResponseBody
	public int addUser() {
		return userServiceImpl.addUser("jack", "6321");
	}
}
