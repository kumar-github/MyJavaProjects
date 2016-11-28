package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudWbContractAggregator was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudWbContractAggregator extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Date> DATE_OP = new Property<Date>("dateOp");
	public static final Property<String> FLDCHR_DESCRIPTION = new Property<String>("fldchrDescription");
	public static final Property<Integer> FLDCHR_REC_ID = new Property<Integer>("fldchrRecId");
	public static final Property<String> OPERATION = new Property<String>("operation");
	public static final Property<String> USERID = new Property<String>("userid");

	public void setDateOp(Date dateOp)
	{
		writeProperty("dateOp", dateOp);
	}

	public Date getDateOp()
	{
		return (Date) readProperty("dateOp");
	}

	public void setFldchrDescription(String fldchrDescription)
	{
		writeProperty("fldchrDescription", fldchrDescription);
	}

	public String getFldchrDescription()
	{
		return (String) readProperty("fldchrDescription");
	}

	public void setFldchrRecId(Integer fldchrRecId)
	{
		writeProperty("fldchrRecId", fldchrRecId);
	}

	public Integer getFldchrRecId()
	{
		return (Integer) readProperty("fldchrRecId");
	}

	public void setOperation(String operation)
	{
		writeProperty("operation", operation);
	}

	public String getOperation()
	{
		return (String) readProperty("operation");
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