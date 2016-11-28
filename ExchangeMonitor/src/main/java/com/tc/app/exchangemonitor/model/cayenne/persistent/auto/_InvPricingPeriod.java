package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Inventory;

/**
 * Class _InvPricingPeriod was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _InvPricingPeriod extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String INV_NUM_PK_COLUMN = "inv_num";

	public static final Property<Date> INV_PRICE_END_DATE = new Property<Date>("invPriceEndDate");
	public static final Property<String> INV_PRICE_EXCL_HOL = new Property<String>("invPriceExclHol");
	public static final Property<String> INV_PRICE_EXCL_SAT = new Property<String>("invPriceExclSat");
	public static final Property<String> INV_PRICE_EXCL_SUN = new Property<String>("invPriceExclSun");
	public static final Property<Date> INV_PRICE_START_DATE = new Property<Date>("invPriceStartDate");
	public static final Property<Short> NUM_OF_PRICING_DAYS = new Property<Short>("numOfPricingDays");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<Inventory> INVENTORY = new Property<Inventory>("inventory");

	public void setInvPriceEndDate(Date invPriceEndDate)
	{
		writeProperty("invPriceEndDate", invPriceEndDate);
	}

	public Date getInvPriceEndDate()
	{
		return (Date) readProperty("invPriceEndDate");
	}

	public void setInvPriceExclHol(String invPriceExclHol)
	{
		writeProperty("invPriceExclHol", invPriceExclHol);
	}

	public String getInvPriceExclHol()
	{
		return (String) readProperty("invPriceExclHol");
	}

	public void setInvPriceExclSat(String invPriceExclSat)
	{
		writeProperty("invPriceExclSat", invPriceExclSat);
	}

	public String getInvPriceExclSat()
	{
		return (String) readProperty("invPriceExclSat");
	}

	public void setInvPriceExclSun(String invPriceExclSun)
	{
		writeProperty("invPriceExclSun", invPriceExclSun);
	}

	public String getInvPriceExclSun()
	{
		return (String) readProperty("invPriceExclSun");
	}

	public void setInvPriceStartDate(Date invPriceStartDate)
	{
		writeProperty("invPriceStartDate", invPriceStartDate);
	}

	public Date getInvPriceStartDate()
	{
		return (Date) readProperty("invPriceStartDate");
	}

	public void setNumOfPricingDays(Short numOfPricingDays)
	{
		writeProperty("numOfPricingDays", numOfPricingDays);
	}

	public Short getNumOfPricingDays()
	{
		return (Short) readProperty("numOfPricingDays");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setInventory(Inventory inventory)
	{
		setToOneTarget("inventory", inventory, true);
	}

	public Inventory getInventory()
	{
		return (Inventory) readProperty("inventory");
	}

}