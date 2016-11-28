package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudPortfolio was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudPortfolio extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> CMNT_NUM = new Property<Integer>("cmntNum");
	public static final Property<String> DESIRED_PL_CURR_CODE = new Property<String>("desiredPlCurrCode");
	public static final Property<Integer> NUM_HISTORY_DAYS = new Property<Integer>("numHistoryDays");
	public static final Property<String> OWNER_INIT = new Property<String>("ownerInit");
	public static final Property<String> PORT_CLASS = new Property<String>("portClass");
	public static final Property<String> PORT_FULL_NAME = new Property<String>("portFullName");
	public static final Property<Short> PORT_LOCKED = new Property<Short>("portLocked");
	public static final Property<Integer> PORT_NUM = new Property<Integer>("portNum");
	public static final Property<String> PORT_REF_KEY = new Property<String>("portRefKey");
	public static final Property<String> PORT_SHORT_NAME = new Property<String>("portShortName");
	public static final Property<String> PORT_TYPE = new Property<String>("portType");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRADING_ENTITY_NUM = new Property<Integer>("tradingEntityNum");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setCmntNum(Integer cmntNum)
	{
		writeProperty("cmntNum", cmntNum);
	}

	public Integer getCmntNum()
	{
		return (Integer) readProperty("cmntNum");
	}

	public void setDesiredPlCurrCode(String desiredPlCurrCode)
	{
		writeProperty("desiredPlCurrCode", desiredPlCurrCode);
	}

	public String getDesiredPlCurrCode()
	{
		return (String) readProperty("desiredPlCurrCode");
	}

	public void setNumHistoryDays(Integer numHistoryDays)
	{
		writeProperty("numHistoryDays", numHistoryDays);
	}

	public Integer getNumHistoryDays()
	{
		return (Integer) readProperty("numHistoryDays");
	}

	public void setOwnerInit(String ownerInit)
	{
		writeProperty("ownerInit", ownerInit);
	}

	public String getOwnerInit()
	{
		return (String) readProperty("ownerInit");
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

	public void setPortLocked(Short portLocked)
	{
		writeProperty("portLocked", portLocked);
	}

	public Short getPortLocked()
	{
		return (Short) readProperty("portLocked");
	}

	public void setPortNum(Integer portNum)
	{
		writeProperty("portNum", portNum);
	}

	public Integer getPortNum()
	{
		return (Integer) readProperty("portNum");
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

	public void setPortType(String portType)
	{
		writeProperty("portType", portType);
	}

	public String getPortType()
	{
		return (String) readProperty("portType");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setTradingEntityNum(Integer tradingEntityNum)
	{
		writeProperty("tradingEntityNum", tradingEntityNum);
	}

	public Integer getTradingEntityNum()
	{
		return (Integer) readProperty("tradingEntityNum");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

}