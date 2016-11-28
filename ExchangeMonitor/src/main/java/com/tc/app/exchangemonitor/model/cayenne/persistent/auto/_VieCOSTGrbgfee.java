package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VieCOSTGrbgfee was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VieCOSTGrbgfee extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Double> COST_AMT = new Property<Double>("costAmt");
	public static final Property<String> COST_CODE = new Property<String>("costCode");
	public static final Property<String> COST_PAY_REC_IND = new Property<String>("costPayRecInd");
	public static final Property<String> COST_PRICE_CURR_CODE = new Property<String>("costPriceCurrCode");
	public static final Property<Double> COST_UNIT_PRICE = new Property<Double>("costUnitPrice");
	public static final Property<String> FLDCHR_OP_KEY = new Property<String>("fldchrOpKey");
	public static final Property<Date> GRBG_COST_DUE_DATE = new Property<Date>("grbgCostDueDate");
	public static final Property<Double> GRBG_COST_QTY = new Property<Double>("grbgCostQty");

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

	public void setCostUnitPrice(Double costUnitPrice)
	{
		writeProperty("costUnitPrice", costUnitPrice);
	}

	public Double getCostUnitPrice()
	{
		return (Double) readProperty("costUnitPrice");
	}

	public void setFldchrOpKey(String fldchrOpKey)
	{
		writeProperty("fldchrOpKey", fldchrOpKey);
	}

	public String getFldchrOpKey()
	{
		return (String) readProperty("fldchrOpKey");
	}

	public void setGrbgCostDueDate(Date grbgCostDueDate)
	{
		writeProperty("grbgCostDueDate", grbgCostDueDate);
	}

	public Date getGrbgCostDueDate()
	{
		return (Date) readProperty("grbgCostDueDate");
	}

	public void setGrbgCostQty(Double grbgCostQty)
	{
		writeProperty("grbgCostQty", grbgCostQty);
	}

	public Double getGrbgCostQty()
	{
		return (Double) readProperty("grbgCostQty");
	}

}