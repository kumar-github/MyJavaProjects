package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Commodity;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Market;

/**
 * Class _TradeOrderPosEffect was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _TradeOrderPosEffect extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String ORDER_NUM_PK_COLUMN = "order_num";
	public static final String TRADE_NUM_PK_COLUMN = "trade_num";

	public static final Property<Integer> REAL_PORT_NUM = new Property<Integer>("realPortNum");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<Commodity> COMMODITY = new Property<Commodity>("commodity");
	public static final Property<Commodity> COMMODITY1 = new Property<Commodity>("commodity1");
	public static final Property<Market> MARKET = new Property<Market>("market");
	public static final Property<Market> MARKET1 = new Property<Market>("market1");

	public void setRealPortNum(Integer realPortNum)
	{
		writeProperty("realPortNum", realPortNum);
	}

	public Integer getRealPortNum()
	{
		return (Integer) readProperty("realPortNum");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setCommodity(Commodity commodity)
	{
		setToOneTarget("commodity", commodity, true);
	}

	public Commodity getCommodity()
	{
		return (Commodity) readProperty("commodity");
	}

	public void setCommodity1(Commodity commodity1)
	{
		setToOneTarget("commodity1", commodity1, true);
	}

	public Commodity getCommodity1()
	{
		return (Commodity) readProperty("commodity1");
	}

	public void setMarket(Market market)
	{
		setToOneTarget("market", market, true);
	}

	public Market getMarket()
	{
		return (Market) readProperty("market");
	}

	public void setMarket1(Market market1)
	{
		setToOneTarget("market1", market1, true);
	}

	public Market getMarket1()
	{
		return (Market) readProperty("market1");
	}

}