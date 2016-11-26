package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.TradeOrderOnExch;

/**
 * Class _OrderInstruction was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _OrderInstruction extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String ORDER_INSTR_CODE_PK_COLUMN = "order_instr_code";

	public static final Property<String> ORDER_INSTR_DESC = new Property<String>("orderInstrDesc");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<List<TradeOrderOnExch>> TRADE_ORDER_ON_EXCHES = new Property<List<TradeOrderOnExch>>("tradeOrderOnExches");

	public void setOrderInstrDesc(String orderInstrDesc)
	{
		writeProperty("orderInstrDesc", orderInstrDesc);
	}

	public String getOrderInstrDesc()
	{
		return (String) readProperty("orderInstrDesc");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void addToTradeOrderOnExches(TradeOrderOnExch obj)
	{
		addToManyTarget("tradeOrderOnExches", obj, true);
	}

	public void removeFromTradeOrderOnExches(TradeOrderOnExch obj)
	{
		removeToManyTarget("tradeOrderOnExches", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<TradeOrderOnExch> getTradeOrderOnExches()
	{
		return (List<TradeOrderOnExch>) readProperty("tradeOrderOnExches");
	}

}
