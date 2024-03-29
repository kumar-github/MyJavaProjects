package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudOtcOptionValue was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudOtcOptionValue extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> OTC_OPT_CODE = new Property<String>("otcOptCode");
	public static final Property<Double> OTC_OPT_DELTA = new Property<Double>("otcOptDelta");
	public static final Property<Double> OTC_OPT_PRICE = new Property<Double>("otcOptPrice");
	public static final Property<Date> OTC_OPT_QUOTE_DATE = new Property<Date>("otcOptQuoteDate");
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

	public void setOtcOptDelta(Double otcOptDelta)
	{
		writeProperty("otcOptDelta", otcOptDelta);
	}

	public Double getOtcOptDelta()
	{
		return (Double) readProperty("otcOptDelta");
	}

	public void setOtcOptPrice(Double otcOptPrice)
	{
		writeProperty("otcOptPrice", otcOptPrice);
	}

	public Double getOtcOptPrice()
	{
		return (Double) readProperty("otcOptPrice");
	}

	public void setOtcOptQuoteDate(Date otcOptQuoteDate)
	{
		writeProperty("otcOptQuoteDate", otcOptQuoteDate);
	}

	public Date getOtcOptQuoteDate()
	{
		return (Date) readProperty("otcOptQuoteDate");
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
