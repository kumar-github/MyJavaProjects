package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudFLMTMMarketDescriptor was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudFLMTMMarketDescriptor extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Date> DATE_OP = new Property<Date>("dateOp");
	public static final Property<Integer> ID_MARKET = new Property<Integer>("idMarket");
	public static final Property<String> MARKET_DESCRIPTION = new Property<String>("marketDescription");
	public static final Property<String> MARKET_UOM = new Property<String>("marketUom");
	public static final Property<String> OPERATION = new Property<String>("operation");
	public static final Property<String> USERID = new Property<String>("userid");
	public static final Property<String> WEEK_DAYS = new Property<String>("weekDays");

	public void setDateOp(Date dateOp)
	{
		writeProperty("dateOp", dateOp);
	}

	public Date getDateOp()
	{
		return (Date) readProperty("dateOp");
	}

	public void setIdMarket(Integer idMarket)
	{
		writeProperty("idMarket", idMarket);
	}

	public Integer getIdMarket()
	{
		return (Integer) readProperty("idMarket");
	}

	public void setMarketDescription(String marketDescription)
	{
		writeProperty("marketDescription", marketDescription);
	}

	public String getMarketDescription()
	{
		return (String) readProperty("marketDescription");
	}

	public void setMarketUom(String marketUom)
	{
		writeProperty("marketUom", marketUom);
	}

	public String getMarketUom()
	{
		return (String) readProperty("marketUom");
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

	public void setWeekDays(String weekDays)
	{
		writeProperty("weekDays", weekDays);
	}

	public String getWeekDays()
	{
		return (String) readProperty("weekDays");
	}

}
