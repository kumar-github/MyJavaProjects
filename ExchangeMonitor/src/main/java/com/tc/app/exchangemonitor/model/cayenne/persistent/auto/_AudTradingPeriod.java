package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudTradingPeriod was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudTradingPeriod extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> COMMKT_KEY = new Property<Integer>("commktKey");
	public static final Property<Date> FIRST_DEL_DATE = new Property<Date>("firstDelDate");
	public static final Property<Date> FIRST_ISSUE_DATE = new Property<Date>("firstIssueDate");
	public static final Property<Date> LAST_DEL_DATE = new Property<Date>("lastDelDate");
	public static final Property<Date> LAST_ISSUE_DATE = new Property<Date>("lastIssueDate");
	public static final Property<Date> LAST_QUOTE_DATE = new Property<Date>("lastQuoteDate");
	public static final Property<Date> LAST_TRADE_DATE = new Property<Date>("lastTradeDate");
	public static final Property<String> OPT_EVAL_METHOD = new Property<String>("optEvalMethod");
	public static final Property<Date> OPT_EXP_DATE = new Property<Date>("optExpDate");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<String> TRADING_PRD = new Property<String>("tradingPrd");
	public static final Property<String> TRADING_PRD_DESC = new Property<String>("tradingPrdDesc");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setCommktKey(Integer commktKey)
	{
		writeProperty("commktKey", commktKey);
	}

	public Integer getCommktKey()
	{
		return (Integer) readProperty("commktKey");
	}

	public void setFirstDelDate(Date firstDelDate)
	{
		writeProperty("firstDelDate", firstDelDate);
	}

	public Date getFirstDelDate()
	{
		return (Date) readProperty("firstDelDate");
	}

	public void setFirstIssueDate(Date firstIssueDate)
	{
		writeProperty("firstIssueDate", firstIssueDate);
	}

	public Date getFirstIssueDate()
	{
		return (Date) readProperty("firstIssueDate");
	}

	public void setLastDelDate(Date lastDelDate)
	{
		writeProperty("lastDelDate", lastDelDate);
	}

	public Date getLastDelDate()
	{
		return (Date) readProperty("lastDelDate");
	}

	public void setLastIssueDate(Date lastIssueDate)
	{
		writeProperty("lastIssueDate", lastIssueDate);
	}

	public Date getLastIssueDate()
	{
		return (Date) readProperty("lastIssueDate");
	}

	public void setLastQuoteDate(Date lastQuoteDate)
	{
		writeProperty("lastQuoteDate", lastQuoteDate);
	}

	public Date getLastQuoteDate()
	{
		return (Date) readProperty("lastQuoteDate");
	}

	public void setLastTradeDate(Date lastTradeDate)
	{
		writeProperty("lastTradeDate", lastTradeDate);
	}

	public Date getLastTradeDate()
	{
		return (Date) readProperty("lastTradeDate");
	}

	public void setOptEvalMethod(String optEvalMethod)
	{
		writeProperty("optEvalMethod", optEvalMethod);
	}

	public String getOptEvalMethod()
	{
		return (String) readProperty("optEvalMethod");
	}

	public void setOptExpDate(Date optExpDate)
	{
		writeProperty("optExpDate", optExpDate);
	}

	public Date getOptExpDate()
	{
		return (Date) readProperty("optExpDate");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
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

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

}
