package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudAcctBookcompGuarantee was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudAcctBookcompGuarantee extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> ACCT_BOOKCOMP_KEY = new Property<Integer>("acctBookcompKey");
	public static final Property<Integer> ACCT_GUARANTEE_NUM = new Property<Integer>("acctGuaranteeNum");
	public static final Property<Date> EFF_DATE = new Property<Date>("effDate");
	public static final Property<BigDecimal> GUARANTEE_AMT = new Property<BigDecimal>("guaranteeAmt");
	public static final Property<String> GUARANTEE_CURR_CODE = new Property<String>("guaranteeCurrCode");
	public static final Property<String> GUARANTEE_DIRECTION = new Property<String>("guaranteeDirection");
	public static final Property<String> GUARANTEE_TYPE = new Property<String>("guaranteeType");
	public static final Property<Integer> GUARANTOR_ACCT_NUM = new Property<Integer>("guarantorAcctNum");
	public static final Property<Date> MATURITY_DATE = new Property<Date>("maturityDate");
	public static final Property<String> ORDER_TYPE_CODE = new Property<String>("orderTypeCode");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setAcctBookcompKey(Integer acctBookcompKey)
	{
		writeProperty("acctBookcompKey", acctBookcompKey);
	}

	public Integer getAcctBookcompKey()
	{
		return (Integer) readProperty("acctBookcompKey");
	}

	public void setAcctGuaranteeNum(Integer acctGuaranteeNum)
	{
		writeProperty("acctGuaranteeNum", acctGuaranteeNum);
	}

	public Integer getAcctGuaranteeNum()
	{
		return (Integer) readProperty("acctGuaranteeNum");
	}

	public void setEffDate(Date effDate)
	{
		writeProperty("effDate", effDate);
	}

	public Date getEffDate()
	{
		return (Date) readProperty("effDate");
	}

	public void setGuaranteeAmt(BigDecimal guaranteeAmt)
	{
		writeProperty("guaranteeAmt", guaranteeAmt);
	}

	public BigDecimal getGuaranteeAmt()
	{
		return (BigDecimal) readProperty("guaranteeAmt");
	}

	public void setGuaranteeCurrCode(String guaranteeCurrCode)
	{
		writeProperty("guaranteeCurrCode", guaranteeCurrCode);
	}

	public String getGuaranteeCurrCode()
	{
		return (String) readProperty("guaranteeCurrCode");
	}

	public void setGuaranteeDirection(String guaranteeDirection)
	{
		writeProperty("guaranteeDirection", guaranteeDirection);
	}

	public String getGuaranteeDirection()
	{
		return (String) readProperty("guaranteeDirection");
	}

	public void setGuaranteeType(String guaranteeType)
	{
		writeProperty("guaranteeType", guaranteeType);
	}

	public String getGuaranteeType()
	{
		return (String) readProperty("guaranteeType");
	}

	public void setGuarantorAcctNum(Integer guarantorAcctNum)
	{
		writeProperty("guarantorAcctNum", guarantorAcctNum);
	}

	public Integer getGuarantorAcctNum()
	{
		return (Integer) readProperty("guarantorAcctNum");
	}

	public void setMaturityDate(Date maturityDate)
	{
		writeProperty("maturityDate", maturityDate);
	}

	public Date getMaturityDate()
	{
		return (Date) readProperty("maturityDate");
	}

	public void setOrderTypeCode(String orderTypeCode)
	{
		writeProperty("orderTypeCode", orderTypeCode);
	}

	public String getOrderTypeCode()
	{
		return (String) readProperty("orderTypeCode");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
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