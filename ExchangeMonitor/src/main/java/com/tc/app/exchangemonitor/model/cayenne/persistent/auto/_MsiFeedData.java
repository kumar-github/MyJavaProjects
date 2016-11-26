package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.FeedData;
import com.tc.app.exchangemonitor.model.cayenne.persistent.FeedXsdXmlText;

/**
 * Class _MsiFeedData was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _MsiFeedData extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String OID_PK_COLUMN = "oid";

	public static final Property<String> MSG_CATEGORY = new Property<String>("msgCategory");
	public static final Property<String> MSG_CONTROL_ID = new Property<String>("msgControlId");
	public static final Property<Date> MSG_DATE = new Property<Date>("msgDate");
	public static final Property<Date> MSG_TIME = new Property<Date>("msgTime");
	public static final Property<String> MSG_TYPE = new Property<String>("msgType");
	public static final Property<String> RECEIVG_APPL = new Property<String>("receivgAppl");
	public static final Property<String> REF_MSG_CONTROL_ID = new Property<String>("refMsgControlId");
	public static final Property<String> RESPONSE_RECV = new Property<String>("responseRecv");
	public static final Property<String> SENDG_APPL = new Property<String>("sendgAppl");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<String> TRIGGER_EVENT = new Property<String>("triggerEvent");
	public static final Property<FeedData> FEED_DATA = new Property<FeedData>("feedData");
	public static final Property<FeedXsdXmlText> REQ_RES_XML = new Property<FeedXsdXmlText>("reqResXml");

	public void setMsgCategory(String msgCategory)
	{
		writeProperty("msgCategory", msgCategory);
	}

	public String getMsgCategory()
	{
		return (String) readProperty("msgCategory");
	}

	public void setMsgControlId(String msgControlId)
	{
		writeProperty("msgControlId", msgControlId);
	}

	public String getMsgControlId()
	{
		return (String) readProperty("msgControlId");
	}

	public void setMsgDate(Date msgDate)
	{
		writeProperty("msgDate", msgDate);
	}

	public Date getMsgDate()
	{
		return (Date) readProperty("msgDate");
	}

	public void setMsgTime(Date msgTime)
	{
		writeProperty("msgTime", msgTime);
	}

	public Date getMsgTime()
	{
		return (Date) readProperty("msgTime");
	}

	public void setMsgType(String msgType)
	{
		writeProperty("msgType", msgType);
	}

	public String getMsgType()
	{
		return (String) readProperty("msgType");
	}

	public void setReceivgAppl(String receivgAppl)
	{
		writeProperty("receivgAppl", receivgAppl);
	}

	public String getReceivgAppl()
	{
		return (String) readProperty("receivgAppl");
	}

	public void setRefMsgControlId(String refMsgControlId)
	{
		writeProperty("refMsgControlId", refMsgControlId);
	}

	public String getRefMsgControlId()
	{
		return (String) readProperty("refMsgControlId");
	}

	public void setResponseRecv(String responseRecv)
	{
		writeProperty("responseRecv", responseRecv);
	}

	public String getResponseRecv()
	{
		return (String) readProperty("responseRecv");
	}

	public void setSendgAppl(String sendgAppl)
	{
		writeProperty("sendgAppl", sendgAppl);
	}

	public String getSendgAppl()
	{
		return (String) readProperty("sendgAppl");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setTriggerEvent(String triggerEvent)
	{
		writeProperty("triggerEvent", triggerEvent);
	}

	public String getTriggerEvent()
	{
		return (String) readProperty("triggerEvent");
	}

	public void setFeedData(FeedData feedData)
	{
		setToOneTarget("feedData", feedData, true);
	}

	public FeedData getFeedData()
	{
		return (FeedData) readProperty("feedData");
	}

	public void setReqResXml(FeedXsdXmlText reqResXml)
	{
		setToOneTarget("reqResXml", reqResXml, true);
	}

	public FeedXsdXmlText getReqResXml()
	{
		return (FeedXsdXmlText) readProperty("reqResXml");
	}

}
