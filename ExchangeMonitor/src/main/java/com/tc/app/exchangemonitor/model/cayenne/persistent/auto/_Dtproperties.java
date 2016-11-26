package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _Dtproperties was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Dtproperties extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String ID_PK_COLUMN = "id";
	public static final String PROPERTY_PK_COLUMN = "property";

	public static final Property<byte[]> LVALUE = new Property<byte[]>("lvalue");
	public static final Property<Integer> OBJECTID = new Property<Integer>("objectid");
	public static final Property<String> UVALUE = new Property<String>("uvalue");
	public static final Property<String> VALUE = new Property<String>("value");
	public static final Property<Integer> VERSION = new Property<Integer>("version");

	public void setLvalue(byte[] lvalue)
	{
		writeProperty("lvalue", lvalue);
	}

	public byte[] getLvalue()
	{
		return (byte[]) readProperty("lvalue");
	}

	public void setObjectid(Integer objectid)
	{
		writeProperty("objectid", objectid);
	}

	public Integer getObjectid()
	{
		return (Integer) readProperty("objectid");
	}

	public void setUvalue(String uvalue)
	{
		writeProperty("uvalue", uvalue);
	}

	public String getUvalue()
	{
		return (String) readProperty("uvalue");
	}

	public void setValue(String value)
	{
		writeProperty("value", value);
	}

	public String getValue()
	{
		return (String) readProperty("value");
	}

	public void setVersion(Integer version)
	{
		writeProperty("version", version);
	}

	public Integer getVersion()
	{
		return (Integer) readProperty("version");
	}

}
