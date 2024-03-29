package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.FeedData;

/**
 * Class _AgBttOrderTicket was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AgBttOrderTicket extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FD_OID_PK_COLUMN = "fd_oid";

	public static final Property<String> FEED_NAME = new Property<String>("feedName");
	public static final Property<Integer> LINE_ITEM_CNT = new Property<Integer>("lineItemCnt");
	public static final Property<String> REF_ID = new Property<String>("refId");
	public static final Property<String> SENDER = new Property<String>("sender");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<String> TRANSMITTAL_TYPE = new Property<String>("transmittalType");
	public static final Property<FeedData> FD_O = new Property<FeedData>("fdO");

	public void setFeedName(String feedName)
	{
		writeProperty("feedName", feedName);
	}

	public String getFeedName()
	{
		return (String) readProperty("feedName");
	}

	public void setLineItemCnt(Integer lineItemCnt)
	{
		writeProperty("lineItemCnt", lineItemCnt);
	}

	public Integer getLineItemCnt()
	{
		return (Integer) readProperty("lineItemCnt");
	}

	public void setRefId(String refId)
	{
		writeProperty("refId", refId);
	}

	public String getRefId()
	{
		return (String) readProperty("refId");
	}

	public void setSender(String sender)
	{
		writeProperty("sender", sender);
	}

	public String getSender()
	{
		return (String) readProperty("sender");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setTransmittalType(String transmittalType)
	{
		writeProperty("transmittalType", transmittalType);
	}

	public String getTransmittalType()
	{
		return (String) readProperty("transmittalType");
	}

	public void setFdO(FeedData fdO)
	{
		setToOneTarget("fdO", fdO, true);
	}

	public FeedData getFdO()
	{
		return (FeedData) readProperty("fdO");
	}

}
