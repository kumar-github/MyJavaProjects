package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Account;

/**
 * Class _BankExposureSummary was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _BankExposureSummary extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String ACCT_NUM_PK_COLUMN = "acct_num";
	public static final String EXP_IMP_EXP_IND_PK_COLUMN = "exp_imp_exp_ind";

	public static final Property<Double> EXP_AMT = new Property<Double>("expAmt");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<Account> ACCOUNT = new Property<Account>("account");

	public void setExpAmt(Double expAmt)
	{
		writeProperty("expAmt", expAmt);
	}

	public Double getExpAmt()
	{
		return (Double) readProperty("expAmt");
	}

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
