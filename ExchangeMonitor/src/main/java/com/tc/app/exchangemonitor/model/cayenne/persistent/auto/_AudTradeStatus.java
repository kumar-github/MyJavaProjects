package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudTradeStatus was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudTradeStatus extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<String> TRADE_STATUS_CODE = new Property<String>("tradeStatusCode");
	public static final Property<String> TRADE_STATUS_DESC = new Property<String>("tradeStatusDesc");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setTradeStatusCode(String tradeStatusCode)
	{
		writeProperty("tradeStatusCode", tradeStatusCode);
	}

	public String getTradeStatusCode()
	{
		return (String) readProperty("tradeStatusCode");
	}

	public void setTradeStatusDesc(String tradeStatusDesc)
	{
		writeProperty("tradeStatusDesc", tradeStatusDesc);
	}

	public String getTradeStatusDesc()
	{
		return (String) readProperty("tradeStatusDesc");
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
