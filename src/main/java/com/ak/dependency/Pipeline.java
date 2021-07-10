package com.ak.dependency;

import com.ak.aspect.MethodLog;
import com.ak.dependency.model.BalanceInfo;

public class Pipeline {
	
	@MethodLog
	public BalanceInfo balanceInfo() {

		BalanceInfo balanceInfo = new BalanceInfo();
		balanceInfo.setAvalBal("10000");
		balanceInfo.setDebtBal("5000");

		return balanceInfo;

	}

}
