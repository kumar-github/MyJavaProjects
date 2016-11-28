package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Account;

/**
 * Class _BookingFixture was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _BookingFixture extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FLDINT_BOOKC_ACCT_NUM_PK_COLUMN = "fldintBookcAcctNum";

	public static final Property<String> FLDCHR_BOOKC_ENABLED_FLAG = new Property<String>("fldchrBookcEnabledFlag");
	public static final Property<String> FLDCHR_BOOKC_FIXTURE_CODE = new Property<String>("fldchrBookcFixtureCode");
	public static final Property<Account> ACCOUNT = new Property<Account>("account");

	public void setFldchrBookcEnabledFlag(String fldchrBookcEnabledFlag)
	{
		writeProperty("fldchrBookcEnabledFlag", fldchrBookcEnabledFlag);
	}

	public String getFldchrBookcEnabledFlag()
	{
		return (String) readProperty("fldchrBookcEnabledFlag");
	}

	public void setFldchrBookcFixtureCode(String fldchrBookcFixtureCode)
	{
		writeProperty("fldchrBookcFixtureCode", fldchrBookcFixtureCode);
	}

	public String getFldchrBookcFixtureCode()
	{
		return (String) readProperty("fldchrBookcFixtureCode");
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