package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VTradeOrderAllRs was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VTradeOrderAllRs extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> APP_NAME = new Property<String>("appName");
	public static final Property<String> BAL_IND = new Property<String>("balInd");
	public static final Property<String> CASH_SETTLE_HOLIDAYS = new Property<String>("cashSettleHolidays");
	public static final Property<String> CASH_SETTLE_PRD_FREQ = new Property<String>("cashSettlePrdFreq");
	public static final Property<Date> CASH_SETTLE_PRD_START_DATE = new Property<Date>("cashSettlePrdStartDate");
	public static final Property<String> CASH_SETTLE_SATURDAYS = new Property<String>("cashSettleSaturdays");
	public static final Property<String> CASH_SETTLE_SUNDAYS = new Property<String>("cashSettleSundays");
	public static final Property<String> CASH_SETTLE_TYPE = new Property<String>("cashSettleType");
	public static final Property<Integer> CMNT_NUM = new Property<Integer>("cmntNum");
	public static final Property<String> COMMITMENT_IND = new Property<String>("commitmentInd");
	public static final Property<Date> EFP_LAST_POST_DATE = new Property<Date>("efpLastPostDate");
	public static final Property<Short> INTERNAL_PARENT_ORDER_NUM = new Property<Short>("internalParentOrderNum");
	public static final Property<Integer> INTERNAL_PARENT_TRADE_NUM = new Property<Integer>("internalParentTradeNum");
	public static final Property<Double> MARGIN_AMT = new Property<Double>("marginAmt");
	public static final Property<String> MARGIN_AMT_CURR_CODE = new Property<String>("marginAmtCurrCode");
	public static final Property<Short> MAX_ITEM_NUM = new Property<Short>("maxItemNum");
	public static final Property<Short> ORDER_NUM = new Property<Short>("orderNum");
	public static final Property<String> ORDER_STATUS_CODE = new Property<String>("orderStatusCode");
	public static final Property<String> ORDER_STRATEGY_NAME = new Property<String>("orderStrategyName");
	public static final Property<Short> ORDER_STRATEGY_NUM = new Property<Short>("orderStrategyNum");
	public static final Property<Short> ORDER_STRIP_NUM = new Property<Short>("orderStripNum");
	public static final Property<String> ORDER_TYPE_CODE = new Property<String>("orderTypeCode");
	public static final Property<String> PARENT_ORDER_IND = new Property<String>("parentOrderInd");
	public static final Property<Short> PARENT_ORDER_NUM = new Property<Short>("parentOrderNum");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<BigDecimal> SEQUENCE = new Property<BigDecimal>("sequence");
	public static final Property<String> STORAGE_IDENTIFIER = new Property<String>("storageIdentifier");
	public static final Property<Short> STRIP_DETAIL_ORDER_COUNT = new Property<Short>("stripDetailOrderCount");
	public static final Property<String> STRIP_ORDER_STATUS = new Property<String>("stripOrderStatus");
	public static final Property<String> STRIP_PERIODICITY = new Property<String>("stripPeriodicity");
	public static final Property<String> STRIP_SUMMARY_IND = new Property<String>("stripSummaryInd");
	public static final Property<String> TERM_EVERGREEN_IND = new Property<String>("termEvergreenInd");
	public static final Property<Integer> TRADE_NUM = new Property<Integer>("tradeNum");
	public static final Property<Date> TRAN_DATE = new Property<Date>("tranDate");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<String> TRANS_TYPE = new Property<String>("transType");
	public static final Property<String> TRANS_USER_INIT = new Property<String>("transUserInit");
	public static final Property<String> WORKSTATION_ID = new Property<String>("workstationId");

	public void setAppName(String appName)
	{
		writeProperty("appName", appName);
	}

	public String getAppName()
	{
		return (String) readProperty("appName");
	}

	public void setBalInd(String balInd)
	{
		writeProperty("balInd", balInd);
	}

	public String getBalInd()
	{
		return (String) readProperty("balInd");
	}

	public void setCashSettleHolidays(String cashSettleHolidays)
	{
		writeProperty("cashSettleHolidays", cashSettleHolidays);
	}

	public String getCashSettleHolidays()
	{
		return (String) readProperty("cashSettleHolidays");
	}

	public void setCashSettlePrdFreq(String cashSettlePrdFreq)
	{
		writeProperty("cashSettlePrdFreq", cashSettlePrdFreq);
	}

	public String getCashSettlePrdFreq()
	{
		return (String) readProperty("cashSettlePrdFreq");
	}

	public void setCashSettlePrdStartDate(Date cashSettlePrdStartDate)
	{
		writeProperty("cashSettlePrdStartDate", cashSettlePrdStartDate);
	}

	public Date getCashSettlePrdStartDate()
	{
		return (Date) readProperty("cashSettlePrdStartDate");
	}

	public void setCashSettleSaturdays(String cashSettleSaturdays)
	{
		writeProperty("cashSettleSaturdays", cashSettleSaturdays);
	}

	public String getCashSettleSaturdays()
	{
		return (String) readProperty("cashSettleSaturdays");
	}

	public void setCashSettleSundays(String cashSettleSundays)
	{
		writeProperty("cashSettleSundays", cashSettleSundays);
	}

	public String getCashSettleSundays()
	{
		return (String) readProperty("cashSettleSundays");
	}

	public void setCashSettleType(String cashSettleType)
	{
		writeProperty("cashSettleType", cashSettleType);
	}

	public String getCashSettleType()
	{
		return (String) readProperty("cashSettleType");
	}

	public void setCmntNum(Integer cmntNum)
	{
		writeProperty("cmntNum", cmntNum);
	}

	public Integer getCmntNum()
	{
		return (Integer) readProperty("cmntNum");
	}

	public void setCommitmentInd(String commitmentInd)
	{
		writeProperty("commitmentInd", commitmentInd);
	}

	public String getCommitmentInd()
	{
		return (String) readProperty("commitmentInd");
	}

	public void setEfpLastPostDate(Date efpLastPostDate)
	{
		writeProperty("efpLastPostDate", efpLastPostDate);
	}

	public Date getEfpLastPostDate()
	{
		return (Date) readProperty("efpLastPostDate");
	}

	public void setInternalParentOrderNum(Short internalParentOrderNum)
	{
		writeProperty("internalParentOrderNum", internalParentOrderNum);
	}

	public Short getInternalParentOrderNum()
	{
		return (Short) readProperty("internalParentOrderNum");
	}

	public void setInternalParentTradeNum(Integer internalParentTradeNum)
	{
		writeProperty("internalParentTradeNum", internalParentTradeNum);
	}

	public Integer getInternalParentTradeNum()
	{
		return (Integer) readProperty("internalParentTradeNum");
	}

	public void setMarginAmt(Double marginAmt)
	{
		writeProperty("marginAmt", marginAmt);
	}

	public Double getMarginAmt()
	{
		return (Double) readProperty("marginAmt");
	}

	public void setMarginAmtCurrCode(String marginAmtCurrCode)
	{
		writeProperty("marginAmtCurrCode", marginAmtCurrCode);
	}

	public String getMarginAmtCurrCode()
	{
		return (String) readProperty("marginAmtCurrCode");
	}

	public void setMaxItemNum(Short maxItemNum)
	{
		writeProperty("maxItemNum", maxItemNum);
	}

	public Short getMaxItemNum()
	{
		return (Short) readProperty("maxItemNum");
	}

	public void setOrderNum(Short orderNum)
	{
		writeProperty("orderNum", orderNum);
	}

	public Short getOrderNum()
	{
		return (Short) readProperty("orderNum");
	}

	public void setOrderStatusCode(String orderStatusCode)
	{
		writeProperty("orderStatusCode", orderStatusCode);
	}

	public String getOrderStatusCode()
	{
		return (String) readProperty("orderStatusCode");
	}

	public void setOrderStrategyName(String orderStrategyName)
	{
		writeProperty("orderStrategyName", orderStrategyName);
	}

	public String getOrderStrategyName()
	{
		return (String) readProperty("orderStrategyName");
	}

	public void setOrderStrategyNum(Short orderStrategyNum)
	{
		writeProperty("orderStrategyNum", orderStrategyNum);
	}

	public Short getOrderStrategyNum()
	{
		return (Short) readProperty("orderStrategyNum");
	}

	public void setOrderStripNum(Short orderStripNum)
	{
		writeProperty("orderStripNum", orderStripNum);
	}

	public Short getOrderStripNum()
	{
		return (Short) readProperty("orderStripNum");
	}

	public void setOrderTypeCode(String orderTypeCode)
	{
		writeProperty("orderTypeCode", orderTypeCode);
	}

	public String getOrderTypeCode()
	{
		return (String) readProperty("orderTypeCode");
	}

	public void setParentOrderInd(String parentOrderInd)
	{
		writeProperty("parentOrderInd", parentOrderInd);
	}

	public String getParentOrderInd()
	{
		return (String) readProperty("parentOrderInd");
	}

	public void setParentOrderNum(Short parentOrderNum)
	{
		writeProperty("parentOrderNum", parentOrderNum);
	}

	public Short getParentOrderNum()
	{
		return (Short) readProperty("parentOrderNum");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setSequence(BigDecimal sequence)
	{
		writeProperty("sequence", sequence);
	}

	public BigDecimal getSequence()
	{
		return (BigDecimal) readProperty("sequence");
	}

	public void setStorageIdentifier(String storageIdentifier)
	{
		writeProperty("storageIdentifier", storageIdentifier);
	}

	public String getStorageIdentifier()
	{
		return (String) readProperty("storageIdentifier");
	}

	public void setStripDetailOrderCount(Short stripDetailOrderCount)
	{
		writeProperty("stripDetailOrderCount", stripDetailOrderCount);
	}

	public Short getStripDetailOrderCount()
	{
		return (Short) readProperty("stripDetailOrderCount");
	}

	public void setStripOrderStatus(String stripOrderStatus)
	{
		writeProperty("stripOrderStatus", stripOrderStatus);
	}

	public String getStripOrderStatus()
	{
		return (String) readProperty("stripOrderStatus");
	}

	public void setStripPeriodicity(String stripPeriodicity)
	{
		writeProperty("stripPeriodicity", stripPeriodicity);
	}

	public String getStripPeriodicity()
	{
		return (String) readProperty("stripPeriodicity");
	}

	public void setStripSummaryInd(String stripSummaryInd)
	{
		writeProperty("stripSummaryInd", stripSummaryInd);
	}

	public String getStripSummaryInd()
	{
		return (String) readProperty("stripSummaryInd");
	}

	public void setTermEvergreenInd(String termEvergreenInd)
	{
		writeProperty("termEvergreenInd", termEvergreenInd);
	}

	public String getTermEvergreenInd()
	{
		return (String) readProperty("termEvergreenInd");
	}

	public void setTradeNum(Integer tradeNum)
	{
		writeProperty("tradeNum", tradeNum);
	}

	public Integer getTradeNum()
	{
		return (Integer) readProperty("tradeNum");
	}

	public void setTranDate(Date tranDate)
	{
		writeProperty("tranDate", tranDate);
	}

	public Date getTranDate()
	{
		return (Date) readProperty("tranDate");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setTransType(String transType)
	{
		writeProperty("transType", transType);
	}

	public String getTransType()
	{
		return (String) readProperty("transType");
	}

	public void setTransUserInit(String transUserInit)
	{
		writeProperty("transUserInit", transUserInit);
	}

	public String getTransUserInit()
	{
		return (String) readProperty("transUserInit");
	}

	public void setWorkstationId(String workstationId)
	{
		writeProperty("workstationId", workstationId);
	}

	public String getWorkstationId()
	{
		return (String) readProperty("workstationId");
	}

}