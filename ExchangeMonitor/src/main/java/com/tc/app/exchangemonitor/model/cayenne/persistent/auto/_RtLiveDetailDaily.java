package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _RtLiveDetailDaily was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _RtLiveDetailDaily extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String DETAIL_NUM_PK_COLUMN = "detail_num";
	public static final String TICKET_NUM_PK_COLUMN = "ticket_num";
	public static final String TIME_STAMP_PK_COLUMN = "time_stamp";

	public static final Property<String> BROKER = new Property<String>("broker");
	public static final Property<String> BUY_SELL_IND = new Property<String>("buySellInd");
	public static final Property<String> EXPIRE = new Property<String>("expire");
	public static final Property<String> FUT_DESC = new Property<String>("futDesc");
	public static final Property<String> LOCATION = new Property<String>("location");
	public static final Property<Double> OPT_PREMIUM = new Property<Double>("optPremium");
	public static final Property<String> OPTION_TYPE = new Property<String>("optionType");
	public static final Property<String> PAYS = new Property<String>("pays");
	public static final Property<Double> QTY = new Property<Double>("qty");
	public static final Property<String> RECEIVES = new Property<String>("receives");
	public static final Property<String> SETTLEMENT = new Property<String>("settlement");
	public static final Property<String> START_END = new Property<String>("startEnd");
	public static final Property<String> STRIKE = new Property<String>("strike");
	public static final Property<String> UNDERLYING = new Property<String>("underlying");
	public static final Property<String> UOM_PER = new Property<String>("uomPer");

	public void setBroker(String broker)
	{
		writeProperty("broker", broker);
	}

	public String getBroker()
	{
		return (String) readProperty("broker");
	}

	public void setBuySellInd(String buySellInd)
	{
		writeProperty("buySellInd", buySellInd);
	}

	public String getBuySellInd()
	{
		return (String) readProperty("buySellInd");
	}

	public void setExpire(String expire)
	{
		writeProperty("expire", expire);
	}

	public String getExpire()
	{
		return (String) readProperty("expire");
	}

	public void setFutDesc(String futDesc)
	{
		writeProperty("futDesc", futDesc);
	}

	public String getFutDesc()
	{
		return (String) readProperty("futDesc");
	}

	public void setLocation(String location)
	{
		writeProperty("location", location);
	}

	public String getLocation()
	{
		return (String) readProperty("location");
	}

	public void setOptPremium(Double optPremium)
	{
		writeProperty("optPremium", optPremium);
	}

	public Double getOptPremium()
	{
		return (Double) readProperty("optPremium");
	}

	public void setOptionType(String optionType)
	{
		writeProperty("optionType", optionType);
	}

	public String getOptionType()
	{
		return (String) readProperty("optionType");
	}

	public void setPays(String pays)
	{
		writeProperty("pays", pays);
	}

	public String getPays()
	{
		return (String) readProperty("pays");
	}

	public void setQty(Double qty)
	{
		writeProperty("qty", qty);
	}

	public Double getQty()
	{
		return (Double) readProperty("qty");
	}

	public void setReceives(String receives)
	{
		writeProperty("receives", receives);
	}

	public String getReceives()
	{
		return (String) readProperty("receives");
	}

	public void setSettlement(String settlement)
	{
		writeProperty("settlement", settlement);
	}

	public String getSettlement()
	{
		return (String) readProperty("settlement");
	}

	public void setStartEnd(String startEnd)
	{
		writeProperty("startEnd", startEnd);
	}

	public String getStartEnd()
	{
		return (String) readProperty("startEnd");
	}

	public void setStrike(String strike)
	{
		writeProperty("strike", strike);
	}

	public String getStrike()
	{
		return (String) readProperty("strike");
	}

	public void setUnderlying(String underlying)
	{
		writeProperty("underlying", underlying);
	}

	public String getUnderlying()
	{
		return (String) readProperty("underlying");
	}

	public void setUomPer(String uomPer)
	{
		writeProperty("uomPer", uomPer);
	}

	public String getUomPer()
	{
		return (String) readProperty("uomPer");
	}

}
