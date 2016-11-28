package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VMetTsTradeItemExchOpt was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VMetTsTradeItemExchOpt extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> CLEARING_BROKER = new Property<String>("clearingBroker");
	public static final Property<Integer> CLR_BRKR_NUM = new Property<Integer>("clrBrkrNum");
	public static final Property<Date> EXP_DATE = new Property<Date>("expDate");
	public static final Property<Short> ITEM_NUM = new Property<Short>("itemNum");
	public static final Property<Short> ORDER_NUM = new Property<Short>("orderNum");
	public static final Property<Double> PREMIUM = new Property<Double>("premium");
	public static final Property<String> PREMIUM_CURR_CODE = new Property<String>("premiumCurrCode");
	public static final Property<String> PREMIUM_UOM_CODE = new Property<String>("premiumUomCode");
	public static final Property<String> PUT_CALL_IND = new Property<String>("putCallInd");
	public static final Property<Double> STRIKE_PRICE = new Property<Double>("strikePrice");
	public static final Property<Integer> TRADE_NUM = new Property<Integer>("tradeNum");

	public void setClearingBroker(String clearingBroker)
	{
		writeProperty("clearingBroker", clearingBroker);
	}

	public String getClearingBroker()
	{
		return (String) readProperty("clearingBroker");
	}

	public void setClrBrkrNum(Integer clrBrkrNum)
	{
		writeProperty("clrBrkrNum", clrBrkrNum);
	}

	public Integer getClrBrkrNum()
	{
		return (Integer) readProperty("clrBrkrNum");
	}

	public void setExpDate(Date expDate)
	{
		writeProperty("expDate", expDate);
	}

	public Date getExpDate()
	{
		return (Date) readProperty("expDate");
	}

	public void setItemNum(Short itemNum)
	{
		writeProperty("itemNum", itemNum);
	}

	public Short getItemNum()
	{
		return (Short) readProperty("itemNum");
	}

	public void setOrderNum(Short orderNum)
	{
		writeProperty("orderNum", orderNum);
	}

	public Short getOrderNum()
	{
		return (Short) readProperty("orderNum");
	}

	public void setPremium(Double premium)
	{
		writeProperty("premium", premium);
	}

	public Double getPremium()
	{
		return (Double) readProperty("premium");
	}

	public void setPremiumCurrCode(String premiumCurrCode)
	{
		writeProperty("premiumCurrCode", premiumCurrCode);
	}

	public String getPremiumCurrCode()
	{
		return (String) readProperty("premiumCurrCode");
	}

	public void setPremiumUomCode(String premiumUomCode)
	{
		writeProperty("premiumUomCode", premiumUomCode);
	}

	public String getPremiumUomCode()
	{
		return (String) readProperty("premiumUomCode");
	}

	public void setPutCallInd(String putCallInd)
	{
		writeProperty("putCallInd", putCallInd);
	}

	public String getPutCallInd()
	{
		return (String) readProperty("putCallInd");
	}

	public void setStrikePrice(Double strikePrice)
	{
		writeProperty("strikePrice", strikePrice);
	}

	public Double getStrikePrice()
	{
		return (Double) readProperty("strikePrice");
	}

	public void setTradeNum(Integer tradeNum)
	{
		writeProperty("tradeNum", tradeNum);
	}

	public Integer getTradeNum()
	{
		return (Integer) readProperty("tradeNum");
	}

}