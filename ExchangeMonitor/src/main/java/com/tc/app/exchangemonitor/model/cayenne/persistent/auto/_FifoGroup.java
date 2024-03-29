package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Account;
import com.tc.app.exchangemonitor.model.cayenne.persistent.TradingPeriod;

/**
 * Class _FifoGroup was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _FifoGroup extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FIFO_GROUP_NUM_PK_COLUMN = "fifo_group_num";

	public static final Property<String> ITEM_TYPE = new Property<String>("itemType");
	public static final Property<String> PUT_CALL_IND = new Property<String>("putCallInd");
	public static final Property<BigDecimal> STRIKE_PRICE = new Property<BigDecimal>("strikePrice");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<Account> ACCOUNT = new Property<Account>("account");
	public static final Property<TradingPeriod> TRADING_PERIOD = new Property<TradingPeriod>("tradingPeriod");
	public static final Property<TradingPeriod> TRADING_PERIOD1 = new Property<TradingPeriod>("tradingPeriod1");

	public void setItemType(String itemType)
	{
		writeProperty("itemType", itemType);
	}

	public String getItemType()
	{
		return (String) readProperty("itemType");
	}

	public void setPutCallInd(String putCallInd)
	{
		writeProperty("putCallInd", putCallInd);
	}

	public String getPutCallInd()
	{
		return (String) readProperty("putCallInd");
	}

	public void setStrikePrice(BigDecimal strikePrice)
	{
		writeProperty("strikePrice", strikePrice);
	}

	public BigDecimal getStrikePrice()
	{
		return (BigDecimal) readProperty("strikePrice");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setAccount(Account account)
	{
		setToOneTarget("account", account, true);
	}

	public Account getAccount()
	{
		return (Account) readProperty("account");
	}

	public void setTradingPeriod(TradingPeriod tradingPeriod)
	{
		setToOneTarget("tradingPeriod", tradingPeriod, true);
	}

	public TradingPeriod getTradingPeriod()
	{
		return (TradingPeriod) readProperty("tradingPeriod");
	}

	public void setTradingPeriod1(TradingPeriod tradingPeriod1)
	{
		setToOneTarget("tradingPeriod1", tradingPeriod1, true);
	}

	public TradingPeriod getTradingPeriod1()
	{
		return (TradingPeriod) readProperty("tradingPeriod1");
	}

}
