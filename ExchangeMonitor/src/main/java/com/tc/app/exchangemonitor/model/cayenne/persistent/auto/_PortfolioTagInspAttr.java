package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _PortfolioTagInspAttr was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PortfolioTagInspAttr extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> REF_INSP_ATTR_NAME = new Property<String>("refInspAttrName");
	public static final Property<String> REF_INSP_ATTR_TYPE_IND = new Property<String>("refInspAttrTypeInd");
	public static final Property<String> REF_INSP_ATTR_VALUE = new Property<String>("refInspAttrValue");
	public static final Property<String> TAG_NAME = new Property<String>("tagName");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setRefInspAttrName(String refInspAttrName)
	{
		writeProperty("refInspAttrName", refInspAttrName);
	}

	public String getRefInspAttrName()
	{
		return (String) readProperty("refInspAttrName");
	}

	public void setRefInspAttrTypeInd(String refInspAttrTypeInd)
	{
		writeProperty("refInspAttrTypeInd", refInspAttrTypeInd);
	}

	public String getRefInspAttrTypeInd()
	{
		return (String) readProperty("refInspAttrTypeInd");
	}

	public void setRefInspAttrValue(String refInspAttrValue)
	{
		writeProperty("refInspAttrValue", refInspAttrValue);
	}

	public String getRefInspAttrValue()
	{
		return (String) readProperty("refInspAttrValue");
	}

	public void setTagName(String tagName)
	{
		writeProperty("tagName", tagName);
	}

	public String getTagName()
	{
		return (String) readProperty("tagName");
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