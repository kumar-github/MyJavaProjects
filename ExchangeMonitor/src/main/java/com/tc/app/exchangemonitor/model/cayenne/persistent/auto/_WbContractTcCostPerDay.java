package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Cost;
import com.tc.app.exchangemonitor.model.cayenne.persistent.WbContract;

/**
 * Class _WbContractTcCostPerDay was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _WbContractTcCostPerDay extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String ID_PK_COLUMN = "id";

	public static final Property<String> COST_CODE = new Property<String>("costCode");
	public static final Property<String> CURRENCY = new Property<String>("currency");
	public static final Property<String> RATE_ID = new Property<String>("rateId");
	public static final Property<Double> VOYAGE_COST_PER_DAY = new Property<Double>("voyageCostPerDay");
	public static final Property<Date> VOYAGE_DAY = new Property<Date>("voyageDay");
	public static final Property<Cost> COST = new Property<Cost>("cost");
	public static final Property<WbContract> WB_CONTRACT = new Property<WbContract>("wbContract");

	public void setCostCode(String costCode)
	{
		writeProperty("costCode", costCode);
	}

	public String getCostCode()
	{
		return (String) readProperty("costCode");
	}

	public void setCurrency(String currency)
	{
		writeProperty("currency", currency);
	}

	public String getCurrency()
	{
		return (String) readProperty("currency");
	}

	public void setRateId(String rateId)
	{
		writeProperty("rateId", rateId);
	}

	public String getRateId()
	{
		return (String) readProperty("rateId");
	}

	public void setVoyageCostPerDay(Double voyageCostPerDay)
	{
		writeProperty("voyageCostPerDay", voyageCostPerDay);
	}

	public Double getVoyageCostPerDay()
	{
		return (Double) readProperty("voyageCostPerDay");
	}

	public void setVoyageDay(Date voyageDay)
	{
		writeProperty("voyageDay", voyageDay);
	}

	public Date getVoyageDay()
	{
		return (Date) readProperty("voyageDay");
	}

	public void setCost(Cost cost)
	{
		setToOneTarget("cost", cost, true);
	}

	public Cost getCost()
	{
		return (Cost) readProperty("cost");
	}

	public void setWbContract(WbContract wbContract)
	{
		setToOneTarget("wbContract", wbContract, true);
	}

	public WbContract getWbContract()
	{
		return (WbContract) readProperty("wbContract");
	}

}