package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudGenericDataValues was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudGenericDataValues extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Date> DATETIME_VALUE = new Property<Date>("datetimeValue");
	public static final Property<Double> DOUBLE_VALUE = new Property<Double>("doubleValue");
	public static final Property<Integer> GDD_NUM = new Property<Integer>("gddNum");
	public static final Property<Integer> GDV_NUM = new Property<Integer>("gdvNum");
	public static final Property<Integer> INT_VALUE = new Property<Integer>("intValue");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<String> STRING_VALUE = new Property<String>("stringValue");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setDatetimeValue(Date datetimeValue)
	{
		writeProperty("datetimeValue", datetimeValue);
	}

	public Date getDatetimeValue()
	{
		return (Date) readProperty("datetimeValue");
	}

	public void setDoubleValue(Double doubleValue)
	{
		writeProperty("doubleValue", doubleValue);
	}

	public Double getDoubleValue()
	{
		return (Double) readProperty("doubleValue");
	}

	public void setGddNum(Integer gddNum)
	{
		writeProperty("gddNum", gddNum);
	}

	public Integer getGddNum()
	{
		return (Integer) readProperty("gddNum");
	}

	public void setGdvNum(Integer gdvNum)
	{
		writeProperty("gdvNum", gdvNum);
	}

	public Integer getGdvNum()
	{
		return (Integer) readProperty("gdvNum");
	}

	public void setIntValue(Integer intValue)
	{
		writeProperty("intValue", intValue);
	}

	public Integer getIntValue()
	{
		return (Integer) readProperty("intValue");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setStringValue(String stringValue)
	{
		writeProperty("stringValue", stringValue);
	}

	public String getStringValue()
	{
		return (String) readProperty("stringValue");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

}