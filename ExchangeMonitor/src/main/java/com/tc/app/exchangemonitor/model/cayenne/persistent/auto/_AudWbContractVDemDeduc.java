package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudWbContractVDemDeduc was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudWbContractVDemDeduc extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Date> DATE_OP = new Property<Date>("dateOp");
	public static final Property<String> FLDCHR_CONTR_KEY = new Property<String>("fldchrContrKey");
	public static final Property<String> FLDCHR_PORT_NAME = new Property<String>("fldchrPortName");
	public static final Property<String> FLDCHR_REASON = new Property<String>("fldchrReason");
	public static final Property<Integer> FLDINT_ID_ORDER = new Property<Integer>("fldintIdOrder");
	public static final Property<Integer> FLDINT_SHARE = new Property<Integer>("fldintShare");
	public static final Property<String> FLDINT_TOTAL_DEDUCTION = new Property<String>("fldintTotalDeduction");
	public static final Property<String> FLDINT_TOTAL_TIME = new Property<String>("fldintTotalTime");
	public static final Property<Date> FLDSDT_END_DATE = new Property<Date>("fldsdtEndDate");
	public static final Property<Date> FLDSDT_START_DATE = new Property<Date>("fldsdtStartDate");
	public static final Property<String> OPERATION = new Property<String>("operation");
	public static final Property<String> USERID = new Property<String>("userid");

	public void setDateOp(Date dateOp)
	{
		writeProperty("dateOp", dateOp);
	}

	public Date getDateOp()
	{
		return (Date) readProperty("dateOp");
	}

	public void setFldchrContrKey(String fldchrContrKey)
	{
		writeProperty("fldchrContrKey", fldchrContrKey);
	}

	public String getFldchrContrKey()
	{
		return (String) readProperty("fldchrContrKey");
	}

	public void setFldchrPortName(String fldchrPortName)
	{
		writeProperty("fldchrPortName", fldchrPortName);
	}

	public String getFldchrPortName()
	{
		return (String) readProperty("fldchrPortName");
	}

	public void setFldchrReason(String fldchrReason)
	{
		writeProperty("fldchrReason", fldchrReason);
	}

	public String getFldchrReason()
	{
		return (String) readProperty("fldchrReason");
	}

	public void setFldintIdOrder(Integer fldintIdOrder)
	{
		writeProperty("fldintIdOrder", fldintIdOrder);
	}

	public Integer getFldintIdOrder()
	{
		return (Integer) readProperty("fldintIdOrder");
	}

	public void setFldintShare(Integer fldintShare)
	{
		writeProperty("fldintShare", fldintShare);
	}

	public Integer getFldintShare()
	{
		return (Integer) readProperty("fldintShare");
	}

	public void setFldintTotalDeduction(String fldintTotalDeduction)
	{
		writeProperty("fldintTotalDeduction", fldintTotalDeduction);
	}

	public String getFldintTotalDeduction()
	{
		return (String) readProperty("fldintTotalDeduction");
	}

	public void setFldintTotalTime(String fldintTotalTime)
	{
		writeProperty("fldintTotalTime", fldintTotalTime);
	}

	public String getFldintTotalTime()
	{
		return (String) readProperty("fldintTotalTime");
	}

	public void setFldsdtEndDate(Date fldsdtEndDate)
	{
		writeProperty("fldsdtEndDate", fldsdtEndDate);
	}

	public Date getFldsdtEndDate()
	{
		return (Date) readProperty("fldsdtEndDate");
	}

	public void setFldsdtStartDate(Date fldsdtStartDate)
	{
		writeProperty("fldsdtStartDate", fldsdtStartDate);
	}

	public Date getFldsdtStartDate()
	{
		return (Date) readProperty("fldsdtStartDate");
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