package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VExposureDetailRev was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VExposureDetailRev extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> ASOF_TRANS_ID = new Property<Integer>("asofTransId");
	public static final Property<Double> CASH_EXP_AMT = new Property<Double>("cashExpAmt");
	public static final Property<Date> CASH_FROM_DATE = new Property<Date>("cashFromDate");
	public static final Property<Date> CASH_TO_DATE = new Property<Date>("cashToDate");
	public static final Property<BigDecimal> COST_AMT = new Property<BigDecimal>("costAmt");
	public static final Property<Integer> COST_NUM = new Property<Integer>("costNum");
	public static final Property<String> COST_PRICE_CURR_CODE = new Property<String>("costPriceCurrCode");
	public static final Property<Integer> CREDIT_EXPOSURE_OID = new Property<Integer>("creditExposureOid");
	public static final Property<Integer> EXPOSURE_NUM = new Property<Integer>("exposureNum");
	public static final Property<String> LC_TYPE_CODE = new Property<String>("lcTypeCode");
	public static final Property<Date> MTM_END_DATE = new Property<Date>("mtmEndDate");
	public static final Property<Date> MTM_FROM_DATE = new Property<Date>("mtmFromDate");
	public static final Property<Double> MTM_PL = new Property<Double>("mtmPl");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> SHIFT_EXPOSURE_NUM = new Property<Integer>("shiftExposureNum");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setAsofTransId(Integer asofTransId)
	{
		writeProperty("asofTransId", asofTransId);
	}

	public Integer getAsofTransId()
	{
		return (Integer) readProperty("asofTransId");
	}

	public void setCashExpAmt(Double cashExpAmt)
	{
		writeProperty("cashExpAmt", cashExpAmt);
	}

	public Double getCashExpAmt()
	{
		return (Double) readProperty("cashExpAmt");
	}

	public void setCashFromDate(Date cashFromDate)
	{
		writeProperty("cashFromDate", cashFromDate);
	}

	public Date getCashFromDate()
	{
		return (Date) readProperty("cashFromDate");
	}

	public void setCashToDate(Date cashToDate)
	{
		writeProperty("cashToDate", cashToDate);
	}

	public Date getCashToDate()
	{
		return (Date) readProperty("cashToDate");
	}

	public void setCostAmt(BigDecimal costAmt)
	{
		writeProperty("costAmt", costAmt);
	}

	public BigDecimal getCostAmt()
	{
		return (BigDecimal) readProperty("costAmt");
	}

	public void setCostNum(Integer costNum)
	{
		writeProperty("costNum", costNum);
	}

	public Integer getCostNum()
	{
		return (Integer) readProperty("costNum");
	}

	public void setCostPriceCurrCode(String costPriceCurrCode)
	{
		writeProperty("costPriceCurrCode", costPriceCurrCode);
	}

	public String getCostPriceCurrCode()
	{
		return (String) readProperty("costPriceCurrCode");
	}

	public void setCreditExposureOid(Integer creditExposureOid)
	{
		writeProperty("creditExposureOid", creditExposureOid);
	}

	public Integer getCreditExposureOid()
	{
		return (Integer) readProperty("creditExposureOid");
	}

	public void setExposureNum(Integer exposureNum)
	{
		writeProperty("exposureNum", exposureNum);
	}

	public Integer getExposureNum()
	{
		return (Integer) readProperty("exposureNum");
	}

	public void setLcTypeCode(String lcTypeCode)
	{
		writeProperty("lcTypeCode", lcTypeCode);
	}

	public String getLcTypeCode()
	{
		return (String) readProperty("lcTypeCode");
	}

	public void setMtmEndDate(Date mtmEndDate)
	{
		writeProperty("mtmEndDate", mtmEndDate);
	}

	public Date getMtmEndDate()
	{
		return (Date) readProperty("mtmEndDate");
	}

	public void setMtmFromDate(Date mtmFromDate)
	{
		writeProperty("mtmFromDate", mtmFromDate);
	}

	public Date getMtmFromDate()
	{
		return (Date) readProperty("mtmFromDate");
	}

	public void setMtmPl(Double mtmPl)
	{
		writeProperty("mtmPl", mtmPl);
	}

	public Double getMtmPl()
	{
		return (Double) readProperty("mtmPl");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setShiftExposureNum(Integer shiftExposureNum)
	{
		writeProperty("shiftExposureNum", shiftExposureNum);
	}

	public Integer getShiftExposureNum()
	{
		return (Integer) readProperty("shiftExposureNum");
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