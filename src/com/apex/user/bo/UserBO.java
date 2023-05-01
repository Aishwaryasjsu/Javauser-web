package com.apex.user.bo;

import com.apex.user.vo.User;

import org.springframework.stereotype.Service;

import com.apex.user.vo.Bank;

public interface UserBO {
	public void addUser(User user) throws Exception;
	public void updateUser(User user);
	public User getUser(int id);
	public void deleteUser(int id);
//	public void addbankdetails(String bankName,String ssn,String accountName);
	
}


