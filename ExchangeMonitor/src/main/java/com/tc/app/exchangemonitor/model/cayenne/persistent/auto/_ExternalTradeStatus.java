package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.ExternalTrade;

/**
 * Class _ExternalTradeStatus was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ExternalTradeStatus extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String OID_PK_COLUMN = "oid";

	public static final Property<String> EXTERNAL_TRADE_STATUS_NAME = new Property<String>("externalTradeStatusName");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<List<ExternalTrade>> EXTERNAL_TRADES = new Property<List<ExternalTrade>>("externalTrades");

	public void setExternalTradeStatusName(String externalTradeStatusName)
	{
		writeProperty("externalTradeStatusName", externalTradeStatusName);
	}

	public String getExternalTradeStatusName()
	{
		return (String) readProperty("externalTradeStatusName");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void addToExternalTrades(ExternalTrade obj)
	{
		addToManyTarget("externalTrades", obj, true);
	}

	public void removeFromExternalTrades(ExternalTrade obj)
	{
		removeToManyTarget("externalTrades", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<ExternalTrade> getExternalTrades()
	{
		return (List<ExternalTrade>) readProperty("externalTrades");
	}

}
