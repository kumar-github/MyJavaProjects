package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.OptionStrike;
import com.tc.app.exchangemonitor.model.cayenne.persistent.PriceSource;

/**
 * Class _OptionPrice was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _OptionPrice extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String COMMKT_KEY_PK_COLUMN = "commkt_key";
	public static final String OPT_PRICE_QUOTE_DATE_PK_COLUMN = "opt_price_quote_date";
	public static final String OPT_STRIKE_PRICE_PK_COLUMN = "opt_strike_price";
	public static final String PRICE_SOURCE_CODE_PK_COLUMN = "price_source_code";
	public static final String PUT_CALL_IND_PK_COLUMN = "put_call_ind";
	public static final String TRADING_PRD_PK_COLUMN = "trading_prd";

	public static final Property<String> AVG_CLOSED_CREATION_IND = new Property<String>("avgClosedCreationInd");
	public static final Property<Double> AVG_CLOSED_PRICE = new Property<Double>("avgClosedPrice");
	public static final Property<String> CREATION_TYPE = new Property<String>("creationType");
	public static final Property<String> HIGH_ASKED_CREATION_IND = new Property<String>("highAskedCreationInd");
	public static final Property<Double> HIGH_ASKED_PRICE = new Property<Double>("highAskedPrice");
	public static final Property<String> LOW_BID_CREATION_IND = new Property<String>("lowBidCreationInd");
	public static final Property<Double> LOW_BID_PRICE = new Property<Double>("lowBidPrice");
	public static final Property<Double> OPEN_INTEREST = new Property<Double>("openInterest");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<Double> VOL_TRADED = new Property<Double>("volTraded");
	public static final Property<Double> VOLATILITY = new Property<Double>("volatility");
	public static final Property<String> VOLATILITY_CREATION_IND = new Property<String>("volatilityCreationInd");
	public static final Property<OptionStrike> OPTION_STRIKE = new Property<OptionStrike>("optionStrike");
	public static final Property<OptionStrike> OPTION_STRIKE1 = new Property<OptionStrike>("optionStrike1");
	public static final Property<OptionStrike> OPTION_STRIKE2 = new Property<OptionStrike>("optionStrike2");
	public static final Property<OptionStrike> OPTION_STRIKE3 = new Property<OptionStrike>("optionStrike3");
	public static final Property<PriceSource> PRICE_SOURCE = new Property<PriceSource>("priceSource");

	public void setAvgClosedCreationInd(String avgClosedCreationInd)
	{
		writeProperty("avgClosedCreationInd", avgClosedCreationInd);
	}

	public String getAvgClosedCreationInd()
	{
		return (String) readProperty("avgClosedCreationInd");
	}

	public void setAvgClosedPrice(Double avgClosedPrice)
	{
		writeProperty("avgClosedPrice", avgClosedPrice);
	}

	public Double getAvgClosedPrice()
	{
		return (Double) readProperty("avgClosedPrice");
	}

	public void setCreationType(String creationType)
	{
		writeProperty("creationType", creationType);
	}

	public String getCreationType()
	{
		return (String) readProperty("creationType");
	}

	public void setHighAskedCreationInd(String highAskedCreationInd)
	{
		writeProperty("highAskedCreationInd", highAskedCreationInd);
	}

	public String getHighAskedCreationInd()
	{
		return (String) readProperty("highAskedCreationInd");
	}

	public void setHighAskedPrice(Double highAskedPrice)
	{
		writeProperty("highAskedPrice", highAskedPrice);
	}

	public Double getHighAskedPrice()
	{
		return (Double) readProperty("highAskedPrice");
	}

	public void setLowBidCreationInd(String lowBidCreationInd)
	{
		writeProperty("lowBidCreationInd", lowBidCreationInd);
	}

	public String getLowBidCreationInd()
	{
		return (String) readProperty("lowBidCreationInd");
	}

	public void setLowBidPrice(Double lowBidPrice)
	{
		writeProperty("lowBidPrice", lowBidPrice);
	}

	public Double getLowBidPrice()
	{
		return (Double) readProperty("lowBidPrice");
	}

	public void setOpenInterest(Double openInterest)
	{
		writeProperty("openInterest", openInterest);
	}

	public Double getOpenInterest()
	{
		return (Double) readProperty("openInterest");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setVolTraded(Double volTraded)
	{
		writeProperty("volTraded", volTraded);
	}

	public Double getVolTraded()
	{
		return (Double) readProperty("volTraded");
	}

	public void setVolatility(Double volatility)
	{
		writeProperty("volatility", volatility);
	}

	public Double getVolatility()
	{
		return (Double) readProperty("volatility");
	}

	public void setVolatilityCreationInd(String volatilityCreationInd)
	{
		writeProperty("volatilityCreationInd", volatilityCreationInd);
	}

	public String getVolatilityCreationInd()
	{
		return (String) readProperty("volatilityCreationInd");
	}

	public void setOptionStrike(OptionStrike optionStrike)
	{
		setToOneTarget("optionStrike", optionStrike, true);
	}

	public OptionStrike getOptionStrike()
	{
		return (OptionStrike) readProperty("optionStrike");
	}

	public void setOptionStrike1(OptionStrike optionStrike1)
	{
		setToOneTarget("optionStrike1", optionStrike1, true);
	}

	public OptionStrike getOptionStrike1()
	{
		return (OptionStrike) readProperty("optionStrike1");
	}

	public void setOptionStrike2(OptionStrike optionStrike2)
	{
		setToOneTarget("optionStrike2", optionStrike2, true);
	}

	public OptionStrike getOptionStrike2()
	{
		return (OptionStrike) readProperty("optionStrike2");
	}

	public void setOptionStrike3(OptionStrike optionStrike3)
	{
		setToOneTarget("optionStrike3", optionStrike3, true);
	}

	public OptionStrike getOptionStrike3()
	{
		return (OptionStrike) readProperty("optionStrike3");
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