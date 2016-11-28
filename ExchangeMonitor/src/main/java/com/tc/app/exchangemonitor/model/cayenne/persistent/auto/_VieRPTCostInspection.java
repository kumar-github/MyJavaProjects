package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VieRPTCostInspection was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VieRPTCostInspection extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> ACCT_NUM = new Property<Integer>("acctNum");
	public static final Property<Short> ALLOC_ITEM_NUM = new Property<Short>("allocItemNum");
	public static final Property<Integer> ALLOC_NUM = new Property<Integer>("allocNum");
	public static final Property<Double> COST_AMT = new Property<Double>("costAmt");
	public static final Property<String> COST_CODE = new Property<String>("costCode");
	public static final Property<Date> COST_DUE_DATE = new Property<Date>("costDueDate");
	public static final Property<String> COST_OWNER_CODE = new Property<String>("costOwnerCode");
	public static final Property<String> COST_PAY_REC_IND = new Property<String>("costPayRecInd");
	public static final Property<String> COST_PRICE_CURR_CODE = new Property<String>("costPriceCurrCode");
	public static final Property<String> COST_PRICE_UOM_CODE = new Property<String>("costPriceUomCode");
	public static final Property<String> COST_STATUS = new Property<String>("costStatus");
	public static final Property<Date> CREATION_DATE = new Property<Date>("creationDate");

	public void setAcctNum(Integer acctNum)
	{
		writeProperty("acctNum", acctNum);
	}

	public Integer getAcctNum()
	{
		return (Integer) readProperty("acctNum");
	}

	public void setAllocItemNum(Short allocItemNum)
	{
		writeProperty("allocItemNum", allocItemNum);
	}

	public Short getAllocItemNum()
	{
		return (Short) readProperty("allocItemNum");
	}

	public void setAllocNum(Integer allocNum)
	{
		writeProperty("allocNum", allocNum);
	}

	public Integer getAllocNum()
	{
		return (Integer) readProperty("allocNum");
	}

	public void setCostAmt(Double costAmt)
	{
		writeProperty("costAmt", costAmt);
	}

	public Double getCostAmt()
	{
		return (Double) readProperty("costAmt");
	}

	public void setCostCode(String costCode)
	{
		writeProperty("costCode", costCode);
	}

	public String getCostCode()
	{
		return (String) readProperty("costCode");
	}

	public void setCostDueDate(Date costDueDate)
	{
		writeProperty("costDueDate", costDueDate);
	}

	public Date getCostDueDate()
	{
		return (Date) readProperty("costDueDate");
	}

	public void setCostOwnerCode(String costOwnerCode)
	{
		writeProperty("costOwnerCode", costOwnerCode);
	}

	public String getCostOwnerCode()
	{
		return (String) readProperty("costOwnerCode");
	}

	public void setCostPayRecInd(String costPayRecInd)
	{
		writeProperty("costPayRecInd", costPayRecInd);
	}

	public String getCostPayRecInd()
	{
		return (String) readProperty("costPayRecInd");
	}

	public void setCostPriceCurrCode(String costPriceCurrCode)
	{
		writeProperty("costPriceCurrCode", costPriceCurrCode);
	}

	public String getCostPriceCurrCode()
	{
		return (String) readProperty("costPriceCurrCode");
	}

	public void setCostPriceUomCode(String costPriceUomCode)
	{
		writeProperty("costPriceUomCode", costPriceUomCode);
	}

	public String getCostPriceUomCode()
	{
		return (String) readProperty("costPriceUomCode");
	}

	public void setCostStatus(String costStatus)
	{
		writeProperty("costStatus", costStatus);
	}

	public String getCostStatus()
	{
		return (String) readProperty("costStatus");
	}

	public void setCreationDate(Date creationDate)
	{
		writeProperty("creationDate", creationDate);
	}

	public Date getCreationDate()
	{
		return (Date) readProperty("creationDate");
	}

}