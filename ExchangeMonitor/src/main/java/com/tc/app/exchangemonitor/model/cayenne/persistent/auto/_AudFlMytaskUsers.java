package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudFlMytaskUsers was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudFlMytaskUsers extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Date> DATE_OP = new Property<Date>("dateOp");
	public static final Property<String> FLDCHR_USER_INIT = new Property<String>("fldchrUserInit");
	public static final Property<String> FLDCHRFREE_TEXT = new Property<String>("fldchrfreeText");
	public static final Property<Date> FLDINT_DELIVERY_DATE = new Property<Date>("fldintDeliveryDate");
	public static final Property<Integer> FLDINT_ID = new Property<Integer>("fldintId");
	public static final Property<Integer> FLDINT_ID_SCOPE = new Property<Integer>("fldintIdScope");
	public static final Property<Integer> FLDINT_ID_TARGET = new Property<Integer>("fldintIdTarget");
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

	public void setFldchrUserInit(String fldchrUserInit)
	{
		writeProperty("fldchrUserInit", fldchrUserInit);
	}

	public String getFldchrUserInit()
	{
		return (String) readProperty("fldchrUserInit");
	}

	public void setFldchrfreeText(String fldchrfreeText)
	{
		writeProperty("fldchrfreeText", fldchrfreeText);
	}

	public String getFldchrfreeText()
	{
		return (String) readProperty("fldchrfreeText");
	}

	public void setFldintDeliveryDate(Date fldintDeliveryDate)
	{
		writeProperty("fldintDeliveryDate", fldintDeliveryDate);
	}

	public Date getFldintDeliveryDate()
	{
		return (Date) readProperty("fldintDeliveryDate");
	}

	public void setFldintId(Integer fldintId)
	{
		writeProperty("fldintId", fldintId);
	}

	public Integer getFldintId()
	{
		return (Integer) readProperty("fldintId");
	}

	public void setFldintIdScope(Integer fldintIdScope)
	{
		writeProperty("fldintIdScope", fldintIdScope);
	}

	public Integer getFldintIdScope()
	{
		return (Integer) readProperty("fldintIdScope");
	}

	public void setFldintIdTarget(Integer fldintIdTarget)
	{
		writeProperty("fldintIdTarget", fldintIdTarget);
	}

	public Integer getFldintIdTarget()
	{
		return (Integer) readProperty("fldintIdTarget");
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
