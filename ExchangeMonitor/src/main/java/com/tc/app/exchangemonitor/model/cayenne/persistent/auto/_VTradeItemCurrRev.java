package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VTradeItemCurrRev was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VTradeItemCurrRev extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> ASOF_TRANS_ID = new Property<Integer>("asofTransId");
	public static final Property<String> CREDIT_TERM_CODE = new Property<String>("creditTermCode");
	public static final Property<Integer> ITEM_NUM = new Property<Integer>("itemNum");
	public static final Property<Integer> ORDER_NUM = new Property<Integer>("orderNum");
	public static final Property<BigDecimal> PAY_CURR_AMT = new Property<BigDecimal>("payCurrAmt");
	public static final Property<String> PAY_CURR_CODE = new Property<String>("payCurrCode");
	public static final Property<Date> PAYMENT_DATE = new Property<Date>("paymentDate");
	public static final Property<BigDecimal> REC_CURR_AMT = new Property<BigDecimal>("recCurrAmt");
	public static final Property<String> REC_CURR_CODE = new Property<String>("recCurrCode");
	public static final Property<BigDecimal> REF_SPOT_RATE = new Property<BigDecimal>("refSpotRate");
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

	public void setCreditTermCode(String creditTermCode)
	{
		writeProperty("creditTermCode", creditTermCode);
	}

	public String getCreditTermCode()
	{
		return (String) readProperty("creditTermCode");
	}

	public void setItemNum(Integer itemNum)
	{
		writeProperty("itemNum", itemNum);
	}

	public Integer getItemNum()
	{
		return (Integer) readProperty("itemNum");
	}

	public void setOrderNum(Integer orderNum)
	{
		writeProperty("orderNum", orderNum);
	}

	public Integer getOrderNum()
	{
		return (Integer) readProperty("orderNum");
	}

	public void setPayCurrAmt(BigDecimal payCurrAmt)
	{
		writeProperty("payCurrAmt", payCurrAmt);
	}

	public BigDecimal getPayCurrAmt()
	{
		return (BigDecimal) readProperty("payCurrAmt");
	}

	public void setPayCurrCode(String payCurrCode)
	{
		writeProperty("payCurrCode", payCurrCode);
	}

	public String getPayCurrCode()
	{
		return (String) readProperty("payCurrCode");
	}

	public void setPaymentDate(Date paymentDate)
	{
		writeProperty("paymentDate", paymentDate);
	}

	public Date getPaymentDate()
	{
		return (Date) readProperty("paymentDate");
	}

	public void setRecCurrAmt(BigDecimal recCurrAmt)
	{
		writeProperty("recCurrAmt", recCurrAmt);
	}

	public BigDecimal getRecCurrAmt()
	{
		return (BigDecimal) readProperty("recCurrAmt");
	}

	public void setRecCurrCode(String recCurrCode)
	{
		writeProperty("recCurrCode", recCurrCode);
	}

	public String getRecCurrCode()
	{
		return (String) readProperty("recCurrCode");
	}

	public void setRefSpotRate(BigDecimal refSpotRate)
	{
		writeProperty("refSpotRate", refSpotRate);
	}

	public BigDecimal getRefSpotRate()
	{
		return (BigDecimal) readProperty("refSpotRate");
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
