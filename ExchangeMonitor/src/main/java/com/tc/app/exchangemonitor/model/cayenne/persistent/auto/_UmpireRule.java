package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.TradeItemDryPhy;

/**
 * Class _UmpireRule was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _UmpireRule extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String RULE_NUM_PK_COLUMN = "rule_num";

	public static final Property<String> LONG_DESC = new Property<String>("longDesc");
	public static final Property<String> SHORT_DESC = new Property<String>("shortDesc");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<List<TradeItemDryPhy>> TRADE_ITEM_DRY_PHIES = new Property<List<TradeItemDryPhy>>("tradeItemDryPhies");

	public void setLongDesc(String longDesc)
	{
		writeProperty("longDesc", longDesc);
	}

	public String getLongDesc()
	{
		return (String) readProperty("longDesc");
	}

	public void setShortDesc(String shortDesc)
	{
		writeProperty("shortDesc", shortDesc);
	}

	public String getShortDesc()
	{
		return (String) readProperty("shortDesc");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void addToTradeItemDryPhies(TradeItemDryPhy obj)
	{
		addToManyTarget("tradeItemDryPhies", obj, true);
	}

	public void removeFromTradeItemDryPhies(TradeItemDryPhy obj)
	{
		removeToManyTarget("tradeItemDryPhies", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<TradeItemDryPhy> getTradeItemDryPhies()
	{
		return (List<TradeItemDryPhy>) readProperty("tradeItemDryPhies");
	}

}