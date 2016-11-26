package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VMdsTradefill was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VMdsTradefill extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> BOOKING_COMPANY = new Property<String>("bookingCompany");
	public static final Property<String> CLEARING_BROKER = new Property<String>("clearingBroker");
	public static final Property<String> COMMODITY = new Property<String>("commodity");
	public static final Property<Date> CONTR_DATE = new Property<Date>("contrDate");
	public static final Property<Double> CONTR_QTY = new Property<Double>("contrQty");
	public static final Property<String> CONTR_QTY_UOM_CODE = new Property<String>("contrQtyUomCode");
	public static final Property<String> COUNTER_PARTY = new Property<String>("counterParty");
	public static final Property<Date> CREATE_DATE = new Property<Date>("createDate");
	public static final Property<Date> E_FPPOST_DATE = new Property<Date>("eFPPostDate");
	public static final Property<String> EXCHANGE_DEAL_ID = new Property<String>("exchangeDealID");
	public static final Property<Double> FILL_PRICE = new Property<Double>("fillPrice");
	public static final Property<String> FILL_PRICE_CURR_CODE = new Property<String>("fillPriceCurrCode");
	public static final Property<String> FILL_PRICE_UOM_CODE = new Property<String>("fillPriceUomCode");
	public static final Property<Double> FILL_QTY = new Property<Double>("fillQty");
	public static final Property<String> FLOOR_BROKER = new Property<String>("floorBroker");
	public static final Property<String> INHOUSE_IND = new Property<String>("inhouseInd");
	public static final Property<Short> ITEM_FILL_NUM = new Property<Short>("itemFillNum");
	public static final Property<Short> ITEM_NUM = new Property<Short>("itemNum");
	public static final Property<Date> LAST_TRADEDATE = new Property<Date>("lastTradedate");
	public static final Property<String> MARKET = new Property<String>("market");
	public static final Property<Date> OPTION_EXPIRY_DATE = new Property<Date>("optionExpiryDate");
	public static final Property<String> OPTION_TYPE = new Property<String>("optionType");
	public static final Property<Short> ORDER_NUM = new Property<Short>("orderNum");
	public static final Property<String> ORDER_TYPE = new Property<String>("orderType");
	public static final Property<String> P_SIND = new Property<String>("pSInd");
	public static final Property<String> PORT_GROUP = new Property<String>("portGroup");
	public static final Property<String> PROFIT_CNTR = new Property<String>("profitCntr");
	public static final Property<String> PUT_CALL_IND = new Property<String>("putCallInd");
	public static final Property<Integer> REAL_PORT_NUM = new Property<Integer>("realPortNum");
	public static final Property<Double> STRIKE_PRICE = new Property<Double>("strikePrice");
	public static final Property<String> STRIKE_PRICE_CURR = new Property<String>("strikePriceCurr");
	public static final Property<String> STRIKE_PRICE_UOM = new Property<String>("strikePriceUom");
	public static final Property<Double> TI_AVG_PRICE = new Property<Double>("tiAvgPrice");
	public static final Property<Integer> TRADE = new Property<Integer>("trade");
	public static final Property<String> TRADE_KEY = new Property<String>("tradeKey");
	public static final Property<Date> TRADE_MOD_DATE = new Property<Date>("tradeModDate");
	public static final Property<String> TRADER = new Property<String>("trader");
	public static final Property<String> TRADING_PRD = new Property<String>("tradingPrd");
	public static final Property<String> TRADING_PRD_DESC = new Property<String>("tradingPrdDesc");
	public static final Property<String> TRADING_PRD_MONTH_YR = new Property<String>("tradingPrdMonthYr");
	public static final Property<String> TRADING_PRD_QTR = new Property<String>("tradingPrdQtr");
	public static final Property<String> TRADING_PRD_YEAR = new Property<String>("tradingPrdYear");

	public void setBookingCompany(String bookingCompany)
	{
		writeProperty("bookingCompany", bookingCompany);
	}

	public String getBookingCompany()
	{
		return (String) readProperty("bookingCompany");
	}

	public void setClearingBroker(String clearingBroker)
	{
		writeProperty("clearingBroker", clearingBroker);
	}

	public String getClearingBroker()
	{
		return (String) readProperty("clearingBroker");
	}

	public void setCommodity(String commodity)
	{
		writeProperty("commodity", commodity);
	}

	public String getCommodity()
	{
		return (String) readProperty("commodity");
	}

	public void setContrDate(Date contrDate)
	{
		writeProperty("contrDate", contrDate);
	}

	public Date getContrDate()
	{
		return (Date) readProperty("contrDate");
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

	public void setCounterParty(String counterParty)
	{
		writeProperty("counterParty", counterParty);
	}

	public String getCounterParty()
	{
		return (String) readProperty("counterParty");
	}

	public void setCreateDate(Date createDate)
	{
		writeProperty("createDate", createDate);
	}

	public Date getCreateDate()
	{
		return (Date) readProperty("createDate");
	}

	public void setEFPPostDate(Date eFPPostDate)
	{
		writeProperty("eFPPostDate", eFPPostDate);
	}

	public Date getEFPPostDate()
	{
		return (Date) readProperty("eFPPostDate");
	}

	public void setExchangeDealID(String exchangeDealID)
	{
		writeProperty("exchangeDealID", exchangeDealID);
	}

	public String getExchangeDealID()
	{
		return (String) readProperty("exchangeDealID");
	}

	public void setFillPrice(Double fillPrice)
	{
		writeProperty("fillPrice", fillPrice);
	}

	public Double getFillPrice()
	{
		return (Double) readProperty("fillPrice");
	}

	public void setFillPriceCurrCode(String fillPriceCurrCode)
	{
		writeProperty("fillPriceCurrCode", fillPriceCurrCode);
	}

	public String getFillPriceCurrCode()
	{
		return (String) readProperty("fillPriceCurrCode");
	}

	public void setFillPriceUomCode(String fillPriceUomCode)
	{
		writeProperty("fillPriceUomCode", fillPriceUomCode);
	}

	public String getFillPriceUomCode()
	{
		return (String) readProperty("fillPriceUomCode");
	}

	public void setFillQty(Double fillQty)
	{
		writeProperty("fillQty", fillQty);
	}

	public Double getFillQty()
	{
		return (Double) readProperty("fillQty");
	}

	public void setFloorBroker(String floorBroker)
	{
		writeProperty("floorBroker", floorBroker);
	}

	public String getFloorBroker()
	{
		return (String) readProperty("floorBroker");
	}

	public void setInhouseInd(String inhouseInd)
	{
		writeProperty("inhouseInd", inhouseInd);
	}

	public String getInhouseInd()
	{
		return (String) readProperty("inhouseInd");
	}

	public void setItemFillNum(Short itemFillNum)
	{
		writeProperty("itemFillNum", itemFillNum);
	}

	public Short getItemFillNum()
	{
		return (Short) readProperty("itemFillNum");
	}

	public void setItemNum(Short itemNum)
	{
		writeProperty("itemNum", itemNum);
	}

	public Short getItemNum()
	{
		return (Short) readProperty("itemNum");
	}

	public void setLastTradedate(Date lastTradedate)
	{
		writeProperty("lastTradedate", lastTradedate);
	}

	public Date getLastTradedate()
	{
		return (Date) readProperty("lastTradedate");
	}

	public void setMarket(String market)
	{
		writeProperty("market", market);
	}

	public String getMarket()
	{
		return (String) readProperty("market");
	}

	public void setOptionExpiryDate(Date optionExpiryDate)
	{
		writeProperty("optionExpiryDate", optionExpiryDate);
	}

	public Date getOptionExpiryDate()
	{
		return (Date) readProperty("optionExpiryDate");
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

	public void setOrderType(String orderType)
	{
		writeProperty("orderType", orderType);
	}

	public String getOrderType()
	{
		return (String) readProperty("orderType");
	}

	public void setPSInd(String pSInd)
	{
		writeProperty("pSInd", pSInd);
	}

	public String getPSInd()
	{
		return (String) readProperty("pSInd");
	}

	public void setPortGroup(String portGroup)
	{
		writeProperty("portGroup", portGroup);
	}

	public String getPortGroup()
	{
		return (String) readProperty("portGroup");
	}

	public void setProfitCntr(String profitCntr)
	{
		writeProperty("profitCntr", profitCntr);
	}

	public String getProfitCntr()
	{
		return (String) readProperty("profitCntr");
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

	public void setStrikePrice(Double strikePrice)
	{
		writeProperty("strikePrice", strikePrice);
	}

	public Double getStrikePrice()
	{
		return (Double) readProperty("strikePrice");
	}

	public void setStrikePriceCurr(String strikePriceCurr)
	{
		writeProperty("strikePriceCurr", strikePriceCurr);
	}

	public String getStrikePriceCurr()
	{
		return (String) readProperty("strikePriceCurr");
	}

	public void setStrikePriceUom(String strikePriceUom)
	{
		writeProperty("strikePriceUom", strikePriceUom);
	}

	public String getStrikePriceUom()
	{
		return (String) readProperty("strikePriceUom");
	}

	public void setTiAvgPrice(Double tiAvgPrice)
	{
		writeProperty("tiAvgPrice", tiAvgPrice);
	}

	public Double getTiAvgPrice()
	{
		return (Double) readProperty("tiAvgPrice");
	}

	public void setTrade(Integer trade)
	{
		writeProperty("trade", trade);
	}

	public Integer getTrade()
	{
		return (Integer) readProperty("trade");
	}

	public void setTradeKey(String tradeKey)
	{
		writeProperty("tradeKey", tradeKey);
	}

	public String getTradeKey()
	{
		return (String) readProperty("tradeKey");
	}

	public void setTradeModDate(Date tradeModDate)
	{
		writeProperty("tradeModDate", tradeModDate);
	}

	public Date getTradeModDate()
	{
		return (Date) readProperty("tradeModDate");
	}

	public void setTrader(String trader)
	{
		writeProperty("trader", trader);
	}

	public String getTrader()
	{
		return (String) readProperty("trader");
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

	public void setTradingPrdMonthYr(String tradingPrdMonthYr)
	{
		writeProperty("tradingPrdMonthYr", tradingPrdMonthYr);
	}

	public String getTradingPrdMonthYr()
	{
		return (String) readProperty("tradingPrdMonthYr");
	}

	public void setTradingPrdQtr(String tradingPrdQtr)
	{
		writeProperty("tradingPrdQtr", tradingPrdQtr);
	}

	public String getTradingPrdQtr()
	{
		return (String) readProperty("tradingPrdQtr");
	}

	public void setTradingPrdYear(String tradingPrdYear)
	{
		writeProperty("tradingPrdYear", tradingPrdYear);
	}

	public String getTradingPrdYear()
	{
		return (String) readProperty("tradingPrdYear");
	}

}
