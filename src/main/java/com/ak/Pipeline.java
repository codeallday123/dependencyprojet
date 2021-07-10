package com.ak;

import com.ak.model.BalanceInfo;

public class Pipeline {

	public BalanceInfo balanceInfo() {

		BalanceInfo balanceInfo = new BalanceInfo();
		balanceInfo.setAvalBal("10000");
		balanceInfo.setDebtBal("5000");

		return balanceInfo;

	}

}
