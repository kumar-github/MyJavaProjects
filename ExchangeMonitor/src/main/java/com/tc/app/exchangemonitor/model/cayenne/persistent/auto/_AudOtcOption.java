package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudOtcOption was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudOtcOption extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> OTC_OPT_CODE = new Property<String>("otcOptCode");
	public static final Property<String> OTC_OPT_DESC = new Property<String>("otcOptDesc");
	public static final Property<String> OTC_OPT_PRICE_CURR_CODE = new Property<String>("otcOptPriceCurrCode");
	public static final Property<String> OTC_OPT_PRICE_UOM_CODE = new Property<String>("otcOptPriceUomCode");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setOtcOptCode(String otcOptCode)
	{
		writeProperty("otcOptCode", otcOptCode);
	}

	public String getOtcOptCode()
	{
		return (String) readProperty("otcOptCode");
	}

	public void setOtcOptDesc(String otcOptDesc)
	{
		writeProperty("otcOptDesc", otcOptDesc);
	}

	public String getOtcOptDesc()
	{
		return (String) readProperty("otcOptDesc");
	}

	public void setOtcOptPriceCurrCode(String otcOptPriceCurrCode)
	{
		writeProperty("otcOptPriceCurrCode", otcOptPriceCurrCode);
	}

	public String getOtcOptPriceCurrCode()
	{
		return (String) readProperty("otcOptPriceCurrCode");
	}

	public void setOtcOptPriceUomCode(String otcOptPriceUomCode)
	{
		writeProperty("otcOptPriceUomCode", otcOptPriceUomCode);
	}

	public String getOtcOptPriceUomCode()
	{
		return (String) readProperty("otcOptPriceUomCode");
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
