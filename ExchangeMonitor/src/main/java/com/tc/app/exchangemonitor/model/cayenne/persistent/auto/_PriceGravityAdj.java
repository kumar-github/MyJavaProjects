package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.CommodityMarket;
import com.tc.app.exchangemonitor.model.cayenne.persistent.PriceSource;

/**
 * Class _PriceGravityAdj was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PriceGravityAdj extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String COMMKT_KEY_PK_COLUMN = "commkt_key";
	public static final String PRICE_QUOTE_DATE_PK_COLUMN = "price_quote_date";
	public static final String PRICE_SOURCE_CODE_PK_COLUMN = "price_source_code";

	public static final Property<String> GRAVITY_SOURCE_CODE = new Property<String>("gravitySourceCode");
	public static final Property<String> GRAVITY_TABLE_NAME = new Property<String>("gravityTableName");
	public static final Property<Double> POSTED_GRAVITY = new Property<Double>("postedGravity");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<CommodityMarket> COMMODITY_MARKET = new Property<CommodityMarket>("commodityMarket");
	public static final Property<PriceSource> PRICE_SOURCE = new Property<PriceSource>("priceSource");

	public void setGravitySourceCode(String gravitySourceCode)
	{
		writeProperty("gravitySourceCode", gravitySourceCode);
	}

	public String getGravitySourceCode()
	{
		return (String) readProperty("gravitySourceCode");
	}

	public void setGravityTableName(String gravityTableName)
	{
		writeProperty("gravityTableName", gravityTableName);
	}

	public String getGravityTableName()
	{
		return (String) readProperty("gravityTableName");
	}

	public void setPostedGravity(Double postedGravity)
	{
		writeProperty("postedGravity", postedGravity);
	}

	public Double getPostedGravity()
	{
		return (Double) readProperty("postedGravity");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setCommodityMarket(CommodityMarket commodityMarket)
	{
		setToOneTarget("commodityMarket", commodityMarket, true);
	}

	public CommodityMarket getCommodityMarket()
	{
		return (CommodityMarket) readProperty("commodityMarket");
	}

	public void setPriceSource(PriceSource priceSource)
	{
		setToOneTarget("priceSource", priceSource, true);
	}

	public PriceSource getPriceSource()
	{
		return (PriceSource) readProperty("priceSource");
	}

}
