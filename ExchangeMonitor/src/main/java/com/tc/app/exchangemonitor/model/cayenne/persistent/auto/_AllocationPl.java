package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Commodity;

/**
 * Class _AllocationPl was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AllocationPl extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String ALLOC_NUM_PK_COLUMN = "alloc_num";

	public static final Property<Double> ALLOC_PL_PURCHASE_AMT = new Property<Double>("allocPlPurchaseAmt");
	public static final Property<Double> ALLOC_PL_SALES_AMT = new Property<Double>("allocPlSalesAmt");
	public static final Property<Double> ALLOC_PL_SEC_COSTS_AMT = new Property<Double>("allocPlSecCostsAmt");
	public static final Property<String> ALLOC_PL_STATUS = new Property<String>("allocPlStatus");
	public static final Property<Integer> POS_GROUP_NUM = new Property<Integer>("posGroupNum");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<Commodity> COMMODITY = new Property<Commodity>("commodity");

	public void setAllocPlPurchaseAmt(Double allocPlPurchaseAmt)
	{
		writeProperty("allocPlPurchaseAmt", allocPlPurchaseAmt);
	}

	public Double getAllocPlPurchaseAmt()
	{
		return (Double) readProperty("allocPlPurchaseAmt");
	}

	public void setAllocPlSalesAmt(Double allocPlSalesAmt)
	{
		writeProperty("allocPlSalesAmt", allocPlSalesAmt);
	}

	public Double getAllocPlSalesAmt()
	{
		return (Double) readProperty("allocPlSalesAmt");
	}

	public void setAllocPlSecCostsAmt(Double allocPlSecCostsAmt)
	{
		writeProperty("allocPlSecCostsAmt", allocPlSecCostsAmt);
	}

	public Double getAllocPlSecCostsAmt()
	{
		return (Double) readProperty("allocPlSecCostsAmt");
	}

	public void setAllocPlStatus(String allocPlStatus)
	{
		writeProperty("allocPlStatus", allocPlStatus);
	}

	public String getAllocPlStatus()
	{
		return (String) readProperty("allocPlStatus");
	}

	public void setPosGroupNum(Integer posGroupNum)
	{
		writeProperty("posGroupNum", posGroupNum);
	}

	public Integer getPosGroupNum()
	{
		return (Integer) readProperty("posGroupNum");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setCommodity(Commodity commodity)
	{
		setToOneTarget("commodity", commodity, true);
	}

	public Commodity getCommodity()
	{
		return (Commodity) readProperty("commodity");
	}

}