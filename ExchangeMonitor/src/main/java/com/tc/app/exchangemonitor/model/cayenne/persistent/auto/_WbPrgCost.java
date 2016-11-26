package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _WbPrgCost was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _WbPrgCost extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FLDCHR_REC_ID_PK_COLUMN = "fldchrRecId";

	public static final Property<String> FLDCHR_COST_CODE = new Property<String>("fldchrCostCode");
	public static final Property<String> FLDCHR_CURRENCY_CODE = new Property<String>("fldchrCurrencyCode");
	public static final Property<String> FLDCHR_LOT_KEY = new Property<String>("fldchrLotKey");
	public static final Property<BigDecimal> FLDDEC_COST_AMT = new Property<BigDecimal>("flddecCostAmt");
	public static final Property<BigDecimal> FLDDEC_COST_QTY_FUEL = new Property<BigDecimal>("flddecCostQtyFuel");
	public static final Property<BigDecimal> FLDDEC_COST_QTY_GAS = new Property<BigDecimal>("flddecCostQtyGas");

	public void setFldchrCostCode(String fldchrCostCode)
	{
		writeProperty("fldchrCostCode", fldchrCostCode);
	}

	public String getFldchrCostCode()
	{
		return (String) readProperty("fldchrCostCode");
	}

	public void setFldchrCurrencyCode(String fldchrCurrencyCode)
	{
		writeProperty("fldchrCurrencyCode", fldchrCurrencyCode);
	}

	public String getFldchrCurrencyCode()
	{
		return (String) readProperty("fldchrCurrencyCode");
	}

	public void setFldchrLotKey(String fldchrLotKey)
	{
		writeProperty("fldchrLotKey", fldchrLotKey);
	}

	public String getFldchrLotKey()
	{
		return (String) readProperty("fldchrLotKey");
	}

	public void setFlddecCostAmt(BigDecimal flddecCostAmt)
	{
		writeProperty("flddecCostAmt", flddecCostAmt);
	}

	public BigDecimal getFlddecCostAmt()
	{
		return (BigDecimal) readProperty("flddecCostAmt");
	}

	public void setFlddecCostQtyFuel(BigDecimal flddecCostQtyFuel)
	{
		writeProperty("flddecCostQtyFuel", flddecCostQtyFuel);
	}

	public BigDecimal getFlddecCostQtyFuel()
	{
		return (BigDecimal) readProperty("flddecCostQtyFuel");
	}

	public void setFlddecCostQtyGas(BigDecimal flddecCostQtyGas)
	{
		writeProperty("flddecCostQtyGas", flddecCostQtyGas);
	}

	public BigDecimal getFlddecCostQtyGas()
	{
		return (BigDecimal) readProperty("flddecCostQtyGas");
	}

}
