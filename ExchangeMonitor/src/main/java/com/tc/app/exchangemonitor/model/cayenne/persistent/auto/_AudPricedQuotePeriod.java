package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudPricedQuotePeriod was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudPricedQuotePeriod extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Date> END_PRICING_DATE = new Property<Date>("endPricingDate");
	public static final Property<Date> END_TRADING_DATE = new Property<Date>("endTradingDate");
	public static final Property<Integer> ID = new Property<Integer>("id");
	public static final Property<Integer> QUOTE_ID = new Property<Integer>("quoteId");
	public static final Property<Integer> QUOTE_PERIOD_DESC_ID = new Property<Integer>("quotePeriodDescId");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<String> SYMBOL = new Property<String>("symbol");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<String> TYPE = new Property<String>("type");

	public void setEndPricingDate(Date endPricingDate)
	{
		writeProperty("endPricingDate", endPricingDate);
	}

	public Date getEndPricingDate()
	{
		return (Date) readProperty("endPricingDate");
	}

	public void setEndTradingDate(Date endTradingDate)
	{
		writeProperty("endTradingDate", endTradingDate);
	}

	public Date getEndTradingDate()
	{
		return (Date) readProperty("endTradingDate");
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

	public void setQuotePeriodDescId(Integer quotePeriodDescId)
	{
		writeProperty("quotePeriodDescId", quotePeriodDescId);
	}

	public Integer getQuotePeriodDescId()
	{
		return (Integer) readProperty("quotePeriodDescId");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setSymbol(String symbol)
	{
		writeProperty("symbol", symbol);
	}

	public String getSymbol()
	{
		return (String) readProperty("symbol");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setType(String type)
	{
		writeProperty("type", type);
	}

	public String getType()
	{
		return (String) readProperty("type");
	}

}