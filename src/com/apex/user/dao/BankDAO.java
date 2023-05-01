package com.apex.user.dao;


import com.apex.user.vo.Bank;

public interface BankDAO {
	public void addbankdetails(Bank bank);
	public void updateBank(Bank bank);
	public Bank getBank(int id);
	public void deleteBank(int id);
}
