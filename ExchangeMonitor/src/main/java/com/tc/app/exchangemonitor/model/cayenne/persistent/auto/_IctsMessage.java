package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.IctsMessageDetail;

/**
 * Class _IctsMessage was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _IctsMessage extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String OID_PK_COLUMN = "oid";

	public static final Property<String> MSG_DESCRIPTION = new Property<String>("msgDescription");
	public static final Property<String> MSG_TYPE = new Property<String>("msgType");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<List<IctsMessageDetail>> ICTS_MESSAGE_DETAILS = new Property<List<IctsMessageDetail>>("ictsMessageDetails");

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

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void addToIctsMessageDetails(IctsMessageDetail obj)
	{
		addToManyTarget("ictsMessageDetails", obj, true);
	}

	public void removeFromIctsMessageDetails(IctsMessageDetail obj)
	{
		removeToManyTarget("ictsMessageDetails", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<IctsMessageDetail> getIctsMessageDetails()
	{
		return (List<IctsMessageDetail>) readProperty("ictsMessageDetails");
	}

}
