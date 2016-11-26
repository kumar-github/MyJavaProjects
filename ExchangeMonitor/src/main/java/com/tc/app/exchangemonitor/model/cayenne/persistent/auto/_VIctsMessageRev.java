package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VIctsMessageRev was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VIctsMessageRev extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> ASOF_TRANS_ID = new Property<Integer>("asofTransId");
	public static final Property<String> MSG_DESCRIPTION = new Property<String>("msgDescription");
	public static final Property<String> MSG_TYPE = new Property<String>("msgType");
	public static final Property<Integer> OID = new Property<Integer>("oid");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setAsofTransId(Integer asofTransId)
	{
		writeProperty("asofTransId", asofTransId);
	}

	public Integer getAsofTransId()
	{
		return (Integer) readProperty("asofTransId");
	}

	public void setMsgDescription(String msgDescription)
	{
		writeProperty("msgDescription", msgDescription);
	}

	public String getMsgDescription()
	{
		return (String) readProperty("msgDescription");
	}

	public void setMsgType(String msgType)
	{
		writeProperty("msgType", msgType);
	}

	public String getMsgType()
	{
		return (String) readProperty("msgType");
	}

	public void setOid(Integer oid)
	{
		writeProperty("oid", oid);
	}

	public Integer getOid()
	{
		return (Integer) readProperty("oid");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
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
