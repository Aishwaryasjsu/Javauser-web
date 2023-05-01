package com.apex.user.dao;


import java.util.List;

import org.springframework.stereotype.Service;

import com.apex.user.vo.User;
@Service
public interface UserDAO {
	public void addUser(User user) throws Exception;
	
	
	public void updateUser(User user);
	public User getUser(String email);
	public List<User> CustomgetUser(String email);
	public void deleteUser(int id);
	
}
