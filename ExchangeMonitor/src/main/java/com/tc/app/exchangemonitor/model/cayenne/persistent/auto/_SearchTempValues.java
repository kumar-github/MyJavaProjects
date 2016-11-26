package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _SearchTempValues was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _SearchTempValues extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String SPID_PK_COLUMN = "spid";

	public static final Property<String> CODE_VALUE = new Property<String>("codeValue");
	public static final Property<Integer> INT_VALUE = new Property<Integer>("intValue");
	public static final Property<Short> UNIQUE_ID = new Property<Short>("uniqueId");

	public void setCodeValue(String codeValue)
	{
		writeProperty("codeValue", codeValue);
	}

	public String getCodeValue()
	{
		return (String) readProperty("codeValue");
	}

	public void setIntValue(Integer intValue)
	{
		writeProperty("intValue", intValue);
	}

	public Integer getIntValue()
	{
		return (Integer) readProperty("intValue");
	}

	public void setUniqueId(Short uniqueId)
	{
		writeProperty("uniqueId", uniqueId);
	}

	public Short getUniqueId()
	{
		return (Short) readProperty("uniqueId");
	}

}
