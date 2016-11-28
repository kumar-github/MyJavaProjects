package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VieSEARCHTradePl was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VieSEARCHTradePl extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> FLDCHR_ANLST_USER_FULL_NAME = new Property<String>("fldchrAnlstUserFullName");
	public static final Property<String> FLDCHR_ANLST_USER_INIT = new Property<String>("fldchrAnlstUserInit");
	public static final Property<String> FLDCHR_BOOKC_FULL_NAME = new Property<String>("fldchrBookcFullName");
	public static final Property<String> FLDCHR_BOOKC_SHORT_NAME = new Property<String>("fldchrBookcShortName");
	public static final Property<String> FLDCHR_CONTR_KEY = new Property<String>("fldchrContrKey");
	public static final Property<String> FLDCHR_CONTR_NUM = new Property<String>("fldchrContrNum");
	public static final Property<String> FLDCHR_CONTR_STATUS = new Property<String>("fldchrContrStatus");
	public static final Property<String> FLDCHR_CPART_FULL_NAME = new Property<String>("fldchrCpartFullName");
	public static final Property<String> FLDCHR_CPART_SHORT_NAME = new Property<String>("fldchrCpartShortName");
	public static final Property<String> FLDCHR_TRAD_USER_INIT = new Property<String>("fldchrTradUserInit");
	public static final Property<String> FLDCHR_TRADE_USER_FULL_NAME = new Property<String>("fldchrTradeUserFullName");
	public static final Property<Integer> FLDINT_BOOKC_ACCT_NUM = new Property<Integer>("fldintBookcAcctNum");
	public static final Property<Integer> FLDINT_CPART_ACCT_NUM = new Property<Integer>("fldintCpartAcctNum");
	public static final Property<Date> FLDSDT_CONTR_END_DATE = new Property<Date>("fldsdtContrEndDate");
	public static final Property<Date> FLDSDT_CONTR_START_DATE = new Property<Date>("fldsdtContrStartDate");
	public static final Property<Date> FLDSDT_NEGOTIATION_DATE = new Property<Date>("fldsdtNegotiationDate");

	public void setFldchrAnlstUserFullName(String fldchrAnlstUserFullName)
	{
		writeProperty("fldchrAnlstUserFullName", fldchrAnlstUserFullName);
	}

	public String getFldchrAnlstUserFullName()
	{
		return (String) readProperty("fldchrAnlstUserFullName");
	}

	public void setFldchrAnlstUserInit(String fldchrAnlstUserInit)
	{
		writeProperty("fldchrAnlstUserInit", fldchrAnlstUserInit);
	}

	public String getFldchrAnlstUserInit()
	{
		return (String) readProperty("fldchrAnlstUserInit");
	}

	public void setFldchrBookcFullName(String fldchrBookcFullName)
	{
		writeProperty("fldchrBookcFullName", fldchrBookcFullName);
	}

	public String getFldchrBookcFullName()
	{
		return (String) readProperty("fldchrBookcFullName");
	}

	public void setFldchrBookcShortName(String fldchrBookcShortName)
	{
		writeProperty("fldchrBookcShortName", fldchrBookcShortName);
	}

	public String getFldchrBookcShortName()
	{
		return (String) readProperty("fldchrBookcShortName");
	}

	public void setFldchrContrKey(String fldchrContrKey)
	{
		writeProperty("fldchrContrKey", fldchrContrKey);
	}

	public String getFldchrContrKey()
	{
		return (String) readProperty("fldchrContrKey");
	}

	public void setFldchrContrNum(String fldchrContrNum)
	{
		writeProperty("fldchrContrNum", fldchrContrNum);
	}

	public String getFldchrContrNum()
	{
		return (String) readProperty("fldchrContrNum");
	}

	public void setFldchrContrStatus(String fldchrContrStatus)
	{
		writeProperty("fldchrContrStatus", fldchrContrStatus);
	}

	public String getFldchrContrStatus()
	{
		return (String) readProperty("fldchrContrStatus");
	}

	public void setFldchrCpartFullName(String fldchrCpartFullName)
	{
		writeProperty("fldchrCpartFullName", fldchrCpartFullName);
	}

	public String getFldchrCpartFullName()
	{
		return (String) readProperty("fldchrCpartFullName");
	}

	public void setFldchrCpartShortName(String fldchrCpartShortName)
	{
		writeProperty("fldchrCpartShortName", fldchrCpartShortName);
	}

	public String getFldchrCpartShortName()
	{
		return (String) readProperty("fldchrCpartShortName");
	}

	public void setFldchrTradUserInit(String fldchrTradUserInit)
	{
		writeProperty("fldchrTradUserInit", fldchrTradUserInit);
	}

	public String getFldchrTradUserInit()
	{
		return (String) readProperty("fldchrTradUserInit");
	}

	public void setFldchrTradeUserFullName(String fldchrTradeUserFullName)
	{
		writeProperty("fldchrTradeUserFullName", fldchrTradeUserFullName);
	}

	public String getFldchrTradeUserFullName()
	{
		return (String) readProperty("fldchrTradeUserFullName");
	}

	public void setFldintBookcAcctNum(Integer fldintBookcAcctNum)
	{
		writeProperty("fldintBookcAcctNum", fldintBookcAcctNum);
	}

	public Integer getFldintBookcAcctNum()
	{
		return (Integer) readProperty("fldintBookcAcctNum");
	}

	public void setFldintCpartAcctNum(Integer fldintCpartAcctNum)
	{
		writeProperty("fldintCpartAcctNum", fldintCpartAcctNum);
	}

	public Integer getFldintCpartAcctNum()
	{
		return (Integer) readProperty("fldintCpartAcctNum");
	}

	public void setFldsdtContrEndDate(Date fldsdtContrEndDate)
	{
		writeProperty("fldsdtContrEndDate", fldsdtContrEndDate);
	}

	public Date getFldsdtContrEndDate()
	{
		return (Date) readProperty("fldsdtContrEndDate");
	}

	public void setFldsdtContrStartDate(Date fldsdtContrStartDate)
	{
		writeProperty("fldsdtContrStartDate", fldsdtContrStartDate);
	}

	public Date getFldsdtContrStartDate()
	{
		return (Date) readProperty("fldsdtContrStartDate");
	}

	public void setFldsdtNegotiationDate(Date fldsdtNegotiationDate)
	{
		writeProperty("fldsdtNegotiationDate", fldsdtNegotiationDate);
	}

	public Date getFldsdtNegotiationDate()
	{
		return (Date) readProperty("fldsdtNegotiationDate");
	}

}