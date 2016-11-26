package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudQuoteMarketdataSource was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudQuoteMarketdataSource extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> CALENDAR_CODE = new Property<String>("calendarCode");
	public static final Property<String> CURRENCY_CODE = new Property<String>("currencyCode");
	public static final Property<Integer> ID = new Property<Integer>("id");
	public static final Property<Integer> QUOTE_ID = new Property<Integer>("quoteId");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<String> UOM_CODE = new Property<String>("uomCode");
	public static final Property<Integer> VENDOR_ID = new Property<Integer>("vendorId");

	public void setCalendarCode(String calendarCode)
	{
		writeProperty("calendarCode", calendarCode);
	}

	public String getCalendarCode()
	{
		return (String) readProperty("calendarCode");
	}

	public void setCurrencyCode(String currencyCode)
	{
		writeProperty("currencyCode", currencyCode);
	}

	public String getCurrencyCode()
	{
		return (String) readProperty("currencyCode");
	}

	public void setId(Integer id)
	{
		writeProperty("id", id);
	}

	public Integer getId()
	{
		return (Integer) readProperty("id");
	}

	public void setQuoteId(Integer quoteId)
	{
		writeProperty("quoteId", quoteId);
	}

	public Integer getQuoteId()
	{
		return (Integer) readProperty("quoteId");
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

	public void setUomCode(String uomCode)
	{
		writeProperty("uomCode", uomCode);
	}

	public String getUomCode()
	{
		return (String) readProperty("uomCode");
	}

	public void setVendorId(Integer vendorId)
	{
		writeProperty("vendorId", vendorId);
	}

	public Integer getVendorId()
	{
		return (Integer) readProperty("vendorId");
	}

}
