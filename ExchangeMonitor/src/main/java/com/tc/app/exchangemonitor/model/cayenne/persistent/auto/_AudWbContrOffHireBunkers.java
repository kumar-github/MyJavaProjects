package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudWbContrOffHireBunkers was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudWbContrOffHireBunkers extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Date> DATE_OP = new Property<Date>("dateOp");
	public static final Property<String> FLDCHR_COMMODITY_CODE = new Property<String>("fldchrCommodityCode");
	public static final Property<String> FLDCHR_CONTR_KEY = new Property<String>("fldchrContrKey");
	public static final Property<Integer> FLDCHR_REC_ID = new Property<Integer>("fldchrRecId");
	public static final Property<Integer> FLDCHR_REF_REC_ID = new Property<Integer>("fldchrRefRecId");
	public static final Property<String> FLDINT_COST_NUM = new Property<String>("fldintCostNum");
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

	public void setFldchrCommodityCode(String fldchrCommodityCode)
	{
		writeProperty("fldchrCommodityCode", fldchrCommodityCode);
	}

	public String getFldchrCommodityCode()
	{
		return (String) readProperty("fldchrCommodityCode");
	}

	public void setFldchrContrKey(String fldchrContrKey)
	{
		writeProperty("fldchrContrKey", fldchrContrKey);
	}

	public String getFldchrContrKey()
	{
		return (String) readProperty("fldchrContrKey");
	}

	public void setFldchrRecId(Integer fldchrRecId)
	{
		writeProperty("fldchrRecId", fldchrRecId);
	}

	public Integer getFldchrRecId()
	{
		return (Integer) readProperty("fldchrRecId");
	}

	public void setFldchrRefRecId(Integer fldchrRefRecId)
	{
		writeProperty("fldchrRefRecId", fldchrRefRecId);
	}

	public Integer getFldchrRefRecId()
	{
		return (Integer) readProperty("fldchrRefRecId");
	}

	public void setFldintCostNum(String fldintCostNum)
	{
		writeProperty("fldintCostNum", fldintCostNum);
	}

	public String getFldintCostNum()
	{
		return (String) readProperty("fldintCostNum");
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
