package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VBcpPricesFeb2 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VBcpPricesFeb2 extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> AVG_CLOSED_CREATION_IND = new Property<String>("avgClosedCreationInd");
	public static final Property<Double> AVG_CLOSED_PRICE = new Property<Double>("avgClosedPrice");
	public static final Property<Integer> COMMKT_KEY = new Property<Integer>("commktKey");
	public static final Property<String> CREATION_TYPE = new Property<String>("creationType");
	public static final Property<String> HIGH_ASKED_CREATION_IND = new Property<String>("highAskedCreationInd");
	public static final Property<Double> HIGH_ASKED_PRICE = new Property<Double>("highAskedPrice");
	public static final Property<String> LOW_BID_CREATION_IND = new Property<String>("lowBidCreationInd");
	public static final Property<Double> LOW_BID_PRICE = new Property<Double>("lowBidPrice");
	public static final Property<Double> OPEN_INTEREST = new Property<Double>("openInterest");
	public static final Property<Date> PRICE_QUOTE_DATE = new Property<Date>("priceQuoteDate");
	public static final Property<String> PRICE_SOURCE_CODE = new Property<String>("priceSourceCode");
	public static final Property<String> TRADING_PRD = new Property<String>("tradingPrd");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<Double> VOL_TRADED = new Property<Double>("volTraded");

	public void setAvgClosedCreationInd(String avgClosedCreationInd)
	{
		writeProperty("avgClosedCreationInd", avgClosedCreationInd);
	}

	public String getAvgClosedCreationInd()
	{
		return (String) readProperty("avgClosedCreationInd");
	}

	public void setAvgClosedPrice(Double avgClosedPrice)
	{
		writeProperty("avgClosedPrice", avgClosedPrice);
	}

	public Double getAvgClosedPrice()
	{
		return (Double) readProperty("avgClosedPrice");
	}

	public void setCommktKey(Integer commktKey)
	{
		writeProperty("commktKey", commktKey);
	}

	public Integer getCommktKey()
	{
		return (Integer) readProperty("commktKey");
	}

	public void setCreationType(String creationType)
	{
		writeProperty("creationType", creationType);
	}

	public String getCreationType()
	{
		return (String) readProperty("creationType");
	}

	public void setHighAskedCreationInd(String highAskedCreationInd)
	{
		writeProperty("highAskedCreationInd", highAskedCreationInd);
	}

	public String getHighAskedCreationInd()
	{
		return (String) readProperty("highAskedCreationInd");
	}

	public void setHighAskedPrice(Double highAskedPrice)
	{
		writeProperty("highAskedPrice", highAskedPrice);
	}

	public Double getHighAskedPrice()
	{
		return (Double) readProperty("highAskedPrice");
	}

	public void setLowBidCreationInd(String lowBidCreationInd)
	{
		writeProperty("lowBidCreationInd", lowBidCreationInd);
	}

	public String getLowBidCreationInd()
	{
		return (String) readProperty("lowBidCreationInd");
	}

	public void setLowBidPrice(Double lowBidPrice)
	{
		writeProperty("lowBidPrice", lowBidPrice);
	}

	public Double getLowBidPrice()
	{
		return (Double) readProperty("lowBidPrice");
	}

	public void setOpenInterest(Double openInterest)
	{
		writeProperty("openInterest", openInterest);
	}

	public Double getOpenInterest()
	{
		return (Double) readProperty("openInterest");
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

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setVolTraded(Double volTraded)
	{
		writeProperty("volTraded", volTraded);
	}

	public Double getVolTraded()
	{
		return (Double) readProperty("volTraded");
	}

}