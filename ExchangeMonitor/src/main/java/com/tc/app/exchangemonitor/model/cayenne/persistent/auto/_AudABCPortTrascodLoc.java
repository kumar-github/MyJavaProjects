package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudABCPortTrascodLoc was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudABCPortTrascodLoc extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> A_BCCOMPLETE_CODE = new Property<String>("aBCCompleteCode");
	public static final Property<Date> DATE_OP = new Property<Date>("dateOp");
	public static final Property<Integer> FLDINT_LOCATION_ID = new Property<Integer>("fldintLocationID");
	public static final Property<String> LOC_CODE = new Property<String>("locCode");
	public static final Property<String> OPERATION = new Property<String>("operation");
	public static final Property<String> USERID = new Property<String>("userid");

	public void setABCCompleteCode(String aBCCompleteCode)
	{
		writeProperty("aBCCompleteCode", aBCCompleteCode);
	}

	public String getABCCompleteCode()
	{
		return (String) readProperty("aBCCompleteCode");
	}

	public void setDateOp(Date dateOp)
	{
		writeProperty("dateOp", dateOp);
	}

	public Date getDateOp()
	{
		return (Date) readProperty("dateOp");
	}

	public void setFldintLocationID(Integer fldintLocationID)
	{
		writeProperty("fldintLocationID", fldintLocationID);
	}

	public Integer getFldintLocationID()
	{
		return (Integer) readProperty("fldintLocationID");
	}

	public void setLocCode(String locCode)
	{
		writeProperty("locCode", locCode);
	}

	public String getLocCode()
	{
		return (String) readProperty("locCode");
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