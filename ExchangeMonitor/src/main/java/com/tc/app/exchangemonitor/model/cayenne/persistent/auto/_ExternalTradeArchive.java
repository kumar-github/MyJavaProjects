package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _ExternalTradeArchive was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ExternalTradeArchive extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String ARCHIVED_DATE_PK_COLUMN = "archived_date";
	public static final String OID_PK_COLUMN = "oid";

	public static final Property<Date> ENTRY_DATE = new Property<Date>("entryDate");
	public static final Property<Integer> EXT_POS_NUM = new Property<Integer>("extPosNum");
	public static final Property<Integer> EXTERNAL_COMMENT_OID = new Property<Integer>("externalCommentOid");
	public static final Property<Integer> EXTERNAL_TRADE_SOURCE_OID = new Property<Integer>("externalTradeSourceOid");
	public static final Property<Integer> EXTERNAL_TRADE_STATE_OID = new Property<Integer>("externalTradeStateOid");
	public static final Property<Integer> EXTERNAL_TRADE_STATUS_OID = new Property<Integer>("externalTradeStatusOid");
	public static final Property<Integer> EXTERNAL_TRADE_SYSTEM_OID = new Property<Integer>("externalTradeSystemOid");
	public static final Property<Integer> INHOUSE_PORT_NUM = new Property<Integer>("inhousePortNum");
	public static final Property<Short> ITEM_NUM = new Property<Short>("itemNum");
	public static final Property<Short> ORDER_NUM = new Property<Short>("orderNum");
	public static final Property<Integer> PORT_NUM = new Property<Integer>("portNum");
	public static final Property<BigDecimal> SEQUENCE = new Property<BigDecimal>("sequence");
	public static final Property<Integer> TRADE_NUM = new Property<Integer>("tradeNum");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setEntryDate(Date entryDate)
	{
		writeProperty("entryDate", entryDate);
	}

	public Date getEntryDate()
	{
		return (Date) readProperty("entryDate");
	}

	public void setExtPosNum(Integer extPosNum)
	{
		writeProperty("extPosNum", extPosNum);
	}

	public Integer getExtPosNum()
	{
		return (Integer) readProperty("extPosNum");
	}

	public void setExternalCommentOid(Integer externalCommentOid)
	{
		writeProperty("externalCommentOid", externalCommentOid);
	}

	public Integer getExternalCommentOid()
	{
		return (Integer) readProperty("externalCommentOid");
	}

	public void setExternalTradeSourceOid(Integer externalTradeSourceOid)
	{
		writeProperty("externalTradeSourceOid", externalTradeSourceOid);
	}

	public Integer getExternalTradeSourceOid()
	{
		return (Integer) readProperty("externalTradeSourceOid");
	}

	public void setExternalTradeStateOid(Integer externalTradeStateOid)
	{
		writeProperty("externalTradeStateOid", externalTradeStateOid);
	}

	public Integer getExternalTradeStateOid()
	{
		return (Integer) readProperty("externalTradeStateOid");
	}

	public void setExternalTradeStatusOid(Integer externalTradeStatusOid)
	{
		writeProperty("externalTradeStatusOid", externalTradeStatusOid);
	}

	public Integer getExternalTradeStatusOid()
	{
		return (Integer) readProperty("externalTradeStatusOid");
	}

	public void setExternalTradeSystemOid(Integer externalTradeSystemOid)
	{
		writeProperty("externalTradeSystemOid", externalTradeSystemOid);
	}

	public Integer getExternalTradeSystemOid()
	{
		return (Integer) readProperty("externalTradeSystemOid");
	}

	public void setInhousePortNum(Integer inhousePortNum)
	{
		writeProperty("inhousePortNum", inhousePortNum);
	}

	public Integer getInhousePortNum()
	{
		return (Integer) readProperty("inhousePortNum");
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

	public void setPortNum(Integer portNum)
	{
		writeProperty("portNum", portNum);
	}

	public Integer getPortNum()
	{
		return (Integer) readProperty("portNum");
	}

	public void setSequence(BigDecimal sequence)
	{
		writeProperty("sequence", sequence);
	}

	public BigDecimal getSequence()
	{
		return (BigDecimal) readProperty("sequence");
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
