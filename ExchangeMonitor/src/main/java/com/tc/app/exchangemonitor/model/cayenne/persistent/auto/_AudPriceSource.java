package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudPriceSource was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudPriceSource extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> PRICE_SOURCE_CODE = new Property<String>("priceSourceCode");
	public static final Property<String> PRICE_SOURCE_NAME = new Property<String>("priceSourceName");
	public static final Property<String> PRICE_SOURCE_TYPE = new Property<String>("priceSourceType");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setPriceSourceCode(String priceSourceCode)
	{
		writeProperty("priceSourceCode", priceSourceCode);
	}

	public String getPriceSourceCode()
	{
		return (String) readProperty("priceSourceCode");
	}

	public void setPriceSourceName(String priceSourceName)
	{
		writeProperty("priceSourceName", priceSourceName);
	}

	public String getPriceSourceName()
	{
		return (String) readProperty("priceSourceName");
	}

	public void setPriceSourceType(String priceSourceType)
	{
		writeProperty("priceSourceType", priceSourceType);
	}

	public String getPriceSourceType()
	{
		return (String) readProperty("priceSourceType");
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
