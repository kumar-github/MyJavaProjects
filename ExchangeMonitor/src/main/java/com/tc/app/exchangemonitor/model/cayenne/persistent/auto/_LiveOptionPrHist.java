package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _LiveOptionPrHist was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _LiveOptionPrHist extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String OID_PK_COLUMN = "oid";

	public static final Property<BigDecimal> CLOSE_COLUMN = new Property<BigDecimal>("closeColumn");
	public static final Property<Integer> COMMKT_KEY = new Property<Integer>("commktKey");
	public static final Property<Date> DATE = new Property<Date>("date");
	public static final Property<BigDecimal> HIGH = new Property<BigDecimal>("high");
	public static final Property<BigDecimal> LAST = new Property<BigDecimal>("last");
	public static final Property<BigDecimal> LOW = new Property<BigDecimal>("low");
	public static final Property<BigDecimal> NET_CHANGE = new Property<BigDecimal>("netChange");
	public static final Property<BigDecimal> OPEN_INTEREST = new Property<BigDecimal>("openInterest");
	public static final Property<BigDecimal> OPEN_PRICE = new Property<BigDecimal>("openPrice");
	public static final Property<BigDecimal> OPT_STRIKE_PRICE = new Property<BigDecimal>("optStrikePrice");
	public static final Property<BigDecimal> PREVIOUS_CLOSE = new Property<BigDecimal>("previousClose");
	public static final Property<String> PRICE_SOURCE_CODE = new Property<String>("priceSourceCode");
	public static final Property<String> PUT_CALL_IND = new Property<String>("putCallInd");
	public static final Property<String> TRADING_PRD = new Property<String>("tradingPrd");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<BigDecimal> VOLATILITY = new Property<BigDecimal>("volatility");
	public static final Property<BigDecimal> VOLUME_TRADED = new Property<BigDecimal>("volumeTraded");

	public void setCloseColumn(BigDecimal closeColumn)
	{
		writeProperty("closeColumn", closeColumn);
	}

	public BigDecimal getCloseColumn()
	{
		return (BigDecimal) readProperty("closeColumn");
	}

	public void setCommktKey(Integer commktKey)
	{
		writeProperty("commktKey", commktKey);
	}

	public Integer getCommktKey()
	{
		return (Integer) readProperty("commktKey");
	}

	public void setDate(Date date)
	{
		writeProperty("date", date);
	}

	public Date getDate()
	{
		return (Date) readProperty("date");
	}

	public void setHigh(BigDecimal high)
	{
		writeProperty("high", high);
	}

	public BigDecimal getHigh()
	{
		return (BigDecimal) readProperty("high");
	}

	public void setLast(BigDecimal last)
	{
		writeProperty("last", last);
	}

	public BigDecimal getLast()
	{
		return (BigDecimal) readProperty("last");
	}

	public void setLow(BigDecimal low)
	{
		writeProperty("low", low);
	}

	public BigDecimal getLow()
	{
		return (BigDecimal) readProperty("low");
	}

	public void setNetChange(BigDecimal netChange)
	{
		writeProperty("netChange", netChange);
	}

	public BigDecimal getNetChange()
	{
		return (BigDecimal) readProperty("netChange");
	}

	public void setOpenInterest(BigDecimal openInterest)
	{
		writeProperty("openInterest", openInterest);
	}

	public BigDecimal getOpenInterest()
	{
		return (BigDecimal) readProperty("openInterest");
	}

	public void setOpenPrice(BigDecimal openPrice)
	{
		writeProperty("openPrice", openPrice);
	}

	public BigDecimal getOpenPrice()
	{
		return (BigDecimal) readProperty("openPrice");
	}

	public void setOptStrikePrice(BigDecimal optStrikePrice)
	{
		writeProperty("optStrikePrice", optStrikePrice);
	}

	public BigDecimal getOptStrikePrice()
	{
		return (BigDecimal) readProperty("optStrikePrice");
	}

	public void setPreviousClose(BigDecimal previousClose)
	{
		writeProperty("previousClose", previousClose);
	}

	public BigDecimal getPreviousClose()
	{
		return (BigDecimal) readProperty("previousClose");
	}

	public void setPriceSourceCode(String priceSourceCode)
	{
		writeProperty("priceSourceCode", priceSourceCode);
	}

	public String getPriceSourceCode()
	{
		return (String) readProperty("priceSourceCode");
	}

	public void setPutCallInd(String putCallInd)
	{
		writeProperty("putCallInd", putCallInd);
	}

	public String getPutCallInd()
	{
		return (String) readProperty("putCallInd");
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

	public void setVolatility(BigDecimal volatility)
	{
		writeProperty("volatility", volatility);
	}

	public BigDecimal getVolatility()
	{
		return (BigDecimal) readProperty("volatility");
	}

	public void setVolumeTraded(BigDecimal volumeTraded)
	{
		writeProperty("volumeTraded", volumeTraded);
	}

	public BigDecimal getVolumeTraded()
	{
		return (BigDecimal) readProperty("volumeTraded");
	}

}
