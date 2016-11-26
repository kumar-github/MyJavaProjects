package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Account;

/**
 * Class _AccountAffiliated was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AccountAffiliated extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String AFFILIATE_TYPE_PK_COLUMN = "affiliate_type";
	public static final String BOOKING_COMP_NUM_PK_COLUMN = "booking_comp_num";
	public static final String CNTPARTY_ACCT_NUM_PK_COLUMN = "cntparty_acct_num";

	public static final Property<Integer> TRANS_ID = new Property<>("transId");
	public static final Property<Account> ACCOUNT = new Property<>("account");
	public static final Property<Account> ACCOUNT1 = new Property<>("account1");

	public void setTransId(final Integer transId)
	{
		this.writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) this.readProperty("transId");
	}

	public void setAccount(final Account account)
	{
		this.setToOneTarget("account", account, true);
	}

	public Account getAccount()
	{
		return (Account) this.readProperty("account");
	}

	public void setAccount1(final Account account1)
	{
		this.setToOneTarget("account1", account1, true);
	}

	public Account getAccount1()
	{
		return (Account) this.readProperty("account1");
	}

}
