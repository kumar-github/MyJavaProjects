package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.BookingCompanyInfo;
import com.tc.app.exchangemonitor.model.cayenne.persistent.CalendarDetail;
import com.tc.app.exchangemonitor.model.cayenne.persistent.CommodityMarketSource;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Country;
import com.tc.app.exchangemonitor.model.cayenne.persistent.QuoteMarketdataSource;
import com.tc.app.exchangemonitor.model.cayenne.persistent.QuotePricingPeriod;
import com.tc.app.exchangemonitor.model.cayenne.persistent.State;

/**
 * Class _Calendar was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Calendar extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String CALENDAR_CODE_PK_COLUMN = "calendar_code";

	public static final Property<String> CALENDAR_DATE_MASK = new Property<>("calendarDateMask");
	public static final Property<String> CALENDAR_DESC = new Property<>("calendarDesc");
	public static final Property<String> CALENDAR_NAME = new Property<>("calendarName");
	public static final Property<String> CALENDAR_STATUS = new Property<>("calendarStatus");
	public static final Property<String> CALENDAR_TYPE = new Property<>("calendarType");
	public static final Property<Integer> TRANS_ID = new Property<>("transId");
	public static final Property<List<BookingCompanyInfo>> BOOKING_COMPANY_INFOES = new Property<>("bookingCompanyInfoes");
	public static final Property<List<CalendarDetail>> CALENDAR_DETAILS = new Property<>("calendarDetails");
	public static final Property<List<CommodityMarketSource>> COMMODITY_MARKET_SOURCES = new Property<>("commodityMarketSources");
	public static final Property<List<Country>> COUNTRIES = new Property<>("countries");
	public static final Property<List<QuoteMarketdataSource>> QUOTE_MARKETDATA_SOURCES = new Property<>("quoteMarketdataSources");
	public static final Property<List<QuotePricingPeriod>> QUOTE_PRICING_PERIODS = new Property<>("quotePricingPeriods");
	public static final Property<List<State>> STATES = new Property<>("states");

	public void setCalendarDateMask(final String calendarDateMask)
	{
		this.writeProperty("calendarDateMask", calendarDateMask);
	}

	public String getCalendarDateMask()
	{
		return (String) this.readProperty("calendarDateMask");
	}

	public void setCalendarDesc(final String calendarDesc)
	{
		this.writeProperty("calendarDesc", calendarDesc);
	}

	public String getCalendarDesc()
	{
		return (String) this.readProperty("calendarDesc");
	}

	public void setCalendarName(final String calendarName)
	{
		this.writeProperty("calendarName", calendarName);
	}

	public String getCalendarName()
	{
		return (String) this.readProperty("calendarName");
	}

	public void setCalendarStatus(final String calendarStatus)
	{
		this.writeProperty("calendarStatus", calendarStatus);
	}

	public String getCalendarStatus()
	{
		return (String) this.readProperty("calendarStatus");
	}

	public void setCalendarType(final String calendarType)
	{
		this.writeProperty("calendarType", calendarType);
	}

	public String getCalendarType()
	{
		return (String) this.readProperty("calendarType");
	}

	public void setTransId(final Integer transId)
	{
		this.writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) this.readProperty("transId");
	}

	public void addToBookingCompanyInfoes(final BookingCompanyInfo obj)
	{
		this.addToManyTarget("bookingCompanyInfoes", obj, true);
	}

	public void removeFromBookingCompanyInfoes(final BookingCompanyInfo obj)
	{
		this.removeToManyTarget("bookingCompanyInfoes", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<BookingCompanyInfo> getBookingCompanyInfoes()
	{
		return (List<BookingCompanyInfo>) this.readProperty("bookingCompanyInfoes");
	}

	public void addToCalendarDetails(final CalendarDetail obj)
	{
		this.addToManyTarget("calendarDetails", obj, true);
	}

	public void removeFromCalendarDetails(final CalendarDetail obj)
	{
		this.removeToManyTarget("calendarDetails", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<CalendarDetail> getCalendarDetails()
	{
		return (List<CalendarDetail>) this.readProperty("calendarDetails");
	}

	public void addToCommodityMarketSources(final CommodityMarketSource obj)
	{
		this.addToManyTarget("commodityMarketSources", obj, true);
	}

	public void removeFromCommodityMarketSources(final CommodityMarketSource obj)
	{
		this.removeToManyTarget("commodityMarketSources", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<CommodityMarketSource> getCommodityMarketSources()
	{
		return (List<CommodityMarketSource>) this.readProperty("commodityMarketSources");
	}

	public void addToCountries(final Country obj)
	{
		this.addToManyTarget("countries", obj, true);
	}

	public void removeFromCountries(final Country obj)
	{
		this.removeToManyTarget("countries", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<Country> getCountries()
	{
		return (List<Country>) this.readProperty("countries");
	}

	public void addToQuoteMarketdataSources(final QuoteMarketdataSource obj)
	{
		this.addToManyTarget("quoteMarketdataSources", obj, true);
	}

	public void removeFromQuoteMarketdataSources(final QuoteMarketdataSource obj)
	{
		this.removeToManyTarget("quoteMarketdataSources", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<QuoteMarketdataSource> getQuoteMarketdataSources()
	{
		return (List<QuoteMarketdataSource>) this.readProperty("quoteMarketdataSources");
	}

	public void addToQuotePricingPeriods(final QuotePricingPeriod obj)
	{
		this.addToManyTarget("quotePricingPeriods", obj, true);
	}

	public void removeFromQuotePricingPeriods(final QuotePricingPeriod obj)
	{
		this.removeToManyTarget("quotePricingPeriods", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<QuotePricingPeriod> getQuotePricingPeriods()
	{
		return (List<QuotePricingPeriod>) this.readProperty("quotePricingPeriods");
	}

	public void addToStates(final State obj)
	{
		this.addToManyTarget("states", obj, true);
	}

	public void removeFromStates(final State obj)
	{
		this.removeToManyTarget("states", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<State> getStates()
	{
		return (List<State>) this.readProperty("states");
	}

}