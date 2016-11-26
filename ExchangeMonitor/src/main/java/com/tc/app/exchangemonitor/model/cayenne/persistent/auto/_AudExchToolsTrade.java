package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudExchToolsTrade was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudExchToolsTrade extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> ACCEPTED_ACTION = new Property<String>("acceptedAction");
	public static final Property<String> ACCEPTED_BROKER = new Property<String>("acceptedBroker");
	public static final Property<String> ACCEPTED_COMPANY = new Property<String>("acceptedCompany");
	public static final Property<String> ACCEPTED_TRADER = new Property<String>("acceptedTrader");
	public static final Property<String> ACCT_CONTACT = new Property<String>("acctContact");
	public static final Property<String> AUTO_EXERC_IND = new Property<String>("autoExercInd");
	public static final Property<Date> BEGIN_DATE = new Property<Date>("beginDate");
	public static final Property<String> BUYER_ACCOUNT = new Property<String>("buyerAccount");
	public static final Property<String> BUYER_CLRNG_BROKER = new Property<String>("buyerClrngBroker");
	public static final Property<Double> BUYER_COMM_COST = new Property<Double>("buyerCommCost");
	public static final Property<String> BUYER_COMM_CURR = new Property<String>("buyerCommCurr");
	public static final Property<String> CALL_PUT = new Property<String>("callPut");
	public static final Property<String> COMMODITY = new Property<String>("commodity");
	public static final Property<Date> CREATION_DATE = new Property<Date>("creationDate");
	public static final Property<Date> DEL_DATE_FROM = new Property<Date>("delDateFrom");
	public static final Property<Date> DEL_DATE_TO = new Property<Date>("delDateTo");
	public static final Property<Date> END_DATE = new Property<Date>("endDate");
	public static final Property<Date> EVENT_DEEMED_DATE = new Property<Date>("eventDeemedDate");
	public static final Property<String> EXCH_TOOLS_TRADE_NUM = new Property<String>("exchToolsTradeNum");
	public static final Property<Integer> EXTERNAL_COMMENT_OID = new Property<Integer>("externalCommentOid");
	public static final Property<Integer> EXTERNAL_TRADE_OID = new Property<Integer>("externalTradeOid");
	public static final Property<String> FLOAT_MARKET_QUOTE1 = new Property<String>("floatMarketQuote1");
	public static final Property<String> FLOAT_MARKET_QUOTE2 = new Property<String>("floatMarketQuote2");
	public static final Property<BigDecimal> FLOAT_QTY1 = new Property<BigDecimal>("floatQty1");
	public static final Property<BigDecimal> FLOAT_QTY2 = new Property<BigDecimal>("floatQty2");
	public static final Property<String> FORMULA_NAME = new Property<String>("formulaName");
	public static final Property<String> GTC = new Property<String>("gtc");
	public static final Property<String> INPUT_ACTION = new Property<String>("inputAction");
	public static final Property<String> INPUT_BROKER = new Property<String>("inputBroker");
	public static final Property<String> INPUT_COMPANY = new Property<String>("inputCompany");
	public static final Property<String> INPUT_TRADER = new Property<String>("inputTrader");
	public static final Property<String> MOT = new Property<String>("mot");
	public static final Property<Date> PREMIUM_DATE = new Property<Date>("premiumDate");
	public static final Property<Double> PRICE = new Property<Double>("price");
	public static final Property<String> PRICE_CURRENCY = new Property<String>("priceCurrency");
	public static final Property<String> PRICE_TYPE = new Property<String>("priceType");
	public static final Property<String> PRICE_UOM = new Property<String>("priceUom");
	public static final Property<Integer> PRODUCT_ID = new Property<Integer>("productId");
	public static final Property<String> QTY_UOM = new Property<String>("qtyUom");
	public static final Property<Double> QUANTITY = new Property<Double>("quantity");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<String> RISK_MARKET = new Property<String>("riskMarket");
	public static final Property<String> SELLER_ACCOUNT = new Property<String>("sellerAccount");
	public static final Property<String> SELLER_CLRNG_BROKER = new Property<String>("sellerClrngBroker");
	public static final Property<Double> SELLER_COMM_COST = new Property<Double>("sellerCommCost");
	public static final Property<String> SELLER_COMM_CURR = new Property<String>("sellerCommCurr");
	public static final Property<Double> STRIKE_PRICE = new Property<Double>("strikePrice");
	public static final Property<Integer> TEMPLATE_TRADE_NUM = new Property<Integer>("templateTradeNum");
	public static final Property<String> TITLE_MARKET = new Property<String>("titleMarket");
	public static final Property<String> TITLE_TRANSFER = new Property<String>("titleTransfer");
	public static final Property<String> TRADE_TYPE = new Property<String>("tradeType");
	public static final Property<String> TRADING_PERIOD = new Property<String>("tradingPeriod");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setAcceptedAction(String acceptedAction)
	{
		writeProperty("acceptedAction", acceptedAction);
	}

	public String getAcceptedAction()
	{
		return (String) readProperty("acceptedAction");
	}

	public void setAcceptedBroker(String acceptedBroker)
	{
		writeProperty("acceptedBroker", acceptedBroker);
	}

	public String getAcceptedBroker()
	{
		return (String) readProperty("acceptedBroker");
	}

	public void setAcceptedCompany(String acceptedCompany)
	{
		writeProperty("acceptedCompany", acceptedCompany);
	}

	public String getAcceptedCompany()
	{
		return (String) readProperty("acceptedCompany");
	}

	public void setAcceptedTrader(String acceptedTrader)
	{
		writeProperty("acceptedTrader", acceptedTrader);
	}

	public String getAcceptedTrader()
	{
		return (String) readProperty("acceptedTrader");
	}

	public void setAcctContact(String acctContact)
	{
		writeProperty("acctContact", acctContact);
	}

	public String getAcctContact()
	{
		return (String) readProperty("acctContact");
	}

	public void setAutoExercInd(String autoExercInd)
	{
		writeProperty("autoExercInd", autoExercInd);
	}

	public String getAutoExercInd()
	{
		return (String) readProperty("autoExercInd");
	}

	public void setBeginDate(Date beginDate)
	{
		writeProperty("beginDate", beginDate);
	}

	public Date getBeginDate()
	{
		return (Date) readProperty("beginDate");
	}

	public void setBuyerAccount(String buyerAccount)
	{
		writeProperty("buyerAccount", buyerAccount);
	}

	public String getBuyerAccount()
	{
		return (String) readProperty("buyerAccount");
	}

	public void setBuyerClrngBroker(String buyerClrngBroker)
	{
		writeProperty("buyerClrngBroker", buyerClrngBroker);
	}

	public String getBuyerClrngBroker()
	{
		return (String) readProperty("buyerClrngBroker");
	}

	public void setBuyerCommCost(Double buyerCommCost)
	{
		writeProperty("buyerCommCost", buyerCommCost);
	}

	public Double getBuyerCommCost()
	{
		return (Double) readProperty("buyerCommCost");
	}

	public void setBuyerCommCurr(String buyerCommCurr)
	{
		writeProperty("buyerCommCurr", buyerCommCurr);
	}

	public String getBuyerCommCurr()
	{
		return (String) readProperty("buyerCommCurr");
	}

	public void setCallPut(String callPut)
	{
		writeProperty("callPut", callPut);
	}

	public String getCallPut()
	{
		return (String) readProperty("callPut");
	}

	public void setCommodity(String commodity)
	{
		writeProperty("commodity", commodity);
	}

	public String getCommodity()
	{
		return (String) readProperty("commodity");
	}

	public void setCreationDate(Date creationDate)
	{
		writeProperty("creationDate", creationDate);
	}

	public Date getCreationDate()
	{
		return (Date) readProperty("creationDate");
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

	public void setEndDate(Date endDate)
	{
		writeProperty("endDate", endDate);
	}

	public Date getEndDate()
	{
		return (Date) readProperty("endDate");
	}

	public void setEventDeemedDate(Date eventDeemedDate)
	{
		writeProperty("eventDeemedDate", eventDeemedDate);
	}

	public Date getEventDeemedDate()
	{
		return (Date) readProperty("eventDeemedDate");
	}

	public void setExchToolsTradeNum(String exchToolsTradeNum)
	{
		writeProperty("exchToolsTradeNum", exchToolsTradeNum);
	}

	public String getExchToolsTradeNum()
	{
		return (String) readProperty("exchToolsTradeNum");
	}

	public void setExternalCommentOid(Integer externalCommentOid)
	{
		writeProperty("externalCommentOid", externalCommentOid);
	}

	public Integer getExternalCommentOid()
	{
		return (Integer) readProperty("externalCommentOid");
	}

	public void setExternalTradeOid(Integer externalTradeOid)
	{
		writeProperty("externalTradeOid", externalTradeOid);
	}

	public Integer getExternalTradeOid()
	{
		return (Integer) readProperty("externalTradeOid");
	}

	public void setFloatMarketQuote1(String floatMarketQuote1)
	{
		writeProperty("floatMarketQuote1", floatMarketQuote1);
	}

	public String getFloatMarketQuote1()
	{
		return (String) readProperty("floatMarketQuote1");
	}

	public void setFloatMarketQuote2(String floatMarketQuote2)
	{
		writeProperty("floatMarketQuote2", floatMarketQuote2);
	}

	public String getFloatMarketQuote2()
	{
		return (String) readProperty("floatMarketQuote2");
	}

	public void setFloatQty1(BigDecimal floatQty1)
	{
		writeProperty("floatQty1", floatQty1);
	}

	public BigDecimal getFloatQty1()
	{
		return (BigDecimal) readProperty("floatQty1");
	}

	public void setFloatQty2(BigDecimal floatQty2)
	{
		writeProperty("floatQty2", floatQty2);
	}

	public BigDecimal getFloatQty2()
	{
		return (BigDecimal) readProperty("floatQty2");
	}

	public void setFormulaName(String formulaName)
	{
		writeProperty("formulaName", formulaName);
	}

	public String getFormulaName()
	{
		return (String) readProperty("formulaName");
	}

	public void setGtc(String gtc)
	{
		writeProperty("gtc", gtc);
	}

	public String getGtc()
	{
		return (String) readProperty("gtc");
	}

	public void setInputAction(String inputAction)
	{
		writeProperty("inputAction", inputAction);
	}

	public String getInputAction()
	{
		return (String) readProperty("inputAction");
	}

	public void setInputBroker(String inputBroker)
	{
		writeProperty("inputBroker", inputBroker);
	}

	public String getInputBroker()
	{
		return (String) readProperty("inputBroker");
	}

	public void setInputCompany(String inputCompany)
	{
		writeProperty("inputCompany", inputCompany);
	}

	public String getInputCompany()
	{
		return (String) readProperty("inputCompany");
	}

	public void setInputTrader(String inputTrader)
	{
		writeProperty("inputTrader", inputTrader);
	}

	public String getInputTrader()
	{
		return (String) readProperty("inputTrader");
	}

	public void setMot(String mot)
	{
		writeProperty("mot", mot);
	}

	public String getMot()
	{
		return (String) readProperty("mot");
	}

	public void setPremiumDate(Date premiumDate)
	{
		writeProperty("premiumDate", premiumDate);
	}

	public Date getPremiumDate()
	{
		return (Date) readProperty("premiumDate");
	}

	public void setPrice(Double price)
	{
		writeProperty("price", price);
	}

	public Double getPrice()
	{
		return (Double) readProperty("price");
	}

	public void setPriceCurrency(String priceCurrency)
	{
		writeProperty("priceCurrency", priceCurrency);
	}

	public String getPriceCurrency()
	{
		return (String) readProperty("priceCurrency");
	}

	public void setPriceType(String priceType)
	{
		writeProperty("priceType", priceType);
	}

	public String getPriceType()
	{
		return (String) readProperty("priceType");
	}

	public void setPriceUom(String priceUom)
	{
		writeProperty("priceUom", priceUom);
	}

	public String getPriceUom()
	{
		return (String) readProperty("priceUom");
	}

	public void setProductId(Integer productId)
	{
		writeProperty("productId", productId);
	}

	public Integer getProductId()
	{
		return (Integer) readProperty("productId");
	}

	public void setQtyUom(String qtyUom)
	{
		writeProperty("qtyUom", qtyUom);
	}

	public String getQtyUom()
	{
		return (String) readProperty("qtyUom");
	}

	public void setQuantity(Double quantity)
	{
		writeProperty("quantity", quantity);
	}

	public Double getQuantity()
	{
		return (Double) readProperty("quantity");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setRiskMarket(String riskMarket)
	{
		writeProperty("riskMarket", riskMarket);
	}

	public String getRiskMarket()
	{
		return (String) readProperty("riskMarket");
	}

	public void setSellerAccount(String sellerAccount)
	{
		writeProperty("sellerAccount", sellerAccount);
	}

	public String getSellerAccount()
	{
		return (String) readProperty("sellerAccount");
	}

	public void setSellerClrngBroker(String sellerClrngBroker)
	{
		writeProperty("sellerClrngBroker", sellerClrngBroker);
	}

	public String getSellerClrngBroker()
	{
		return (String) readProperty("sellerClrngBroker");
	}

	public void setSellerCommCost(Double sellerCommCost)
	{
		writeProperty("sellerCommCost", sellerCommCost);
	}

	public Double getSellerCommCost()
	{
		return (Double) readProperty("sellerCommCost");
	}

	public void setSellerCommCurr(String sellerCommCurr)
	{
		writeProperty("sellerCommCurr", sellerCommCurr);
	}

	public String getSellerCommCurr()
	{
		return (String) readProperty("sellerCommCurr");
	}

	public void setStrikePrice(Double strikePrice)
	{
		writeProperty("strikePrice", strikePrice);
	}

	public Double getStrikePrice()
	{
		return (Double) readProperty("strikePrice");
	}

	public void setTemplateTradeNum(Integer templateTradeNum)
	{
		writeProperty("templateTradeNum", templateTradeNum);
	}

	public Integer getTemplateTradeNum()
	{
		return (Integer) readProperty("templateTradeNum");
	}

	public void setTitleMarket(String titleMarket)
	{
		writeProperty("titleMarket", titleMarket);
	}

	public String getTitleMarket()
	{
		return (String) readProperty("titleMarket");
	}

	public void setTitleTransfer(String titleTransfer)
	{
		writeProperty("titleTransfer", titleTransfer);
	}

	public String getTitleTransfer()
	{
		return (String) readProperty("titleTransfer");
	}

	public void setTradeType(String tradeType)
	{
		writeProperty("tradeType", tradeType);
	}

	public String getTradeType()
	{
		return (String) readProperty("tradeType");
	}

	public void setTradingPeriod(String tradingPeriod)
	{
		writeProperty("tradingPeriod", tradingPeriod);
	}

	public String getTradingPeriod()
	{
		return (String) readProperty("tradingPeriod");
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
