package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VCubeTsTradeItem was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VCubeTsTradeItem extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Date> ACCUM_END_DATE = new Property<Date>("accumEndDate");
	public static final Property<Date> ACCUM_START_DATE = new Property<Date>("accumStartDate");
	public static final Property<Double> AVG_PRICE = new Property<Double>("avgPrice");
	public static final Property<String> BOOK_ACCT_SHORT_NAME = new Property<String>("bookAcctShortName");
	public static final Property<Integer> BOOKING_COMP_NUM = new Property<Integer>("bookingCompNum");
	public static final Property<String> BRKR_ACCT_SHORT_NAME = new Property<String>("brkrAcctShortName");
	public static final Property<Double> BRKR_COMM_AMT = new Property<Double>("brkrCommAmt");
	public static final Property<String> BRKR_COMM_CURR_CODE = new Property<String>("brkrCommCurrCode");
	public static final Property<String> BRKR_COMM_UOM_CODE = new Property<String>("brkrCommUomCode");
	public static final Property<Integer> BRKR_NUM = new Property<Integer>("brkrNum");
	public static final Property<String> BRKR_REF_NUM = new Property<String>("brkrRefNum");
	public static final Property<String> CMDTY_CODE = new Property<String>("cmdtyCode");
	public static final Property<String> CMDTY_GROUP = new Property<String>("cmdtyGroup");
	public static final Property<String> CMDTY_SHORT_NAME = new Property<String>("cmdtyShortName");
	public static final Property<Integer> CMNT_NUM = new Property<Integer>("cmntNum");
	public static final Property<String> CMNT_TEXT = new Property<String>("cmntText");
	public static final Property<Integer> COMMKT_KEY = new Property<Integer>("commktKey");
	public static final Property<String> CONTR_DISCH_PORT = new Property<String>("contrDischPort");
	public static final Property<String> CONTR_LOAD_PORT = new Property<String>("contrLoadPort");
	public static final Property<Double> CONTR_QTY = new Property<Double>("contrQty");
	public static final Property<String> CONTR_QTY_PERIODICITY = new Property<String>("contrQtyPeriodicity");
	public static final Property<String> CONTR_QTY_UOM_CODE = new Property<String>("contrQtyUomCode");
	public static final Property<Integer> EXCH_BRKR_NUM = new Property<Integer>("exchBrkrNum");
	public static final Property<String> EXCHBRKR_ACCT_SHORT_NAME = new Property<String>("exchbrkrAcctShortName");
	public static final Property<Integer> FINANCE_BANK_NUM = new Property<Integer>("financeBankNum");
	public static final Property<String> FORMULA_IND = new Property<String>("formulaInd");
	public static final Property<String> GTC_CODE = new Property<String>("gtcCode");
	public static final Property<Short> ITEM_NUM = new Property<Short>("itemNum");
	public static final Property<String> ITEM_TYPE = new Property<String>("itemType");
	public static final Property<String> MKT_SHORT_NAME = new Property<String>("mktShortName");
	public static final Property<String> MTM_PRICE_SOURCE_CODE = new Property<String>("mtmPriceSourceCode");
	public static final Property<Double> OPEN_QTY = new Property<Double>("openQty");
	public static final Property<Short> ORDER_NUM = new Property<Short>("orderNum");
	public static final Property<String> ORDER_TYPE_CODE = new Property<String>("orderTypeCode");
	public static final Property<String> P_SIND = new Property<String>("pSInd");
	public static final Property<String> PRICE_CURR_CODE = new Property<String>("priceCurrCode");
	public static final Property<String> PRICE_UOM_CODE = new Property<String>("priceUomCode");
	public static final Property<String> PRODUCT = new Property<String>("product");
	public static final Property<Integer> REAL_PORT_NUM = new Property<Integer>("realPortNum");
	public static final Property<String> RISK_MKT_CODE = new Property<String>("riskMktCode");
	public static final Property<Short> SCHED_STATUS = new Property<Short>("schedStatus");
	public static final Property<String> SHORT_CMNT = new Property<String>("shortCmnt");
	public static final Property<String> TINY_CMNT = new Property<String>("tinyCmnt");
	public static final Property<String> TITLE_MKT_CODE = new Property<String>("titleMktCode");
	public static final Property<Double> TOTAL_SCH_QTY = new Property<Double>("totalSchQty");
	public static final Property<String> TRADE_KEY = new Property<String>("tradeKey");
	public static final Property<Integer> TRADE_NUM = new Property<Integer>("tradeNum");
	public static final Property<String> TRADING_PRD = new Property<String>("tradingPrd");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setAccumEndDate(Date accumEndDate)
	{
		writeProperty("accumEndDate", accumEndDate);
	}

	public Date getAccumEndDate()
	{
		return (Date) readProperty("accumEndDate");
	}

	public void setAccumStartDate(Date accumStartDate)
	{
		writeProperty("accumStartDate", accumStartDate);
	}

	public Date getAccumStartDate()
	{
		return (Date) readProperty("accumStartDate");
	}

	public void setAvgPrice(Double avgPrice)
	{
		writeProperty("avgPrice", avgPrice);
	}

	public Double getAvgPrice()
	{
		return (Double) readProperty("avgPrice");
	}

	public void setBookAcctShortName(String bookAcctShortName)
	{
		writeProperty("bookAcctShortName", bookAcctShortName);
	}

	public String getBookAcctShortName()
	{
		return (String) readProperty("bookAcctShortName");
	}

	public void setBookingCompNum(Integer bookingCompNum)
	{
		writeProperty("bookingCompNum", bookingCompNum);
	}

	public Integer getBookingCompNum()
	{
		return (Integer) readProperty("bookingCompNum");
	}

	public void setBrkrAcctShortName(String brkrAcctShortName)
	{
		writeProperty("brkrAcctShortName", brkrAcctShortName);
	}

	public String getBrkrAcctShortName()
	{
		return (String) readProperty("brkrAcctShortName");
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

	public void setCmntNum(Integer cmntNum)
	{
		writeProperty("cmntNum", cmntNum);
	}

	public Integer getCmntNum()
	{
		return (Integer) readProperty("cmntNum");
	}

	public void setCmntText(String cmntText)
	{
		writeProperty("cmntText", cmntText);
	}

	public String getCmntText()
	{
		return (String) readProperty("cmntText");
	}

	public void setCommktKey(Integer commktKey)
	{
		writeProperty("commktKey", commktKey);
	}

	public Integer getCommktKey()
	{
		return (Integer) readProperty("commktKey");
	}

	public void setContrDischPort(String contrDischPort)
	{
		writeProperty("contrDischPort", contrDischPort);
	}

	public String getContrDischPort()
	{
		return (String) readProperty("contrDischPort");
	}

	public void setContrLoadPort(String contrLoadPort)
	{
		writeProperty("contrLoadPort", contrLoadPort);
	}

	public String getContrLoadPort()
	{
		return (String) readProperty("contrLoadPort");
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

	public void setExchBrkrNum(Integer exchBrkrNum)
	{
		writeProperty("exchBrkrNum", exchBrkrNum);
	}

	public Integer getExchBrkrNum()
	{
		return (Integer) readProperty("exchBrkrNum");
	}

	public void setExchbrkrAcctShortName(String exchbrkrAcctShortName)
	{
		writeProperty("exchbrkrAcctShortName", exchbrkrAcctShortName);
	}

	public String getExchbrkrAcctShortName()
	{
		return (String) readProperty("exchbrkrAcctShortName");
	}

	public void setFinanceBankNum(Integer financeBankNum)
	{
		writeProperty("financeBankNum", financeBankNum);
	}

	public Integer getFinanceBankNum()
	{
		return (Integer) readProperty("financeBankNum");
	}

	public void setFormulaInd(String formulaInd)
	{
		writeProperty("formulaInd", formulaInd);
	}

	public String getFormulaInd()
	{
		return (String) readProperty("formulaInd");
	}

	public void setGtcCode(String gtcCode)
	{
		writeProperty("gtcCode", gtcCode);
	}

	public String getGtcCode()
	{
		return (String) readProperty("gtcCode");
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

	public void setMktShortName(String mktShortName)
	{
		writeProperty("mktShortName", mktShortName);
	}

	public String getMktShortName()
	{
		return (String) readProperty("mktShortName");
	}

	public void setMtmPriceSourceCode(String mtmPriceSourceCode)
	{
		writeProperty("mtmPriceSourceCode", mtmPriceSourceCode);
	}

	public String getMtmPriceSourceCode()
	{
		return (String) readProperty("mtmPriceSourceCode");
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

	public void setProduct(String product)
	{
		writeProperty("product", product);
	}

	public String getProduct()
	{
		return (String) readProperty("product");
	}

	public void setRealPortNum(Integer realPortNum)
	{
		writeProperty("realPortNum", realPortNum);
	}

	public Integer getRealPortNum()
	{
		return (Integer) readProperty("realPortNum");
	}

	public void setRiskMktCode(String riskMktCode)
	{
		writeProperty("riskMktCode", riskMktCode);
	}

	public String getRiskMktCode()
	{
		return (String) readProperty("riskMktCode");
	}

	public void setSchedStatus(Short schedStatus)
	{
		writeProperty("schedStatus", schedStatus);
	}

	public Short getSchedStatus()
	{
		return (Short) readProperty("schedStatus");
	}

	public void setShortCmnt(String shortCmnt)
	{
		writeProperty("shortCmnt", shortCmnt);
	}

	public String getShortCmnt()
	{
		return (String) readProperty("shortCmnt");
	}

	public void setTinyCmnt(String tinyCmnt)
	{
		writeProperty("tinyCmnt", tinyCmnt);
	}

	public String getTinyCmnt()
	{
		return (String) readProperty("tinyCmnt");
	}

	public void setTitleMktCode(String titleMktCode)
	{
		writeProperty("titleMktCode", titleMktCode);
	}

	public String getTitleMktCode()
	{
		return (String) readProperty("titleMktCode");
	}

	public void setTotalSchQty(Double totalSchQty)
	{
		writeProperty("totalSchQty", totalSchQty);
	}

	public Double getTotalSchQty()
	{
		return (Double) readProperty("totalSchQty");
	}

	public void setTradeKey(String tradeKey)
	{
		writeProperty("tradeKey", tradeKey);
	}

	public String getTradeKey()
	{
		return (String) readProperty("tradeKey");
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

}
