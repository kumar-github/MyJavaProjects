package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudCashExposure was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudCashExposure extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Date> CASH_EXP_DATE = new Property<Date>("cashExpDate");
	public static final Property<Double> CASH_EXP_NET_AMT = new Property<Double>("cashExpNetAmt");
	public static final Property<Short> CASH_EXP_NUM = new Property<Short>("cashExpNum");
	public static final Property<Double> CASH_EXP_PAY_AMT = new Property<Double>("cashExpPayAmt");
	public static final Property<Double> CASH_EXP_REC_AMT = new Property<Double>("cashExpRecAmt");
	public static final Property<String> CASH_IS_DUE_CODE = new Property<String>("cashIsDueCode");
	public static final Property<Integer> EXPOSURE_NUM = new Property<Integer>("exposureNum");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setCashExpDate(Date cashExpDate)
	{
		writeProperty("cashExpDate", cashExpDate);
	}

	public Date getCashExpDate()
	{
		return (Date) readProperty("cashExpDate");
	}

	public void setCashExpNetAmt(Double cashExpNetAmt)
	{
		writeProperty("cashExpNetAmt", cashExpNetAmt);
	}

	public Double getCashExpNetAmt()
	{
		return (Double) readProperty("cashExpNetAmt");
	}

	public void setCashExpNum(Short cashExpNum)
	{
		writeProperty("cashExpNum", cashExpNum);
	}

	public Short getCashExpNum()
	{
		return (Short) readProperty("cashExpNum");
	}

	public void setCashExpPayAmt(Double cashExpPayAmt)
	{
		writeProperty("cashExpPayAmt", cashExpPayAmt);
	}

	public Double getCashExpPayAmt()
	{
		return (Double) readProperty("cashExpPayAmt");
	}

	public void setCashExpRecAmt(Double cashExpRecAmt)
	{
		writeProperty("cashExpRecAmt", cashExpRecAmt);
	}

	public Double getCashExpRecAmt()
	{
		return (Double) readProperty("cashExpRecAmt");
	}

	public void setCashIsDueCode(String cashIsDueCode)
	{
		writeProperty("cashIsDueCode", cashIsDueCode);
	}

	public String getCashIsDueCode()
	{
		return (String) readProperty("cashIsDueCode");
	}

	public void setExposureNum(Integer exposureNum)
	{
		writeProperty("exposureNum", exposureNum);
	}

	public Integer getExposureNum()
	{
		return (Integer) readProperty("exposureNum");
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
