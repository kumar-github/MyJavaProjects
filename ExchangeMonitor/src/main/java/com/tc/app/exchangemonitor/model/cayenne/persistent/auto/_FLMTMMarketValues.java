package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _FLMTMMarketValues was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _FLMTMMarketValues extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String ID_MARKET_PK_COLUMN = "IdMarket";
	public static final String FLDSDT_DATE_PK_COLUMN = "fldsdtDate";

	public static final Property<BigDecimal> FLD_VALUE = new Property<BigDecimal>("fldValue");

	public void setFldValue(BigDecimal fldValue)
	{
		writeProperty("fldValue", fldValue);
	}

	public BigDecimal getFldValue()
	{
		return (BigDecimal) readProperty("fldValue");
	}

}