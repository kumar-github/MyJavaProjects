package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudMotAlias was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudMotAlias extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> ALIAS_SOURCE_CODE = new Property<String>("aliasSourceCode");
	public static final Property<String> MOT_ALIAS_NAME = new Property<String>("motAliasName");
	public static final Property<String> MOT_CODE = new Property<String>("motCode");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setAliasSourceCode(String aliasSourceCode)
	{
		writeProperty("aliasSourceCode", aliasSourceCode);
	}

	public String getAliasSourceCode()
	{
		return (String) readProperty("aliasSourceCode");
	}

	public void setMotAliasName(String motAliasName)
	{
		writeProperty("motAliasName", motAliasName);
	}

	public String getMotAliasName()
	{
		return (String) readProperty("motAliasName");
	}

	public void setMotCode(String motCode)
	{
		writeProperty("motCode", motCode);
	}

	public String getMotCode()
	{
		return (String) readProperty("motCode");
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