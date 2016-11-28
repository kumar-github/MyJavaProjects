package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Commodity;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Location;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Uom;

/**
 * Class _BunkerPurPriceLookup was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _BunkerPurPriceLookup extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String OID_PK_COLUMN = "oid";

	public static final Property<Date> DEL_DATE_FROM = new Property<>("delDateFrom");
	public static final Property<Date> DEL_DATE_TO = new Property<>("delDateTo");
	public static final Property<String> FORMULA_IND = new Property<>("formulaInd");
	public static final Property<String> FORMULA_NAME = new Property<>("formulaName");
	public static final Property<Double> PRICE_AMT = new Property<>("priceAmt");
	public static final Property<Integer> TRANS_ID = new Property<>("transId");
	public static final Property<Commodity> COMMODITY = new Property<>("commodity");
	public static final Property<Commodity> COMMODITY1 = new Property<>("commodity1");
	public static final Property<Location> LOCATION = new Property<>("location");
	public static final Property<Uom> UOM = new Property<>("uom");

	public void setDelDateFrom(final Date delDateFrom)
	{
		this.writeProperty("delDateFrom", delDateFrom);
	}

	public Date getDelDateFrom()
	{
		return (Date) this.readProperty("delDateFrom");
	}

	public void setDelDateTo(final Date delDateTo)
	{
		this.writeProperty("delDateTo", delDateTo);
	}

	public Date getDelDateTo()
	{
		return (Date) this.readProperty("delDateTo");
	}

	public void setFormulaInd(final String formulaInd)
	{
		this.writeProperty("formulaInd", formulaInd);
	}

	public String getFormulaInd()
	{
		return (String) this.readProperty("formulaInd");
	}

	public void setFormulaName(final String formulaName)
	{
		this.writeProperty("formulaName", formulaName);
	}

	public String getFormulaName()
	{
		return (String) this.readProperty("formulaName");
	}

	public void setPriceAmt(final Double priceAmt)
	{
		this.writeProperty("priceAmt", priceAmt);
	}

	public Double getPriceAmt()
	{
		return (Double) this.readProperty("priceAmt");
	}

	public void setTransId(final Integer transId)
	{
		this.writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) this.readProperty("transId");
	}

	public void setCommodity(final Commodity commodity)
	{
		this.setToOneTarget("commodity", commodity, true);
	}

	public Commodity getCommodity()
	{
		return (Commodity) this.readProperty("commodity");
	}

	public void setCommodity1(final Commodity commodity1)
	{
		this.setToOneTarget("commodity1", commodity1, true);
	}

	public Commodity getCommodity1()
	{
		return (Commodity) this.readProperty("commodity1");
	}

	public void setLocation(final Location location)
	{
		this.setToOneTarget("location", location, true);
	}

	public Location getLocation()
	{
		return (Location) this.readProperty("location");
	}

	public void setUom(final Uom uom)
	{
		this.setToOneTarget("uom", uom, true);
	}

	public Uom getUom()
	{
		return (Uom) this.readProperty("uom");
	}

}