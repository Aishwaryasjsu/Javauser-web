package com.apex.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.apex.user.bo.UserBO;
import com.apex.user.vo.User;

@Controller
public class UserController {
	@Autowired
	UserBO userBO = null;
	
	@RequestMapping("/entryadduser.do")
	public String entryAddUser(@ModelAttribute User user){
		return "person";
	}
	@RequestMapping("/adduser.do")
	public String addUser(@ModelAttribute User user){
		System.out.println("UserController:addUser():Start");
		//step1
		System.out.println("The first name is: " + user.getFirstName());
		System.out.println("The first name is: " + user.getLastName());
		//step2
		userBO.addUser(user);
		//step3
		System.out.println("UserController:addUser():End");
		return "success";
	}
}
