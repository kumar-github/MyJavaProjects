package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudLcUsage was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudLcUsage extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> LC_USAGE_CODE = new Property<String>("lcUsageCode");
	public static final Property<String> LC_USAGE_DESC = new Property<String>("lcUsageDesc");
	public static final Property<String> LC_USAGE_SHORT_NAME = new Property<String>("lcUsageShortName");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setLcUsageCode(String lcUsageCode)
	{
		writeProperty("lcUsageCode", lcUsageCode);
	}

	public String getLcUsageCode()
	{
		return (String) readProperty("lcUsageCode");
	}

	public void setLcUsageDesc(String lcUsageDesc)
	{
		writeProperty("lcUsageDesc", lcUsageDesc);
	}

	public String getLcUsageDesc()
	{
		return (String) readProperty("lcUsageDesc");
	}

	public void setLcUsageShortName(String lcUsageShortName)
	{
		writeProperty("lcUsageShortName", lcUsageShortName);
	}

	public String getLcUsageShortName()
	{
		return (String) readProperty("lcUsageShortName");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
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
