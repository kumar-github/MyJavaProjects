package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudMcaTradeItem was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudMcaTradeItem extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> ITEM_NUM = new Property<Integer>("itemNum");
	public static final Property<Integer> MCA_NUM = new Property<Integer>("mcaNum");
	public static final Property<Double> MTM_AMOUNT = new Property<Double>("mtmAmount");
	public static final Property<String> MTM_CURR_CODE = new Property<String>("mtmCurrCode");
	public static final Property<Short> ORDER_NUM = new Property<Short>("orderNum");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Short> TRADE_NUM = new Property<Short>("tradeNum");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setItemNum(Integer itemNum)
	{
		writeProperty("itemNum", itemNum);
	}

	public Integer getItemNum()
	{
		return (Integer) readProperty("itemNum");
	}

	public void setMcaNum(Integer mcaNum)
	{
		writeProperty("mcaNum", mcaNum);
	}

	public Integer getMcaNum()
	{
		return (Integer) readProperty("mcaNum");
	}

	public void setMtmAmount(Double mtmAmount)
	{
		writeProperty("mtmAmount", mtmAmount);
	}

	public Double getMtmAmount()
	{
		return (Double) readProperty("mtmAmount");
	}

	public void setMtmCurrCode(String mtmCurrCode)
	{
		writeProperty("mtmCurrCode", mtmCurrCode);
	}

	public String getMtmCurrCode()
	{
		return (String) readProperty("mtmCurrCode");
	}

	public void setOrderNum(Short orderNum)
	{
		writeProperty("orderNum", orderNum);
	}

	public Short getOrderNum()
	{
		return (Short) readProperty("orderNum");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setTradeNum(Short tradeNum)
	{
		writeProperty("tradeNum", tradeNum);
	}

	public Short getTradeNum()
	{
		return (Short) readProperty("tradeNum");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

}
