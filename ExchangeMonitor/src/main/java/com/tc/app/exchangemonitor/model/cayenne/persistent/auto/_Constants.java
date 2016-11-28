package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _Constants was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Constants extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String ATTRIBUTE_NAME_PK_COLUMN = "attribute_name";

	public static final Property<String> ATTRIBUTE_NOTE = new Property<String>("attributeNote");
	public static final Property<String> ATTRIBUTE_STATUS = new Property<String>("attributeStatus");
	public static final Property<String> ATTRIBUTE_VALUE = new Property<String>("attributeValue");
	public static final Property<String> CLIENT_EDIT_IND = new Property<String>("clientEditInd");

	public void setAttributeNote(String attributeNote)
	{
		writeProperty("attributeNote", attributeNote);
	}

	public String getAttributeNote()
	{
		return (String) readProperty("attributeNote");
	}

	public void setAttributeStatus(String attributeStatus)
	{
		writeProperty("attributeStatus", attributeStatus);
	}

	public String getAttributeStatus()
	{
		return (String) readProperty("attributeStatus");
	}

	public void setAttributeValue(String attributeValue)
	{
		writeProperty("attributeValue", attributeValue);
	}

	public String getAttributeValue()
	{
		return (String) readProperty("attributeValue");
	}

	public void setClientEditInd(String clientEditInd)
	{
		writeProperty("clientEditInd", clientEditInd);
	}

	public String getClientEditInd()
	{
		return (String) readProperty("clientEditInd");
	}

}