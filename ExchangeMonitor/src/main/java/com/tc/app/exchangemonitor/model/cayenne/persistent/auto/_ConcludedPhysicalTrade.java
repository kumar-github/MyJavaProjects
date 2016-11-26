package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _ConcludedPhysicalTrade was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ConcludedPhysicalTrade extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> ACCT_CONT_NUM = new Property<Integer>("acctContNum");
	public static final Property<Integer> ACCT_NUM = new Property<Integer>("acctNum");
	public static final Property<String> ACCT_SHORT_NAME = new Property<String>("acctShortName");
	public static final Property<Double> AVG_PRICE = new Property<Double>("avgPrice");
	public static final Property<String> BAL_IND = new Property<String>("balInd");
	public static final Property<Integer> BOOKING_COMP_NUM = new Property<Integer>("bookingCompNum");
	public static final Property<Double> BRKR_COMM_AMT = new Property<Double>("brkrCommAmt");
	public static final Property<String> BRKR_COMM_CURR_CODE = new Property<String>("brkrCommCurrCode");
	public static final Property<String> BRKR_COMM_UOM_CODE = new Property<String>("brkrCommUomCode");
	public static final Property<Integer> BRKR_CONT_NUM = new Property<Integer>("brkrContNum");
	public static final Property<Integer> BRKR_NUM = new Property<Integer>("brkrNum");
	public static final Property<String> BRKR_REF_NUM = new Property<String>("brkrRefNum");
	public static final Property<String> CMDTY_CODE = new Property<String>("cmdtyCode");
	public static final Property<Integer> CMNT_NUM = new Property<Integer>("cmntNum");
	public static final Property<Double> CONTR_QTY = new Property<Double>("contrQty");
	public static final Property<String> CONTR_QTY_UOM_CODE = new Property<String>("contrQtyUomCode");
	public static final Property<String> CR_ANLY_INIT = new Property<String>("crAnlyInit");
	public static final Property<String> CREDIT_TERM_CODE = new Property<String>("creditTermCode");
	public static final Property<String> DEL_DATE_EST_IND = new Property<String>("delDateEstInd");
	public static final Property<Date> DEL_DATE_FROM = new Property<Date>("delDateFrom");
	public static final Property<Date> DEL_DATE_TO = new Property<Date>("delDateTo");
	public static final Property<String> DEL_LOC_CODE = new Property<String>("delLocCode");
	public static final Property<String> DEL_TERM_CODE = new Property<String>("delTermCode");
	public static final Property<String> FORMULA_IND = new Property<String>("formulaInd");
	public static final Property<Short> ITEM_NUM = new Property<Short>("itemNum");
	public static final Property<Double> MAX_QTY = new Property<Double>("maxQty");
	public static final Property<String> MAX_QTY_UOM_CODE = new Property<String>("maxQtyUomCode");
	public static final Property<Double> MIN_QTY = new Property<Double>("minQty");
	public static final Property<String> MIN_QTY_UOM_CODE = new Property<String>("minQtyUomCode");
	public static final Property<Double> MIN_SHIP_QTY = new Property<Double>("minShipQty");
	public static final Property<String> MIN_SHIP_QTY_UOM_CODE = new Property<String>("minShipQtyUomCode");
	public static final Property<String> MOT_CODE = new Property<String>("motCode");
	public static final Property<Double> OPEN_QTY = new Property<Double>("openQty");
	public static final Property<Short> ORDER_NUM = new Property<Short>("orderNum");
	public static final Property<String> ORDER_TYPE_CODE = new Property<String>("orderTypeCode");
	public static final Property<String> P_SIND = new Property<String>("pSInd");
	public static final Property<String> PARCEL_NUM = new Property<String>("parcelNum");
	public static final Property<Date> PARTIAL_DEADLINE_DATE = new Property<Date>("partialDeadlineDate");
	public static final Property<Double> PARTIAL_RES_INC_AMT = new Property<Double>("partialResIncAmt");
	public static final Property<Integer> PAY_DAYS = new Property<Integer>("payDays");
	public static final Property<String> PAY_TERM_CODE = new Property<String>("payTermCode");
	public static final Property<Integer> PIPELINE_CYCLE_NUM = new Property<Integer>("pipelineCycleNum");
	public static final Property<String> PRICE_CURR_CODE = new Property<String>("priceCurrCode");
	public static final Property<String> PRICE_UOM_CODE = new Property<String>("priceUomCode");
	public static final Property<String> RISK_MKT_CODE = new Property<String>("riskMktCode");
	public static final Property<String> SCH_INIT = new Property<String>("schInit");
	public static final Property<String> SCH_QTY_UOM_CODE = new Property<String>("schQtyUomCode");
	public static final Property<String> TAKEN_TO_SCH_POS_IND = new Property<String>("takenToSchPosInd");
	public static final Property<Short> TIMING_CYCLE_YEAR = new Property<Short>("timingCycleYear");
	public static final Property<String> TITLE_MKT_CODE = new Property<String>("titleMktCode");
	public static final Property<String> TOL_OPT = new Property<String>("tolOpt");
	public static final Property<Double> TOL_QTY = new Property<Double>("tolQty");
	public static final Property<String> TOL_QTY_UOM_CODE = new Property<String>("tolQtyUomCode");
	public static final Property<String> TOL_SIGN = new Property<String>("tolSign");
	public static final Property<Double> TOTAL_SCH_QTY = new Property<Double>("totalSchQty");
	public static final Property<Short> TOTAL_SHIP_NUM = new Property<Short>("totalShipNum");
	public static final Property<String> TRADE_IMP_REC_IND = new Property<String>("tradeImpRecInd");
	public static final Property<Integer> TRADE_NUM = new Property<Integer>("tradeNum");
	public static final Property<String> TRADER_INIT = new Property<String>("traderInit");
	public static final Property<String> TRADING_PRD = new Property<String>("tradingPrd");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<String> VESSEL_NAME = new Property<String>("vesselName");

	public void setAcctContNum(Integer acctContNum)
	{
		writeProperty("acctContNum", acctContNum);
	}

	public Integer getAcctContNum()
	{
		return (Integer) readProperty("acctContNum");
	}

	public void setAcctNum(Integer acctNum)
	{
		writeProperty("acctNum", acctNum);
	}

	public Integer getAcctNum()
	{
		return (Integer) readProperty("acctNum");
	}

	public void setAcctShortName(String acctShortName)
	{
		writeProperty("acctShortName", acctShortName);
	}

	public String getAcctShortName()
	{
		return (String) readProperty("acctShortName");
	}

	public void setAvgPrice(Double avgPrice)
	{
		writeProperty("avgPrice", avgPrice);
	}

	public Double getAvgPrice()
	{
		return (Double) readProperty("avgPrice");
	}

	public void setBalInd(String balInd)
	{
		writeProperty("balInd", balInd);
	}

	public String getBalInd()
	{
		return (String) readProperty("balInd");
	}

	public void setBookingCompNum(Integer bookingCompNum)
	{
		writeProperty("bookingCompNum", bookingCompNum);
	}

	public Integer getBookingCompNum()
	{
		return (Integer) readProperty("bookingCompNum");
	}

	public void setBrkrCommAmt(Double brkrCommAmt)
	{
		writeProperty("brkrCommAmt", brkrCommAmt);
	}

	public Double getBrkrCommAmt()
	{
		return (Double) readProperty("brkrCommAmt");
	}

	public void setBrkrCommCurrCode(String brkrCommCurrCode)
	{
		writeProperty("brkrCommCurrCode", brkrCommCurrCode);
	}

	public String getBrkrCommCurrCode()
	{
		return (String) readProperty("brkrCommCurrCode");
	}

	public void setBrkrCommUomCode(String brkrCommUomCode)
	{
		writeProperty("brkrCommUomCode", brkrCommUomCode);
	}

	public String getBrkrCommUomCode()
	{
		return (String) readProperty("brkrCommUomCode");
	}

	public void setBrkrContNum(Integer brkrContNum)
	{
		writeProperty("brkrContNum", brkrContNum);
	}

	public Integer getBrkrContNum()
	{
		return (Integer) readProperty("brkrContNum");
	}

	public void setBrkrNum(Integer brkrNum)
	{
		writeProperty("brkrNum", brkrNum);
	}

	public Integer getBrkrNum()
	{
		return (Integer) readProperty("brkrNum");
	}

	public void setBrkrRefNum(String brkrRefNum)
	{
		writeProperty("brkrRefNum", brkrRefNum);
	}

	public String getBrkrRefNum()
	{
		return (String) readProperty("brkrRefNum");
	}

	public void setCmdtyCode(String cmdtyCode)
	{
		writeProperty("cmdtyCode", cmdtyCode);
	}

	public String getCmdtyCode()
	{
		return (String) readProperty("cmdtyCode");
	}

	public void setCmntNum(Integer cmntNum)
	{
		writeProperty("cmntNum", cmntNum);
	}

	public Integer getCmntNum()
	{
		return (Integer) readProperty("cmntNum");
	}

	public void setContrQty(Double contrQty)
	{
		writeProperty("contrQty", contrQty);
	}

	public Double getContrQty()
	{
		return (Double) readProperty("contrQty");
	}

	public void setContrQtyUomCode(String contrQtyUomCode)
	{
		writeProperty("contrQtyUomCode", contrQtyUomCode);
	}

	public String getContrQtyUomCode()
	{
		return (String) readProperty("contrQtyUomCode");
	}

	public void setCrAnlyInit(String crAnlyInit)
	{
		writeProperty("crAnlyInit", crAnlyInit);
	}

	public String getCrAnlyInit()
	{
		return (String) readProperty("crAnlyInit");
	}

	public void setCreditTermCode(String creditTermCode)
	{
		writeProperty("creditTermCode", creditTermCode);
	}

	public String getCreditTermCode()
	{
		return (String) readProperty("creditTermCode");
	}

	public void setDelDateEstInd(String delDateEstInd)
	{
		writeProperty("delDateEstInd", delDateEstInd);
	}

	public String getDelDateEstInd()
	{
		return (String) readProperty("delDateEstInd");
	}

	public void setDelDateFrom(Date delDateFrom)
	{
		writeProperty("delDateFrom", delDateFrom);
	}

	public Date getDelDateFrom()
	{
		return (Date) readProperty("delDateFrom");
	}

	public void setDelDateTo(Date delDateTo)
	{
		writeProperty("delDateTo", delDateTo);
	}

	public Date getDelDateTo()
	{
		return (Date) readProperty("delDateTo");
	}

	public void setDelLocCode(String delLocCode)
	{
		writeProperty("delLocCode", delLocCode);
	}

	public String getDelLocCode()
	{
		return (String) readProperty("delLocCode");
	}

	public void setDelTermCode(String delTermCode)
	{
		writeProperty("delTermCode", delTermCode);
	}

	public String getDelTermCode()
	{
		return (String) readProperty("delTermCode");
	}

	public void setFormulaInd(String formulaInd)
	{
		writeProperty("formulaInd", formulaInd);
	}

	public String getFormulaInd()
	{
		return (String) readProperty("formulaInd");
	}

	public void setItemNum(Short itemNum)
	{
		writeProperty("itemNum", itemNum);
	}

	public Short getItemNum()
	{
		return (Short) readProperty("itemNum");
	}

	public void setMaxQty(Double maxQty)
	{
		writeProperty("maxQty", maxQty);
	}

	public Double getMaxQty()
	{
		return (Double) readProperty("maxQty");
	}

	public void setMaxQtyUomCode(String maxQtyUomCode)
	{
		writeProperty("maxQtyUomCode", maxQtyUomCode);
	}

	public String getMaxQtyUomCode()
	{
		return (String) readProperty("maxQtyUomCode");
	}

	public void setMinQty(Double minQty)
	{
		writeProperty("minQty", minQty);
	}

	public Double getMinQty()
	{
		return (Double) readProperty("minQty");
	}

	public void setMinQtyUomCode(String minQtyUomCode)
	{
		writeProperty("minQtyUomCode", minQtyUomCode);
	}

	public String getMinQtyUomCode()
	{
		return (String) readProperty("minQtyUomCode");
	}

	public void setMinShipQty(Double minShipQty)
	{
		writeProperty("minShipQty", minShipQty);
	}

	public Double getMinShipQty()
	{
		return (Double) readProperty("minShipQty");
	}

	public void setMinShipQtyUomCode(String minShipQtyUomCode)
	{
		writeProperty("minShipQtyUomCode", minShipQtyUomCode);
	}

	public String getMinShipQtyUomCode()
	{
		return (String) readProperty("minShipQtyUomCode");
	}

	public void setMotCode(String motCode)
	{
		writeProperty("motCode", motCode);
	}

	public String getMotCode()
	{
		return (String) readProperty("motCode");
	}

	public void setOpenQty(Double openQty)
	{
		writeProperty("openQty", openQty);
	}

	public Double getOpenQty()
	{
		return (Double) readProperty("openQty");
	}

	public void setOrderNum(Short orderNum)
	{
		writeProperty("orderNum", orderNum);
	}

	public Short getOrderNum()
	{
		return (Short) readProperty("orderNum");
	}

	public void setOrderTypeCode(String orderTypeCode)
	{
		writeProperty("orderTypeCode", orderTypeCode);
	}

	public String getOrderTypeCode()
	{
		return (String) readProperty("orderTypeCode");
	}

	public void setPSInd(String pSInd)
	{
		writeProperty("pSInd", pSInd);
	}

	public String getPSInd()
	{
		return (String) readProperty("pSInd");
	}

	public void setParcelNum(String parcelNum)
	{
		writeProperty("parcelNum", parcelNum);
	}

	public String getParcelNum()
	{
		return (String) readProperty("parcelNum");
	}

	public void setPartialDeadlineDate(Date partialDeadlineDate)
	{
		writeProperty("partialDeadlineDate", partialDeadlineDate);
	}

	public Date getPartialDeadlineDate()
	{
		return (Date) readProperty("partialDeadlineDate");
	}

	public void setPartialResIncAmt(Double partialResIncAmt)
	{
		writeProperty("partialResIncAmt", partialResIncAmt);
	}

	public Double getPartialResIncAmt()
	{
		return (Double) readProperty("partialResIncAmt");
	}

	public void setPayDays(Integer payDays)
	{
		writeProperty("payDays", payDays);
	}

	public Integer getPayDays()
	{
		return (Integer) readProperty("payDays");
	}

	public void setPayTermCode(String payTermCode)
	{
		writeProperty("payTermCode", payTermCode);
	}

	public String getPayTermCode()
	{
		return (String) readProperty("payTermCode");
	}

	public void setPipelineCycleNum(Integer pipelineCycleNum)
	{
		writeProperty("pipelineCycleNum", pipelineCycleNum);
	}

	public Integer getPipelineCycleNum()
	{
		return (Integer) readProperty("pipelineCycleNum");
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

	public void setRiskMktCode(String riskMktCode)
	{
		writeProperty("riskMktCode", riskMktCode);
	}

	public String getRiskMktCode()
	{
		return (String) readProperty("riskMktCode");
	}

	public void setSchInit(String schInit)
	{
		writeProperty("schInit", schInit);
	}

	public String getSchInit()
	{
		return (String) readProperty("schInit");
	}

	public void setSchQtyUomCode(String schQtyUomCode)
	{
		writeProperty("schQtyUomCode", schQtyUomCode);
	}

	public String getSchQtyUomCode()
	{
		return (String) readProperty("schQtyUomCode");
	}

	public void setTakenToSchPosInd(String takenToSchPosInd)
	{
		writeProperty("takenToSchPosInd", takenToSchPosInd);
	}

	public String getTakenToSchPosInd()
	{
		return (String) readProperty("takenToSchPosInd");
	}

	public void setTimingCycleYear(Short timingCycleYear)
	{
		writeProperty("timingCycleYear", timingCycleYear);
	}

	public Short getTimingCycleYear()
	{
		return (Short) readProperty("timingCycleYear");
	}

	public void setTitleMktCode(String titleMktCode)
	{
		writeProperty("titleMktCode", titleMktCode);
	}

	public String getTitleMktCode()
	{
		return (String) readProperty("titleMktCode");
	}

	public void setTolOpt(String tolOpt)
	{
		writeProperty("tolOpt", tolOpt);
	}

	public String getTolOpt()
	{
		return (String) readProperty("tolOpt");
	}

	public void setTolQty(Double tolQty)
	{
		writeProperty("tolQty", tolQty);
	}

	public Double getTolQty()
	{
		return (Double) readProperty("tolQty");
	}

	public void setTolQtyUomCode(String tolQtyUomCode)
	{
		writeProperty("tolQtyUomCode", tolQtyUomCode);
	}

	public String getTolQtyUomCode()
	{
		return (String) readProperty("tolQtyUomCode");
	}

	public void setTolSign(String tolSign)
	{
		writeProperty("tolSign", tolSign);
	}

	public String getTolSign()
	{
		return (String) readProperty("tolSign");
	}

	public void setTotalSchQty(Double totalSchQty)
	{
		writeProperty("totalSchQty", totalSchQty);
	}

	public Double getTotalSchQty()
	{
		return (Double) readProperty("totalSchQty");
	}

	public void setTotalShipNum(Short totalShipNum)
	{
		writeProperty("totalShipNum", totalShipNum);
	}

	public Short getTotalShipNum()
	{
		return (Short) readProperty("totalShipNum");
	}

	public void setTradeImpRecInd(String tradeImpRecInd)
	{
		writeProperty("tradeImpRecInd", tradeImpRecInd);
	}

	public String getTradeImpRecInd()
	{
		return (String) readProperty("tradeImpRecInd");
	}

	public void setTradeNum(Integer tradeNum)
	{
		writeProperty("tradeNum", tradeNum);
	}

	public Integer getTradeNum()
	{
		return (Integer) readProperty("tradeNum");
	}

	public void setTraderInit(String traderInit)
	{
		writeProperty("traderInit", traderInit);
	}

	public String getTraderInit()
	{
		return (String) readProperty("traderInit");
	}

	public void setTradingPrd(String tradingPrd)
	{
		writeProperty("tradingPrd", tradingPrd);
	}

	public String getTradingPrd()
	{
		return (String) readProperty("tradingPrd");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setVesselName(String vesselName)
	{
		writeProperty("vesselName", vesselName);
	}

	public String getVesselName()
	{
		return (String) readProperty("vesselName");
	}

}
