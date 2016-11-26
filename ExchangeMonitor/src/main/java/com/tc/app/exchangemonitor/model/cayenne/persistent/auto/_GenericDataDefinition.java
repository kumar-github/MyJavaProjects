package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _GenericDataDefinition was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _GenericDataDefinition extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String GDD_NUM_PK_COLUMN = "gdd_num";

	public static final Property<String> ATTR_NAME = new Property<String>("attrName");
	public static final Property<String> DATA_NAME = new Property<String>("dataName");
	public static final Property<Short> DATA_TYPE_IND = new Property<Short>("dataTypeInd");
	public static final Property<Integer> GDN_NUM = new Property<Integer>("gdnNum");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setAttrName(String attrName)
	{
		writeProperty("attrName", attrName);
	}

	public String getAttrName()
	{
		return (String) readProperty("attrName");
	}

	public void setDataName(String dataName)
	{
		writeProperty("dataName", dataName);
	}

	public String getDataName()
	{
		return (String) readProperty("dataName");
	}

	public void setDataTypeInd(Short dataTypeInd)
	{
		writeProperty("dataTypeInd", dataTypeInd);
	}

	public Short getDataTypeInd()
	{
		return (Short) readProperty("dataTypeInd");
	}

	public void setGdnNum(Integer gdnNum)
	{
		writeProperty("gdnNum", gdnNum);
	}

	public Integer getGdnNum()
	{
		return (Integer) readProperty("gdnNum");
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
