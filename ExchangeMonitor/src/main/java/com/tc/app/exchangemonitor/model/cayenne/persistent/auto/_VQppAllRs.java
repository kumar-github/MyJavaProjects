package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VQppAllRs was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VQppAllRs extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Short> ACCUM_NUM = new Property<Short>("accumNum");
	public static final Property<String> APP_NAME = new Property<String>("appName");
	public static final Property<Date> CAL_IMPACT_END_DATE = new Property<Date>("calImpactEndDate");
	public static final Property<Date> CAL_IMPACT_START_DATE = new Property<Date>("calImpactStartDate");
	public static final Property<String> CALENDAR_CODE = new Property<String>("calendarCode");
	public static final Property<Short> FORMULA_BODY_NUM = new Property<Short>("formulaBodyNum");
	public static final Property<Short> FORMULA_COMP_NUM = new Property<Short>("formulaCompNum");
	public static final Property<Integer> FORMULA_NUM = new Property<Integer>("formulaNum");
	public static final Property<Short> ITEM_NUM = new Property<Short>("itemNum");
	public static final Property<Date> LAST_PRICING_DATE = new Property<Date>("lastPricingDate");
	public static final Property<String> MANUAL_OVERRIDE_IND = new Property<String>("manualOverrideInd");
	public static final Property<Date> NOMINAL_END_DATE = new Property<Date>("nominalEndDate");
	public static final Property<Date> NOMINAL_START_DATE = new Property<Date>("nominalStartDate");
	public static final Property<Short> NUM_OF_DAYS_PRICED = new Property<Short>("numOfDaysPriced");
	public static final Property<Short> NUM_OF_PRICING_DAYS = new Property<Short>("numOfPricingDays");
	public static final Property<Double> OPEN_PRICE = new Property<Double>("openPrice");
	public static final Property<Short> ORDER_NUM = new Property<Short>("orderNum");
	public static final Property<String> PRICE_CURR_CODE = new Property<String>("priceCurrCode");
	public static final Property<String> PRICE_UOM_CODE = new Property<String>("priceUomCode");
	public static final Property<Double> PRICED_PRICE = new Property<Double>("pricedPrice");
	public static final Property<Double> PRICED_QTY = new Property<Double>("pricedQty");
	public static final Property<Short> QPP_NUM = new Property<Short>("qppNum");
	public static final Property<String> QTY_UOM_CODE = new Property<String>("qtyUomCode");
	public static final Property<Date> QUOTE_END_DATE = new Property<Date>("quoteEndDate");
	public static final Property<Date> QUOTE_START_DATE = new Property<Date>("quoteStartDate");
	public static final Property<String> REAL_TRADING_PRD = new Property<String>("realTradingPrd");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<String> RISK_TRADING_PRD = new Property<String>("riskTradingPrd");
	public static final Property<BigDecimal> SEQUENCE = new Property<BigDecimal>("sequence");
	public static final Property<Double> TOTAL_QTY = new Property<Double>("totalQty");
	public static final Property<Integer> TRADE_NUM = new Property<Integer>("tradeNum");
	public static final Property<Date> TRAN_DATE = new Property<Date>("tranDate");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<String> TRANS_TYPE = new Property<String>("transType");
	public static final Property<String> TRANS_USER_INIT = new Property<String>("transUserInit");
	public static final Property<String> WORKSTATION_ID = new Property<String>("workstationId");

	public void setAccumNum(Short accumNum)
	{
		writeProperty("accumNum", accumNum);
	}

	public Short getAccumNum()
	{
		return (Short) readProperty("accumNum");
	}

	public void setAppName(String appName)
	{
		writeProperty("appName", appName);
	}

	public String getAppName()
	{
		return (String) readProperty("appName");
	}

	public void setCalImpactEndDate(Date calImpactEndDate)
	{
		writeProperty("calImpactEndDate", calImpactEndDate);
	}

	public Date getCalImpactEndDate()
	{
		return (Date) readProperty("calImpactEndDate");
	}

	public void setCalImpactStartDate(Date calImpactStartDate)
	{
		writeProperty("calImpactStartDate", calImpactStartDate);
	}

	public Date getCalImpactStartDate()
	{
		return (Date) readProperty("calImpactStartDate");
	}

	public void setCalendarCode(String calendarCode)
	{
		writeProperty("calendarCode", calendarCode);
	}

	public String getCalendarCode()
	{
		return (String) readProperty("calendarCode");
	}

	public void setFormulaBodyNum(Short formulaBodyNum)
	{
		writeProperty("formulaBodyNum", formulaBodyNum);
	}

	public Short getFormulaBodyNum()
	{
		return (Short) readProperty("formulaBodyNum");
	}

	public void setFormulaCompNum(Short formulaCompNum)
	{
		writeProperty("formulaCompNum", formulaCompNum);
	}

	public Short getFormulaCompNum()
	{
		return (Short) readProperty("formulaCompNum");
	}

	public void setFormulaNum(Integer formulaNum)
	{
		writeProperty("formulaNum", formulaNum);
	}

	public Integer getFormulaNum()
	{
		return (Integer) readProperty("formulaNum");
	}

	public void setItemNum(Short itemNum)
	{
		writeProperty("itemNum", itemNum);
	}

	public Short getItemNum()
	{
		return (Short) readProperty("itemNum");
	}

	public void setLastPricingDate(Date lastPricingDate)
	{
		writeProperty("lastPricingDate", lastPricingDate);
	}

	public Date getLastPricingDate()
	{
		return (Date) readProperty("lastPricingDate");
	}

	public void setManualOverrideInd(String manualOverrideInd)
	{
		writeProperty("manualOverrideInd", manualOverrideInd);
	}

	public String getManualOverrideInd()
	{
		return (String) readProperty("manualOverrideInd");
	}

	public void setNominalEndDate(Date nominalEndDate)
	{
		writeProperty("nominalEndDate", nominalEndDate);
	}

	public Date getNominalEndDate()
	{
		return (Date) readProperty("nominalEndDate");
	}

	public void setNominalStartDate(Date nominalStartDate)
	{
		writeProperty("nominalStartDate", nominalStartDate);
	}

	public Date getNominalStartDate()
	{
		return (Date) readProperty("nominalStartDate");
	}

	public void setNumOfDaysPriced(Short numOfDaysPriced)
	{
		writeProperty("numOfDaysPriced", numOfDaysPriced);
	}

	public Short getNumOfDaysPriced()
	{
		return (Short) readProperty("numOfDaysPriced");
	}

	public void setNumOfPricingDays(Short numOfPricingDays)
	{
		writeProperty("numOfPricingDays", numOfPricingDays);
	}

	public Short getNumOfPricingDays()
	{
		return (Short) readProperty("numOfPricingDays");
	}

	public void setOpenPrice(Double openPrice)
	{
		writeProperty("openPrice", openPrice);
	}

	public Double getOpenPrice()
	{
		return (Double) readProperty("openPrice");
	}

	public void setOrderNum(Short orderNum)
	{
		writeProperty("orderNum", orderNum);
	}

	public Short getOrderNum()
	{
		return (Short) readProperty("orderNum");
	}

	public void setPriceCurrCode(String priceCurrCode)
	{
		writeProperty("priceCurrCode", priceCurrCode);
	}

	public String getPriceCurrCode()
	{
		return (String) readProperty("priceCurrCode");
	}

	public void setPriceUomCode(String priceUomCode)
	{
		writeProperty("priceUomCode", priceUomCode);
	}

	public String getPriceUomCode()
	{
		return (String) readProperty("priceUomCode");
	}

	public void setPricedPrice(Double pricedPrice)
	{
		writeProperty("pricedPrice", pricedPrice);
	}

	public Double getPricedPrice()
	{
		return (Double) readProperty("pricedPrice");
	}

	public void setPricedQty(Double pricedQty)
	{
		writeProperty("pricedQty", pricedQty);
	}

	public Double getPricedQty()
	{
		return (Double) readProperty("pricedQty");
	}

	public void setQppNum(Short qppNum)
	{
		writeProperty("qppNum", qppNum);
	}

	public Short getQppNum()
	{
		return (Short) readProperty("qppNum");
	}

	public void setQtyUomCode(String qtyUomCode)
	{
		writeProperty("qtyUomCode", qtyUomCode);
	}

	public String getQtyUomCode()
	{
		return (String) readProperty("qtyUomCode");
	}

	public void setQuoteEndDate(Date quoteEndDate)
	{
		writeProperty("quoteEndDate", quoteEndDate);
	}

	public Date getQuoteEndDate()
	{
		return (Date) readProperty("quoteEndDate");
	}

	public void setQuoteStartDate(Date quoteStartDate)
	{
		writeProperty("quoteStartDate", quoteStartDate);
	}

	public Date getQuoteStartDate()
	{
		return (Date) readProperty("quoteStartDate");
	}

	public void setRealTradingPrd(String realTradingPrd)
	{
		writeProperty("realTradingPrd", realTradingPrd);
	}

	public String getRealTradingPrd()
	{
		return (String) readProperty("realTradingPrd");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setRiskTradingPrd(String riskTradingPrd)
	{
		writeProperty("riskTradingPrd", riskTradingPrd);
	}

	public String getRiskTradingPrd()
	{
		return (String) readProperty("riskTradingPrd");
	}

	public void setSequence(BigDecimal sequence)
	{
		writeProperty("sequence", sequence);
	}

	public BigDecimal getSequence()
	{
		return (BigDecimal) readProperty("sequence");
	}

	public void setTotalQty(Double totalQty)
	{
		writeProperty("totalQty", totalQty);
	}

	public Double getTotalQty()
	{
		return (Double) readProperty("totalQty");
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
