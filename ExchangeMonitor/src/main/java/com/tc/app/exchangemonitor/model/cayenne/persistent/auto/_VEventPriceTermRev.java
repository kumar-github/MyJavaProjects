package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VEventPriceTermRev was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VEventPriceTermRev extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> ADJ_PRICING_DATE_IND = new Property<String>("adjPricingDateInd");
	public static final Property<Integer> ASOF_TRANS_ID = new Property<Integer>("asofTransId");
	public static final Property<Date> DATE_DEEMED = new Property<Date>("dateDeemed");
	public static final Property<Date> DEEMED_EVENT_DATE = new Property<Date>("deemedEventDate");
	public static final Property<String> EVENT_DATE_HOLIDAYS = new Property<String>("eventDateHolidays");
	public static final Property<String> EVENT_DATE_SATURDAYS = new Property<String>("eventDateSaturdays");
	public static final Property<String> EVENT_DATE_SUNDAYS = new Property<String>("eventDateSundays");
	public static final Property<String> EVENT_DFLT_IND = new Property<String>("eventDfltInd");
	public static final Property<String> EVENT_INCLUDE_IND = new Property<String>("eventIncludeInd");
	public static final Property<String> EVENT_NAME = new Property<String>("eventName");
	public static final Property<String> EVENT_OPER = new Property<String>("eventOper");
	public static final Property<Short> EVENT_PRICING_DAYS = new Property<Short>("eventPricingDays");
	public static final Property<Short> EVENT_START_END_DAYS = new Property<Short>("eventStartEndDays");
	public static final Property<String> EVENT_TRIG_IND = new Property<String>("eventTrigInd");
	public static final Property<Integer> FORMULA_NUM = new Property<Integer>("formulaNum");
	public static final Property<Short> PARENT_PRICE_TERM_NUM = new Property<Short>("parentPriceTermNum");
	public static final Property<Short> PRICE_TERM_NUM = new Property<Short>("priceTermNum");
	public static final Property<String> QUOTE_TYPE = new Property<String>("quoteType");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setAdjPricingDateInd(String adjPricingDateInd)
	{
		writeProperty("adjPricingDateInd", adjPricingDateInd);
	}

	public String getAdjPricingDateInd()
	{
		return (String) readProperty("adjPricingDateInd");
	}

	public void setAsofTransId(Integer asofTransId)
	{
		writeProperty("asofTransId", asofTransId);
	}

	public Integer getAsofTransId()
	{
		return (Integer) readProperty("asofTransId");
	}

	public void setDateDeemed(Date dateDeemed)
	{
		writeProperty("dateDeemed", dateDeemed);
	}

	public Date getDateDeemed()
	{
		return (Date) readProperty("dateDeemed");
	}

	public void setDeemedEventDate(Date deemedEventDate)
	{
		writeProperty("deemedEventDate", deemedEventDate);
	}

	public Date getDeemedEventDate()
	{
		return (Date) readProperty("deemedEventDate");
	}

	public void setEventDateHolidays(String eventDateHolidays)
	{
		writeProperty("eventDateHolidays", eventDateHolidays);
	}

	public String getEventDateHolidays()
	{
		return (String) readProperty("eventDateHolidays");
	}

	public void setEventDateSaturdays(String eventDateSaturdays)
	{
		writeProperty("eventDateSaturdays", eventDateSaturdays);
	}

	public String getEventDateSaturdays()
	{
		return (String) readProperty("eventDateSaturdays");
	}

	public void setEventDateSundays(String eventDateSundays)
	{
		writeProperty("eventDateSundays", eventDateSundays);
	}

	public String getEventDateSundays()
	{
		return (String) readProperty("eventDateSundays");
	}

	public void setEventDfltInd(String eventDfltInd)
	{
		writeProperty("eventDfltInd", eventDfltInd);
	}

	public String getEventDfltInd()
	{
		return (String) readProperty("eventDfltInd");
	}

	public void setEventIncludeInd(String eventIncludeInd)
	{
		writeProperty("eventIncludeInd", eventIncludeInd);
	}

	public String getEventIncludeInd()
	{
		return (String) readProperty("eventIncludeInd");
	}

	public void setEventName(String eventName)
	{
		writeProperty("eventName", eventName);
	}

	public String getEventName()
	{
		return (String) readProperty("eventName");
	}

	public void setEventOper(String eventOper)
	{
		writeProperty("eventOper", eventOper);
	}

	public String getEventOper()
	{
		return (String) readProperty("eventOper");
	}

	public void setEventPricingDays(Short eventPricingDays)
	{
		writeProperty("eventPricingDays", eventPricingDays);
	}

	public Short getEventPricingDays()
	{
		return (Short) readProperty("eventPricingDays");
	}

	public void setEventStartEndDays(Short eventStartEndDays)
	{
		writeProperty("eventStartEndDays", eventStartEndDays);
	}

	public Short getEventStartEndDays()
	{
		return (Short) readProperty("eventStartEndDays");
	}

	public void setEventTrigInd(String eventTrigInd)
	{
		writeProperty("eventTrigInd", eventTrigInd);
	}

	public String getEventTrigInd()
	{
		return (String) readProperty("eventTrigInd");
	}

	public void setFormulaNum(Integer formulaNum)
	{
		writeProperty("formulaNum", formulaNum);
	}

	public Integer getFormulaNum()
	{
		return (Integer) readProperty("formulaNum");
	}

	public void setParentPriceTermNum(Short parentPriceTermNum)
	{
		writeProperty("parentPriceTermNum", parentPriceTermNum);
	}

	public Short getParentPriceTermNum()
	{
		return (Short) readProperty("parentPriceTermNum");
	}

	public void setPriceTermNum(Short priceTermNum)
	{
		writeProperty("priceTermNum", priceTermNum);
	}

	public Short getPriceTermNum()
	{
		return (Short) readProperty("priceTermNum");
	}

	public void setQuoteType(String quoteType)
	{
		writeProperty("quoteType", quoteType);
	}

	public String getQuoteType()
	{
		return (String) readProperty("quoteType");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
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
