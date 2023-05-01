package com.apex.user.dao;

import org.springframework.stereotype.Repository;

import com.apex.user.vo.Bank;
import com.apex.user.vo.User;

@Repository
public class BankDAOImpl implements BankDAO {

	@Override
	public void addbankdetails(Bank bank){
		System.out.println("UserDAOImpl:addUser():Start");
		//invoke JDBC Code
		System.out.println("UserDAOImpl:addUser():End");
	}

	@Override
	public void updateBank(Bank bank) {

	}

	@Override
	public Bank getBank(int id) {
		return null;
	}

	@Override
	public void deleteBank(int id) {
	}

}
