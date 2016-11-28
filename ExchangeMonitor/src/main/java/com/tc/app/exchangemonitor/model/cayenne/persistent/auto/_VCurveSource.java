package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VCurveSource was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VCurveSource extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> ALIAS_SOURCE_CODE = new Property<String>("aliasSourceCode");
	public static final Property<String> COMMKT_ALIAS_NAME = new Property<String>("commktAliasName");
	public static final Property<Integer> COMMKT_KEY = new Property<Integer>("commktKey");

	public void setAliasSourceCode(String aliasSourceCode)
	{
		writeProperty("aliasSourceCode", aliasSourceCode);
	}

	public String getAliasSourceCode()
	{
		return (String) readProperty("aliasSourceCode");
	}

	public void setCommktAliasName(String commktAliasName)
	{
		writeProperty("commktAliasName", commktAliasName);
	}

	public String getCommktAliasName()
	{
		return (String) readProperty("commktAliasName");
	}

	public void setCommktKey(Integer commktKey)
	{
		writeProperty("commktKey", commktKey);
	}

	public Integer getCommktKey()
	{
		return (Integer) readProperty("commktKey");
	}

}