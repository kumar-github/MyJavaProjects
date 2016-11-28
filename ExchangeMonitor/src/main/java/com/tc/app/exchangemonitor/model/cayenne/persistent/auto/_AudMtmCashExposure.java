package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudMtmCashExposure was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudMtmCashExposure extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<BigDecimal> ALT_CASH_EXP_PAY_AMT = new Property<BigDecimal>("altCashExpPayAmt");
	public static final Property<BigDecimal> ALT_CASH_EXP_REC_AMT = new Property<BigDecimal>("altCashExpRecAmt");
	public static final Property<BigDecimal> ALT_CASH_FLOW_PAY_EXP_AMT = new Property<BigDecimal>("altCashFlowPayExpAmt");
	public static final Property<BigDecimal> ALT_CASH_FLOW_REC_EXP_AMT = new Property<BigDecimal>("altCashFlowRecExpAmt");
	public static final Property<Double> CASH_EXP_NET_AMT = new Property<Double>("cashExpNetAmt");
	public static final Property<Double> CASH_EXP_PAY_AMT = new Property<Double>("cashExpPayAmt");
	public static final Property<Double> CASH_EXP_REC_AMT = new Property<Double>("cashExpRecAmt");
	public static final Property<Double> CASH_FLOW_PAY_EXP_AMT = new Property<Double>("cashFlowPayExpAmt");
	public static final Property<Double> CASH_FLOW_REC_EXP_AMT = new Property<Double>("cashFlowRecExpAmt");
	public static final Property<Date> EXP_DATE = new Property<Date>("expDate");
	public static final Property<String> EXP_TYPE = new Property<String>("expType");
	public static final Property<Integer> EXPOSURE_NUM = new Property<Integer>("exposureNum");
	public static final Property<BigDecimal> GROSS_MTM_EXP_AMT = new Property<BigDecimal>("grossMtmExpAmt");
	public static final Property<Double> MTM_EXP_AMT = new Property<Double>("mtmExpAmt");
	public static final Property<BigDecimal> OVERDUE_GROSS_MTM_EXP_AMT = new Property<BigDecimal>("overdueGrossMtmExpAmt");
	public static final Property<BigDecimal> OVERDUE_MTM_EXP_AMT = new Property<BigDecimal>("overdueMtmExpAmt");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setAltCashExpPayAmt(BigDecimal altCashExpPayAmt)
	{
		writeProperty("altCashExpPayAmt", altCashExpPayAmt);
	}

	public BigDecimal getAltCashExpPayAmt()
	{
		return (BigDecimal) readProperty("altCashExpPayAmt");
	}

	public void setAltCashExpRecAmt(BigDecimal altCashExpRecAmt)
	{
		writeProperty("altCashExpRecAmt", altCashExpRecAmt);
	}

	public BigDecimal getAltCashExpRecAmt()
	{
		return (BigDecimal) readProperty("altCashExpRecAmt");
	}

	public void setAltCashFlowPayExpAmt(BigDecimal altCashFlowPayExpAmt)
	{
		writeProperty("altCashFlowPayExpAmt", altCashFlowPayExpAmt);
	}

	public BigDecimal getAltCashFlowPayExpAmt()
	{
		return (BigDecimal) readProperty("altCashFlowPayExpAmt");
	}

	public void setAltCashFlowRecExpAmt(BigDecimal altCashFlowRecExpAmt)
	{
		writeProperty("altCashFlowRecExpAmt", altCashFlowRecExpAmt);
	}

	public BigDecimal getAltCashFlowRecExpAmt()
	{
		return (BigDecimal) readProperty("altCashFlowRecExpAmt");
	}

	public void setCashExpNetAmt(Double cashExpNetAmt)
	{
		writeProperty("cashExpNetAmt", cashExpNetAmt);
	}

	public Double getCashExpNetAmt()
	{
		return (Double) readProperty("cashExpNetAmt");
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

	public void setCashFlowPayExpAmt(Double cashFlowPayExpAmt)
	{
		writeProperty("cashFlowPayExpAmt", cashFlowPayExpAmt);
	}

	public Double getCashFlowPayExpAmt()
	{
		return (Double) readProperty("cashFlowPayExpAmt");
	}

	public void setCashFlowRecExpAmt(Double cashFlowRecExpAmt)
	{
		writeProperty("cashFlowRecExpAmt", cashFlowRecExpAmt);
	}

	public Double getCashFlowRecExpAmt()
	{
		return (Double) readProperty("cashFlowRecExpAmt");
	}

	public void setExpDate(Date expDate)
	{
		writeProperty("expDate", expDate);
	}

	public Date getExpDate()
	{
		return (Date) readProperty("expDate");
	}

	public void setExpType(String expType)
	{
		writeProperty("expType", expType);
	}

	public String getExpType()
	{
		return (String) readProperty("expType");
	}

	public void setExposureNum(Integer exposureNum)
	{
		writeProperty("exposureNum", exposureNum);
	}

	public Integer getExposureNum()
	{
		return (Integer) readProperty("exposureNum");
	}

	public void setGrossMtmExpAmt(BigDecimal grossMtmExpAmt)
	{
		writeProperty("grossMtmExpAmt", grossMtmExpAmt);
	}

	public BigDecimal getGrossMtmExpAmt()
	{
		return (BigDecimal) readProperty("grossMtmExpAmt");
	}

	public void setMtmExpAmt(Double mtmExpAmt)
	{
		writeProperty("mtmExpAmt", mtmExpAmt);
	}

	public Double getMtmExpAmt()
	{
		return (Double) readProperty("mtmExpAmt");
	}

	public void setOverdueGrossMtmExpAmt(BigDecimal overdueGrossMtmExpAmt)
	{
		writeProperty("overdueGrossMtmExpAmt", overdueGrossMtmExpAmt);
	}

	public BigDecimal getOverdueGrossMtmExpAmt()
	{
		return (BigDecimal) readProperty("overdueGrossMtmExpAmt");
	}

	public void setOverdueMtmExpAmt(BigDecimal overdueMtmExpAmt)
	{
		writeProperty("overdueMtmExpAmt", overdueMtmExpAmt);
	}

	public BigDecimal getOverdueMtmExpAmt()
	{
		return (BigDecimal) readProperty("overdueMtmExpAmt");
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