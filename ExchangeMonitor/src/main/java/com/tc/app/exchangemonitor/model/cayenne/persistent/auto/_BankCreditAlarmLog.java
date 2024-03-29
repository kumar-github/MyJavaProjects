package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Account;

/**
 * Class _BankCreditAlarmLog was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _BankCreditAlarmLog extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String ACCT_NUM_PK_COLUMN = "acct_num";
	public static final String CREDIT_ALARM_LOG_NUM_PK_COLUMN = "credit_alarm_log_num";

	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<Account> ACCOUNT = new Property<Account>("account");

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setAccount(Account account)
	{
		setToOneTarget("account", account, true);
	}

	public Account getAccount()
	{
		return (Account) readProperty("account");
	}

}
