package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudTimeZone was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudTimeZone extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<String> TIME_ZONE_CODE = new Property<String>("timeZoneCode");
	public static final Property<String> TIME_ZONE_DESC = new Property<String>("timeZoneDesc");
	public static final Property<Integer> TIME_ZONE_OFFSET = new Property<Integer>("timeZoneOffset");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setTimeZoneCode(String timeZoneCode)
	{
		writeProperty("timeZoneCode", timeZoneCode);
	}

	public String getTimeZoneCode()
	{
		return (String) readProperty("timeZoneCode");
	}

	public void setTimeZoneDesc(String timeZoneDesc)
	{
		writeProperty("timeZoneDesc", timeZoneDesc);
	}

	public String getTimeZoneDesc()
	{
		return (String) readProperty("timeZoneDesc");
	}

	public void setTimeZoneOffset(Integer timeZoneOffset)
	{
		writeProperty("timeZoneOffset", timeZoneOffset);
	}

	public Integer getTimeZoneOffset()
	{
		return (Integer) readProperty("timeZoneOffset");
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
