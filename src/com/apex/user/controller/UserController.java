package com.apex.user.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.apex.user.bo.BankBO;
import com.apex.user.bo.UserBO;
import com.apex.user.dao.UserDAO;
import com.apex.user.dao.UserDAOImpl;
import com.apex.user.vo.Bank;
import com.apex.user.vo.User;

@Controller
////@SessionAttributes({"user","bank"})
@SessionAttributes("user")
public class UserController {
	@Autowired
//	private UserDAO userdao;
	UserBO userBO = null;
	
	
	
	
	@ModelAttribute("user")
	public User populateUser() {
		return new User();
	}
	
	@RequestMapping("/entryadduser.do")
	public String entryAddUser(@ModelAttribute("user") User user){
		return "person";
	}
	@RequestMapping("/adduser.do")
	public String addUser(@ModelAttribute("user") User user ){
		System.out.println("UserController:addUser():Start");
		//step1
		System.out.println("The first name is: " + user.getFirstName());
		System.out.println("The first name is: " + user.getLastName());
		//step2
//		userBO.addUser(user);
		//step3
		System.out.println("UserController:addUser():End");
//		session.setAttribute("user", user);
		
		return "bank";
	}
	
//	@Autowired
//	BankBO bankBO = null;
	
	
	@RequestMapping("/addbankdetails.do")
	public String addbankdetails(@ModelAttribute("user") User user ) throws Exception{
		//test.user_info_details
		System.out.println("Bankcontroller:addbankdetails():Start");
		//step1
		System.out.println("The first name is: " + user.getaccount());
		System.out.println("The first name is: " + user.getbankName());
		
		//step2
//		userBO.addbankdetails( bankName, ssn, accountName);
//		userdao.addUser(user);
		userBO.addUser(user);
		
		//step3
		System.out.println("Bankcontroller:addbankdetails():End");
//		 session.setAttribute("user", user);
//		 session.setAttribute("bank", bank);
		return "success";
		
	}
	
	@RequestMapping("/entrygetuser.do")
	public String entryGetUser(@ModelAttribute User user, Model model){
		user.Clear();
		System.out.println("user from 1st"+user.getEmail());
		model.addAttribute("user", user);
		return "get";
	}
	
	@RequestMapping("/getuser.do")
	public String getUser(@ModelAttribute User user, Model model){
		User userFull = userBO.CustomgetUser(user.getEmail());
		System.out.println("firstname from second"+userFull);
		model.addAttribute("user", userFull);
		return "success";
	}
	
	
	@RequestMapping("/entryupdateuser.do")
	public String entryUpdateUserUser(@ModelAttribute User user, Model model){
		user.Clear();
		model.addAttribute("user", user);
		return "update";
	}
	@RequestMapping("/showuser.do")
	public String showUser(@ModelAttribute User user, Model model){
		
			User userFull = userBO.CustomgetUser(user.getEmail());
			
			model.addAttribute("user", userFull);
			return "show";
		}
	
	
	@RequestMapping("/update.do")
	public String updateUser(@ModelAttribute User user, Model model){
		
		    userBO.updateUser(user);

			model.addAttribute("user", user);
			return "success";
		}
}
	


	

