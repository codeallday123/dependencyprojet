package com.ak;

import com.ak.model.AccountInfo;
import com.ak.model.BalanceInfo;

public class Route {

	public AccountInfo accountInfo() {

		AccountInfo accountInfo = new AccountInfo();
		accountInfo.setAccountNo("123456");
		accountInfo.setAccountType("Checking");

		BalanceInfo billingInfo = new Pipeline().balanceInfo();
		accountInfo.setBalInfo(billingInfo);

		return accountInfo;

	}
}
