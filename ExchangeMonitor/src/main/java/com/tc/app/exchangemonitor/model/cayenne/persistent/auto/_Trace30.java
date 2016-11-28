package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _Trace30 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Trace30 extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String ROW_NUMBER_PK_COLUMN = "RowNumber";

	public static final Property<String> APPLICATION_NAME = new Property<String>("applicationName");
	public static final Property<byte[]> BINARY_DATA = new Property<byte[]>("binaryData");
	public static final Property<Integer> CLIENT_PROCESS_ID = new Property<Integer>("clientProcessID");
	public static final Property<Integer> CPU = new Property<Integer>("cpu");
	public static final Property<Long> DURATION = new Property<Long>("duration");
	public static final Property<Date> END_TIME = new Property<Date>("endTime");
	public static final Property<Integer> EVENT_CLASS = new Property<Integer>("eventClass");
	public static final Property<String> LOGIN_NAME = new Property<String>("loginName");
	public static final Property<String> N_TUSER_NAME = new Property<String>("nTUserName");
	public static final Property<Long> READS = new Property<Long>("reads");
	public static final Property<Integer> SPID = new Property<Integer>("spid");
	public static final Property<Date> START_TIME = new Property<Date>("startTime");
	public static final Property<String> TEXT_DATA = new Property<String>("textData");
	public static final Property<Long> WRITES = new Property<Long>("writes");

	public void setApplicationName(String applicationName)
	{
		writeProperty("applicationName", applicationName);
	}

	public String getApplicationName()
	{
		return (String) readProperty("applicationName");
	}

	public void setBinaryData(byte[] binaryData)
	{
		writeProperty("binaryData", binaryData);
	}

	public byte[] getBinaryData()
	{
		return (byte[]) readProperty("binaryData");
	}

	public void setClientProcessID(Integer clientProcessID)
	{
		writeProperty("clientProcessID", clientProcessID);
	}

	public Integer getClientProcessID()
	{
		return (Integer) readProperty("clientProcessID");
	}

	public void setCpu(Integer cpu)
	{
		writeProperty("cpu", cpu);
	}

	public Integer getCpu()
	{
		return (Integer) readProperty("cpu");
	}

	public void setDuration(Long duration)
	{
		writeProperty("duration", duration);
	}

	public Long getDuration()
	{
		return (Long) readProperty("duration");
	}

	public void setEndTime(Date endTime)
	{
		writeProperty("endTime", endTime);
	}

	public Date getEndTime()
	{
		return (Date) readProperty("endTime");
	}

	public void setEventClass(Integer eventClass)
	{
		writeProperty("eventClass", eventClass);
	}

	public Integer getEventClass()
	{
		return (Integer) readProperty("eventClass");
	}

	public void setLoginName(String loginName)
	{
		writeProperty("loginName", loginName);
	}

	public String getLoginName()
	{
		return (String) readProperty("loginName");
	}

	public void setNTUserName(String nTUserName)
	{
		writeProperty("nTUserName", nTUserName);
	}

	public String getNTUserName()
	{
		return (String) readProperty("nTUserName");
	}

	public void setReads(Long reads)
	{
		writeProperty("reads", reads);
	}

	public Long getReads()
	{
		return (Long) readProperty("reads");
	}

	public void setSpid(Integer spid)
	{
		writeProperty("spid", spid);
	}

	public Integer getSpid()
	{
		return (Integer) readProperty("spid");
	}

	public void setStartTime(Date startTime)
	{
		writeProperty("startTime", startTime);
	}

	public Date getStartTime()
	{
		return (Date) readProperty("startTime");
	}

	public void setTextData(String textData)
	{
		writeProperty("textData", textData);
	}

	public String getTextData()
	{
		return (String) readProperty("textData");
	}

	public void setWrites(Long writes)
	{
		writeProperty("writes", writes);
	}

	public Long getWrites()
	{
		return (Long) readProperty("writes");
	}

}