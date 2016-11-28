package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.TradeItemBunker;

/**
 * Class _HandlingType was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _HandlingType extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String HANDLING_TYPE_CODE_PK_COLUMN = "handling_type_code";

	public static final Property<String> HANDLING_TYPE_DESC = new Property<String>("handlingTypeDesc");
	public static final Property<String> HANDLING_TYPE_STATUS = new Property<String>("handlingTypeStatus");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<List<TradeItemBunker>> TRADE_ITEM_BUNKERS = new Property<List<TradeItemBunker>>("tradeItemBunkers");

	public void setHandlingTypeDesc(String handlingTypeDesc)
	{
		writeProperty("handlingTypeDesc", handlingTypeDesc);
	}

	public String getHandlingTypeDesc()
	{
		return (String) readProperty("handlingTypeDesc");
	}

	public void setHandlingTypeStatus(String handlingTypeStatus)
	{
		writeProperty("handlingTypeStatus", handlingTypeStatus);
	}

	public String getHandlingTypeStatus()
	{
		return (String) readProperty("handlingTypeStatus");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void addToTradeItemBunkers(TradeItemBunker obj)
	{
		addToManyTarget("tradeItemBunkers", obj, true);
	}

	public void removeFromTradeItemBunkers(TradeItemBunker obj)
	{
		removeToManyTarget("tradeItemBunkers", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<TradeItemBunker> getTradeItemBunkers()
	{
		return (List<TradeItemBunker>) readProperty("tradeItemBunkers");
	}

}