package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Account;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Commodity;
import com.tc.app.exchangemonitor.model.cayenne.persistent.IctsUser;

/**
 * Class _PortfolioEod was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PortfolioEod extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String PORT_NUM_PK_COLUMN = "port_num";

	public static final Property<Integer> CMNT_NUM = new Property<Integer>("cmntNum");
	public static final Property<Integer> NUM_HISTORY_DAYS = new Property<Integer>("numHistoryDays");
	public static final Property<String> PORT_CLASS = new Property<String>("portClass");
	public static final Property<String> PORT_FULL_NAME = new Property<String>("portFullName");
	public static final Property<String> PORT_REF_KEY = new Property<String>("portRefKey");
	public static final Property<String> PORT_SHORT_NAME = new Property<String>("portShortName");
	public static final Property<String> PORT_STATUS = new Property<String>("portStatus");
	public static final Property<String> PORT_TYPE = new Property<String>("portType");
	public static final Property<Date> SNAPSHOT_ASOF_DATE = new Property<Date>("snapshotAsofDate");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<Account> ACCOUNT = new Property<Account>("account");
	public static final Property<Commodity> COMMODITY = new Property<Commodity>("commodity");
	public static final Property<IctsUser> ICTS_USER = new Property<IctsUser>("ictsUser");

	public void setCmntNum(Integer cmntNum)
	{
		writeProperty("cmntNum", cmntNum);
	}

	public Integer getCmntNum()
	{
		return (Integer) readProperty("cmntNum");
	}

	public void setNumHistoryDays(Integer numHistoryDays)
	{
		writeProperty("numHistoryDays", numHistoryDays);
	}

	public Integer getNumHistoryDays()
	{
		return (Integer) readProperty("numHistoryDays");
	}

	public void setPortClass(String portClass)
	{
		writeProperty("portClass", portClass);
	}

	public String getPortClass()
	{
		return (String) readProperty("portClass");
	}

	public void setPortFullName(String portFullName)
	{
		writeProperty("portFullName", portFullName);
	}

	public String getPortFullName()
	{
		return (String) readProperty("portFullName");
	}

	public void setPortRefKey(String portRefKey)
	{
		writeProperty("portRefKey", portRefKey);
	}

	public String getPortRefKey()
	{
		return (String) readProperty("portRefKey");
	}

	public void setPortShortName(String portShortName)
	{
		writeProperty("portShortName", portShortName);
	}

	public String getPortShortName()
	{
		return (String) readProperty("portShortName");
	}

	public void setPortStatus(String portStatus)
	{
		writeProperty("portStatus", portStatus);
	}

	public String getPortStatus()
	{
		return (String) readProperty("portStatus");
	}

	public void setPortType(String portType)
	{
		writeProperty("portType", portType);
	}

	public String getPortType()
	{
		return (String) readProperty("portType");
	}

	public void setSnapshotAsofDate(Date snapshotAsofDate)
	{
		writeProperty("snapshotAsofDate", snapshotAsofDate);
	}

	public Date getSnapshotAsofDate()
	{
		return (Date) readProperty("snapshotAsofDate");
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

	public void setCommodity(Commodity commodity)
	{
		setToOneTarget("commodity", commodity, true);
	}

	public Commodity getCommodity()
	{
		return (Commodity) readProperty("commodity");
	}

	public void setIctsUser(IctsUser ictsUser)
	{
		setToOneTarget("ictsUser", ictsUser, true);
	}

	public IctsUser getIctsUser()
	{
		return (IctsUser) readProperty("ictsUser");
	}

}
