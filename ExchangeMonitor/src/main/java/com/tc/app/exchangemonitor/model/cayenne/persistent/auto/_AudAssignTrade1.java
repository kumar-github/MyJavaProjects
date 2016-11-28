package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudAssignTrade1 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudAssignTrade1 extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> ACCT_NUM = new Property<Integer>("acctNum");
	public static final Property<Integer> CT_DOC_NUM = new Property<Integer>("ctDocNum");
	public static final Property<String> CT_DOC_TYPE = new Property<String>("ctDocType");
	public static final Property<Short> ITEM_NUM = new Property<Short>("itemNum");
	public static final Property<Short> ORDER_NUM = new Property<Short>("orderNum");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRADE_NUM = new Property<Integer>("tradeNum");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setAcctNum(Integer acctNum)
	{
		writeProperty("acctNum", acctNum);
	}

	public Integer getAcctNum()
	{
		return (Integer) readProperty("acctNum");
	}

	public void setCtDocNum(Integer ctDocNum)
	{
		writeProperty("ctDocNum", ctDocNum);
	}

	public Integer getCtDocNum()
	{
		return (Integer) readProperty("ctDocNum");
	}

	public void setCtDocType(String ctDocType)
	{
		writeProperty("ctDocType", ctDocType);
	}

	public String getCtDocType()
	{
		return (String) readProperty("ctDocType");
	}

	public void setItemNum(Short itemNum)
	{
		writeProperty("itemNum", itemNum);
	}

	public Short getItemNum()
	{
		return (Short) readProperty("itemNum");
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