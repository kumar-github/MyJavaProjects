package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VBcpAudPosition90 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VBcpAudPosition90 extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> ACCT_SHORT_NAME = new Property<String>("acctShortName");
	public static final Property<Double> AVG_PURCH_PRICE = new Property<Double>("avgPurchPrice");
	public static final Property<Double> AVG_SALE_PRICE = new Property<Double>("avgSalePrice");
	public static final Property<String> CMDTY_CODE = new Property<String>("cmdtyCode");
	public static final Property<Integer> COMMKT_KEY = new Property<Integer>("commktKey");
	public static final Property<String> DESIRED_OPT_EVAL_METHOD = new Property<String>("desiredOptEvalMethod");
	public static final Property<String> DESIRED_OTC_OPT_CODE = new Property<String>("desiredOtcOptCode");
	public static final Property<Double> DISCOUNT_QTY = new Property<Double>("discountQty");
	public static final Property<String> EQUIV_SOURCE_IND = new Property<String>("equivSourceInd");
	public static final Property<Integer> FORMULA_BODY_NUM = new Property<Integer>("formulaBodyNum");
	public static final Property<String> FORMULA_NAME = new Property<String>("formulaName");
	public static final Property<Integer> FORMULA_NUM = new Property<Integer>("formulaNum");
	public static final Property<String> IS_CLEARED_IND = new Property<String>("isClearedInd");
	public static final Property<String> IS_EQUIV_IND = new Property<String>("isEquivInd");
	public static final Property<String> IS_HEDGE_IND = new Property<String>("isHedgeInd");
	public static final Property<BigDecimal> LAST_MTM_PRICE = new Property<BigDecimal>("lastMtmPrice");
	public static final Property<Double> LONG_QTY = new Property<Double>("longQty");
	public static final Property<String> MKT_CODE = new Property<String>("mktCode");
	public static final Property<Double> MKT_LONG_QTY = new Property<Double>("mktLongQty");
	public static final Property<Double> MKT_SHORT_QTY = new Property<Double>("mktShortQty");
	public static final Property<Date> OPT_EXP_DATE = new Property<Date>("optExpDate");
	public static final Property<String> OPT_PERIODICITY = new Property<String>("optPeriodicity");
	public static final Property<String> OPT_PRICE_SOURCE_CODE = new Property<String>("optPriceSourceCode");
	public static final Property<Date> OPT_START_DATE = new Property<Date>("optStartDate");
	public static final Property<String> OPTION_TYPE = new Property<String>("optionType");
	public static final Property<Integer> POS_NUM = new Property<Integer>("posNum");
	public static final Property<String> POS_STATUS = new Property<String>("posStatus");
	public static final Property<String> POS_TYPE = new Property<String>("posType");
	public static final Property<String> PRICE_CURR_CODE = new Property<String>("priceCurrCode");
	public static final Property<String> PRICE_UOM_CODE = new Property<String>("priceUomCode");
	public static final Property<Double> PRICED_QTY = new Property<Double>("pricedQty");
	public static final Property<String> PUT_CALL_IND = new Property<String>("putCallInd");
	public static final Property<String> QTY_UOM_CODE = new Property<String>("qtyUomCode");
	public static final Property<Integer> REAL_PORT_NUM = new Property<Integer>("realPortNum");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<BigDecimal> ROLLED_QTY = new Property<BigDecimal>("rolledQty");
	public static final Property<Double> SEC_DISCOUNT_QTY = new Property<Double>("secDiscountQty");
	public static final Property<Double> SEC_LONG_QTY = new Property<Double>("secLongQty");
	public static final Property<Double> SEC_MKT_LONG_QTY = new Property<Double>("secMktLongQty");
	public static final Property<Double> SEC_MKT_SHORT_QTY = new Property<Double>("secMktShortQty");
	public static final Property<String> SEC_POS_UOM_CODE = new Property<String>("secPosUomCode");
	public static final Property<Double> SEC_PRICED_QTY = new Property<Double>("secPricedQty");
	public static final Property<BigDecimal> SEC_ROLLED_QTY = new Property<BigDecimal>("secRolledQty");
	public static final Property<Double> SEC_SHORT_QTY = new Property<Double>("secShortQty");
	public static final Property<String> SETTLEMENT_TYPE = new Property<String>("settlementType");
	public static final Property<Double> SHORT_QTY = new Property<Double>("shortQty");
	public static final Property<Double> STRIKE_PRICE = new Property<Double>("strikePrice");
	public static final Property<String> STRIKE_PRICE_CURR_CODE = new Property<String>("strikePriceCurrCode");
	public static final Property<String> STRIKE_PRICE_UOM_CODE = new Property<String>("strikePriceUomCode");
	public static final Property<String> TRADING_PRD = new Property<String>("tradingPrd");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<String> WHAT_IF_IND = new Property<String>("whatIfInd");

	public void setAcctShortName(String acctShortName)
	{
		writeProperty("acctShortName", acctShortName);
	}

	public String getAcctShortName()
	{
		return (String) readProperty("acctShortName");
	}

	public void setAvgPurchPrice(Double avgPurchPrice)
	{
		writeProperty("avgPurchPrice", avgPurchPrice);
	}

	public Double getAvgPurchPrice()
	{
		return (Double) readProperty("avgPurchPrice");
	}

	public void setAvgSalePrice(Double avgSalePrice)
	{
		writeProperty("avgSalePrice", avgSalePrice);
	}

	public Double getAvgSalePrice()
	{
		return (Double) readProperty("avgSalePrice");
	}

	public void setCmdtyCode(String cmdtyCode)
	{
		writeProperty("cmdtyCode", cmdtyCode);
	}

	public String getCmdtyCode()
	{
		return (String) readProperty("cmdtyCode");
	}

	public void setCommktKey(Integer commktKey)
	{
		writeProperty("commktKey", commktKey);
	}

	public Integer getCommktKey()
	{
		return (Integer) readProperty("commktKey");
	}

	public void setDesiredOptEvalMethod(String desiredOptEvalMethod)
	{
		writeProperty("desiredOptEvalMethod", desiredOptEvalMethod);
	}

	public String getDesiredOptEvalMethod()
	{
		return (String) readProperty("desiredOptEvalMethod");
	}

	public void setDesiredOtcOptCode(String desiredOtcOptCode)
	{
		writeProperty("desiredOtcOptCode", desiredOtcOptCode);
	}

	public String getDesiredOtcOptCode()
	{
		return (String) readProperty("desiredOtcOptCode");
	}

	public void setDiscountQty(Double discountQty)
	{
		writeProperty("discountQty", discountQty);
	}

	public Double getDiscountQty()
	{
		return (Double) readProperty("discountQty");
	}

	public void setEquivSourceInd(String equivSourceInd)
	{
		writeProperty("equivSourceInd", equivSourceInd);
	}

	public String getEquivSourceInd()
	{
		return (String) readProperty("equivSourceInd");
	}

	public void setFormulaBodyNum(Integer formulaBodyNum)
	{
		writeProperty("formulaBodyNum", formulaBodyNum);
	}

	public Integer getFormulaBodyNum()
	{
		return (Integer) readProperty("formulaBodyNum");
	}

	public void setFormulaName(String formulaName)
	{
		writeProperty("formulaName", formulaName);
	}

	public String getFormulaName()
	{
		return (String) readProperty("formulaName");
	}

	public void setFormulaNum(Integer formulaNum)
	{
		writeProperty("formulaNum", formulaNum);
	}

	public Integer getFormulaNum()
	{
		return (Integer) readProperty("formulaNum");
	}

	public void setIsClearedInd(String isClearedInd)
	{
		writeProperty("isClearedInd", isClearedInd);
	}

	public String getIsClearedInd()
	{
		return (String) readProperty("isClearedInd");
	}

	public void setIsEquivInd(String isEquivInd)
	{
		writeProperty("isEquivInd", isEquivInd);
	}

	public String getIsEquivInd()
	{
		return (String) readProperty("isEquivInd");
	}

	public void setIsHedgeInd(String isHedgeInd)
	{
		writeProperty("isHedgeInd", isHedgeInd);
	}

	public String getIsHedgeInd()
	{
		return (String) readProperty("isHedgeInd");
	}

	public void setLastMtmPrice(BigDecimal lastMtmPrice)
	{
		writeProperty("lastMtmPrice", lastMtmPrice);
	}

	public BigDecimal getLastMtmPrice()
	{
		return (BigDecimal) readProperty("lastMtmPrice");
	}

	public void setLongQty(Double longQty)
	{
		writeProperty("longQty", longQty);
	}

	public Double getLongQty()
	{
		return (Double) readProperty("longQty");
	}

	public void setMktCode(String mktCode)
	{
		writeProperty("mktCode", mktCode);
	}

	public String getMktCode()
	{
		return (String) readProperty("mktCode");
	}

	public void setMktLongQty(Double mktLongQty)
	{
		writeProperty("mktLongQty", mktLongQty);
	}

	public Double getMktLongQty()
	{
		return (Double) readProperty("mktLongQty");
	}

	public void setMktShortQty(Double mktShortQty)
	{
		writeProperty("mktShortQty", mktShortQty);
	}

	public Double getMktShortQty()
	{
		return (Double) readProperty("mktShortQty");
	}

	public void setOptExpDate(Date optExpDate)
	{
		writeProperty("optExpDate", optExpDate);
	}

	public Date getOptExpDate()
	{
		return (Date) readProperty("optExpDate");
	}

	public void setOptPeriodicity(String optPeriodicity)
	{
		writeProperty("optPeriodicity", optPeriodicity);
	}

	public String getOptPeriodicity()
	{
		return (String) readProperty("optPeriodicity");
	}

	public void setOptPriceSourceCode(String optPriceSourceCode)
	{
		writeProperty("optPriceSourceCode", optPriceSourceCode);
	}

	public String getOptPriceSourceCode()
	{
		return (String) readProperty("optPriceSourceCode");
	}

	public void setOptStartDate(Date optStartDate)
	{
		writeProperty("optStartDate", optStartDate);
	}

	public Date getOptStartDate()
	{
		return (Date) readProperty("optStartDate");
	}

	public void setOptionType(String optionType)
	{
		writeProperty("optionType", optionType);
	}

	public String getOptionType()
	{
		return (String) readProperty("optionType");
	}

	public void setPosNum(Integer posNum)
	{
		writeProperty("posNum", posNum);
	}

	public Integer getPosNum()
	{
		return (Integer) readProperty("posNum");
	}

	public void setPosStatus(String posStatus)
	{
		writeProperty("posStatus", posStatus);
	}

	public String getPosStatus()
	{
		return (String) readProperty("posStatus");
	}

	public void setPosType(String posType)
	{
		writeProperty("posType", posType);
	}

	public String getPosType()
	{
		return (String) readProperty("posType");
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

	public void setPricedQty(Double pricedQty)
	{
		writeProperty("pricedQty", pricedQty);
	}

	public Double getPricedQty()
	{
		return (Double) readProperty("pricedQty");
	}

	public void setPutCallInd(String putCallInd)
	{
		writeProperty("putCallInd", putCallInd);
	}

	public String getPutCallInd()
	{
		return (String) readProperty("putCallInd");
	}

	public void setQtyUomCode(String qtyUomCode)
	{
		writeProperty("qtyUomCode", qtyUomCode);
	}

	public String getQtyUomCode()
	{
		return (String) readProperty("qtyUomCode");
	}

	public void setRealPortNum(Integer realPortNum)
	{
		writeProperty("realPortNum", realPortNum);
	}

	public Integer getRealPortNum()
	{
		return (Integer) readProperty("realPortNum");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setRolledQty(BigDecimal rolledQty)
	{
		writeProperty("rolledQty", rolledQty);
	}

	public BigDecimal getRolledQty()
	{
		return (BigDecimal) readProperty("rolledQty");
	}

	public void setSecDiscountQty(Double secDiscountQty)
	{
		writeProperty("secDiscountQty", secDiscountQty);
	}

	public Double getSecDiscountQty()
	{
		return (Double) readProperty("secDiscountQty");
	}

	public void setSecLongQty(Double secLongQty)
	{
		writeProperty("secLongQty", secLongQty);
	}

	public Double getSecLongQty()
	{
		return (Double) readProperty("secLongQty");
	}

	public void setSecMktLongQty(Double secMktLongQty)
	{
		writeProperty("secMktLongQty", secMktLongQty);
	}

	public Double getSecMktLongQty()
	{
		return (Double) readProperty("secMktLongQty");
	}

	public void setSecMktShortQty(Double secMktShortQty)
	{
		writeProperty("secMktShortQty", secMktShortQty);
	}

	public Double getSecMktShortQty()
	{
		return (Double) readProperty("secMktShortQty");
	}

	public void setSecPosUomCode(String secPosUomCode)
	{
		writeProperty("secPosUomCode", secPosUomCode);
	}

	public String getSecPosUomCode()
	{
		return (String) readProperty("secPosUomCode");
	}

	public void setSecPricedQty(Double secPricedQty)
	{
		writeProperty("secPricedQty", secPricedQty);
	}

	public Double getSecPricedQty()
	{
		return (Double) readProperty("secPricedQty");
	}

	public void setSecRolledQty(BigDecimal secRolledQty)
	{
		writeProperty("secRolledQty", secRolledQty);
	}

	public BigDecimal getSecRolledQty()
	{
		return (BigDecimal) readProperty("secRolledQty");
	}

	public void setSecShortQty(Double secShortQty)
	{
		writeProperty("secShortQty", secShortQty);
	}

	public Double getSecShortQty()
	{
		return (Double) readProperty("secShortQty");
	}

	public void setSettlementType(String settlementType)
	{
		writeProperty("settlementType", settlementType);
	}

	public String getSettlementType()
	{
		return (String) readProperty("settlementType");
	}

	public void setShortQty(Double shortQty)
	{
		writeProperty("shortQty", shortQty);
	}

	public Double getShortQty()
	{
		return (Double) readProperty("shortQty");
	}

	public void setStrikePrice(Double strikePrice)
	{
		writeProperty("strikePrice", strikePrice);
	}

	public Double getStrikePrice()
	{
		return (Double) readProperty("strikePrice");
	}

	public void setStrikePriceCurrCode(String strikePriceCurrCode)
	{
		writeProperty("strikePriceCurrCode", strikePriceCurrCode);
	}

	public String getStrikePriceCurrCode()
	{
		return (String) readProperty("strikePriceCurrCode");
	}

	public void setStrikePriceUomCode(String strikePriceUomCode)
	{
		writeProperty("strikePriceUomCode", strikePriceUomCode);
	}

	public String getStrikePriceUomCode()
	{
		return (String) readProperty("strikePriceUomCode");
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

	public void setWhatIfInd(String whatIfInd)
	{
		writeProperty("whatIfInd", whatIfInd);
	}

	public String getWhatIfInd()
	{
		return (String) readProperty("whatIfInd");
	}

}
