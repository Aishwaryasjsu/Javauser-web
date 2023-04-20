package com.apex.user.bo;

import com.apex.user.vo.User;

public interface UserBO {
	public void addUser(User user);
	public void updateUser(User user);
	public User getUser(int id);
	public void deleteUser(int id);
}
