package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Account;
import com.tc.app.exchangemonitor.model.cayenne.persistent.ContractStatus;
import com.tc.app.exchangemonitor.model.cayenne.persistent.IctsUser;

/**
 * Class _Contract was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Contract extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String CONTR_NUM_PK_COLUMN = "contr_num";
	public static final String CONTR_REV_NUM_PK_COLUMN = "contr_rev_num";

	public static final Property<String> CONTR_CONFIRMED_BY = new Property<String>("contrConfirmedBy");
	public static final Property<Date> CONTR_CONFIRMED_DATE = new Property<Date>("contrConfirmedDate");
	public static final Property<Date> CONTR_CREATION_DATE = new Property<Date>("contrCreationDate");
	public static final Property<String> CONTR_NAME = new Property<String>("contrName");
	public static final Property<String> CONTR_ON_HOLD_INDS = new Property<String>("contrOnHoldInds");
	public static final Property<String> CONTR_TYPE = new Property<String>("contrType");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<Account> ACCOUNT = new Property<Account>("account");
	public static final Property<ContractStatus> CONTRACT_STATUS = new Property<ContractStatus>("contractStatus");
	public static final Property<IctsUser> ICTS_USER = new Property<IctsUser>("ictsUser");
	public static final Property<IctsUser> ICTS_USER1 = new Property<IctsUser>("ictsUser1");

	public void setContrConfirmedBy(String contrConfirmedBy)
	{
		writeProperty("contrConfirmedBy", contrConfirmedBy);
	}

	public String getContrConfirmedBy()
	{
		return (String) readProperty("contrConfirmedBy");
	}

	public void setContrConfirmedDate(Date contrConfirmedDate)
	{
		writeProperty("contrConfirmedDate", contrConfirmedDate);
	}

	public Date getContrConfirmedDate()
	{
		return (Date) readProperty("contrConfirmedDate");
	}

	public void setContrCreationDate(Date contrCreationDate)
	{
		writeProperty("contrCreationDate", contrCreationDate);
	}

	public Date getContrCreationDate()
	{
		return (Date) readProperty("contrCreationDate");
	}

	public void setContrName(String contrName)
	{
		writeProperty("contrName", contrName);
	}

	public String getContrName()
	{
		return (String) readProperty("contrName");
	}

	public void setContrOnHoldInds(String contrOnHoldInds)
	{
		writeProperty("contrOnHoldInds", contrOnHoldInds);
	}

	public String getContrOnHoldInds()
	{
		return (String) readProperty("contrOnHoldInds");
	}

	public void setContrType(String contrType)
	{
		writeProperty("contrType", contrType);
	}

	public String getContrType()
	{
		return (String) readProperty("contrType");
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

	public void setContractStatus(ContractStatus contractStatus)
	{
		setToOneTarget("contractStatus", contractStatus, true);
	}

	public ContractStatus getContractStatus()
	{
		return (ContractStatus) readProperty("contractStatus");
	}

	public void setIctsUser(IctsUser ictsUser)
	{
		setToOneTarget("ictsUser", ictsUser, true);
	}

	public IctsUser getIctsUser()
	{
		return (IctsUser) readProperty("ictsUser");
	}

	public void setIctsUser1(IctsUser ictsUser1)
	{
		setToOneTarget("ictsUser1", ictsUser1, true);
	}

	public IctsUser getIctsUser1()
	{
		return (IctsUser) readProperty("ictsUser1");
	}

}
