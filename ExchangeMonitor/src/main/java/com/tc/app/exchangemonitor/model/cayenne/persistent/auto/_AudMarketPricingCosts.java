package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudMarketPricingCosts was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudMarketPricingCosts extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Double> COST_AMT = new Property<Double>("costAmt");
	public static final Property<String> COST_CURR_CODE = new Property<String>("costCurrCode");
	public static final Property<Date> COST_DATE = new Property<Date>("costDate");
	public static final Property<String> COST_NAME = new Property<String>("costName");
	public static final Property<String> COST_UOM_CODE = new Property<String>("costUomCode");
	public static final Property<String> MKT_CODE = new Property<String>("mktCode");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setCostAmt(Double costAmt)
	{
		writeProperty("costAmt", costAmt);
	}

	public Double getCostAmt()
	{
		return (Double) readProperty("costAmt");
	}

	public void setCostCurrCode(String costCurrCode)
	{
		writeProperty("costCurrCode", costCurrCode);
	}

	public String getCostCurrCode()
	{
		return (String) readProperty("costCurrCode");
	}

	public void setCostDate(Date costDate)
	{
		writeProperty("costDate", costDate);
	}

	public Date getCostDate()
	{
		return (Date) readProperty("costDate");
	}

	public void setCostName(String costName)
	{
		writeProperty("costName", costName);
	}

	public String getCostName()
	{
		return (String) readProperty("costName");
	}

	public void setCostUomCode(String costUomCode)
	{
		writeProperty("costUomCode", costUomCode);
	}

	public String getCostUomCode()
	{
		return (String) readProperty("costUomCode");
	}

	public void setMktCode(String mktCode)
	{
		writeProperty("mktCode", mktCode);
	}

	public String getMktCode()
	{
		return (String) readProperty("mktCode");
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