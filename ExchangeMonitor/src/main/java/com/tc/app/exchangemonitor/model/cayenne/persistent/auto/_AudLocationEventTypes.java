package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudLocationEventTypes was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudLocationEventTypes extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Date> DATE_OP = new Property<Date>("dateOp");
	public static final Property<String> FLDCHR_EVENT_ID = new Property<String>("fldchrEventId");
	public static final Property<String> FLDVCH_EVENT_DESC = new Property<String>("fldvchEventDesc");
	public static final Property<String> OPERATION = new Property<String>("operation");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<String> USERID = new Property<String>("userid");

	public void setDateOp(Date dateOp)
	{
		writeProperty("dateOp", dateOp);
	}

	public Date getDateOp()
	{
		return (Date) readProperty("dateOp");
	}

	public void setFldchrEventId(String fldchrEventId)
	{
		writeProperty("fldchrEventId", fldchrEventId);
	}

	public String getFldchrEventId()
	{
		return (String) readProperty("fldchrEventId");
	}

	public void setFldvchEventDesc(String fldvchEventDesc)
	{
		writeProperty("fldvchEventDesc", fldvchEventDesc);
	}

	public String getFldvchEventDesc()
	{
		return (String) readProperty("fldvchEventDesc");
	}

	public void setOperation(String operation)
	{
		writeProperty("operation", operation);
	}

	public String getOperation()
	{
		return (String) readProperty("operation");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setUserid(String userid)
	{
		writeProperty("userid", userid);
	}

	public String getUserid()
	{
		return (String) readProperty("userid");
	}

}
