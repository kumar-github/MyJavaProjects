package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Account;

/**
 * Class _AccountExtInfo was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AccountExtInfo extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String ACCT_NUM_PK_COLUMN = "acct_num";

	public static final Property<String> FLD_VALUE1 = new Property<String>("fldValue1");
	public static final Property<String> FLD_VALUE2 = new Property<String>("fldValue2");
	public static final Property<String> FLD_VALUE3 = new Property<String>("fldValue3");
	public static final Property<String> FLD_VALUE4 = new Property<String>("fldValue4");
	public static final Property<String> FLD_VALUE5 = new Property<String>("fldValue5");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<Account> ACCOUNT = new Property<Account>("account");

	public void setFldValue1(String fldValue1)
	{
		writeProperty("fldValue1", fldValue1);
	}

	public String getFldValue1()
	{
		return (String) readProperty("fldValue1");
	}

	public void setFldValue2(String fldValue2)
	{
		writeProperty("fldValue2", fldValue2);
	}

	public String getFldValue2()
	{
		return (String) readProperty("fldValue2");
	}

	public void setFldValue3(String fldValue3)
	{
		writeProperty("fldValue3", fldValue3);
	}

	public String getFldValue3()
	{
		return (String) readProperty("fldValue3");
	}

	public void setFldValue4(String fldValue4)
	{
		writeProperty("fldValue4", fldValue4);
	}

	public String getFldValue4()
	{
		return (String) readProperty("fldValue4");
	}

	public void setFldValue5(String fldValue5)
	{
		writeProperty("fldValue5", fldValue5);
	}

	public String getFldValue5()
	{
		return (String) readProperty("fldValue5");
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
