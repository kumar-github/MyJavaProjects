package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudMarketdataFile was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudMarketdataFile extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> ID = new Property<Integer>("id");
	public static final Property<String> NAME = new Property<String>("name");
	public static final Property<Integer> PARSER_ID = new Property<Integer>("parserId");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setId(Integer id)
	{
		writeProperty("id", id);
	}

	public Integer getId()
	{
		return (Integer) readProperty("id");
	}

	public void setName(String name)
	{
		writeProperty("name", name);
	}

	public String getName()
	{
		return (String) readProperty("name");
	}

	public void setParserId(Integer parserId)
	{
		writeProperty("parserId", parserId);
	}

	public Integer getParserId()
	{
		return (Integer) readProperty("parserId");
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