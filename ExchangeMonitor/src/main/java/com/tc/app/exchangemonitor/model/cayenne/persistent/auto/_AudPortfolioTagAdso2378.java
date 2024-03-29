package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudPortfolioTagAdso2378 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudPortfolioTagAdso2378 extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> PORT_NUM = new Property<Integer>("portNum");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<String> TAG_NAME = new Property<String>("tagName");
	public static final Property<String> TAG_VALUE = new Property<String>("tagValue");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setPortNum(Integer portNum)
	{
		writeProperty("portNum", portNum);
	}

	public Integer getPortNum()
	{
		return (Integer) readProperty("portNum");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setTagName(String tagName)
	{
		writeProperty("tagName", tagName);
	}

	public String getTagName()
	{
		return (String) readProperty("tagName");
	}

	public void setTagValue(String tagValue)
	{
		writeProperty("tagValue", tagValue);
	}

	public String getTagValue()
	{
		return (String) readProperty("tagValue");
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
