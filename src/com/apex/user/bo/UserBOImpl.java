package com.apex.user.bo;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apex.user.dao.UserDAO;
import com.apex.user.vo.User;

@Service
public class UserBOImpl implements UserBO {
	@Autowired
	UserDAO userDAO = null;
	
	@Override
	public void addUser(User user) throws Exception {
		System.out.println("UserBOImpl:addUser():Start");
		userDAO.addUser(user);
		System.out.println("UserBOImpl:addUser():End");
	}
	
//	@Override
//	public void addbankdetails(String bankName,String ssn,String accountName) {
//		System.out.println("UserBOImpl:addUser():Start");
//		userDAO.addbankdetails(bankName,ssn,accountName);
//		System.out.println("UserBOImpl:addUser():End");
//	}

	@Override
	public void updateUser(User user) {
		userDAO.updateUser(user);
	}
	@Override
	public User getUser(String email) {
		return null;
		
	}
	
	@Override
	public User CustomgetUser(String email) {
		System.out.println("UserBOImpl:addUser():Start");
//		System.out.println(userDAO.CustomgetUser(email));
		System.out.println("UserBOImpl:addUser():End");
		java.util.List<User> usr =(java.util.List<User>) userDAO.CustomgetUser(email);
		return usr.get(0);
		
		
	}

	@Override
	public void deleteUser(int id) {

	}

}
