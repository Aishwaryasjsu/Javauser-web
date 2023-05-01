package com.apex.user.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name = "user_info_details")
public class User {
	private int id;
	private String  firstName;
	private String	lastName;
	private String  middleName;
	private String  gender;
	private String  bankName;
	private String	ssn;
	private String  account;
	
	public User() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Column(name = "firstName")
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Column(name = "lastName")
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Column(name = "middleName")
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	@Column(name = "gender")
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Column(name = "bankname")
	public String getbankName() {
		return bankName;
	}
	public void setbankName(String bankName) {
		this.bankName = bankName;
	}
	@Column(name = "ssn")
	public String getssn() {
		return ssn;
	}
	public void setssn(String ssn) {
		this.ssn = ssn;
	}
	@Column(name = "account")
	public String getaccount() {
		return account;
	}
	public void setaccount(String account) {
		this.account = account;
	}
	

}