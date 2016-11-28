package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _EntityKeyName was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _EntityKeyName extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String ENTITY_NAME_PK_COLUMN = "entity_name";
	public static final String KEY_NUM_PK_COLUMN = "key_num";

	public static final Property<String> KEY_DATA_TYPE = new Property<String>("keyDataType");
	public static final Property<String> KEY_NAME = new Property<String>("keyName");

	public void setKeyDataType(String keyDataType)
	{
		writeProperty("keyDataType", keyDataType);
	}

	public String getKeyDataType()
	{
		return (String) readProperty("keyDataType");
	}

	public void setKeyName(String keyName)
	{
		writeProperty("keyName", keyName);
	}

	public String getKeyName()
	{
		return (String) readProperty("keyName");
	}

}