package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudPortfolioTagOptionAdso2378 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudPortfolioTagOptionAdso2378 extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<String> TAG_NAME = new Property<String>("tagName");
	public static final Property<String> TAG_OPTION = new Property<String>("tagOption");
	public static final Property<String> TAG_OPTION_DESC = new Property<String>("tagOptionDesc");
	public static final Property<String> TAG_OPTION_STATUS = new Property<String>("tagOptionStatus");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

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

	public void setTagOption(String tagOption)
	{
		writeProperty("tagOption", tagOption);
	}

	public String getTagOption()
	{
		return (String) readProperty("tagOption");
	}

	public void setTagOptionDesc(String tagOptionDesc)
	{
		writeProperty("tagOptionDesc", tagOptionDesc);
	}

	public String getTagOptionDesc()
	{
		return (String) readProperty("tagOptionDesc");
	}

	public void setTagOptionStatus(String tagOptionStatus)
	{
		writeProperty("tagOptionStatus", tagOptionStatus);
	}

	public String getTagOptionStatus()
	{
		return (String) readProperty("tagOptionStatus");
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
