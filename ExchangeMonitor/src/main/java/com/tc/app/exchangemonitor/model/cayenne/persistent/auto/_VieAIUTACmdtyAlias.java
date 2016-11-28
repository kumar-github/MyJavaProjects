package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VieAIUTACmdtyAlias was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VieAIUTACmdtyAlias extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> CMDTY_ALIAS_NAME = new Property<String>("cmdtyAliasName");
	public static final Property<String> CMDTY_CODE = new Property<String>("cmdtyCode");

	public void setCmdtyAliasName(String cmdtyAliasName)
	{
		writeProperty("cmdtyAliasName", cmdtyAliasName);
	}

	public String getCmdtyAliasName()
	{
		return (String) readProperty("cmdtyAliasName");
	}

	public void setCmdtyCode(String cmdtyCode)
	{
		writeProperty("cmdtyCode", cmdtyCode);
	}

	public String getCmdtyCode()
	{
		return (String) readProperty("cmdtyCode");
	}

}