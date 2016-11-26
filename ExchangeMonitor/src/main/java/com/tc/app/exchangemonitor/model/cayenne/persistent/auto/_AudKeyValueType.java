package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudKeyValueType was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudKeyValueType extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> KEY_VALUE_DESC = new Property<String>("keyValueDesc");
	public static final Property<String> KEY_VALUE_NAME = new Property<String>("keyValueName");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setKeyValueDesc(String keyValueDesc)
	{
		writeProperty("keyValueDesc", keyValueDesc);
	}

	public String getKeyValueDesc()
	{
		return (String) readProperty("keyValueDesc");
	}

	public void setKeyValueName(String keyValueName)
	{
		writeProperty("keyValueName", keyValueName);
	}

	public String getKeyValueName()
	{
		return (String) readProperty("keyValueName");
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
