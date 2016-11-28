package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.AliasSource;

/**
 * Class _PortfolioAlias was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PortfolioAlias extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String ALIAS_SOURCE_CODE_PK_COLUMN = "alias_source_code";
	public static final String PORT_NUM_PK_COLUMN = "port_num";

	public static final Property<String> PORT_ALIAS_DESC = new Property<String>("portAliasDesc");
	public static final Property<String> PORT_ALIAS_NAME = new Property<String>("portAliasName");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<AliasSource> ALIAS_SOURCE = new Property<AliasSource>("aliasSource");

	public void setPortAliasDesc(String portAliasDesc)
	{
		writeProperty("portAliasDesc", portAliasDesc);
	}

	public String getPortAliasDesc()
	{
		return (String) readProperty("portAliasDesc");
	}

	public void setPortAliasName(String portAliasName)
	{
		writeProperty("portAliasName", portAliasName);
	}

	public String getPortAliasName()
	{
		return (String) readProperty("portAliasName");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setAliasSource(AliasSource aliasSource)
	{
		setToOneTarget("aliasSource", aliasSource, true);
	}

	public AliasSource getAliasSource()
	{
		return (AliasSource) readProperty("aliasSource");
	}

}