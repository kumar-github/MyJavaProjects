package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.AliasSource;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Commodity;

/**
 * Class _CommodityAlias was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CommodityAlias extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String ALIAS_SOURCE_CODE_PK_COLUMN = "alias_source_code";
	public static final String CMDTY_CODE_PK_COLUMN = "cmdty_code";

	public static final Property<String> CMDTY_ALIAS_NAME = new Property<String>("cmdtyAliasName");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<AliasSource> ALIAS_SOURCE = new Property<AliasSource>("aliasSource");
	public static final Property<Commodity> COMMODITY = new Property<Commodity>("commodity");

	public void setCmdtyAliasName(String cmdtyAliasName)
	{
		writeProperty("cmdtyAliasName", cmdtyAliasName);
	}

	public String getCmdtyAliasName()
	{
		return (String) readProperty("cmdtyAliasName");
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

	public void setCommodity(Commodity commodity)
	{
		setToOneTarget("commodity", commodity, true);
	}

	public Commodity getCommodity()
	{
		return (Commodity) readProperty("commodity");
	}

}
