package com.apex.user.dao;


import org.springframework.stereotype.Service;

import com.apex.user.vo.User;
@Service
public interface UserDAO {
	public void addUser(User user) throws Exception;
	
	
	public void updateUser(User user);
	public User getUser(int id);
	public void deleteUser(int id);
	
}
