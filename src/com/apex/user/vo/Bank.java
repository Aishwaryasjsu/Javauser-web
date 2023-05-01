package com.apex.user.vo;


public class Bank {
	private int id;
	private String  bankName;
	private String	ssn;
	private String  account;
	
	public Bank() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getbankName() {
		return bankName;
	}
	public void setbankName(String bankName) {
		this.bankName = bankName;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	
}
