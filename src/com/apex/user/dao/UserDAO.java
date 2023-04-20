package com.apex.user.dao;

import com.apex.user.vo.User;

public interface UserDAO {
	public void addUser(User user);
	public void updateUser(User user);
	public User getUser(int id);
	public void deleteUser(int id);
}
