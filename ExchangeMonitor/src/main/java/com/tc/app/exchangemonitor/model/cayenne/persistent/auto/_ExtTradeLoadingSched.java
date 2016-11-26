package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.ExternalTradeSource;

/**
 * Class _ExtTradeLoadingSched was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ExtTradeLoadingSched extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String OID_PK_COLUMN = "oid";

	public static final Property<String> BUYER_SELLER_ACCOUNT = new Property<String>("buyerSellerAccount");
	public static final Property<String> LOADING_DATE_TIMEZONE = new Property<String>("loadingDateTimezone");
	public static final Property<String> LOADING_SCHEDULE = new Property<String>("loadingSchedule");
	public static final Property<Date> LOADING_TIME_FROM = new Property<Date>("loadingTimeFrom");
	public static final Property<Date> LOADING_TIME_TO = new Property<Date>("loadingTimeTo");
	public static final Property<Date> TRADE_DATE_TO_LOAD = new Property<Date>("tradeDateToLoad");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<ExternalTradeSource> EXTERNAL_TRADE_SOURCE_O = new Property<ExternalTradeSource>("externalTradeSourceO");

	public void setBuyerSellerAccount(String buyerSellerAccount)
	{
		writeProperty("buyerSellerAccount", buyerSellerAccount);
	}

	public String getBuyerSellerAccount()
	{
		return (String) readProperty("buyerSellerAccount");
	}

	public void setLoadingDateTimezone(String loadingDateTimezone)
	{
		writeProperty("loadingDateTimezone", loadingDateTimezone);
	}

	public String getLoadingDateTimezone()
	{
		return (String) readProperty("loadingDateTimezone");
	}

	public void setLoadingSchedule(String loadingSchedule)
	{
		writeProperty("loadingSchedule", loadingSchedule);
	}

	public String getLoadingSchedule()
	{
		return (String) readProperty("loadingSchedule");
	}

	public void setLoadingTimeFrom(Date loadingTimeFrom)
	{
		writeProperty("loadingTimeFrom", loadingTimeFrom);
	}

	public Date getLoadingTimeFrom()
	{
		return (Date) readProperty("loadingTimeFrom");
	}

	public void setLoadingTimeTo(Date loadingTimeTo)
	{
		writeProperty("loadingTimeTo", loadingTimeTo);
	}

	public Date getLoadingTimeTo()
	{
		return (Date) readProperty("loadingTimeTo");
	}

	public void setTradeDateToLoad(Date tradeDateToLoad)
	{
		writeProperty("tradeDateToLoad", tradeDateToLoad);
	}

	public Date getTradeDateToLoad()
	{
		return (Date) readProperty("tradeDateToLoad");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setExternalTradeSourceO(ExternalTradeSource externalTradeSourceO)
	{
		setToOneTarget("externalTradeSourceO", externalTradeSourceO, true);
	}

	public ExternalTradeSource getExternalTradeSourceO()
	{
		return (ExternalTradeSource) readProperty("externalTradeSourceO");
	}

}
