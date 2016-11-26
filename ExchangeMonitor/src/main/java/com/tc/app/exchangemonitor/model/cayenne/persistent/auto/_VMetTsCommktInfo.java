package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VMetTsCommktInfo was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VMetTsCommktInfo extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> CMDTY_CODE = new Property<String>("cmdtyCode");
	public static final Property<String> CMDTY_SHORT_NAME = new Property<String>("cmdtyShortName");
	public static final Property<String> CMDTY_TYPE = new Property<String>("cmdtyType");
	public static final Property<Integer> COMMKT_KEY = new Property<Integer>("commktKey");
	public static final Property<String> MKT_CODE = new Property<String>("mktCode");
	public static final Property<String> MKT_SHORT_NAME = new Property<String>("mktShortName");
	public static final Property<String> MKT_TYPE = new Property<String>("mktType");
	public static final Property<String> MTM_PRICE_SOURCE_CODE = new Property<String>("mtmPriceSourceCode");

	public void setCmdtyCode(String cmdtyCode)
	{
		writeProperty("cmdtyCode", cmdtyCode);
	}

	public String getCmdtyCode()
	{
		return (String) readProperty("cmdtyCode");
	}

	public void setCmdtyShortName(String cmdtyShortName)
	{
		writeProperty("cmdtyShortName", cmdtyShortName);
	}

	public String getCmdtyShortName()
	{
		return (String) readProperty("cmdtyShortName");
	}

	public void setCmdtyType(String cmdtyType)
	{
		writeProperty("cmdtyType", cmdtyType);
	}

	public String getCmdtyType()
	{
		return (String) readProperty("cmdtyType");
	}

	public void setCommktKey(Integer commktKey)
	{
		writeProperty("commktKey", commktKey);
	}

	public Integer getCommktKey()
	{
		return (Integer) readProperty("commktKey");
	}

	public void setMktCode(String mktCode)
	{
		writeProperty("mktCode", mktCode);
	}

	public String getMktCode()
	{
		return (String) readProperty("mktCode");
	}

	public void setMktShortName(String mktShortName)
	{
		writeProperty("mktShortName", mktShortName);
	}

	public String getMktShortName()
	{
		return (String) readProperty("mktShortName");
	}

	public void setMktType(String mktType)
	{
		writeProperty("mktType", mktType);
	}

	public String getMktType()
	{
		return (String) readProperty("mktType");
	}

	public void setMtmPriceSourceCode(String mtmPriceSourceCode)
	{
		writeProperty("mtmPriceSourceCode", mtmPriceSourceCode);
	}

	public String getMtmPriceSourceCode()
	{
		return (String) readProperty("mtmPriceSourceCode");
	}

}
