package com.apex.user.dao;

import org.springframework.stereotype.Repository;

import com.apex.user.vo.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Override
	public void addUser(User user) {
		System.out.println("UserDAOImpl:addUser():Start");
		//invoke JDBC Code
		System.out.println("UserDAOImpl:addUser():End");
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
