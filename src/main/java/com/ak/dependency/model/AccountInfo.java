package com.ak.dependency.model;

public class AccountInfo {

	private String accountNo;
	private String accountType;
	private BalanceInfo balInfo;

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public BalanceInfo getBalInfo() {
		return balInfo;
	}

	public void setBalInfo(BalanceInfo balInfo) {
		this.balInfo = balInfo;
	}

}
