package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.KeyValueType;

/**
 * Class _KeyValue was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _KeyValue extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String OID_PK_COLUMN = "oid";

	public static final Property<String> KEYSTRING = new Property<String>("keystring");
	public static final Property<Integer> OWNER_ID = new Property<Integer>("ownerId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<String> VALUE = new Property<String>("value");
	public static final Property<KeyValueType> KEY_VALUE_TYPE = new Property<KeyValueType>("keyValueType");

	public void setKeystring(String keystring)
	{
		writeProperty("keystring", keystring);
	}

	public String getKeystring()
	{
		return (String) readProperty("keystring");
	}

	public void setOwnerId(Integer ownerId)
	{
		writeProperty("ownerId", ownerId);
	}

	public Integer getOwnerId()
	{
		return (Integer) readProperty("ownerId");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setValue(String value)
	{
		writeProperty("value", value);
	}

	public String getValue()
	{
		return (String) readProperty("value");
	}

	public void setKeyValueType(KeyValueType keyValueType)
	{
		setToOneTarget("keyValueType", keyValueType, true);
	}

	public KeyValueType getKeyValueType()
	{
		return (KeyValueType) readProperty("keyValueType");
	}

}
