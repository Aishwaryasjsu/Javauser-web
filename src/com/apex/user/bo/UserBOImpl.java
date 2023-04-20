package com.apex.user.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apex.user.dao.UserDAO;
import com.apex.user.vo.User;

@Service
public class UserBOImpl implements UserBO {
	@Autowired
	UserDAO userDAO = null;
	
	@Override
	public void addUser(User user) {
		System.out.println("UserBOImpl:addUser():Start");
		userDAO.addUser(user);
		System.out.println("UserBOImpl:addUser():End");
	}

	@Override
	public void updateUser(User user) {

	}

	@Override
	public User getUser(int id) {
		return null;
	}

	@Override
	public void deleteUser(int id) {

	}

}
