package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudBusinessArea was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudBusinessArea extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Date> DATE_OP = new Property<Date>("dateOp");
	public static final Property<String> FLDCHR_BUSINESS_AREA_CODE = new Property<String>("fldchrBusinessAreaCode");
	public static final Property<String> FLDCHR_BUSINESS_AREA_DESC = new Property<String>("fldchrBusinessAreaDesc");
	public static final Property<String> FLDCHR_ENABLE_FLAG = new Property<String>("fldchrEnableFlag");
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

	public void setFldchrBusinessAreaCode(String fldchrBusinessAreaCode)
	{
		writeProperty("fldchrBusinessAreaCode", fldchrBusinessAreaCode);
	}

	public String getFldchrBusinessAreaCode()
	{
		return (String) readProperty("fldchrBusinessAreaCode");
	}

	public void setFldchrBusinessAreaDesc(String fldchrBusinessAreaDesc)
	{
		writeProperty("fldchrBusinessAreaDesc", fldchrBusinessAreaDesc);
	}

	public String getFldchrBusinessAreaDesc()
	{
		return (String) readProperty("fldchrBusinessAreaDesc");
	}

	public void setFldchrEnableFlag(String fldchrEnableFlag)
	{
		writeProperty("fldchrEnableFlag", fldchrEnableFlag);
	}

	public String getFldchrEnableFlag()
	{
		return (String) readProperty("fldchrEnableFlag");
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
