package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VPosgridPriceDetail was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VPosgridPriceDetail extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Double> AVG_CLOSED_PRICE = new Property<Double>("avgClosedPrice");
	public static final Property<String> CMDTY_CODE = new Property<String>("cmdtyCode");
	public static final Property<String> CMDTY_SHORT_NAME = new Property<String>("cmdtyShortName");
	public static final Property<Integer> COMMKT_KEY = new Property<Integer>("commktKey");
	public static final Property<Double> HIGH_ASKED_PRICE = new Property<Double>("highAskedPrice");
	public static final Property<Date> LAST_ISSUE_DATE = new Property<Date>("lastIssueDate");
	public static final Property<Date> LAST_TRADE_DATE = new Property<Date>("lastTradeDate");
	public static final Property<Double> LOT_SIZE = new Property<Double>("lotSize");
	public static final Property<Double> LOW_BID_PRICE = new Property<Double>("lowBidPrice");
	public static final Property<String> MKT_CODE = new Property<String>("mktCode");
	public static final Property<String> MKT_SHORT_NAME = new Property<String>("mktShortName");
	public static final Property<String> PRICE_CURR_CODE = new Property<String>("priceCurrCode");
	public static final Property<Date> PRICE_QUOTE_DATE = new Property<Date>("priceQuoteDate");
	public static final Property<String> PRICE_SOURCE_CODE = new Property<String>("priceSourceCode");
	public static final Property<String> PRICE_UOM_CODE = new Property<String>("priceUomCode");
	public static final Property<String> TRADING_PRD = new Property<String>("tradingPrd");
	public static final Property<String> TRADING_PRD_DESC = new Property<String>("tradingPrdDesc");
	public static final Property<String> UNDERLYING_CMDTY = new Property<String>("underlyingCmdty");
	public static final Property<String> UNDERLYING_CMDTY_CODE = new Property<String>("underlyingCmdtyCode");
	public static final Property<Integer> UNDERLYING_COMMKT_KEY = new Property<Integer>("underlyingCommktKey");
	public static final Property<String> UNDERLYING_MKT = new Property<String>("underlyingMkt");
	public static final Property<String> UNDERLYING_MKT_CODE = new Property<String>("underlyingMktCode");
	public static final Property<String> UNDERLYING_QUOTE = new Property<String>("underlyingQuote");
	public static final Property<Double> UNDERLYING_QUOTE_DIFF = new Property<Double>("underlyingQuoteDiff");
	public static final Property<String> UNDERLYING_QUOTE_TYPE = new Property<String>("underlyingQuoteType");
	public static final Property<String> UNDERLYING_SOURCE = new Property<String>("underlyingSource");
	public static final Property<String> UNDERLYING_TRADING_PRD = new Property<String>("underlyingTradingPrd");

	public void setAvgClosedPrice(Double avgClosedPrice)
	{
		writeProperty("avgClosedPrice", avgClosedPrice);
	}

	public Double getAvgClosedPrice()
	{
		return (Double) readProperty("avgClosedPrice");
	}

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

	public void setCommktKey(Integer commktKey)
	{
		writeProperty("commktKey", commktKey);
	}

	public Integer getCommktKey()
	{
		return (Integer) readProperty("commktKey");
	}

	public void setHighAskedPrice(Double highAskedPrice)
	{
		writeProperty("highAskedPrice", highAskedPrice);
	}

	public Double getHighAskedPrice()
	{
		return (Double) readProperty("highAskedPrice");
	}

	public void setLastIssueDate(Date lastIssueDate)
	{
		writeProperty("lastIssueDate", lastIssueDate);
	}

	public Date getLastIssueDate()
	{
		return (Date) readProperty("lastIssueDate");
	}

	public void setLastTradeDate(Date lastTradeDate)
	{
		writeProperty("lastTradeDate", lastTradeDate);
	}

	public Date getLastTradeDate()
	{
		return (Date) readProperty("lastTradeDate");
	}

	public void setLotSize(Double lotSize)
	{
		writeProperty("lotSize", lotSize);
	}

	public Double getLotSize()
	{
		return (Double) readProperty("lotSize");
	}

	public void setLowBidPrice(Double lowBidPrice)
	{
		writeProperty("lowBidPrice", lowBidPrice);
	}

	public Double getLowBidPrice()
	{
		return (Double) readProperty("lowBidPrice");
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

	public void setPriceCurrCode(String priceCurrCode)
	{
		writeProperty("priceCurrCode", priceCurrCode);
	}

	public String getPriceCurrCode()
	{
		return (String) readProperty("priceCurrCode");
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

	public void setPriceUomCode(String priceUomCode)
	{
		writeProperty("priceUomCode", priceUomCode);
	}

	public String getPriceUomCode()
	{
		return (String) readProperty("priceUomCode");
	}

	public void setTradingPrd(String tradingPrd)
	{
		writeProperty("tradingPrd", tradingPrd);
	}

	public String getTradingPrd()
	{
		return (String) readProperty("tradingPrd");
	}

	public void setTradingPrdDesc(String tradingPrdDesc)
	{
		writeProperty("tradingPrdDesc", tradingPrdDesc);
	}

	public String getTradingPrdDesc()
	{
		return (String) readProperty("tradingPrdDesc");
	}

	public void setUnderlyingCmdty(String underlyingCmdty)
	{
		writeProperty("underlyingCmdty", underlyingCmdty);
	}

	public String getUnderlyingCmdty()
	{
		return (String) readProperty("underlyingCmdty");
	}

	public void setUnderlyingCmdtyCode(String underlyingCmdtyCode)
	{
		writeProperty("underlyingCmdtyCode", underlyingCmdtyCode);
	}

	public String getUnderlyingCmdtyCode()
	{
		return (String) readProperty("underlyingCmdtyCode");
	}

	public void setUnderlyingCommktKey(Integer underlyingCommktKey)
	{
		writeProperty("underlyingCommktKey", underlyingCommktKey);
	}

	public Integer getUnderlyingCommktKey()
	{
		return (Integer) readProperty("underlyingCommktKey");
	}

	public void setUnderlyingMkt(String underlyingMkt)
	{
		writeProperty("underlyingMkt", underlyingMkt);
	}

	public String getUnderlyingMkt()
	{
		return (String) readProperty("underlyingMkt");
	}

	public void setUnderlyingMktCode(String underlyingMktCode)
	{
		writeProperty("underlyingMktCode", underlyingMktCode);
	}

	public String getUnderlyingMktCode()
	{
		return (String) readProperty("underlyingMktCode");
	}

	public void setUnderlyingQuote(String underlyingQuote)
	{
		writeProperty("underlyingQuote", underlyingQuote);
	}

	public String getUnderlyingQuote()
	{
		return (String) readProperty("underlyingQuote");
	}

	public void setUnderlyingQuoteDiff(Double underlyingQuoteDiff)
	{
		writeProperty("underlyingQuoteDiff", underlyingQuoteDiff);
	}

	public Double getUnderlyingQuoteDiff()
	{
		return (Double) readProperty("underlyingQuoteDiff");
	}

	public void setUnderlyingQuoteType(String underlyingQuoteType)
	{
		writeProperty("underlyingQuoteType", underlyingQuoteType);
	}

	public String getUnderlyingQuoteType()
	{
		return (String) readProperty("underlyingQuoteType");
	}

	public void setUnderlyingSource(String underlyingSource)
	{
		writeProperty("underlyingSource", underlyingSource);
	}

	public String getUnderlyingSource()
	{
		return (String) readProperty("underlyingSource");
	}

	public void setUnderlyingTradingPrd(String underlyingTradingPrd)
	{
		writeProperty("underlyingTradingPrd", underlyingTradingPrd);
	}

	public String getUnderlyingTradingPrd()
	{
		return (String) readProperty("underlyingTradingPrd");
	}

}
