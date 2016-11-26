package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudEntityTagInspAttr was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudEntityTagInspAttr extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> ENTITY_TAG_ATTR_NAME = new Property<String>("entityTagAttrName");
	public static final Property<String> ENTITY_TAG_ATTR_VALUE = new Property<String>("entityTagAttrValue");
	public static final Property<Integer> ENTITY_TAG_ID = new Property<Integer>("entityTagId");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setEntityTagAttrName(String entityTagAttrName)
	{
		writeProperty("entityTagAttrName", entityTagAttrName);
	}

	public String getEntityTagAttrName()
	{
		return (String) readProperty("entityTagAttrName");
	}

	public void setEntityTagAttrValue(String entityTagAttrValue)
	{
		writeProperty("entityTagAttrValue", entityTagAttrValue);
	}

	public String getEntityTagAttrValue()
	{
		return (String) readProperty("entityTagAttrValue");
	}

	public void setEntityTagId(Integer entityTagId)
	{
		writeProperty("entityTagId", entityTagId);
	}

	public Integer getEntityTagId()
	{
		return (Integer) readProperty("entityTagId");
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
