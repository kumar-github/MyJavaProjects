package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VSapFxCurve was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VSapFxCurve extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Double> AVG_CLOSED_PRICE = new Property<Double>("avgClosedPrice");
	public static final Property<String> CURRENCY_PAIR = new Property<String>("currencyPair");
	public static final Property<Date> PRICE_QUOTE_DATE = new Property<Date>("priceQuoteDate");
	public static final Property<String> PRICE_SOURCE_CODE = new Property<String>("priceSourceCode");
	public static final Property<String> TRADING_PRD = new Property<String>("tradingPrd");

	public void setAvgClosedPrice(Double avgClosedPrice)
	{
		writeProperty("avgClosedPrice", avgClosedPrice);
	}

	public Double getAvgClosedPrice()
	{
		return (Double) readProperty("avgClosedPrice");
	}

	public void setCurrencyPair(String currencyPair)
	{
		writeProperty("currencyPair", currencyPair);
	}

	public String getCurrencyPair()
	{
		return (String) readProperty("currencyPair");
	}

	public void setPriceQuoteDate(Date priceQuoteDate)
	{
		writeProperty("priceQuoteDate", priceQuoteDate);
	}

	public Date getPriceQuoteDate()
	{
		return (Date) readProperty("priceQuoteDate");
	}

	public void setPriceSourceCode(String priceSourceCode)
	{
		writeProperty("priceSourceCode", priceSourceCode);
	}

	public String getPriceSourceCode()
	{
		return (String) readProperty("priceSourceCode");
	}

	public void setTradingPrd(String tradingPrd)
	{
		writeProperty("tradingPrd", tradingPrd);
	}

	public String getTradingPrd()
	{
		return (String) readProperty("tradingPrd");
	}

}