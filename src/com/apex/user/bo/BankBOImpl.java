package com.apex.user.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apex.user.dao.BankDAO;
import com.apex.user.dao.UserDAO;
import com.apex.user.vo.Bank;
import com.apex.user.vo.User;

@Service
public class BankBOImpl implements BankBO {
	@Autowired
	BankDAO bankDAO = null;
	
	@Override
	public void addbankdetails(Bank bank) {
		System.out.println("BankBOImpl:addbankdetails():Start");
		bankDAO.addbankdetails(bank);
		System.out.println("BankBOImpl:addbankdetails():End");
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
