package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudCreditReserve was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudCreditReserve extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> ACCT_NUM = new Property<Integer>("acctNum");
	public static final Property<String> CURR_CODE = new Property<String>("currCode");
	public static final Property<Integer> OID = new Property<Integer>("oid");
	public static final Property<String> ORDER_TYPE_CODE = new Property<String>("orderTypeCode");
	public static final Property<BigDecimal> RESERVED_AMT = new Property<BigDecimal>("reservedAmt");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<String> STATUS = new Property<String>("status");
	public static final Property<String> TRADER_INIT = new Property<String>("traderInit");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<Date> VALUE_DATE = new Property<Date>("valueDate");

	public void setAcctNum(Integer acctNum)
	{
		writeProperty("acctNum", acctNum);
	}

	public Integer getAcctNum()
	{
		return (Integer) readProperty("acctNum");
	}

	public void setCurrCode(String currCode)
	{
		writeProperty("currCode", currCode);
	}

	public String getCurrCode()
	{
		return (String) readProperty("currCode");
	}

	public void setOid(Integer oid)
	{
		writeProperty("oid", oid);
	}

	public Integer getOid()
	{
		return (Integer) readProperty("oid");
	}

	public void setOrderTypeCode(String orderTypeCode)
	{
		writeProperty("orderTypeCode", orderTypeCode);
	}

	public String getOrderTypeCode()
	{
		return (String) readProperty("orderTypeCode");
	}

	public void setReservedAmt(BigDecimal reservedAmt)
	{
		writeProperty("reservedAmt", reservedAmt);
	}

	public BigDecimal getReservedAmt()
	{
		return (BigDecimal) readProperty("reservedAmt");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setStatus(String status)
	{
		writeProperty("status", status);
	}

	public String getStatus()
	{
		return (String) readProperty("status");
	}

	public void setTraderInit(String traderInit)
	{
		writeProperty("traderInit", traderInit);
	}

	public String getTraderInit()
	{
		return (String) readProperty("traderInit");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setValueDate(Date valueDate)
	{
		writeProperty("valueDate", valueDate);
	}

	public Date getValueDate()
	{
		return (Date) readProperty("valueDate");
	}

}
