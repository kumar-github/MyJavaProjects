package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Account;
import com.tc.app.exchangemonitor.model.cayenne.persistent.CommodityMarket;
import com.tc.app.exchangemonitor.model.cayenne.persistent.ExternalTrade;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Uom;

/**
 * Class _ExternalPosition was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ExternalPosition extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String EXT_POS_NUM_PK_COLUMN = "ext_pos_num";

	public static final Property<String> ITEM_TYPE = new Property<String>("itemType");
	public static final Property<String> PUT_CALL_IND = new Property<String>("putCallInd");
	public static final Property<BigDecimal> QUANTITY = new Property<BigDecimal>("quantity");
	public static final Property<BigDecimal> STRIKE_PRICE = new Property<BigDecimal>("strikePrice");
	public static final Property<String> TRADING_PRD = new Property<String>("tradingPrd");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<Account> ACCOUNT = new Property<Account>("account");
	public static final Property<CommodityMarket> COMMODITY_MARKET = new Property<CommodityMarket>("commodityMarket");
	public static final Property<List<ExternalTrade>> EXTERNAL_TRADES = new Property<List<ExternalTrade>>("externalTrades");
	public static final Property<Uom> UOM = new Property<Uom>("uom");

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

	public void setQuantity(BigDecimal quantity)
	{
		writeProperty("quantity", quantity);
	}

	public BigDecimal getQuantity()
	{
		return (BigDecimal) readProperty("quantity");
	}

	public void setStrikePrice(BigDecimal strikePrice)
	{
		writeProperty("strikePrice", strikePrice);
	}

	public BigDecimal getStrikePrice()
	{
		return (BigDecimal) readProperty("strikePrice");
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

	public void setAccount(Account account)
	{
		setToOneTarget("account", account, true);
	}

	public Account getAccount()
	{
		return (Account) readProperty("account");
	}

	public void setCommodityMarket(CommodityMarket commodityMarket)
	{
		setToOneTarget("commodityMarket", commodityMarket, true);
	}

	public CommodityMarket getCommodityMarket()
	{
		return (CommodityMarket) readProperty("commodityMarket");
	}

	public void addToExternalTrades(ExternalTrade obj)
	{
		addToManyTarget("externalTrades", obj, true);
	}

	public void removeFromExternalTrades(ExternalTrade obj)
	{
		removeToManyTarget("externalTrades", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<ExternalTrade> getExternalTrades()
	{
		return (List<ExternalTrade>) readProperty("externalTrades");
	}

	public void setUom(Uom uom)
	{
		setToOneTarget("uom", uom, true);
	}

	public Uom getUom()
	{
		return (Uom) readProperty("uom");
	}

}
