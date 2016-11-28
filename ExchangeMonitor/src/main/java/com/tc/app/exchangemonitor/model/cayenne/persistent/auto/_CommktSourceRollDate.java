package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.CommodityMarketSource;

/**
 * Class _CommktSourceRollDate was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CommktSourceRollDate extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String COMMKT_KEY_PK_COLUMN = "commkt_key";
	public static final String PRICE_SOURCE_CODE_PK_COLUMN = "price_source_code";
	public static final String ROLL_DATE_RULE_NUM_PK_COLUMN = "roll_date_rule_num";

	public static final Property<String> ROLL_DATE_BUS_CAL_IND = new Property<String>("rollDateBusCalInd");
	public static final Property<Short> ROLL_DATE_DAYS = new Property<Short>("rollDateDays");
	public static final Property<String> ROLL_DATE_EVENT = new Property<String>("rollDateEvent");
	public static final Property<String> ROLL_DATE_ON_IND = new Property<String>("rollDateOnInd");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<CommodityMarketSource> COMMODITY_MARKET_SOURCE = new Property<CommodityMarketSource>("commodityMarketSource");
	public static final Property<CommodityMarketSource> COMMODITY_MARKET_SOURCE1 = new Property<CommodityMarketSource>("commodityMarketSource1");

	public void setRollDateBusCalInd(String rollDateBusCalInd)
	{
		writeProperty("rollDateBusCalInd", rollDateBusCalInd);
	}

	public String getRollDateBusCalInd()
	{
		return (String) readProperty("rollDateBusCalInd");
	}

	public void setRollDateDays(Short rollDateDays)
	{
		writeProperty("rollDateDays", rollDateDays);
	}

	public Short getRollDateDays()
	{
		return (Short) readProperty("rollDateDays");
	}

	public void setRollDateEvent(String rollDateEvent)
	{
		writeProperty("rollDateEvent", rollDateEvent);
	}

	public String getRollDateEvent()
	{
		return (String) readProperty("rollDateEvent");
	}

	public void setRollDateOnInd(String rollDateOnInd)
	{
		writeProperty("rollDateOnInd", rollDateOnInd);
	}

	public String getRollDateOnInd()
	{
		return (String) readProperty("rollDateOnInd");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setCommodityMarketSource(CommodityMarketSource commodityMarketSource)
	{
		setToOneTarget("commodityMarketSource", commodityMarketSource, true);
	}

	public CommodityMarketSource getCommodityMarketSource()
	{
		return (CommodityMarketSource) readProperty("commodityMarketSource");
	}

	public void setCommodityMarketSource1(CommodityMarketSource commodityMarketSource1)
	{
		setToOneTarget("commodityMarketSource1", commodityMarketSource1, true);
	}

	public CommodityMarketSource getCommodityMarketSource1()
	{
		return (CommodityMarketSource) readProperty("commodityMarketSource1");
	}

}