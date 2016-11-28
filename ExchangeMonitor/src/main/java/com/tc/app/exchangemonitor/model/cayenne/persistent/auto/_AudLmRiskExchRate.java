package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudLmRiskExchRate was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudLmRiskExchRate extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> EXCH_CODE = new Property<String>("exchCode");
	public static final Property<BigDecimal> EXCH_RATE = new Property<BigDecimal>("exchRate");
	public static final Property<String> FROM_CURR_CODE = new Property<String>("fromCurrCode");
	public static final Property<Date> QUOTE_DATE = new Property<Date>("quoteDate");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<String> TO_CURR_CODE = new Property<String>("toCurrCode");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setExchCode(String exchCode)
	{
		writeProperty("exchCode", exchCode);
	}

	public String getExchCode()
	{
		return (String) readProperty("exchCode");
	}

	public void setExchRate(BigDecimal exchRate)
	{
		writeProperty("exchRate", exchRate);
	}

	public BigDecimal getExchRate()
	{
		return (BigDecimal) readProperty("exchRate");
	}

	public void setFromCurrCode(String fromCurrCode)
	{
		writeProperty("fromCurrCode", fromCurrCode);
	}

	public String getFromCurrCode()
	{
		return (String) readProperty("fromCurrCode");
	}

	public void setQuoteDate(Date quoteDate)
	{
		writeProperty("quoteDate", quoteDate);
	}

	public Date getQuoteDate()
	{
		return (Date) readProperty("quoteDate");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setToCurrCode(String toCurrCode)
	{
		writeProperty("toCurrCode", toCurrCode);
	}

	public String getToCurrCode()
	{
		return (String) readProperty("toCurrCode");
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