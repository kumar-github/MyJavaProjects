package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VTradeItemRev was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VTradeItemRev extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> ACCUM_PERIODICITY = new Property<String>("accumPeriodicity");
	public static final Property<String> ACTIVE_STATUS_IND = new Property<String>("activeStatusInd");
	public static final Property<Double> ADDL_COST_SUM = new Property<Double>("addlCostSum");
	public static final Property<Integer> AGREEMENT_NUM = new Property<Integer>("agreementNum");
	public static final Property<Date> AMEND_CREATION_DATE = new Property<Date>("amendCreationDate");
	public static final Property<Date> AMEND_EFFECT_END_DATE = new Property<Date>("amendEffectEndDate");
	public static final Property<Date> AMEND_EFFECT_START_DATE = new Property<Date>("amendEffectStartDate");
	public static final Property<Short> AMEND_NUM = new Property<Short>("amendNum");
	public static final Property<Integer> ASOF_TRANS_ID = new Property<Integer>("asofTransId");
	public static final Property<Double> AVG_PRICE = new Property<Double>("avgPrice");
	public static final Property<String> B2B_TRADE_ITEM = new Property<String>("b2bTradeItem");
	public static final Property<String> BILLING_TYPE = new Property<String>("billingType");
	public static final Property<Integer> BOOKING_COMP_NUM = new Property<Integer>("bookingCompNum");
	public static final Property<Double> BRKR_COMM_AMT = new Property<Double>("brkrCommAmt");
	public static final Property<String> BRKR_COMM_CURR_CODE = new Property<String>("brkrCommCurrCode");
	public static final Property<String> BRKR_COMM_UOM_CODE = new Property<String>("brkrCommUomCode");
	public static final Property<Integer> BRKR_CONT_NUM = new Property<Integer>("brkrContNum");
	public static final Property<Integer> BRKR_NUM = new Property<Integer>("brkrNum");
	public static final Property<String> BRKR_REF_NUM = new Property<String>("brkrRefNum");
	public static final Property<String> CALENDAR_CODE = new Property<String>("calendarCode");
	public static final Property<Integer> CLR_SERVICE_NUM = new Property<Integer>("clrServiceNum");
	public static final Property<String> CMDTY_CODE = new Property<String>("cmdtyCode");
	public static final Property<Integer> CMNT_NUM = new Property<Integer>("cmntNum");
	public static final Property<String> COMMITTED_QTY_UOM_CODE = new Property<String>("committedQtyUomCode");
	public static final Property<Double> CONTR_MTM_PL = new Property<Double>("contrMtmPl");
	public static final Property<Double> CONTR_QTY = new Property<Double>("contrQty");
	public static final Property<String> CONTR_QTY_PERIODICITY = new Property<String>("contrQtyPeriodicity");
	public static final Property<String> CONTR_QTY_UOM_CODE = new Property<String>("contrQtyUomCode");
	public static final Property<String> DISCH_PORT_LOC_CODE = new Property<String>("dischPortLocCode");
	public static final Property<String> ESTIMATE_IND = new Property<String>("estimateInd");
	public static final Property<Integer> EXCH_BRKR_NUM = new Property<Integer>("exchBrkrNum");
	public static final Property<String> EXCP_ADDNS_CODE = new Property<String>("excpAddnsCode");
	public static final Property<Integer> FINANCE_BANK_NUM = new Property<Integer>("financeBankNum");
	public static final Property<Date> FORMULA_DECLAR_DATE = new Property<Date>("formulaDeclarDate");
	public static final Property<String> FORMULA_IND = new Property<String>("formulaInd");
	public static final Property<String> FUT_TRADER_INIT = new Property<String>("futTraderInit");
	public static final Property<String> GTC_CODE = new Property<String>("gtcCode");
	public static final Property<String> HEDGE_CURR_CODE = new Property<String>("hedgeCurrCode");
	public static final Property<String> HEDGE_MULTI_DIV_IND = new Property<String>("hedgeMultiDivInd");
	public static final Property<String> HEDGE_POS_IND = new Property<String>("hedgePosInd");
	public static final Property<Double> HEDGE_RATE = new Property<Double>("hedgeRate");
	public static final Property<String> IDMS_ACCT_ALLOC = new Property<String>("idmsAcctAlloc");
	public static final Property<String> IDMS_BB_REF_NUM = new Property<String>("idmsBbRefNum");
	public static final Property<String> IDMS_CONTR_NUM = new Property<String>("idmsContrNum");
	public static final Property<String> IDMS_PROFIT_CENTER = new Property<String>("idmsProfitCenter");
	public static final Property<Boolean> INCLUDES_EXCISE_TAX_IND = new Property<Boolean>("includesExciseTaxInd");
	public static final Property<Boolean> INCLUDES_FUEL_TAX_IND = new Property<Boolean>("includesFuelTaxInd");
	public static final Property<Short> INTERNAL_PARENT_ITEM_NUM = new Property<Short>("internalParentItemNum");
	public static final Property<Short> INTERNAL_PARENT_ORDER_NUM = new Property<Short>("internalParentOrderNum");
	public static final Property<Integer> INTERNAL_PARENT_TRADE_NUM = new Property<Integer>("internalParentTradeNum");
	public static final Property<String> IS_CLEARED_IND = new Property<String>("isClearedInd");
	public static final Property<String> IS_LC_ASSIGNED = new Property<String>("isLcAssigned");
	public static final Property<String> IS_RC_ASSIGNED = new Property<String>("isRcAssigned");
	public static final Property<String> ITEM_CONFIRM_IND = new Property<String>("itemConfirmInd");
	public static final Property<Short> ITEM_NUM = new Property<Short>("itemNum");
	public static final Property<String> ITEM_STATUS_CODE = new Property<String>("itemStatusCode");
	public static final Property<String> ITEM_TYPE = new Property<String>("itemType");
	public static final Property<String> LOAD_PORT_LOC_CODE = new Property<String>("loadPortLocCode");
	public static final Property<BigDecimal> MARKET_VALUE = new Property<BigDecimal>("marketValue");
	public static final Property<Short> MAX_ACCUM_NUM = new Property<Short>("maxAccumNum");
	public static final Property<Double> MTM_PL = new Property<Double>("mtmPl");
	public static final Property<Date> MTM_PL_AS_OF_DATE = new Property<Date>("mtmPlAsOfDate");
	public static final Property<String> MTM_PL_CURR_CODE = new Property<String>("mtmPlCurrCode");
	public static final Property<Double> OPEN_QTY = new Property<Double>("openQty");
	public static final Property<String> OPEN_QTY_UOM_CODE = new Property<String>("openQtyUomCode");
	public static final Property<Short> ORDER_NUM = new Property<Short>("orderNum");
	public static final Property<String> ORIGIN_COUNTRY_CODE = new Property<String>("originCountryCode");
	public static final Property<String> P_SIND = new Property<String>("pSInd");
	public static final Property<Short> PARENT_ITEM_NUM = new Property<Short>("parentItemNum");
	public static final Property<String> POOLING_PORT_IND = new Property<String>("poolingPortInd");
	public static final Property<Integer> POOLING_PORT_NUM = new Property<Integer>("poolingPortNum");
	public static final Property<String> POOLING_TYPE = new Property<String>("poolingType");
	public static final Property<String> PRICE_CURR_CODE = new Property<String>("priceCurrCode");
	public static final Property<String> PRICE_UOM_CODE = new Property<String>("priceUomCode");
	public static final Property<String> PRICED_QTY_UOM_CODE = new Property<String>("pricedQtyUomCode");
	public static final Property<String> PURCHASING_GROUP = new Property<String>("purchasingGroup");
	public static final Property<Integer> QUOTE_ID = new Property<Integer>("quoteId");
	public static final Property<Integer> REAL_PORT_NUM = new Property<Integer>("realPortNum");
	public static final Property<Integer> REAL_QUOTE_PERIOD_ID = new Property<Integer>("realQuotePeriodId");
	public static final Property<Integer> RECAP_ITEM_NUM = new Property<Integer>("recapItemNum");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<String> RIN_IND = new Property<String>("rinInd");
	public static final Property<String> RISK_MKT_CODE = new Property<String>("riskMktCode");
	public static final Property<String> SAP_ORDER_NUM = new Property<String>("sapOrderNum");
	public static final Property<String> SCH_QTY_UOM_CODE = new Property<String>("schQtyUomCode");
	public static final Property<Short> SCHED_STATUS = new Property<Short>("schedStatus");
	public static final Property<String> STRIP_ITEM_STATUS = new Property<String>("stripItemStatus");
	public static final Property<Short> SUMMARY_ITEM_NUM = new Property<Short>("summaryItemNum");
	public static final Property<String> TITLE_MKT_CODE = new Property<String>("titleMktCode");
	public static final Property<BigDecimal> TOTAL_COMMITTED_QTY = new Property<BigDecimal>("totalCommittedQty");
	public static final Property<Double> TOTAL_PRICED_QTY = new Property<Double>("totalPricedQty");
	public static final Property<Double> TOTAL_SCH_QTY = new Property<Double>("totalSchQty");
	public static final Property<String> TRADE_MODIFIED_IND = new Property<String>("tradeModifiedInd");
	public static final Property<Integer> TRADE_NUM = new Property<Integer>("tradeNum");
	public static final Property<String> TRADING_PRD = new Property<String>("tradingPrd");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<Double> UOM_CONV_RATE = new Property<Double>("uomConvRate");
	public static final Property<String> USE_MKT_FORMULA_FOR_PL = new Property<String>("useMktFormulaForPl");

	public void setAccumPeriodicity(String accumPeriodicity)
	{
		writeProperty("accumPeriodicity", accumPeriodicity);
	}

	public String getAccumPeriodicity()
	{
		return (String) readProperty("accumPeriodicity");
	}

	public void setActiveStatusInd(String activeStatusInd)
	{
		writeProperty("activeStatusInd", activeStatusInd);
	}

	public String getActiveStatusInd()
	{
		return (String) readProperty("activeStatusInd");
	}

	public void setAddlCostSum(Double addlCostSum)
	{
		writeProperty("addlCostSum", addlCostSum);
	}

	public Double getAddlCostSum()
	{
		return (Double) readProperty("addlCostSum");
	}

	public void setAgreementNum(Integer agreementNum)
	{
		writeProperty("agreementNum", agreementNum);
	}

	public Integer getAgreementNum()
	{
		return (Integer) readProperty("agreementNum");
	}

	public void setAmendCreationDate(Date amendCreationDate)
	{
		writeProperty("amendCreationDate", amendCreationDate);
	}

	public Date getAmendCreationDate()
	{
		return (Date) readProperty("amendCreationDate");
	}

	public void setAmendEffectEndDate(Date amendEffectEndDate)
	{
		writeProperty("amendEffectEndDate", amendEffectEndDate);
	}

	public Date getAmendEffectEndDate()
	{
		return (Date) readProperty("amendEffectEndDate");
	}

	public void setAmendEffectStartDate(Date amendEffectStartDate)
	{
		writeProperty("amendEffectStartDate", amendEffectStartDate);
	}

	public Date getAmendEffectStartDate()
	{
		return (Date) readProperty("amendEffectStartDate");
	}

	public void setAmendNum(Short amendNum)
	{
		writeProperty("amendNum", amendNum);
	}

	public Short getAmendNum()
	{
		return (Short) readProperty("amendNum");
	}

	public void setAsofTransId(Integer asofTransId)
	{
		writeProperty("asofTransId", asofTransId);
	}

	public Integer getAsofTransId()
	{
		return (Integer) readProperty("asofTransId");
	}

	public void setAvgPrice(Double avgPrice)
	{
		writeProperty("avgPrice", avgPrice);
	}

	public Double getAvgPrice()
	{
		return (Double) readProperty("avgPrice");
	}

	public void setB2bTradeItem(String b2bTradeItem)
	{
		writeProperty("b2bTradeItem", b2bTradeItem);
	}

	public String getB2bTradeItem()
	{
		return (String) readProperty("b2bTradeItem");
	}

	public void setBillingType(String billingType)
	{
		writeProperty("billingType", billingType);
	}

	public String getBillingType()
	{
		return (String) readProperty("billingType");
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

	public void setCalendarCode(String calendarCode)
	{
		writeProperty("calendarCode", calendarCode);
	}

	public String getCalendarCode()
	{
		return (String) readProperty("calendarCode");
	}

	public void setClrServiceNum(Integer clrServiceNum)
	{
		writeProperty("clrServiceNum", clrServiceNum);
	}

	public Integer getClrServiceNum()
	{
		return (Integer) readProperty("clrServiceNum");
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

	public void setCommittedQtyUomCode(String committedQtyUomCode)
	{
		writeProperty("committedQtyUomCode", committedQtyUomCode);
	}

	public String getCommittedQtyUomCode()
	{
		return (String) readProperty("committedQtyUomCode");
	}

	public void setContrMtmPl(Double contrMtmPl)
	{
		writeProperty("contrMtmPl", contrMtmPl);
	}

	public Double getContrMtmPl()
	{
		return (Double) readProperty("contrMtmPl");
	}

	public void setContrQty(Double contrQty)
	{
		writeProperty("contrQty", contrQty);
	}

	public Double getContrQty()
	{
		return (Double) readProperty("contrQty");
	}

	public void setContrQtyPeriodicity(String contrQtyPeriodicity)
	{
		writeProperty("contrQtyPeriodicity", contrQtyPeriodicity);
	}

	public String getContrQtyPeriodicity()
	{
		return (String) readProperty("contrQtyPeriodicity");
	}

	public void setContrQtyUomCode(String contrQtyUomCode)
	{
		writeProperty("contrQtyUomCode", contrQtyUomCode);
	}

	public String getContrQtyUomCode()
	{
		return (String) readProperty("contrQtyUomCode");
	}

	public void setDischPortLocCode(String dischPortLocCode)
	{
		writeProperty("dischPortLocCode", dischPortLocCode);
	}

	public String getDischPortLocCode()
	{
		return (String) readProperty("dischPortLocCode");
	}

	public void setEstimateInd(String estimateInd)
	{
		writeProperty("estimateInd", estimateInd);
	}

	public String getEstimateInd()
	{
		return (String) readProperty("estimateInd");
	}

	public void setExchBrkrNum(Integer exchBrkrNum)
	{
		writeProperty("exchBrkrNum", exchBrkrNum);
	}

	public Integer getExchBrkrNum()
	{
		return (Integer) readProperty("exchBrkrNum");
	}

	public void setExcpAddnsCode(String excpAddnsCode)
	{
		writeProperty("excpAddnsCode", excpAddnsCode);
	}

	public String getExcpAddnsCode()
	{
		return (String) readProperty("excpAddnsCode");
	}

	public void setFinanceBankNum(Integer financeBankNum)
	{
		writeProperty("financeBankNum", financeBankNum);
	}

	public Integer getFinanceBankNum()
	{
		return (Integer) readProperty("financeBankNum");
	}

	public void setFormulaDeclarDate(Date formulaDeclarDate)
	{
		writeProperty("formulaDeclarDate", formulaDeclarDate);
	}

	public Date getFormulaDeclarDate()
	{
		return (Date) readProperty("formulaDeclarDate");
	}

	public void setFormulaInd(String formulaInd)
	{
		writeProperty("formulaInd", formulaInd);
	}

	public String getFormulaInd()
	{
		return (String) readProperty("formulaInd");
	}

	public void setFutTraderInit(String futTraderInit)
	{
		writeProperty("futTraderInit", futTraderInit);
	}

	public String getFutTraderInit()
	{
		return (String) readProperty("futTraderInit");
	}

	public void setGtcCode(String gtcCode)
	{
		writeProperty("gtcCode", gtcCode);
	}

	public String getGtcCode()
	{
		return (String) readProperty("gtcCode");
	}

	public void setHedgeCurrCode(String hedgeCurrCode)
	{
		writeProperty("hedgeCurrCode", hedgeCurrCode);
	}

	public String getHedgeCurrCode()
	{
		return (String) readProperty("hedgeCurrCode");
	}

	public void setHedgeMultiDivInd(String hedgeMultiDivInd)
	{
		writeProperty("hedgeMultiDivInd", hedgeMultiDivInd);
	}

	public String getHedgeMultiDivInd()
	{
		return (String) readProperty("hedgeMultiDivInd");
	}

	public void setHedgePosInd(String hedgePosInd)
	{
		writeProperty("hedgePosInd", hedgePosInd);
	}

	public String getHedgePosInd()
	{
		return (String) readProperty("hedgePosInd");
	}

	public void setHedgeRate(Double hedgeRate)
	{
		writeProperty("hedgeRate", hedgeRate);
	}

	public Double getHedgeRate()
	{
		return (Double) readProperty("hedgeRate");
	}

	public void setIdmsAcctAlloc(String idmsAcctAlloc)
	{
		writeProperty("idmsAcctAlloc", idmsAcctAlloc);
	}

	public String getIdmsAcctAlloc()
	{
		return (String) readProperty("idmsAcctAlloc");
	}

	public void setIdmsBbRefNum(String idmsBbRefNum)
	{
		writeProperty("idmsBbRefNum", idmsBbRefNum);
	}

	public String getIdmsBbRefNum()
	{
		return (String) readProperty("idmsBbRefNum");
	}

	public void setIdmsContrNum(String idmsContrNum)
	{
		writeProperty("idmsContrNum", idmsContrNum);
	}

	public String getIdmsContrNum()
	{
		return (String) readProperty("idmsContrNum");
	}

	public void setIdmsProfitCenter(String idmsProfitCenter)
	{
		writeProperty("idmsProfitCenter", idmsProfitCenter);
	}

	public String getIdmsProfitCenter()
	{
		return (String) readProperty("idmsProfitCenter");
	}

	public void setIncludesExciseTaxInd(Boolean includesExciseTaxInd)
	{
		writeProperty("includesExciseTaxInd", includesExciseTaxInd);
	}

	public Boolean getIncludesExciseTaxInd()
	{
		return (Boolean) readProperty("includesExciseTaxInd");
	}

	public void setIncludesFuelTaxInd(Boolean includesFuelTaxInd)
	{
		writeProperty("includesFuelTaxInd", includesFuelTaxInd);
	}

	public Boolean getIncludesFuelTaxInd()
	{
		return (Boolean) readProperty("includesFuelTaxInd");
	}

	public void setInternalParentItemNum(Short internalParentItemNum)
	{
		writeProperty("internalParentItemNum", internalParentItemNum);
	}

	public Short getInternalParentItemNum()
	{
		return (Short) readProperty("internalParentItemNum");
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

	public void setIsClearedInd(String isClearedInd)
	{
		writeProperty("isClearedInd", isClearedInd);
	}

	public String getIsClearedInd()
	{
		return (String) readProperty("isClearedInd");
	}

	public void setIsLcAssigned(String isLcAssigned)
	{
		writeProperty("isLcAssigned", isLcAssigned);
	}

	public String getIsLcAssigned()
	{
		return (String) readProperty("isLcAssigned");
	}

	public void setIsRcAssigned(String isRcAssigned)
	{
		writeProperty("isRcAssigned", isRcAssigned);
	}

	public String getIsRcAssigned()
	{
		return (String) readProperty("isRcAssigned");
	}

	public void setItemConfirmInd(String itemConfirmInd)
	{
		writeProperty("itemConfirmInd", itemConfirmInd);
	}

	public String getItemConfirmInd()
	{
		return (String) readProperty("itemConfirmInd");
	}

	public void setItemNum(Short itemNum)
	{
		writeProperty("itemNum", itemNum);
	}

	public Short getItemNum()
	{
		return (Short) readProperty("itemNum");
	}

	public void setItemStatusCode(String itemStatusCode)
	{
		writeProperty("itemStatusCode", itemStatusCode);
	}

	public String getItemStatusCode()
	{
		return (String) readProperty("itemStatusCode");
	}

	public void setItemType(String itemType)
	{
		writeProperty("itemType", itemType);
	}

	public String getItemType()
	{
		return (String) readProperty("itemType");
	}

	public void setLoadPortLocCode(String loadPortLocCode)
	{
		writeProperty("loadPortLocCode", loadPortLocCode);
	}

	public String getLoadPortLocCode()
	{
		return (String) readProperty("loadPortLocCode");
	}

	public void setMarketValue(BigDecimal marketValue)
	{
		writeProperty("marketValue", marketValue);
	}

	public BigDecimal getMarketValue()
	{
		return (BigDecimal) readProperty("marketValue");
	}

	public void setMaxAccumNum(Short maxAccumNum)
	{
		writeProperty("maxAccumNum", maxAccumNum);
	}

	public Short getMaxAccumNum()
	{
		return (Short) readProperty("maxAccumNum");
	}

	public void setMtmPl(Double mtmPl)
	{
		writeProperty("mtmPl", mtmPl);
	}

	public Double getMtmPl()
	{
		return (Double) readProperty("mtmPl");
	}

	public void setMtmPlAsOfDate(Date mtmPlAsOfDate)
	{
		writeProperty("mtmPlAsOfDate", mtmPlAsOfDate);
	}

	public Date getMtmPlAsOfDate()
	{
		return (Date) readProperty("mtmPlAsOfDate");
	}

	public void setMtmPlCurrCode(String mtmPlCurrCode)
	{
		writeProperty("mtmPlCurrCode", mtmPlCurrCode);
	}

	public String getMtmPlCurrCode()
	{
		return (String) readProperty("mtmPlCurrCode");
	}

	public void setOpenQty(Double openQty)
	{
		writeProperty("openQty", openQty);
	}

	public Double getOpenQty()
	{
		return (Double) readProperty("openQty");
	}

	public void setOpenQtyUomCode(String openQtyUomCode)
	{
		writeProperty("openQtyUomCode", openQtyUomCode);
	}

	public String getOpenQtyUomCode()
	{
		return (String) readProperty("openQtyUomCode");
	}

	public void setOrderNum(Short orderNum)
	{
		writeProperty("orderNum", orderNum);
	}

	public Short getOrderNum()
	{
		return (Short) readProperty("orderNum");
	}

	public void setOriginCountryCode(String originCountryCode)
	{
		writeProperty("originCountryCode", originCountryCode);
	}

	public String getOriginCountryCode()
	{
		return (String) readProperty("originCountryCode");
	}

	public void setPSInd(String pSInd)
	{
		writeProperty("pSInd", pSInd);
	}

	public String getPSInd()
	{
		return (String) readProperty("pSInd");
	}

	public void setParentItemNum(Short parentItemNum)
	{
		writeProperty("parentItemNum", parentItemNum);
	}

	public Short getParentItemNum()
	{
		return (Short) readProperty("parentItemNum");
	}

	public void setPoolingPortInd(String poolingPortInd)
	{
		writeProperty("poolingPortInd", poolingPortInd);
	}

	public String getPoolingPortInd()
	{
		return (String) readProperty("poolingPortInd");
	}

	public void setPoolingPortNum(Integer poolingPortNum)
	{
		writeProperty("poolingPortNum", poolingPortNum);
	}

	public Integer getPoolingPortNum()
	{
		return (Integer) readProperty("poolingPortNum");
	}

	public void setPoolingType(String poolingType)
	{
		writeProperty("poolingType", poolingType);
	}

	public String getPoolingType()
	{
		return (String) readProperty("poolingType");
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

	public void setPricedQtyUomCode(String pricedQtyUomCode)
	{
		writeProperty("pricedQtyUomCode", pricedQtyUomCode);
	}

	public String getPricedQtyUomCode()
	{
		return (String) readProperty("pricedQtyUomCode");
	}

	public void setPurchasingGroup(String purchasingGroup)
	{
		writeProperty("purchasingGroup", purchasingGroup);
	}

	public String getPurchasingGroup()
	{
		return (String) readProperty("purchasingGroup");
	}

	public void setQuoteId(Integer quoteId)
	{
		writeProperty("quoteId", quoteId);
	}

	public Integer getQuoteId()
	{
		return (Integer) readProperty("quoteId");
	}

	public void setRealPortNum(Integer realPortNum)
	{
		writeProperty("realPortNum", realPortNum);
	}

	public Integer getRealPortNum()
	{
		return (Integer) readProperty("realPortNum");
	}

	public void setRealQuotePeriodId(Integer realQuotePeriodId)
	{
		writeProperty("realQuotePeriodId", realQuotePeriodId);
	}

	public Integer getRealQuotePeriodId()
	{
		return (Integer) readProperty("realQuotePeriodId");
	}

	public void setRecapItemNum(Integer recapItemNum)
	{
		writeProperty("recapItemNum", recapItemNum);
	}

	public Integer getRecapItemNum()
	{
		return (Integer) readProperty("recapItemNum");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setRinInd(String rinInd)
	{
		writeProperty("rinInd", rinInd);
	}

	public String getRinInd()
	{
		return (String) readProperty("rinInd");
	}

	public void setRiskMktCode(String riskMktCode)
	{
		writeProperty("riskMktCode", riskMktCode);
	}

	public String getRiskMktCode()
	{
		return (String) readProperty("riskMktCode");
	}

	public void setSapOrderNum(String sapOrderNum)
	{
		writeProperty("sapOrderNum", sapOrderNum);
	}

	public String getSapOrderNum()
	{
		return (String) readProperty("sapOrderNum");
	}

	public void setSchQtyUomCode(String schQtyUomCode)
	{
		writeProperty("schQtyUomCode", schQtyUomCode);
	}

	public String getSchQtyUomCode()
	{
		return (String) readProperty("schQtyUomCode");
	}

	public void setSchedStatus(Short schedStatus)
	{
		writeProperty("schedStatus", schedStatus);
	}

	public Short getSchedStatus()
	{
		return (Short) readProperty("schedStatus");
	}

	public void setStripItemStatus(String stripItemStatus)
	{
		writeProperty("stripItemStatus", stripItemStatus);
	}

	public String getStripItemStatus()
	{
		return (String) readProperty("stripItemStatus");
	}

	public void setSummaryItemNum(Short summaryItemNum)
	{
		writeProperty("summaryItemNum", summaryItemNum);
	}

	public Short getSummaryItemNum()
	{
		return (Short) readProperty("summaryItemNum");
	}

	public void setTitleMktCode(String titleMktCode)
	{
		writeProperty("titleMktCode", titleMktCode);
	}

	public String getTitleMktCode()
	{
		return (String) readProperty("titleMktCode");
	}

	public void setTotalCommittedQty(BigDecimal totalCommittedQty)
	{
		writeProperty("totalCommittedQty", totalCommittedQty);
	}

	public BigDecimal getTotalCommittedQty()
	{
		return (BigDecimal) readProperty("totalCommittedQty");
	}

	public void setTotalPricedQty(Double totalPricedQty)
	{
		writeProperty("totalPricedQty", totalPricedQty);
	}

	public Double getTotalPricedQty()
	{
		return (Double) readProperty("totalPricedQty");
	}

	public void setTotalSchQty(Double totalSchQty)
	{
		writeProperty("totalSchQty", totalSchQty);
	}

	public Double getTotalSchQty()
	{
		return (Double) readProperty("totalSchQty");
	}

	public void setTradeModifiedInd(String tradeModifiedInd)
	{
		writeProperty("tradeModifiedInd", tradeModifiedInd);
	}

	public String getTradeModifiedInd()
	{
		return (String) readProperty("tradeModifiedInd");
	}

	public void setTradeNum(Integer tradeNum)
	{
		writeProperty("tradeNum", tradeNum);
	}

	public Integer getTradeNum()
	{
		return (Integer) readProperty("tradeNum");
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

	public void setUomConvRate(Double uomConvRate)
	{
		writeProperty("uomConvRate", uomConvRate);
	}

	public Double getUomConvRate()
	{
		return (Double) readProperty("uomConvRate");
	}

	public void setUseMktFormulaForPl(String useMktFormulaForPl)
	{
		writeProperty("useMktFormulaForPl", useMktFormulaForPl);
	}

	public String getUseMktFormulaForPl()
	{
		return (String) readProperty("useMktFormulaForPl");
	}

}
