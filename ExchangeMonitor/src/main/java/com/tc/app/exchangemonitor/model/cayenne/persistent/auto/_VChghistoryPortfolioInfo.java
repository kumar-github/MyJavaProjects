package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VChghistoryPortfolioInfo was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VChghistoryPortfolioInfo extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> PORT_FULL_NAME = new Property<String>("portFullName");
	public static final Property<Integer> PORT_NUM = new Property<Integer>("portNum");
	public static final Property<String> PORT_SHORT_NAME = new Property<String>("portShortName");
	public static final Property<String> PORT_TYPE = new Property<String>("portType");
	public static final Property<String> TRADING_ENTITY_NAME = new Property<String>("tradingEntityName");

	public void setPortFullName(String portFullName)
	{
		writeProperty("portFullName", portFullName);
	}

	public String getPortFullName()
	{
		return (String) readProperty("portFullName");
	}

	public void setPortNum(Integer portNum)
	{
		writeProperty("portNum", portNum);
	}

	public Integer getPortNum()
	{
		return (Integer) readProperty("portNum");
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

	public void setTradingEntityName(String tradingEntityName)
	{
		writeProperty("tradingEntityName", tradingEntityName);
	}

	public String getTradingEntityName()
	{
		return (String) readProperty("tradingEntityName");
	}

}
