package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudGenericDataName was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudGenericDataName extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> DATA_NAME = new Property<String>("dataName");
	public static final Property<Integer> GDN_NUM = new Property<Integer>("gdnNum");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setDataName(String dataName)
	{
		writeProperty("dataName", dataName);
	}

	public String getDataName()
	{
		return (String) readProperty("dataName");
	}

	public void setGdnNum(Integer gdnNum)
	{
		writeProperty("gdnNum", gdnNum);
	}

	public Integer getGdnNum()
	{
		return (Integer) readProperty("gdnNum");
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
