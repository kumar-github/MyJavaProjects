package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VVarFinancialPosition was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VVarFinancialPosition extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Double> ALLOC_QTY = new Property<Double>("allocQty");
	public static final Property<String> BOOK = new Property<String>("book");
	public static final Property<Integer> BOOKING_COMP_NUM = new Property<Integer>("bookingCompNum");
	public static final Property<String> CMDTY_CODE = new Property<String>("cmdtyCode");
	public static final Property<String> CMDTY_GROUP = new Property<String>("cmdtyGroup");
	public static final Property<String> CMDTY_SHORT_NAME = new Property<String>("cmdtyShortName");
	public static final Property<Integer> COMMKT_KEY = new Property<Integer>("commktKey");
	public static final Property<Date> CONTR_DATE = new Property<Date>("contrDate");
	public static final Property<String> CONTRACT_PSIND = new Property<String>("contractPSInd");
	public static final Property<Double> CONTRACT_QTY = new Property<Double>("contractQty");
	public static final Property<String> CONTRACT_QTY_UOM_CODE = new Property<String>("contractQtyUomCode");
	public static final Property<Integer> COUNTERPARTY = new Property<Integer>("counterparty");
	public static final Property<String> CREATOR_INIT = new Property<String>("creatorInit");
	public static final Property<Date> DEL_DATE_TO = new Property<Date>("delDateTo");
	public static final Property<Integer> DIST_NUM = new Property<Integer>("distNum");
	public static final Property<Double> DIST_QTY = new Property<Double>("distQty");
	public static final Property<String> DIST_TYPE = new Property<String>("distType");
	public static final Property<Date> FIRST_DEL_DATE = new Property<Date>("firstDelDate");
	public static final Property<String> FORMULA_IND = new Property<String>("formulaInd");
	public static final Property<String> FUT_CURR_CODE = new Property<String>("futCurrCode");
	public static final Property<String> FUT_PRICE_SOURCE_CODE = new Property<String>("futPriceSourceCode");
	public static final Property<String> FUT_PRICE_UOM_CODE = new Property<String>("futPriceUomCode");
	public static final Property<String> INHOUSE_IND = new Property<String>("inhouseInd");
	public static final Property<String> INV_TYPE = new Property<String>("invType");
	public static final Property<String> IS_EQUIV_IND = new Property<String>("isEquivInd");
	public static final Property<String> IS_HEDGE_IND = new Property<String>("isHedgeInd");
	public static final Property<Short> ITEM_NUM = new Property<Short>("itemNum");
	public static final Property<String> ITEM_TYPE = new Property<String>("itemType");
	public static final Property<Date> LAST_DEL_DATE = new Property<Date>("lastDelDate");
	public static final Property<Date> LAST_ISSUE_DATE = new Property<Date>("lastIssueDate");
	public static final Property<Date> LAST_TRADE_DATE = new Property<Date>("lastTradeDate");
	public static final Property<String> MKT_CODE = new Property<String>("mktCode");
	public static final Property<String> MKT_SHORT_NAME = new Property<String>("mktShortName");
	public static final Property<String> MKT_TYPE = new Property<String>("mktType");
	public static final Property<String> MTM_PRICE_SOURCE_CODE = new Property<String>("mtmPriceSourceCode");
	public static final Property<String> OPEN_CLOSE_IND = new Property<String>("openCloseInd");
	public static final Property<Date> OPT_EXP_DATE = new Property<Date>("optExpDate");
	public static final Property<Date> OPT_START_DATE = new Property<Date>("optStartDate");
	public static final Property<String> OPTION_TYPE = new Property<String>("optionType");
	public static final Property<Short> ORDER_NUM = new Property<Short>("orderNum");
	public static final Property<String> ORDER_TYPE_CODE = new Property<String>("orderTypeCode");
	public static final Property<String> PHY_CURR_CODE = new Property<String>("phyCurrCode");
	public static final Property<String> PHY_PRICE_SOURCE_CODE = new Property<String>("phyPriceSourceCode");
	public static final Property<String> PHY_PRICE_UOM_CODE = new Property<String>("phyPriceUomCode");
	public static final Property<Integer> POS_NUM = new Property<Integer>("posNum");
	public static final Property<String> POS_QTY_UOM_CODE = new Property<String>("posQtyUomCode");
	public static final Property<String> POS_TYPE = new Property<String>("posType");
	public static final Property<String> POS_TYPE_DESC = new Property<String>("posTypeDesc");
	public static final Property<String> PRICE_CURR_CODE = new Property<String>("priceCurrCode");
	public static final Property<Date> PRICE_RISK_DATE = new Property<Date>("priceRiskDate");
	public static final Property<String> PRICE_SOURCE_CODE = new Property<String>("priceSourceCode");
	public static final Property<String> PRICE_UOM_CODE = new Property<String>("priceUomCode");
	public static final Property<String> PRODUCT = new Property<String>("product");
	public static final Property<String> PROFIT_CENTER = new Property<String>("profitCenter");
	public static final Property<String> PUT_CALL_IND = new Property<String>("putCallInd");
	public static final Property<Integer> REAL_PORT_NUM = new Property<Integer>("realPortNum");
	public static final Property<String> SETTLEMENT_TYPE = new Property<String>("settlementType");
	public static final Property<Double> STRIKE_PRICE = new Property<Double>("strikePrice");
	public static final Property<String> STRIKE_PRICE_CURR_CODE = new Property<String>("strikePriceCurrCode");
	public static final Property<String> STRIKE_PRICE_UOM_CODE = new Property<String>("strikePriceUomCode");
	public static final Property<String> TID_PSIND = new Property<String>("tidPSInd");
	public static final Property<Double> TID_PRICE_CURR_CONV_RATE = new Property<Double>("tidPriceCurrConvRate");
	public static final Property<String> TID_PRICE_CURR_CONV_TO = new Property<String>("tidPriceCurrConvTo");
	public static final Property<String> TID_QTY_UOM_CODE = new Property<String>("tidQtyUomCode");
	public static final Property<String> TID_QTY_UOM_CODE_CONV_TO = new Property<String>("tidQtyUomCodeConvTo");
	public static final Property<Double> TID_QTY_UOM_CONV_RATE = new Property<Double>("tidQtyUomConvRate");
	public static final Property<Date> TRADE_CREATION_DATE = new Property<Date>("tradeCreationDate");
	public static final Property<Date> TRADE_MOD_DATE = new Property<Date>("tradeModDate");
	public static final Property<Integer> TRADE_NUM = new Property<Integer>("tradeNum");
	public static final Property<String> TRADER_INIT = new Property<String>("traderInit");
	public static final Property<Integer> TRADING_ENTITY = new Property<Integer>("tradingEntity");
	public static final Property<Integer> TRADING_ENTITY_NUM = new Property<Integer>("tradingEntityNum");
	public static final Property<String> TRADING_PRD = new Property<String>("tradingPrd");
	public static final Property<String> TRADING_PRD_DESC = new Property<String>("tradingPrdDesc");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setAllocQty(Double allocQty)
	{
		writeProperty("allocQty", allocQty);
	}

	public Double getAllocQty()
	{
		return (Double) readProperty("allocQty");
	}

	public void setBook(String book)
	{
		writeProperty("book", book);
	}

	public String getBook()
	{
		return (String) readProperty("book");
	}

	public void setBookingCompNum(Integer bookingCompNum)
	{
		writeProperty("bookingCompNum", bookingCompNum);
	}

	public Integer getBookingCompNum()
	{
		return (Integer) readProperty("bookingCompNum");
	}

	public void setCmdtyCode(String cmdtyCode)
	{
		writeProperty("cmdtyCode", cmdtyCode);
	}

	public String getCmdtyCode()
	{
		return (String) readProperty("cmdtyCode");
	}

	public void setCmdtyGroup(String cmdtyGroup)
	{
		writeProperty("cmdtyGroup", cmdtyGroup);
	}

	public String getCmdtyGroup()
	{
		return (String) readProperty("cmdtyGroup");
	}

	public void setCmdtyShortName(String cmdtyShortName)
	{
		writeProperty("cmdtyShortName", cmdtyShortName);
	}

	public String getCmdtyShortName()
	{
		return (String) readProperty("cmdtyShortName");
	}

	public void setCommktKey(Integer commktKey)
	{
		writeProperty("commktKey", commktKey);
	}

	public Integer getCommktKey()
	{
		return (Integer) readProperty("commktKey");
	}

	public void setContrDate(Date contrDate)
	{
		writeProperty("contrDate", contrDate);
	}

	public Date getContrDate()
	{
		return (Date) readProperty("contrDate");
	}

	public void setContractPSInd(String contractPSInd)
	{
		writeProperty("contractPSInd", contractPSInd);
	}

	public String getContractPSInd()
	{
		return (String) readProperty("contractPSInd");
	}

	public void setContractQty(Double contractQty)
	{
		writeProperty("contractQty", contractQty);
	}

	public Double getContractQty()
	{
		return (Double) readProperty("contractQty");
	}

	public void setContractQtyUomCode(String contractQtyUomCode)
	{
		writeProperty("contractQtyUomCode", contractQtyUomCode);
	}

	public String getContractQtyUomCode()
	{
		return (String) readProperty("contractQtyUomCode");
	}

	public void setCounterparty(Integer counterparty)
	{
		writeProperty("counterparty", counterparty);
	}

	public Integer getCounterparty()
	{
		return (Integer) readProperty("counterparty");
	}

	public void setCreatorInit(String creatorInit)
	{
		writeProperty("creatorInit", creatorInit);
	}

	public String getCreatorInit()
	{
		return (String) readProperty("creatorInit");
	}

	public void setDelDateTo(Date delDateTo)
	{
		writeProperty("delDateTo", delDateTo);
	}

	public Date getDelDateTo()
	{
		return (Date) readProperty("delDateTo");
	}

	public void setDistNum(Integer distNum)
	{
		writeProperty("distNum", distNum);
	}

	public Integer getDistNum()
	{
		return (Integer) readProperty("distNum");
	}

	public void setDistQty(Double distQty)
	{
		writeProperty("distQty", distQty);
	}

	public Double getDistQty()
	{
		return (Double) readProperty("distQty");
	}

	public void setDistType(String distType)
	{
		writeProperty("distType", distType);
	}

	public String getDistType()
	{
		return (String) readProperty("distType");
	}

	public void setFirstDelDate(Date firstDelDate)
	{
		writeProperty("firstDelDate", firstDelDate);
	}

	public Date getFirstDelDate()
	{
		return (Date) readProperty("firstDelDate");
	}

	public void setFormulaInd(String formulaInd)
	{
		writeProperty("formulaInd", formulaInd);
	}

	public String getFormulaInd()
	{
		return (String) readProperty("formulaInd");
	}

	public void setFutCurrCode(String futCurrCode)
	{
		writeProperty("futCurrCode", futCurrCode);
	}

	public String getFutCurrCode()
	{
		return (String) readProperty("futCurrCode");
	}

	public void setFutPriceSourceCode(String futPriceSourceCode)
	{
		writeProperty("futPriceSourceCode", futPriceSourceCode);
	}

	public String getFutPriceSourceCode()
	{
		return (String) readProperty("futPriceSourceCode");
	}

	public void setFutPriceUomCode(String futPriceUomCode)
	{
		writeProperty("futPriceUomCode", futPriceUomCode);
	}

	public String getFutPriceUomCode()
	{
		return (String) readProperty("futPriceUomCode");
	}

	public void setInhouseInd(String inhouseInd)
	{
		writeProperty("inhouseInd", inhouseInd);
	}

	public String getInhouseInd()
	{
		return (String) readProperty("inhouseInd");
	}

	public void setInvType(String invType)
	{
		writeProperty("invType", invType);
	}

	public String getInvType()
	{
		return (String) readProperty("invType");
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

	public void setItemNum(Short itemNum)
	{
		writeProperty("itemNum", itemNum);
	}

	public Short getItemNum()
	{
		return (Short) readProperty("itemNum");
	}

	public void setItemType(String itemType)
	{
		writeProperty("itemType", itemType);
	}

	public String getItemType()
	{
		return (String) readProperty("itemType");
	}

	public void setLastDelDate(Date lastDelDate)
	{
		writeProperty("lastDelDate", lastDelDate);
	}

	public Date getLastDelDate()
	{
		return (Date) readProperty("lastDelDate");
	}

	public void setLastIssueDate(Date lastIssueDate)
	{
		writeProperty("lastIssueDate", lastIssueDate);
	}

	public Date getLastIssueDate()
	{
		return (Date) readProperty("lastIssueDate");
	}

	public void setLastTradeDate(Date lastTradeDate)
	{
		writeProperty("lastTradeDate", lastTradeDate);
	}

	public Date getLastTradeDate()
	{
		return (Date) readProperty("lastTradeDate");
	}

	public void setMktCode(String mktCode)
	{
		writeProperty("mktCode", mktCode);
	}

	public String getMktCode()
	{
		return (String) readProperty("mktCode");
	}

	public void setMktShortName(String mktShortName)
	{
		writeProperty("mktShortName", mktShortName);
	}

	public String getMktShortName()
	{
		return (String) readProperty("mktShortName");
	}

	public void setMktType(String mktType)
	{
		writeProperty("mktType", mktType);
	}

	public String getMktType()
	{
		return (String) readProperty("mktType");
	}

	public void setMtmPriceSourceCode(String mtmPriceSourceCode)
	{
		writeProperty("mtmPriceSourceCode", mtmPriceSourceCode);
	}

	public String getMtmPriceSourceCode()
	{
		return (String) readProperty("mtmPriceSourceCode");
	}

	public void setOpenCloseInd(String openCloseInd)
	{
		writeProperty("openCloseInd", openCloseInd);
	}

	public String getOpenCloseInd()
	{
		return (String) readProperty("openCloseInd");
	}

	public void setOptExpDate(Date optExpDate)
	{
		writeProperty("optExpDate", optExpDate);
	}

	public Date getOptExpDate()
	{
		return (Date) readProperty("optExpDate");
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

	public void setPhyCurrCode(String phyCurrCode)
	{
		writeProperty("phyCurrCode", phyCurrCode);
	}

	public String getPhyCurrCode()
	{
		return (String) readProperty("phyCurrCode");
	}

	public void setPhyPriceSourceCode(String phyPriceSourceCode)
	{
		writeProperty("phyPriceSourceCode", phyPriceSourceCode);
	}

	public String getPhyPriceSourceCode()
	{
		return (String) readProperty("phyPriceSourceCode");
	}

	public void setPhyPriceUomCode(String phyPriceUomCode)
	{
		writeProperty("phyPriceUomCode", phyPriceUomCode);
	}

	public String getPhyPriceUomCode()
	{
		return (String) readProperty("phyPriceUomCode");
	}

	public void setPosNum(Integer posNum)
	{
		writeProperty("posNum", posNum);
	}

	public Integer getPosNum()
	{
		return (Integer) readProperty("posNum");
	}

	public void setPosQtyUomCode(String posQtyUomCode)
	{
		writeProperty("posQtyUomCode", posQtyUomCode);
	}

	public String getPosQtyUomCode()
	{
		return (String) readProperty("posQtyUomCode");
	}

	public void setPosType(String posType)
	{
		writeProperty("posType", posType);
	}

	public String getPosType()
	{
		return (String) readProperty("posType");
	}

	public void setPosTypeDesc(String posTypeDesc)
	{
		writeProperty("posTypeDesc", posTypeDesc);
	}

	public String getPosTypeDesc()
	{
		return (String) readProperty("posTypeDesc");
	}

	public void setPriceCurrCode(String priceCurrCode)
	{
		writeProperty("priceCurrCode", priceCurrCode);
	}

	public String getPriceCurrCode()
	{
		return (String) readProperty("priceCurrCode");
	}

	public void setPriceRiskDate(Date priceRiskDate)
	{
		writeProperty("priceRiskDate", priceRiskDate);
	}

	public Date getPriceRiskDate()
	{
		return (Date) readProperty("priceRiskDate");
	}

	public void setPriceSourceCode(String priceSourceCode)
	{
		writeProperty("priceSourceCode", priceSourceCode);
	}

	public String getPriceSourceCode()
	{
		return (String) readProperty("priceSourceCode");
	}

	public void setPriceUomCode(String priceUomCode)
	{
		writeProperty("priceUomCode", priceUomCode);
	}

	public String getPriceUomCode()
	{
		return (String) readProperty("priceUomCode");
	}

	public void setProduct(String product)
	{
		writeProperty("product", product);
	}

	public String getProduct()
	{
		return (String) readProperty("product");
	}

	public void setProfitCenter(String profitCenter)
	{
		writeProperty("profitCenter", profitCenter);
	}

	public String getProfitCenter()
	{
		return (String) readProperty("profitCenter");
	}

	public void setPutCallInd(String putCallInd)
	{
		writeProperty("putCallInd", putCallInd);
	}

	public String getPutCallInd()
	{
		return (String) readProperty("putCallInd");
	}

	public void setRealPortNum(Integer realPortNum)
	{
		writeProperty("realPortNum", realPortNum);
	}

	public Integer getRealPortNum()
	{
		return (Integer) readProperty("realPortNum");
	}

	public void setSettlementType(String settlementType)
	{
		writeProperty("settlementType", settlementType);
	}

	public String getSettlementType()
	{
		return (String) readProperty("settlementType");
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

	public void setTidPSInd(String tidPSInd)
	{
		writeProperty("tidPSInd", tidPSInd);
	}

	public String getTidPSInd()
	{
		return (String) readProperty("tidPSInd");
	}

	public void setTidPriceCurrConvRate(Double tidPriceCurrConvRate)
	{
		writeProperty("tidPriceCurrConvRate", tidPriceCurrConvRate);
	}

	public Double getTidPriceCurrConvRate()
	{
		return (Double) readProperty("tidPriceCurrConvRate");
	}

	public void setTidPriceCurrConvTo(String tidPriceCurrConvTo)
	{
		writeProperty("tidPriceCurrConvTo", tidPriceCurrConvTo);
	}

	public String getTidPriceCurrConvTo()
	{
		return (String) readProperty("tidPriceCurrConvTo");
	}

	public void setTidQtyUomCode(String tidQtyUomCode)
	{
		writeProperty("tidQtyUomCode", tidQtyUomCode);
	}

	public String getTidQtyUomCode()
	{
		return (String) readProperty("tidQtyUomCode");
	}

	public void setTidQtyUomCodeConvTo(String tidQtyUomCodeConvTo)
	{
		writeProperty("tidQtyUomCodeConvTo", tidQtyUomCodeConvTo);
	}

	public String getTidQtyUomCodeConvTo()
	{
		return (String) readProperty("tidQtyUomCodeConvTo");
	}

	public void setTidQtyUomConvRate(Double tidQtyUomConvRate)
	{
		writeProperty("tidQtyUomConvRate", tidQtyUomConvRate);
	}

	public Double getTidQtyUomConvRate()
	{
		return (Double) readProperty("tidQtyUomConvRate");
	}

	public void setTradeCreationDate(Date tradeCreationDate)
	{
		writeProperty("tradeCreationDate", tradeCreationDate);
	}

	public Date getTradeCreationDate()
	{
		return (Date) readProperty("tradeCreationDate");
	}

	public void setTradeModDate(Date tradeModDate)
	{
		writeProperty("tradeModDate", tradeModDate);
	}

	public Date getTradeModDate()
	{
		return (Date) readProperty("tradeModDate");
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

	public void setTradingEntity(Integer tradingEntity)
	{
		writeProperty("tradingEntity", tradingEntity);
	}

	public Integer getTradingEntity()
	{
		return (Integer) readProperty("tradingEntity");
	}

	public void setTradingEntityNum(Integer tradingEntityNum)
	{
		writeProperty("tradingEntityNum", tradingEntityNum);
	}

	public Integer getTradingEntityNum()
	{
		return (Integer) readProperty("tradingEntityNum");
	}

	public void setTradingPrd(String tradingPrd)
	{
		writeProperty("tradingPrd", tradingPrd);
	}

	public String getTradingPrd()
	{
		return (String) readProperty("tradingPrd");
	}

	public void setTradingPrdDesc(String tradingPrdDesc)
	{
		writeProperty("tradingPrdDesc", tradingPrdDesc);
	}

	public String getTradingPrdDesc()
	{
		return (String) readProperty("tradingPrdDesc");
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