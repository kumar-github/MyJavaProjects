package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudTaxQualificationType was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudTaxQualificationType extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> CODE = new Property<String>("code");
	public static final Property<String> LONG_DESCRIPTION = new Property<String>("longDescription");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setCode(String code)
	{
		writeProperty("code", code);
	}

	public String getCode()
	{
		return (String) readProperty("code");
	}

	public void setLongDescription(String longDescription)
	{
		writeProperty("longDescription", longDescription);
	}

	public String getLongDescription()
	{
		return (String) readProperty("longDescription");
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
