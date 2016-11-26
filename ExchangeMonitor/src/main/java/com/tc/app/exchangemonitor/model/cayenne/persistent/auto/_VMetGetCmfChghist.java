package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VMetGetCmfChghist was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VMetGetCmfChghist extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Date> ACTION_DATE = new Property<Date>("actionDate");
	public static final Property<String> APP_NAME = new Property<String>("appName");
	public static final Property<Integer> CMF_NUM = new Property<Integer>("cmfNum");
	public static final Property<String> CURR_AVG_CLOSED_PRICE_DIFF = new Property<String>("currAvgClosedPriceDiff");
	public static final Property<String> CURR_AVG_CLOSED_PRICE_QUOTE = new Property<String>("currAvgClosedPriceQuote");
	public static final Property<String> CURR_HIGH_ASKED_PRICE_DIFF = new Property<String>("currHighAskedPriceDiff");
	public static final Property<String> CURR_HIGH_ASKED_PRICE_QUOTE = new Property<String>("currHighAskedPriceQuote");
	public static final Property<String> CURR_LOW_BID_PRICE_DIFF = new Property<String>("currLowBidPriceDiff");
	public static final Property<String> CURR_LOW_BID_PRICE_QUOTE = new Property<String>("currLowBidPriceQuote");
	public static final Property<String> DONE_BY = new Property<String>("doneBy");
	public static final Property<String> PREV_AVG_CLOSED_PRICE_DIFF = new Property<String>("prevAvgClosedPriceDiff");
	public static final Property<String> PREV_AVG_CLOSED_PRICE_QUOTE = new Property<String>("prevAvgClosedPriceQuote");
	public static final Property<String> PREV_HIGH_ASKED_PRICE_DIFF = new Property<String>("prevHighAskedPriceDiff");
	public static final Property<String> PREV_HIGH_ASKED_PRICE_QUOTE = new Property<String>("prevHighAskedPriceQuote");
	public static final Property<String> PREV_LOW_BID_PRICE_DIFF = new Property<String>("prevLowBidPriceDiff");
	public static final Property<String> PREV_LOW_BID_PRICE_QUOTE = new Property<String>("prevLowBidPriceQuote");
	public static final Property<String> QUOTE = new Property<String>("quote");
	public static final Property<String> STATUS = new Property<String>("status");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setActionDate(Date actionDate)
	{
		writeProperty("actionDate", actionDate);
	}

	public Date getActionDate()
	{
		return (Date) readProperty("actionDate");
	}

	public void setAppName(String appName)
	{
		writeProperty("appName", appName);
	}

	public String getAppName()
	{
		return (String) readProperty("appName");
	}

	public void setCmfNum(Integer cmfNum)
	{
		writeProperty("cmfNum", cmfNum);
	}

	public Integer getCmfNum()
	{
		return (Integer) readProperty("cmfNum");
	}

	public void setCurrAvgClosedPriceDiff(String currAvgClosedPriceDiff)
	{
		writeProperty("currAvgClosedPriceDiff", currAvgClosedPriceDiff);
	}

	public String getCurrAvgClosedPriceDiff()
	{
		return (String) readProperty("currAvgClosedPriceDiff");
	}

	public void setCurrAvgClosedPriceQuote(String currAvgClosedPriceQuote)
	{
		writeProperty("currAvgClosedPriceQuote", currAvgClosedPriceQuote);
	}

	public String getCurrAvgClosedPriceQuote()
	{
		return (String) readProperty("currAvgClosedPriceQuote");
	}

	public void setCurrHighAskedPriceDiff(String currHighAskedPriceDiff)
	{
		writeProperty("currHighAskedPriceDiff", currHighAskedPriceDiff);
	}

	public String getCurrHighAskedPriceDiff()
	{
		return (String) readProperty("currHighAskedPriceDiff");
	}

	public void setCurrHighAskedPriceQuote(String currHighAskedPriceQuote)
	{
		writeProperty("currHighAskedPriceQuote", currHighAskedPriceQuote);
	}

	public String getCurrHighAskedPriceQuote()
	{
		return (String) readProperty("currHighAskedPriceQuote");
	}

	public void setCurrLowBidPriceDiff(String currLowBidPriceDiff)
	{
		writeProperty("currLowBidPriceDiff", currLowBidPriceDiff);
	}

	public String getCurrLowBidPriceDiff()
	{
		return (String) readProperty("currLowBidPriceDiff");
	}

	public void setCurrLowBidPriceQuote(String currLowBidPriceQuote)
	{
		writeProperty("currLowBidPriceQuote", currLowBidPriceQuote);
	}

	public String getCurrLowBidPriceQuote()
	{
		return (String) readProperty("currLowBidPriceQuote");
	}

	public void setDoneBy(String doneBy)
	{
		writeProperty("doneBy", doneBy);
	}

	public String getDoneBy()
	{
		return (String) readProperty("doneBy");
	}

	public void setPrevAvgClosedPriceDiff(String prevAvgClosedPriceDiff)
	{
		writeProperty("prevAvgClosedPriceDiff", prevAvgClosedPriceDiff);
	}

	public String getPrevAvgClosedPriceDiff()
	{
		return (String) readProperty("prevAvgClosedPriceDiff");
	}

	public void setPrevAvgClosedPriceQuote(String prevAvgClosedPriceQuote)
	{
		writeProperty("prevAvgClosedPriceQuote", prevAvgClosedPriceQuote);
	}

	public String getPrevAvgClosedPriceQuote()
	{
		return (String) readProperty("prevAvgClosedPriceQuote");
	}

	public void setPrevHighAskedPriceDiff(String prevHighAskedPriceDiff)
	{
		writeProperty("prevHighAskedPriceDiff", prevHighAskedPriceDiff);
	}

	public String getPrevHighAskedPriceDiff()
	{
		return (String) readProperty("prevHighAskedPriceDiff");
	}

	public void setPrevHighAskedPriceQuote(String prevHighAskedPriceQuote)
	{
		writeProperty("prevHighAskedPriceQuote", prevHighAskedPriceQuote);
	}

	public String getPrevHighAskedPriceQuote()
	{
		return (String) readProperty("prevHighAskedPriceQuote");
	}

	public void setPrevLowBidPriceDiff(String prevLowBidPriceDiff)
	{
		writeProperty("prevLowBidPriceDiff", prevLowBidPriceDiff);
	}

	public String getPrevLowBidPriceDiff()
	{
		return (String) readProperty("prevLowBidPriceDiff");
	}

	public void setPrevLowBidPriceQuote(String prevLowBidPriceQuote)
	{
		writeProperty("prevLowBidPriceQuote", prevLowBidPriceQuote);
	}

	public String getPrevLowBidPriceQuote()
	{
		return (String) readProperty("prevLowBidPriceQuote");
	}

	public void setQuote(String quote)
	{
		writeProperty("quote", quote);
	}

	public String getQuote()
	{
		return (String) readProperty("quote");
	}

	public void setStatus(String status)
	{
		writeProperty("status", status);
	}

	public String getStatus()
	{
		return (String) readProperty("status");
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
