package com.jsp.person.account;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	private String bank_acco;
	private long acc_no;
	private String ifdc_code;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBank_acco() {
		return bank_acco;
	}
	public void setBank_acco(String bank_acco) {
		this.bank_acco = bank_acco;
	}
	public long getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}
	public String getIfdc_code() {
		return ifdc_code;
	}
	public void setIfdc_code(String ifdc_code) {
		this.ifdc_code = ifdc_code;
	}
	
	
	
}
