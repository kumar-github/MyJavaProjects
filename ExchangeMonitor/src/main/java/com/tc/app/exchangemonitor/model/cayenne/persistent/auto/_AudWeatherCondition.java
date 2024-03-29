package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudWeatherCondition was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudWeatherCondition extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Date> DATE_OP = new Property<Date>("dateOp");
	public static final Property<String> FLDCHR_WEATHER_COND_ENABLED_FLAG = new Property<String>("fldchrWeatherCondEnabledFlag");
	public static final Property<String> FLDCHR_WEATHER_CONDITION_CODE = new Property<String>("fldchrWeatherConditionCode");
	public static final Property<String> FLDCHR_WEATHER_CONDITION_DESC = new Property<String>("fldchrWeatherConditionDesc");
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

	public void setFldchrWeatherCondEnabledFlag(String fldchrWeatherCondEnabledFlag)
	{
		writeProperty("fldchrWeatherCondEnabledFlag", fldchrWeatherCondEnabledFlag);
	}

	public String getFldchrWeatherCondEnabledFlag()
	{
		return (String) readProperty("fldchrWeatherCondEnabledFlag");
	}

	public void setFldchrWeatherConditionCode(String fldchrWeatherConditionCode)
	{
		writeProperty("fldchrWeatherConditionCode", fldchrWeatherConditionCode);
	}

	public String getFldchrWeatherConditionCode()
	{
		return (String) readProperty("fldchrWeatherConditionCode");
	}

	public void setFldchrWeatherConditionDesc(String fldchrWeatherConditionDesc)
	{
		writeProperty("fldchrWeatherConditionDesc", fldchrWeatherConditionDesc);
	}

	public String getFldchrWeatherConditionDesc()
	{
		return (String) readProperty("fldchrWeatherConditionDesc");
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
