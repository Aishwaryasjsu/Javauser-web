package com.apex.user.bo;

import com.apex.user.vo.Bank;
import com.apex.user.vo.Bank;

public interface BankBO {
	public void addbankdetails(Bank bank);
	public void updateBank(Bank bank);
	public Bank getBank(String firstName);
	public void deleteBank(int id);
}


