package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudWbVoyageOpsCommodity was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudWbVoyageOpsCommodity extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> ALLOC_NUM = new Property<String>("allocNum");
	public static final Property<Date> BL_DATE = new Property<Date>("blDate");
	public static final Property<Date> DATE_OP = new Property<Date>("dateOp");
	public static final Property<String> FLDCHR_ACTUA_FLAG = new Property<String>("fldchrActuaFlag");
	public static final Property<String> FLDCHR_BASE = new Property<String>("fldchrBase");
	public static final Property<Integer> FLDCHR_BUSINESS_UNIT = new Property<Integer>("fldchrBusinessUnit");
	public static final Property<String> FLDCHR_CHANNEL = new Property<String>("fldchrChannel");
	public static final Property<String> FLDCHR_CMDTY_CODE = new Property<String>("fldchrCmdtyCode");
	public static final Property<String> FLDCHR_CMDTY_UOM = new Property<String>("fldchrCmdtyUom");
	public static final Property<String> FLDCHR_CONTR_KEY = new Property<String>("fldchrContrKey");
	public static final Property<String> FLDCHR_PORT_CMDTY_KEY = new Property<String>("fldchrPortCmdtyKey");
	public static final Property<String> FLDCHR_REFERENCE_LOADING = new Property<String>("fldchrReferenceLoading");
	public static final Property<BigDecimal> FLDDBL_CMDTY_QTY = new Property<BigDecimal>("flddblCmdtyQty");
	public static final Property<Integer> FLDINT_ORDER = new Property<Integer>("fldintOrder");
	public static final Property<String> OPERATION = new Property<String>("operation");
	public static final Property<String> USERID = new Property<String>("userid");

	public void setAllocNum(String allocNum)
	{
		writeProperty("allocNum", allocNum);
	}

	public String getAllocNum()
	{
		return (String) readProperty("allocNum");
	}

	public void setBlDate(Date blDate)
	{
		writeProperty("blDate", blDate);
	}

	public Date getBlDate()
	{
		return (Date) readProperty("blDate");
	}

	public void setDateOp(Date dateOp)
	{
		writeProperty("dateOp", dateOp);
	}

	public Date getDateOp()
	{
		return (Date) readProperty("dateOp");
	}

	public void setFldchrActuaFlag(String fldchrActuaFlag)
	{
		writeProperty("fldchrActuaFlag", fldchrActuaFlag);
	}

	public String getFldchrActuaFlag()
	{
		return (String) readProperty("fldchrActuaFlag");
	}

	public void setFldchrBase(String fldchrBase)
	{
		writeProperty("fldchrBase", fldchrBase);
	}

	public String getFldchrBase()
	{
		return (String) readProperty("fldchrBase");
	}

	public void setFldchrBusinessUnit(Integer fldchrBusinessUnit)
	{
		writeProperty("fldchrBusinessUnit", fldchrBusinessUnit);
	}

	public Integer getFldchrBusinessUnit()
	{
		return (Integer) readProperty("fldchrBusinessUnit");
	}

	public void setFldchrChannel(String fldchrChannel)
	{
		writeProperty("fldchrChannel", fldchrChannel);
	}

	public String getFldchrChannel()
	{
		return (String) readProperty("fldchrChannel");
	}

	public void setFldchrCmdtyCode(String fldchrCmdtyCode)
	{
		writeProperty("fldchrCmdtyCode", fldchrCmdtyCode);
	}

	public String getFldchrCmdtyCode()
	{
		return (String) readProperty("fldchrCmdtyCode");
	}

	public void setFldchrCmdtyUom(String fldchrCmdtyUom)
	{
		writeProperty("fldchrCmdtyUom", fldchrCmdtyUom);
	}

	public String getFldchrCmdtyUom()
	{
		return (String) readProperty("fldchrCmdtyUom");
	}

	public void setFldchrContrKey(String fldchrContrKey)
	{
		writeProperty("fldchrContrKey", fldchrContrKey);
	}

	public String getFldchrContrKey()
	{
		return (String) readProperty("fldchrContrKey");
	}

	public void setFldchrPortCmdtyKey(String fldchrPortCmdtyKey)
	{
		writeProperty("fldchrPortCmdtyKey", fldchrPortCmdtyKey);
	}

	public String getFldchrPortCmdtyKey()
	{
		return (String) readProperty("fldchrPortCmdtyKey");
	}

	public void setFldchrReferenceLoading(String fldchrReferenceLoading)
	{
		writeProperty("fldchrReferenceLoading", fldchrReferenceLoading);
	}

	public String getFldchrReferenceLoading()
	{
		return (String) readProperty("fldchrReferenceLoading");
	}

	public void setFlddblCmdtyQty(BigDecimal flddblCmdtyQty)
	{
		writeProperty("flddblCmdtyQty", flddblCmdtyQty);
	}

	public BigDecimal getFlddblCmdtyQty()
	{
		return (BigDecimal) readProperty("flddblCmdtyQty");
	}

	public void setFldintOrder(Integer fldintOrder)
	{
		writeProperty("fldintOrder", fldintOrder);
	}

	public Integer getFldintOrder()
	{
		return (Integer) readProperty("fldintOrder");
	}

	public void setOperation(String operation)
	{
		writeProperty("operation", operation);
	}

	public String getOperation()
	{
		return (String) readProperty("operation");
	}

	public void setUserid(String userid)
	{
		writeProperty("userid", userid);
	}

	public String getUserid()
	{
		return (String) readProperty("userid");
	}

}