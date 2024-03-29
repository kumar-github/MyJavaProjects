package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VCashSettleDateRev was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VCashSettleDateRev extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> ASOF_TRANS_ID = new Property<Integer>("asofTransId");
	public static final Property<Date> CASH_SETTLE_DATE = new Property<Date>("cashSettleDate");
	public static final Property<Short> CASH_SETTLE_NUM = new Property<Short>("cashSettleNum");
	public static final Property<String> CASH_SETTLE_STATUS = new Property<String>("cashSettleStatus");
	public static final Property<Short> ORDER_NUM = new Property<Short>("orderNum");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRADE_NUM = new Property<Integer>("tradeNum");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setAsofTransId(Integer asofTransId)
	{
		writeProperty("asofTransId", asofTransId);
	}

	public Integer getAsofTransId()
	{
		return (Integer) readProperty("asofTransId");
	}

	public void setCashSettleDate(Date cashSettleDate)
	{
		writeProperty("cashSettleDate", cashSettleDate);
	}

	public Date getCashSettleDate()
	{
		return (Date) readProperty("cashSettleDate");
	}

	public void setCashSettleNum(Short cashSettleNum)
	{
		writeProperty("cashSettleNum", cashSettleNum);
	}

	public Short getCashSettleNum()
	{
		return (Short) readProperty("cashSettleNum");
	}

	public void setCashSettleStatus(String cashSettleStatus)
	{
		writeProperty("cashSettleStatus", cashSettleStatus);
	}

	public String getCashSettleStatus()
	{
		return (String) readProperty("cashSettleStatus");
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

	public void setTradeNum(Integer tradeNum)
	{
		writeProperty("tradeNum", tradeNum);
	}

	public Integer getTradeNum()
	{
		return (Integer) readProperty("tradeNum");
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
