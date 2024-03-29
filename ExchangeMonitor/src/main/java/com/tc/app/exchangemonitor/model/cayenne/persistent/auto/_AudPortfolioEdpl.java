package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudPortfolioEdpl was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudPortfolioEdpl extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Date> ASOF_DATE = new Property<Date>("asofDate");
	public static final Property<BigDecimal> COMP_YR_PL = new Property<BigDecimal>("compYrPl");
	public static final Property<BigDecimal> DAY_PL = new Property<BigDecimal>("dayPl");
	public static final Property<BigDecimal> LATEST_PL = new Property<BigDecimal>("latestPl");
	public static final Property<BigDecimal> MONTH_PL = new Property<BigDecimal>("monthPl");
	public static final Property<Integer> PORT_NUM = new Property<Integer>("portNum");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<BigDecimal> WEEK_PL = new Property<BigDecimal>("weekPl");
	public static final Property<BigDecimal> YEAR_PL = new Property<BigDecimal>("yearPl");

	public void setAsofDate(Date asofDate)
	{
		writeProperty("asofDate", asofDate);
	}

	public Date getAsofDate()
	{
		return (Date) readProperty("asofDate");
	}

	public void setCompYrPl(BigDecimal compYrPl)
	{
		writeProperty("compYrPl", compYrPl);
	}

	public BigDecimal getCompYrPl()
	{
		return (BigDecimal) readProperty("compYrPl");
	}

	public void setDayPl(BigDecimal dayPl)
	{
		writeProperty("dayPl", dayPl);
	}

	public BigDecimal getDayPl()
	{
		return (BigDecimal) readProperty("dayPl");
	}

	public void setLatestPl(BigDecimal latestPl)
	{
		writeProperty("latestPl", latestPl);
	}

	public BigDecimal getLatestPl()
	{
		return (BigDecimal) readProperty("latestPl");
	}

	public void setMonthPl(BigDecimal monthPl)
	{
		writeProperty("monthPl", monthPl);
	}

	public BigDecimal getMonthPl()
	{
		return (BigDecimal) readProperty("monthPl");
	}

	public void setPortNum(Integer portNum)
	{
		writeProperty("portNum", portNum);
	}

	public Integer getPortNum()
	{
		return (Integer) readProperty("portNum");
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

	public void setWeekPl(BigDecimal weekPl)
	{
		writeProperty("weekPl", weekPl);
	}

	public BigDecimal getWeekPl()
	{
		return (BigDecimal) readProperty("weekPl");
	}

	public void setYearPl(BigDecimal yearPl)
	{
		writeProperty("yearPl", yearPl);
	}

	public BigDecimal getYearPl()
	{
		return (BigDecimal) readProperty("yearPl");
	}

}
